import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.util.Scanner;

public class WeatherAPIClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        // Replace with your actual OpenWeatherMap API key
        String apiKey = "5d20d65a6923e8d2597f3feab8397771";


        // Build the URL using the city and API key
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=metric";

        try {
            // Create URL and open connection
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Check if connection is successful
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Error: Unable to fetch weather data. Response Code: " + responseCode);
                return;
            }

            // Read data from API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonResponse = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonResponse.append(line);
            }
            reader.close();

            // Parse JSON data
            JSONObject obj = new JSONObject(jsonResponse.toString());

            String cityName = obj.getString("name");
            JSONObject main = obj.getJSONObject("main");
            double temp = main.getDouble("temp");
            double feelsLike = main.getDouble("feels_like");
            int humidity = main.getInt("humidity");

            JSONObject wind = obj.getJSONObject("wind");
            double windSpeed = wind.getDouble("speed");

            JSONObject weather = obj.getJSONArray("weather").getJSONObject(0);
            String description = weather.getString("description");

            // Display weather data
            System.out.println("\n======= WEATHER REPORT =======");
            System.out.println("City: " + cityName);
            System.out.println("Temperature: " + temp + "°C");
            System.out.println("Feels Like: " + feelsLike + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Wind Speed: " + windSpeed + " m/s");
            System.out.println("Condition: " + description);
            System.out.println("==============================");

        } catch (Exception e) {
            System.out.println("Error occurred while fetching data: " + e.getMessage());
        }
    }
}
