public class ColorTriangulo extends Triangulo{
    private String color;
    ColorTriangulo(String c, String s, double h, double b){
        super(b,h);
        color =c;
    }
    String getColor(){
        return color;
    }
    void Mostrar_Color(){
        System.out.println("El colo es: " + color);
    }
}
