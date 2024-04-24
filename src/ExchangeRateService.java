import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateService {

    private static final String API_KEY = "Coloque_Sua_Chave_Aqui";
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getExchangeRate(String baseCurrencyCode, String targetCurrencyCode) throws IOException {
        String urlStr = API_BASE_URL + baseCurrencyCode;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        JsonParser jsonParser = new JsonParser();
        JsonElement root = jsonParser.parse(new InputStreamReader(conn.getInputStream()));
        JsonObject jsonObj = root.getAsJsonObject();

        if (jsonObj.get("result").getAsString().equals("success")) {
            JsonObject conversionRates = jsonObj.getAsJsonObject("conversion_rates");
            return conversionRates.get(targetCurrencyCode).getAsDouble();
        } else {
            throw new IOException("API request failed: " + jsonObj.get("error"));
        }
    }
}