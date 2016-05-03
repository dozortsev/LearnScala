package dozortsev.day9;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.nio.channels.AsynchronousFileChannel.open;
import static java.nio.file.StandardOpenOption.READ;

public class FileReader {
    public static void main(String[] args) throws Exception {

        final File source = new File("src/main/scala/dozortsev/50000_patients.csv");
        try (AsynchronousFileChannel channel = open(source.toPath(), READ)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) source.length());
            Future<Integer> operation = channel.read(buffer, 0);

            while (!operation.isDone()) {
                System.out.println("Operation isn't done.");
                TimeUnit.SECONDS.sleep(2);
            }

            System.out.println(new String(buffer.array()));
            buffer.clear();
        }
    }
}
