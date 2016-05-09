import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List theAmazingDoubleList = new ArrayList<Double>(){{
            add(2.2); add(3.5); add(6d); add(5.9); add(-12.665987); add(0.000000000001); add(254.0); add(8.6);
        }};
        ObjectOutputStream writer = new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(
                        new File("doubles.list")
                )
            )
        );
        writer.writeObject(theAmazingDoubleList);
        writer.flush();
        writer.close();

        ObjectInputStream reader = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                "doubles.list"
                        )
                )
        );
        System.out.println("And the objects are: " + reader.readObject());
        reader.close();
    }
}
