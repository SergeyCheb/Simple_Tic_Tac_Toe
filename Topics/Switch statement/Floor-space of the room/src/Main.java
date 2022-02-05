import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double area = 0;
        switch (shape) {
            case "triangle" :
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle" :
                double l = scanner.nextDouble();
                double h = scanner.nextDouble();
                area = l * h;
                break;
            case "circle" :
                double r = scanner.nextDouble();
                area = 3.14 * r * r;
                break;
            default:
                break;
        }
        System.out.println(area);
    }
}