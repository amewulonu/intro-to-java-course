import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com/";
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new URL(urlString).openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   
    }


