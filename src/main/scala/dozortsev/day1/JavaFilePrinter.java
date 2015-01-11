package dozortsev.day1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

import static java.lang.System.out;
import static java.nio.file.Files.newDirectoryStream;
import static java.nio.file.Paths.get;

public class JavaFilePrinter {

    public static final String SCALA_SOURCE = "*.scala";
    public static final String PATH = "/home/ant/Documents/Java_Projects/LearnScala/src/main/scala/dozortsev/day1";

    public static void main(String[] args) throws IOException {
        try (DirectoryStream<Path> paths = newDirectoryStream(get(PATH), SCALA_SOURCE)) {
            for (Path path : paths) {
                out.println(path.getFileName());
            }
        }
    }
}