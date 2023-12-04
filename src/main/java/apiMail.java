import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class apiMail {
    public static void main (String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://temporary-mail-afeg-ru.p.rapidapi.com/api/domains/request"))
                .header("X-RapidAPI-Key", "d76b95b0femsh7dbfe4c8055870cp12f0ffjsn822b7ee95f5d")
                .header("X-RapidAPI-Host", "temporary-mail-afeg-ru.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
