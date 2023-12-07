package assistedprojectjava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandlingproject {

    public static void main(String[] args) {
        String filePath = "example.txt";
        
        // Write to a file
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            bufferedWriter.write("Hello, TharunKumar!");
            
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Read from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        // Append to a file
        try {
            FileWriter writer = new FileWriter(filePath, true); // append mode
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            bufferedWriter.write("Appending a new line.");
            
            bufferedWriter.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }


}
