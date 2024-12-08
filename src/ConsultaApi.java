import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Response convertir(String userUrl){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5f9ca4ef49e25bf07cfa5814/latest/" + userUrl);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Response.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré");
        }
    }
}
