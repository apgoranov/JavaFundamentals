import java.io.*;

public class CopyJpg {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File("asdf.jpg"));
            os = new FileOutputStream(new File("my-copied-picture.jpg"));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
