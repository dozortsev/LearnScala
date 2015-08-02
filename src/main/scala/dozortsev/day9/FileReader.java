package dozortsev.day9;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.Future;

import static java.nio.channels.AsynchronousFileChannel.open;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardOpenOption.READ;

public class FileReader {
    public static void main(String[] args) throws Exception {
        final File source = new File("src/main/scala/dozortsev/run.sh");
        try (AsynchronousFileChannel channel = open(source.toPath(), READ)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) source.length());
            Future<Integer> future = channel.read(buffer, 0);

            System.out.printf("%nReading done: %s. Read bytes: %d", future.isDone(), future.get());
            System.out.printf("%n%nContent:%n");

            while (buffer.flip().hasRemaining()) {
                System.out.println(new String(buffer.array()));
            }
            buffer.clear();
            System.out.println();
        }
    }
}
