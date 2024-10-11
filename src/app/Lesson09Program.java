package app;

import java.util.Arrays;
import java.util.Random;

public class Lesson09Program {
    public static void main(String[] args) {
        Random random = new Random();
        //1,2,3,4,5,6,7,8
        //8,7,6,5,4,3,2,1
        //1,2,3,4,5,6,7,8
        //8,7,6,5,4,3,2,1
        //1,2,3,4,5,6,7,8
        //8,7,6,5,4,3,2,1
        //1,2,3,4,5,6,7,8
        //8,7,6,5,4,3,2,1

        int[][] array2D = new int[3][3];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if(i == j){
                    sum += array2D[i][j];
                }
            }
        }
        System.out.println(sum);

//        int[][] array2d = new int[8][8];
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++) {
//                if (i % 2 == 0){
//                    array2d[i][j] = j + 1;
//                }else {
//                    array2d[i][j] = array2d[i].length - j;
//                }
//            }
//        }
//        for (int i = 0; i < array2d.length; i++) {
//            System.out.println(Arrays.toString(array2d[i]));
//        }
//        int minNumber = Integer.MIN_VALUE;
//        int row = random.nextInt(array2d.length);
//        int column = random.nextInt(array2d[0].length);
//        array2d[row][column] = minNumber;

//        for (int i = 0; i < array2d.length; i++) {
//            System.out.println(Arrays.toString(array2d[i]));
//        }

//        int[][] array2D = new int[2][3];
//
//        for (int i = 0; i < array2D.length; i++) {
//            for (int j = 0; j < array2D[i].length; j++) {
//                array2D[i][j] = random.nextInt(10);
//            }
//        }
//
//        array2D = Arrays.copyOf(array2D, 3);
//        array2D[array2D.length - 1] = new int[3];
//        for (int i = 0; i < array2D[array2D.length - 1].length; i++) {
//            array2D[array2D.length - 1][i] = random.nextInt(10);
//        }
//
//        for (int[] arr :
//                array2D) {
//            System.out.println(Arrays.toString(arr));
//        }

//        int[][][] array3D = new int[5][5][5];
//        for (int i = 0; i < array3D.length; i++) {
//            for (int j = 0; j < array3D[i].length; j++) {
//                for (int k = 0; k < array3D[i][j].length; k++) {
//                    System.out.println(array3D[i][j][k]);
//                }
//            }
//        }
        //int[][] array2D = new int[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
//        int[][] array2D = {{1,2,3}, {1,2,3,4}, {1,2,3}};

        //System.out.println(Arrays.deepToString(array2D));

        //int[][] array2D = new int[5][5];

//        for (int i = 0; i < array2D.length; i++) {
//            for (int j = 0; j < array2D[i].length; j++) {
//                System.out.print(array2D[i][j] + ", ");
//            }
//            System.out.println();
//        }

//        int[][] array2D = new int[5][];
//        for (int i = 0; i < array2D.length; i++) {
//            array2D[i] = new int[i +1];
//        }

//        for (int i = 0; i < array2D.length; i++) {
//            System.out.println(Arrays.toString(array2D[i]));
//        }

    }
}
