package book.java.nutshell.chaper10;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.util.concurrent.Future;

public class Issue0 {
    public static void main(String[] args) throws InterruptedException {
        try (AsynchronousFileChannel channel = AsynchronousFileChannel.open(Paths.get(""))) {
            final ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 100);
            final Future<Integer> future = channel.read(buffer, 0);
            while (!future.isDone()) {
                System.out.println(buffer.asCharBuffer().toString());
            }
            System.out.printf("Bytes read: %d", future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
