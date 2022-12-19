public class Rectangulo extends Figuras{//Clase hijo
   private double base;
   private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calculararea();
        calcularperimetro();
    }
    @Override
    protected void calculararea(){
        area = base * altura;
    }
    protected void calcularperimetro(){
        perimetro = base*2+altura*2;
    }
}
