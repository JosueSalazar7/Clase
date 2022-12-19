public abstract class Figuras { //Clase Padre
    double x,y;
    double perimetro, area;
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    protected abstract void calcularperimetro();

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    protected abstract void calculararea();


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
