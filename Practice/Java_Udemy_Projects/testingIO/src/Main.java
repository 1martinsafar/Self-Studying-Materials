import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();

        for(FileStore store : stores) {
            System.out.println("store => " + store);
            System.out.println("store.name() => " + store.name());
        }

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPaths) {
            System.out.println(path);
        }

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory);
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        File workingDirectoryPath = new File("").getAbsoluteFile().getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory);
    }
}
