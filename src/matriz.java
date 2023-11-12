import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1.-Declaracion del arreglo*/
        int [][]Matriz= new int[3][3];
        int ren, col;

        /*2.-Inicializar la matriz*/
        for (ren=0; ren<3; ren++){
            for (col=0; col<3; col++){
                Matriz[ren][col]=0;
            }
        }

        /*3.-Llenado de la matriz*/
        for (ren=0; ren<3; ren++){
            for (col=0; col<3; col++){
                System.out.println("Introduce valor para la matriz ["+(ren+1)+","+(col+1)+"]:");
                Matriz[ren][col]= sc.nextInt();
            }
        }

        /*4.-Solucion (esto depende del planteamiento del problema)*/

        /*5-.Impresion de la matriz*/
        for (ren=0; ren<3; ren++){
            for (col=0; col<3; col++){
                System.out.print(Matriz[ren][col]+" ");
            }
            System.out.println("");
        }


    }
}