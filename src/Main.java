import java.util.Random;

public class Main {

    static long minValue = 333;
    static long maxValue = 888;
    static Random rand = new Random();

    static long getRandomValue() {
        return minValue + rand.nextLong(maxValue - minValue);
    }

    static void printArray(long[] arr) {
//        System.out.println("*** forEach");
//        int c = 0;
//        for (long var : arr) {
//            System.out.println(c + " :: " + arr[c]);
//            c++;
//        }

        System.out.println("*** 'for' Cycle ***");
        for (int v = 0; v < arr.length; v++) {
            System.out.println(v + " :: " + arr[v]);
        }

/*
        System.out.println("*** 'while' Cycle ***");
        int b = 0;
        while (b < arr.length) {
            System.out.println(b + " :: " + arr[b]);
        }
*/

//        System.out.println("*** 'do....while' Cycle ***");
//        int n = 0;
//        do {
//            System.out.println(n + " :: " + arr[n]);
//            n++;
//        } while (n < arr.length);
    }

public static void main(String[] args){
            String lineSeparator = System.lineSeparator();
            int arraysLength = 10;


        System.out.println("*** Bubble sorting ***");
        long[] arrayToSort;
        arrayToSort = new long[arraysLength];
        for (int c = 0; c < arraysLength; c++) {
            arrayToSort[c] = getRandomValue();
        }
        System.out.println(" *** Before sorting ***");
        printArray(arrayToSort);
        for (int c = 1; c < arrayToSort.length; c++){
            for (int v = 0; v < c; v++) {
                if (arrayToSort[c] > arrayToSort[v]) {
                    var tmp = arrayToSort[c];
                    arrayToSort[c] = arrayToSort[v];
                    arrayToSort[v] = tmp;
                }
            }
        }
        System.out.println("*** After sorting ***");
        printArray(arrayToSort);
    }
}


