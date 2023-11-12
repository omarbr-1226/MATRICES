import java.util.Scanner;
/*De una matriz de 3x3 en numeros enteros encontrar el numero más alto y el numero más bajo
 * y la casilla que ocupan dentro de la matriz* */
public class EJERCICIO_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int matriz[][] = new int[3][3];

        /*j filas, i columnas*/
        int i, j, posi=-1;
        int renMax,colMax,renMin,colMin;
        int max,min;

        for (i=0; i<matriz.length; i++){
            for (j=0; j<3; j++){
                matriz[i][j]=0;
            }
        }


        for (i=0; i<matriz.length; i++){
            for (j=0; j<3; j++){
                System.out.println("Introduce valor para la matriz ["+(i+1)+","+(j+1)+"]:");
                matriz[i][j]= sc.nextInt();
            }
        }
        max=-32767;
        min=32768;
        for (i=0; i<matriz.length; i++){
            for (j=0; j<3; j++){
                if (matriz[i][j]>max){
                    max=matriz[i][j];
                    renMax=i;
                    colMax=j;
                }
                if (matriz[i][j]<max){
                    min=matriz[i][j];
                    renMin=i;
                    colMin=j;
                }
            }
        }

    }
}
