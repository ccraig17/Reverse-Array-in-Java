import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};

        reverse(myArray);


    }
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length -1;
        int lengthArray = array.length/2;

        for(int i =0; i <lengthArray; i+=1){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
