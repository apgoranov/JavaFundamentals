import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountTypesOfChar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(
                        "words.txt"
                )
        );
        List chVowels = new ArrayList<Character>(){{
            add('a'); add('e');add('i');add('o');add('u');
            add('A'); add('E');add('I');add('O');add('U');
        }};
        List chConsonants = new ArrayList<Character>(){{
            add('b'); add('c');add('d');add('f');add('g');add('h');add('j'); add('k');add('l');add('m');add('n');add('p');
            add('q'); add('r');add('s');add('t');add('v');add('w');add('x'); add('y');add('z');
            add('B'); add('C');add('D');add('F');add('G');add('H');add('J'); add('K');add('L');add('M');add('N');add('P');
            add('Q'); add('R');add('S');add('T');add('V');add('W');add('X'); add('Y');add('Z');
        }};
        List chPunctuation = new ArrayList<Character>(){{
            add('!'); add('.');add(',');add('?');
        }};
        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;
        String line = reader.readLine();
        while (line != null){
            char[] lineOfChars = line.toCharArray();
            for (int i = 0; i < lineOfChars.length; i++) {
                if (chConsonants.contains(lineOfChars[i])){
                    consonantsCount++;
                }
                else if (chVowels.contains(lineOfChars[i])){
                    vowelsCount++;
                }
                else if (chPunctuation.contains(lineOfChars[i])){
                    punctuationCount++;
                }
                else {
                    continue;
                }
                }
            line = reader.readLine();
        }
        reader.close();
        System.out.println("Vowels: "+ vowelsCount);
        System.out.println("Consonants: "+ consonantsCount);
        System.out.println("Punctuation: "+ punctuationCount);

        BufferedWriter writer = new BufferedWriter(
                new FileWriter(
                        new File("count-chars.txt")
                )
        );
        writer.write("Vowels: "+ vowelsCount + "\n");
        writer.write("Consonants: "+ consonantsCount + "\n");
        writer.write("Punctuation: "+ punctuationCount);
        writer.flush();
        writer.close();
    }
}
