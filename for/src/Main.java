//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("My home work with for");

       /* System.out.println("********");
        System.out.println("********");
        System.out.println("********");
        System.out.println("********");*/

        int height = 5;
        int width = 8;
        for (int i = 0; i < height; i++) {
            for (int g = 0; g < width; g++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //System.out.println("*");
        //System.out.println(" *");
        //System.out.println("  *");
        //System.out.println("   *");
        //System.out.println("    *");
        //System.out.println("     *");
        //System.out.println("      *");
        //System.out.println("       *");

        int size = 8;

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (y == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();


        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (y + x == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            {
            }
            System.out.println();
        }


                  /*System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");*/
        {
            System.out.println();
            {

                for (int u = 7; u > 0; u--) {
                    for (int w = 0; w < u; w++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                System.out.println();

                for (int u = 1; u <= 7; u++) {
                    for (int w = 0; w < u; w++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

                 /* System.out.println("       *   ");
                    System.out.println("      ***   ");
                    System.out.println("     *****   ");
                    System.out.println("    *******  ");
                    System.out.println("   *********  ");
                    System.out.println("  ***********  ");
                    System.out.println(" **************");*/
        System.out.println();

        for (int f = 0; f <7; f++) {

            for (int l = 0; l < 7  - f-1; l++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * f + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*                            ("        *   ");
                                      ("      * * *   ");
                                     ("     * * * * *   ");
                                     ("   * * * * * * *  ");
                                    ("  * * * * * * * * * ");
                                  ("  * * * * * * * * * * *  ");
                                ( " * * * * * * * * * * * * *");
                                  ("  * * * * * * * * * * *  ");
                                    ("  * * * * * * * * *  ");
                                     ("   * * * * * * *  ");
                                     ("     * * * * *   ");
                                      ("      * * *   ");
                                      ("        *   ");
                          */




}}









