package com.array;

/**
 * <h1>5 Dimentional Array</h1>
 * Main class consists method to print 5-dimentional array
 * to console.
 *
 * @author Julia Marushchenko
 * @version 1.0
 * @since 2025-05-13
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating the array
        int [][][][][] array = new int[2][3][2][4][4];

        // Filling the array with random numbers
        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[0].length; index1++){
                for (int index2 = 0; index2 < array[0][0].length; index2++){
                    for (int index3 = 0; index3 < array[0][0][0].length; index3++){
                        for (int index4 = 0; index4 < array[0][0][0][0].length; index4++){
                            array[index][index1][index2][index3][index4] = index;
                        }
                    }
                }
            }
        }

        // Printing the array to console
        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[0].length; index1++){
                for (int index2 = 0; index2 < array[0][0].length; index2++){
                    for (int index3 = 0; index3 < array[0][0][0].length; index3++){
                        for (int index4 = 0; index4 < array[0][0][0][0].length; index4++){
                            System.out.print(array[index][index1][index2][index3][index4] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
