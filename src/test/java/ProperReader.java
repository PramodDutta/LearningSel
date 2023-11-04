import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ProperReader {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        String fileName =  System.getProperty("user.dir")+ "/data.properties";
        properties.load(Files.newInputStream(Paths.get(fileName)));
        String url = properties.getProperty("url");
        System.out.println(url);






    }
}
