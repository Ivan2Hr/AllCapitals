import java.io.*;


public class AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(
                new FileReader("Lines2.txt")
        );

        String Best=null;
        String str ;
        int k = 0;
            while ((str = bfr.readLine()) != null) {

                for (int j = 0; j < str.length(); j++) {
                    char upperChar;
                    upperChar = Character.toUpperCase(str.charAt(j));
                    str = str.replace(str.charAt(j),upperChar);

                }
                if(k==0){
                    Best = str + "\n";

                    k=1;
                }
                else {
                    Best += str + "\n";
                }
            }
                bfr.close();
        BufferedWriter bfw = new BufferedWriter(
                new FileWriter("Lines2.txt"));
                bfw.write(Best);

        bfw.close();

    }
}
