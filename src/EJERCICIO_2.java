import java.util.Scanner;
/*Sea una matriz de M x N con números enteros

* a)sumar todos sus renglones y almacenarlos
* en la posición N+1 de cada renglón.
*
* b)Sumar todas sus columnas y almacenarlos en la
* posición M+1 de cada columna.
*
* c) sumar su diagonal principal (superior izquierda
* a inferior derecha) y almacenarlo en la posición M+1, N+1*/
public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de renglones para la matriz");
        int R= sc.nextInt();
        System.out.println("Ingresa la cantidad de columnas");
        int C= sc.nextInt();
        int ren,col;

        int[][]matrix = new int[R][C];

        for (ren = 0; ren<R; ren++) {
            for (col = 0; col<C; col++) {
                matrix[ren][col]=0;
            }
            System.out.println("");
        }

        for (ren=0; ren<R-1; ren++){
            for (col=0; col<C-1; col++){
                System.out.println("Introduce valor para la matriz ["+ren+","+col+"]:");
                matrix[ren][col]= sc.nextInt();
            }
            System.out.println(" ");
        }

        /*for (ren=0; ren<R; ren++){
            for (col=0; col<C; col++){
                System.out.println(matrix[ren][col]);
            }
            System.out.println("");
        }*/

        //para los renglones
        for (ren=0; ren<R-1; ren++){
            for (col=0; col<C-1; col++){
                matrix[ren][C-1]=matrix[ren][C-1]+matrix[ren][col];
            }
        }
        //para las columnas
        for (col=0; col<C-1; col++){
            for (ren=0; ren<C-1; ren++){
                matrix[R-1][col]=matrix[R-1][col]+matrix[ren][col];
            }
            System.out.println("");
        }
        //para la diagonal
        for (ren=0; ren<R-1; ren++){
            matrix[R-1][C-1]=matrix[R-1][C-1]+matrix[ren][ren];
        }

        //salida de resultados
        for (ren=0; ren<R; ren++){
            for (col=0; col<C-1; col++){
                System.out.println(matrix[ren][col]);
            }
            System.out.println("");
        }









    }
}
