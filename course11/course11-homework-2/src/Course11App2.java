import java.io.*;

public class Course11App2 {
    public static void main(String[] args) throws Exception {
        File folder = new File("D:/Workspaces/vscode/belhard-projects/course11/course11-homework-2/src/files");
        for (File file : folder.listFiles()) {
            FileReaderForThreads frft = new FileReaderForThreads(file.getAbsolutePath());
            frft.start();
        }
    }
}
