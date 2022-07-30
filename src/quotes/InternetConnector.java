package quotes;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class InternetConnector {

    static String[] downloadQuote(String language) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://quotes15.p.rapidapi.com/quotes/random/?language_code=%s", language)))
                .header("X-RapidAPI-Key", "5244d750ddmsh8db03e38315fd08p1461a3jsn64d61421746c")
                .header("X-RapidAPI-Host", "quotes15.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return formatQuote(response.body());
    }

    static String[] formatQuote(String json) {
        JSONObject allElements = new JSONObject(json);
        String[] output = new String[2];
        output[0] = allElements.getString("content");
        output[1] = allElements.getJSONObject("originator").getString("name");
        return output;
    }
}
