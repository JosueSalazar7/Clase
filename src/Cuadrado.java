public class Cuadrado extends Figuras{
    private double lado;
    public Cuadrado(double lado){
        this.lado=lado;
        calculararea();
        calcularperimetro();
    }
    @Override//Sobre escribir
    protected void calculararea(){
        area = lado*lado;
    }
    @Override
    protected void calcularperimetro(){
        perimetro = lado*4;
    }

}
