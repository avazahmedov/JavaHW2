import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Thirdtask {
        public ArrayList readFile(){
            FileReader fr = null;
            try {
                fr = new FileReader("file.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Scanner scan = new Scanner(fr);
            ArrayList<String> strArr = new ArrayList<>();
            while (scan.hasNextLine()){
                String str = new String();
                str += scan.nextLine();
                strArr.add(str);
            }
            return strArr;
        }


    public ArrayList filterString(String str) {
        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            boolean isLetter = true;
            String newStr = "";
            while (isLetter){
                if (str.charAt(i) == '{' || str.charAt(i) == ':' || str.charAt(i) == ',' || str.charAt(i) == ' ' || str.charAt(i) == '}' || str.charAt(i) == '"') {
                    isLetter = false;
                    strArr.add(newStr);
                }
                if (isLetter) {
                    newStr += str.charAt(i);
                }
                i++;
            }
        }
        strArr.removeIf(i -> (i == ""));
        return strArr;
    }

    public String getResult(ArrayList strArr){
        int i = 0;
        return ("Студент " + strArr.get(i+1) + " получил " + strArr.get(i+3) + " по предмету " + strArr.get(i + 5));

    }
}
