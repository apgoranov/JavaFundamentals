import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {
//        BufferedWriter writer = new BufferedWriter(
//                new OutputStreamWriter(
//                        new FileOutputStream("SumLines.txt")
//                )
//        );
//        writer.write("Kvo staa?");
//        writer.newLine();
//        writer.write("Nishto, ti?");
//        writer.newLine();
//        writer.write("Chuk, maina.");
//        writer.newLine();
//        writer.flush();
//        writer.close();
//
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("SumLines.txt")
//                )
//        );
//
//
//        String line = reader.readLine();
//        System.out.print(line + " " + SumOfChars(line)+ "\n");
//        line = reader.readLine();
//        System.out.print(line + " " + SumOfChars(line)+ "\n");
//        line = reader.readLine();
//        System.out.print(line + " " + SumOfChars(line));
//        reader.close();


        FileWriter writer = new FileWriter(
                "SumLines.txt"
        );
        writer.write("Kvo staa?\n");
        writer.write("Nishto, ti?\n");
        writer.write("Chuk, maina.\n");
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(
                new FileReader(
                        "SumLines.txt"
                )
        );
        String line = reader.readLine();
        System.out.print(line + " " + SumOfChars(line)+ "\n");
        line = reader.readLine();
        System.out.print(line + " " + SumOfChars(line)+ "\n");
        line = reader.readLine();
        System.out.print(line + " " + SumOfChars(line));
        reader.close();
    }

    public static int SumOfChars(String line){
        char[] chars = line.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += chars[i];
        }
        return sum;
    }
}
