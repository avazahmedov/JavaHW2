import java.util.*;

public class FirstTask {
    StringBuilder stringBuilder;
    FirstTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("select * from students where: ");
        stringBuilder = new StringBuilder(in.next());
        in.close();
    }

    public ArrayList filterString() {
        StringBuilder str = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
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

    public StringBuilder getResult(ArrayList strArr){
        for (int i = 0; i < strArr.size(); i++) {
            if (this.stringBuilder.toString().equals(strArr.get(i)))
            if (!strArr.get(i+1).equals("null")){
                this.stringBuilder.append(": " + strArr.get(i+1));
            } else {
                this.stringBuilder.append(": Значение null!");
            }
        }
        return this.stringBuilder;
    }
}
