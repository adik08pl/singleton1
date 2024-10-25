import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private Logger(){

    }
    void log(String message) {
        String path = "plik.txt";

        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(message+"\n");
        } catch (IOException e) {
            System.out.println("Error czy coś:" + e.getMessage());
        }
    }
    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

}
