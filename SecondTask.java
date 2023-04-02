import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SecondTask {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
    SecondTask() {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element: ");
            arr[i] = in.nextInt();
        }
    }

    public void bubbleSort(int[] arr) {
        Logger logger = Logger.getLogger(FirstTask.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            logger.info(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
