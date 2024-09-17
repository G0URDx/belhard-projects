import java.io.*;

public class FileReaderForThreads extends Thread {
    private String filePath;

    public FileReaderForThreads(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(getName() + " - " + filePath + ": " + line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + filePath);
            e.printStackTrace();
        }
    }

}
