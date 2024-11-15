package CursoMetodos.sesion2.areasFugura;

public class AreasFiguras {

    //METODO DEL RECTANGULO
    public double areaRectangulo(double largo, double ancho){
        return largo * ancho;
    }

    //METODO DEL TRIANGULO
    public double areaTriangulo(double base, double altura){
        return ((base * altura) / 2);
    }

    //METODO DEL CIRCULO
    public double areaDeUnCirculo(double radio){
        return Math.PI * radio * radio;
    }

}
