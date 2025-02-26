package CursosMetodos.sesion3.AreasFiguras;

import CursoMetodos.sesion3.areasFiguras.AreasFiguras;

public class MainAreasDeFiguras{
    public static void main(String[] args) {

        AreasFiguras areasFigurasObjeto = new AreasFiguras();

        double base = 10;
        double altura = 5;
        double radio = 10;


        System.out.println("Rectangulo: " + areasFigurasObjeto.areaRectangulo(5,3));

        System.out.println("Triangulo: " + areasFigurasObjeto.areaTriangulo(base,altura));
        System.out.println("Circulo: " + areasFigurasObjeto.areaDeUnCirculo(radio));

    }
}
