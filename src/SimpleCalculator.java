import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
            boolean control = true;
            do {
                Scanner in = new Scanner(System.in);
                System.out.print("Wybierz figurę (1 - trójkąt, 2 - kwadrat, 3 - koło): ");
                try {
                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        createTriangle(in);
                        break;
                    case 2:
                        createSquare(in);
                        break;
                    case 3:
                       createCircle(in);
                        break;
                    default:
                        System.out.print("Wybrano niepoprawną opcję!");
                        break;
                }
                }catch(Exception e){
                    System.out.print("Nie podałeś liczby!\n");
                    in.nextLine();
                }
                String question;
                boolean endcontrol;
                do {
                    System.out.print("Czy chcesz zakończyć program (y/n)?\n");
                    question = in.next();
                    if (question.equals("y")) {
                        control = false;
                        endcontrol = false;
                    } else if (question.equals("n")) {
                        endcontrol = false;
                    } else {
                        System.out.print("Zły wybór!\n");
                        endcontrol = true;
                    }
                } while (endcontrol);
            } while (control);
    }
    static void createTriangle(Scanner in){
        System.out.print("Wybrałeś trójkąt!\n");
        double a, b, c;
        System.out.print("Podaj długość boków trójkąta: \n");
        try {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            Triangle triangle1 = new Triangle(a, b, c);
            triangle1.print();
        }
        catch(InputMismatchException e){
            System.out.print("Podana wartość nie jest liczbą!\n");
            in.nextLine();
            return;
        }
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            return;
        }
    }
    static void createSquare(Scanner in){
        System.out.print("Wybrałeś kwadrat!\n");
        double d;
        System.out.print("Podaj długość boku kwadratu: \n");
        try {
            d = in.nextDouble();
            Square square1 = new Square(d);
            square1.print();
        }
        catch(InputMismatchException e){
            System.out.print(e.getMessage());
            in.nextLine();
            return;
        }
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            return;
        }
    }
    static void createCircle(Scanner in){
        System.out.print("Wybrałeś koło!\n");
        double rad;
        System.out.print("Podaj długość promienia koła: \n");
        try {
            rad = in.nextDouble();
            Circle circle1 = new Circle(rad);
            circle1.print();
        }
        catch(InputMismatchException e){
            System.out.print("Nie podałeś liczby!");
            in.nextLine();
            return;
        }
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
            return;
        }
    }
}
