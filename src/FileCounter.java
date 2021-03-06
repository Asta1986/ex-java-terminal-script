import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileCounter {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the full path to target directory: ");
        String path = in.nextLine();

        System.out.println("Number of files in dir:");
        System.out.println(Files.list(Path.of(path)).toList().size());
    }
}
