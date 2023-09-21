import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import movie_catalog.exception.YearConversionErrorException;
import movie_catalog.models.Title;
import movie_catalog.models.TitleOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        var search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();



        while (!search.equalsIgnoreCase("exit")) {

        System.out.println("Enter the movie name for search: ");

        search = scanner.nextLine();


        if (search.equalsIgnoreCase("exit")) {
            break;
        }

            String key = "3ab10a20";
            String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + key;

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                Title myTitle = new Title(myTitleOmdb);
                titles.add(myTitle);

                System.out.println("Title already convert");
                System.out.println(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("There was an error");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Some argument error in the search, check the address");
            } catch (YearConversionErrorException e) {
                System.out.println(e.getMessage());
            }

        }

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();

        System.out.println("The program finished correctly");

    }

}
