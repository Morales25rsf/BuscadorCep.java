// Buscador de CEP
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscadorCep {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CEP (apenas números, ex: 01001000); ");
        String cep = scanner.nextLine();

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build(); 

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                System.out.print("\n📍 Endereço Encontrado:");
                System.out.print(response.body());
        } catch (Exception e) {
             System.out.println("❌ Ops! Ocorreu um erro na comunicação com a API: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
