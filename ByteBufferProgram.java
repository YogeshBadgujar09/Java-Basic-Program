import java.nio.ByteBuffer;

public class ByteBufferProgram {
    public static void main(String[] args) {
        // Create a byte buffer
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Put bytes into the buffer
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);

        // Flip the buffer for reading
        buffer.flip();

        // Get bytes from the buffer
        System.out.println(buffer.get());
        System.out.println(buffer.get());
        System.out.println(buffer.get());
    }
}
