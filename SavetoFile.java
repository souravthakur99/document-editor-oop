import java.io.FileWriter;
import java.io.IOException;
public class SavetoFile implements Persistence{
    @Override
    public void save(String data){
                try (FileWriter writer = new FileWriter("document.txt")) {

            writer.write(data);

            System.out.println("File saved successfully");
    }
    catch (IOException e) {

            System.out.println("Error while saving file");
}
}
}