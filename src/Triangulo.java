public class Triangulo extends Figuras{
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calculararea();
        calcularperimetro();
    }


    @Override
    public void calculararea(){
        area = base*altura/2;
    }
    public void calcularperimetro(){
        perimetro = base*3;
    }

}
