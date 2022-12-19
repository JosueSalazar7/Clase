import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double num1,num2;
        do {
            System.out.println("****MENU****");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.print("\nSeleccione una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nIngrese el valor del lado del cuadrado: ");
                    num1 = sc.nextDouble();
                    Cuadrado miCuadrado = new Cuadrado(num1);
                    System.out.println("\nEl area es: " + miCuadrado.getArea());
                    System.out.println("El perimetro es: " + miCuadrado.getPerimetro());
                    break;
                case 2:
                    System.out.print("\nIngrese la base rectangular: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese la altura rectangular: ");
                    num2 = sc.nextDouble();
                    Rectangulo miRectangulo = new Rectangulo(num1, num2);
                    System.out.println("\nEl area es: " + miRectangulo.getArea());
                    System.out.println("El perimetro es: " + miRectangulo.getPerimetro());
                    break;
                case 3:
                    System.out.print("\nIngrese la base del triangulo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    num2 = sc.nextDouble();
                    Triangulo tr = new Triangulo(num1, num2);
                    System.out.println("\nEl area es: " + tr.getArea());
                    System.out.println("El perimetro es: " + tr.getPerimetro());
                    break;
            }
            System.out.print("\nDesea continuar con el programa 1.Si:");
            op=sc.nextInt();
        }while(op==1);
    }
}
