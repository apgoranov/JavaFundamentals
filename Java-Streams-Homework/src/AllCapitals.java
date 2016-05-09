import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter(
                new File("AllCapitals.txt")
        );
        writer.write("Kvo staa?\n");
        writer.write("Nishto, ti?\n");
        writer.write("Chuk, maina.\n");
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(
                new FileReader("AllCapitals.txt")
        );
        String line = reader.readLine();
        PrintWriter prWr = new PrintWriter(
                new FileWriter(
                       ("AllCapitals.txt")
                )
        );
//        line = line.toUpperCase();
//        prWr.write(line);
//        System.out.println(line);
//        line = reader.readLine();
//        line = line.toUpperCase();
//        prWr.write(line);
//        System.out.println(line);
//        line = reader.readLine();
//        line = line.toUpperCase();
//        prWr.write(line);
//        System.out.println(line);
        while (line != null){
            line = line.toUpperCase();
            prWr.write(line + "\n");
            line = reader.readLine();
        }
        reader.close();
        prWr.flush();
        prWr.close();
    }
}
