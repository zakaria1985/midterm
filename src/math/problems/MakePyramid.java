package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int  n = 6;
        int x = 5*n;
        for ( int i = 0; i< n; i++){
            for ( int j = 0; j<x; j++){
                System.out.println(" ");


            }
            x= x-1;
            for ( int j =0; j<= i; j++){
                System.out.println("*");
            }
            System.out.println( );
        }


        }
  }
