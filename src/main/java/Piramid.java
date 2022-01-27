import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Piramid {
    public static void main(String[] args) {
int n =7;
int i,j;
        for (i = 0; i< n; i++) {
            for ( j = 0; j <n; j++) {
if (j<n-1-i){
                System.out.print(" ");
            }
else {

                System.out.print("#");
            }

            }
            System.out.println();

        }





        for (i = 0; i< n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }





    }}