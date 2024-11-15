package CursoMetodos.sesion2.sumarNumeros;

public class MainSumar {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Sumar
        Sumar sumarObjeto = new Sumar();

        sumarObjeto.sumarNumeros(5,3, "Luis Guillen");

        System.out.println("=============================================");

        sumarObjeto.sumarNumeros(3,5,"Luis");
        sumarObjeto.sumarNumeros(5,10,"Alberto");
        sumarObjeto.sumarNumeros(25,10,"Andy");
        sumarObjeto.sumarNumeros(35,12,"Jeremias");

    }
}
