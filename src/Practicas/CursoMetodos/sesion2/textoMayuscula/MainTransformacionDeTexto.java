package CursoMetodos.sesion3.textoMayusculas;

import CursoMetodos.sesion3.textoMayusculas.TextoMayuscula;

public class MainTransformacionDeTexto {
    public static void main(String[] args) {

        TextoMayuscula textoMayusculaObjetos = new TextoMayuscula();

        String textoOriginal = "Hola mi nombre es luis guillen este es un saludo";
        String textoTransformado = textoMayusculaObjetos.transformarLetraMayuscula(textoOriginal);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto Transformado: " + textoTransformado);
    }
}
