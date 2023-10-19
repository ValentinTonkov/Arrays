import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        * An array is a container object that holds
        * a fixed number of values of a single type.
        * The length of an array is established when the array is created
        * */

        //declaring an array of integers:
        int[] arr3;

        //allocating memory for 10 integers:
        arr3 = new int[10];

        //arrays could also be created and initialized by using this syntax:
        int[] arr = {12, 54, 98, -90, 6, 3, 11, 54, -8};
        //indexes     0   1    2    3  4  5   6   7   8
        // these indexes are used to access a certain element of
        // the array:
        System.out.println("arr[0] is: " + arr[0]); //arr2[0] is 12

        // by using indexes, the values of the elements could be changed:
        arr[2] = 333;
        //now the array will look like this:
        // {12, 54, 333, -90, 6, 3, 11, 54, -8}

        //creating array of bytes:
        byte[] bytes = {12, 8, 124, 7, -3};

        //creating array of chars:
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        //creating array of Integers:
        Integer[] integers = new Integer[5];
        integers[0] = 322;
        integers[1] = 322;
        integers[2] = 322;
        integers[3] = 322;
        integers[4] = 322;

        //getting the lenght of an array:
        System.out.println("arr2 lenght is: " + arr.length);

        //arrays can't be printed using the array identifier only:
        System.out.println(integers); // this will print [Ljava.lang.Integer;@816f27d

        //the array should be printed using its identifier and indexes:
        System.out.println(integers[0] + " " + integers[1] + " " + integers[3] + " and so on..");
        //or using a for loop or foreach:
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();
        //or using Arrays.toString() method
        System.out.println(Arrays.toString(arr));


        //creating copy of an array
        System.out.println("copy of an array");
        int[] arr4 = new int[arr.length];
        System.arraycopy(arr, 0, arr4, 0, arr.length);
        arr[1] = 44;
        printArray(arr);
        printArray(arr4);


        //reversing array elements
        System.out.println("reversing array");
        printArray(reverseArray(arr));
        printArray(reverseArrayUsingNewArray(arr));


        //sort array
        System.out.println("sorting arrays");
        printArray(sortArray(arr));
        Arrays.sort(arr);
        printArray(arr);

        //Array with Integer Objects
        Integer[] objectsArray = {1, 44, 22, 23, 193};

        System.out.println(Arrays.deepToString(objectsArray)); //параметъра трябва да е Object, трябва да се изпозлват за целта
        //масиви от Wrapper класовете или от други обекти, например String

        //char arrays
        System.out.println("char array");
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        printArray(charArray);
        for (int i =0; i < charArray.length; i++){
            charArray[i] = 'h';
        }
        printArray(charArray);
        System.out.println();
        pyramid();


        //Multi dimension
        System.out.println("multi dimension arrays");
        int[][] multiDimArr ;
        multiDimArr = new int[4][4];
        multiDimArr[0][0] = 3;
        multiDimArr[0][1] = 321;
        multiDimArr[0][2] = 22;
        multiDimArr[0][3] = -21;
        printArray(multiDimArr[0]);

        int[][] multiDimArr2 = {{2,92}, {12, 22, 43, 44}, {12, 443, 55}};
        System.out.println("rows: " + multiDimArr2.length);
        for (int i = 0; i < multiDimArr2.length; i++){
            System.out.print(multiDimArr2[i].length + " elements : ");
            printArray(multiDimArr2[i]);
        }
    }


    /**
     * prints an int array
     * @param arr
     */
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }


    /**
     * prints an char array
     * @param arr
     */
    private static void printArray(char[] arr){
        for (char c :
                arr) {
            System.out.print("  " + c);
        }
        System.out.println();
    }

    /**
     * prints an Integer array
     * @param arr
     */
    private static void printArray(Integer[] arr){
        for (Integer i :
                arr) {
            System.out.print("  " + i);
        }
        System.out.println();
    }


    /**
     * sorts an array
     * @param arr array to be sorted
     * @return  sorted array
     */
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = temp;
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * reverses an array
     * @param arr
     * @return
     */
    private static int[] reverseArray(int[] arr){
        int j = arr.length - 1;
        for (int i = 0; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    private static int[] reverseArrayUsingNewArray(int[] arr){
        int[] tempArr = new int[arr.length];
        int j = arr.length - 1;
        for (int i :
                arr) {
            tempArr[j] = i;
            j--;
        }
        return tempArr;
    }

    /**
     * creates an array then prints it
     */
    private static void pyramid(){
        int[][] pyramid = new int[6][];
        for (int i = 0; i < pyramid.length; i++){
            pyramid[i] = new int[pyramid.length - i];
            for (int j = 0; j < pyramid.length - i; j++){
                pyramid[i][j] = 1;
            }
        }
        printArray(pyramid[0]);
        printArray(pyramid[1]);
        printArray(pyramid[2]);
        printArray(pyramid[3]);
        printArray(pyramid[4]);
        printArray(pyramid[5]);
    }

}