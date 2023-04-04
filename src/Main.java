import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        * An array is a container object that holds
        * a fixed number of values of a single type.
        * The length of an array is established when the array is created
        * */

        //declaring an array of integers:
        int[] arr;

        //allocating memory for 10 integers:
        arr = new int[10];

        //arrays could also be created and initialized by using this syntax:
        int[] arr2 = {12, 54, 98, -90, 6, 3, 11, 54, -8};
        //indexes     0   1    2    3  4  5   6   7   8
        // these indexes are used to access a certain element of
        // the array:
        System.out.println("arr2[0] is: " + arr2[0]); //arr2[0] is 12

        // by using indexes, the values of the elements could be changed:
        arr2[2] = 333;
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
        System.out.println("arr2 lenght is: " + arr2.length);

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
        System.out.println(Arrays.toString(arr2));


        //arrays could be copied using arraycoppy method:
        int[] newArr = new int[arr2.length];
        System.arraycopy(arr2, 0, newArr, 0, arr2.length);
    }
}