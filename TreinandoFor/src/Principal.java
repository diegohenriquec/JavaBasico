import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //verifique se uma string tem o tamanho maior que 10 usando o for 
        //Imprima caracter a caracter da string
        // Quando a string tiver a letra "a" pule 2 caracteres se possivel
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        for ( int i = 0; i < texto.length(); i++){
            if (i == 8){
            System.out.print("O tamanho da String é maior que 10");
        }
        System.out.println (texto.substring(i, (i + 1)));
        if (texto.substring(i, i + 1)).toLowerCase().equals("a")
            && (i + 2) < texto.length(){ i = i + 2;

            }
    }
    

    }

}
