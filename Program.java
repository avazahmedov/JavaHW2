import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Program {
    public static void main(String[] args) {
//        FirstTask firstTask = new FirstTask();
//        System.out.println(firstTask.getResult(firstTask.filterString()));

 //       SecondTask secondTask = new SecondTask();
 //           secondTask.bubbleSort(secondTask.arr);

//        Thirdtask thirdtask = new Thirdtask();
//        ArrayList<String> strArr = new ArrayList<>();
//        strArr = thirdtask.readFile();
//        String str1 = strArr.get(0);
//        String str2 = strArr.get(1);
//        String str3 = strArr.get(2);
//        System.out.println(thirdtask.getResult(thirdtask.filterString(str1)));
//        System.out.println(thirdtask.getResult(thirdtask.filterString(str2)));
//        System.out.println(thirdtask.getResult(thirdtask.filterString(str3)));

        FourthTask fourthTask = new FourthTask();
        fourthTask.calcMethod();
    }
}
