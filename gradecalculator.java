import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        int totalMarks;
        double percent;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks Out of 100");
        System.out.println("Enter the marks obtained in Java:");
        int java = sc.nextInt();
        System.out.println("Enter the marks obtained in Python:");
        int python = sc.nextInt();
        System.out.println("Enter the marks obtained in Html:");
        int html = sc.nextInt();
        System.out.println("Enter the marks obtained in Css:");
        int css = sc.nextInt();
        System.out.println("Enter the marks obtained in BootStrap:");
        int bootStrap = sc.nextInt();

        if (java < 35 || python < 35 || html < 35 || css < 35 || bootStrap < 35) {
            System.out.println("Fail!");
        } else {
            totalMarks = java + python + html + css + bootStrap;

            if (java > 100 || python > 100 || html > 100 || css > 100 || bootStrap > 100) {
                System.out.println("The marks should be out of 100 only");
            } else {
                System.out.println("totalMarks marks:");
                System.out.println(totalMarks+" Out of 500");

                percent = (double) totalMarks / 5;
                System.out.println("Percentage:");
                System.out.println(percent);

                if (percent > 90) {
                    System.out.println("A+ grade");
                } else if (percent > 80) {
                    System.out.println("A grade");
                } else if (percent > 70) {
                    System.out.println("B Grade");
                } else if (percent > 50) {
                    System.out.println("C Grade");
                } else if (percent >= 35) {
                    System.out.println("Pass");
                }
            }

        }
    }
}
