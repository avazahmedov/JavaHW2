import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FourthTask {

    public void calcMethod(){
        Logger logger = Logger.getLogger(FirstTask.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = scan.nextInt();
        System.out.println("Enter an operation: ");
        String op = scan.next();
        System.out.println("Enter a number y: ");
        int y = scan.nextInt();
        switch (op) {
            case "+":
                System.out.println(x + y);
                logger.info(x + " + " + y + " = " + (x+y));
                break;
            case "-":
                System.out.println(x - y);
                logger.info(x + " - " + y + " = " + (x-y));
                break;
            case "/":
                System.out.println(x / y);
                logger.info(x + " / " + y + " = " + (x/y));
                break;
            case "*":
                System.out.println(x * y);
                logger.info(x + " * " + y + " = " + (x*y));
                break;
            default:
                System.out.println("Enter correct operation");
                break;
        }
        scan.close();
    }
}
