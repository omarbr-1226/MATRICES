import java.util.Scanner;

//cauadro magico
public class EJERCICIO_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuadro[][];
        int numero,ren,col,T;
        int priren,utlRen,priCol,ultCol;
        do {
            System.out.println("Ingresa las dimensiones del cuadro magico");
            T = sc.nextInt();
        }while (T%2==0 || T<3);

        cuadro=new int[T][T];

        //Inicializar matriz

        for (ren=0; ren<T; ren++){
            for (col=0; col<T; col++){
                cuadro[ren][col]=0;
            }
        }

        //formacion del cuadro
        priren=0;
        utlRen=T-1;
        priCol=0;
        ultCol=T-1;
        ren=0;
        col=T/2;
        numero=1;
        while (numero <=T){
            cuadro[ren][col]=numero;
            if (ren==priren && col==ultCol) {
                ren = ren + 1;
            }else{
                if (ren==priren)
                    ren=utlRen;
                else
                    ren=ren-1;

                if (col==ultCol)
                    col=priCol;
                else
                    col=col+1;
            }
            if (cuadro[ren][col]!=0){
                ren = ren+2;
                col = col-1;
            }
            numero=numero+1;
        }
        for (ren=0; ren<T; ren++){
            for (col=0; col<T; ren++){
                System.out.println(cuadro[ren][col]+"");
            }
            System.out.println("");
        }





    }
}
