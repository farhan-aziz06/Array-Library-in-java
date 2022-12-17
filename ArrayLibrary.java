import java.util.Arrays;
public class ArrayLibrary{
  public static void main(String[] args) {
        //**Array Library.... */

        System.out.println("                Array Library");
        System.out.println();
        int [ ] DemoArray = {1,2,6,9,10,4,3,4,5,5};
        int [] e1 = {1,2,3,4,5};
        int [] e2 ={5,4,3,1,2};

        int a1[][] = { { 10, 20 },
                       { 40, 50 },
                       { 60, 70 } };
  
        int a2[][] = { { 30, 20 },
                       { 10, 0 },
                       { 60, 80 } };
  

        // !binarySearch()	Searches for the specified element in the array with the help of the Binary Search Algorithm

       int b= Arrays.binarySearch(DemoArray,9);
        System.out.println("binarySearch(): "+b);

        //!compare(array 1, array 2)	Compares two arrays passed as parameters lexicographically.
        /*
            It returns 0 if the array is equal to the other array.
            It returns a value less than 0 is returned if the array is lexicographically  less than the other array in
            It returns a value greater than 0 if the array is lexicographically greater than the other array (more characters).
         */

        int[] DemoArray2= {9,4,2,14,14,15,6,6,3,45};

        System.out.println(Arrays.compare(DemoArray2,DemoArray));


        //!copyOf(originalArray, newLength)	Copies the specified array,
        // truncating or padding with the default value (if necessary) so the copy has the specified length.

        int [] Copyofarray = Arrays.copyOf(DemoArray,12);

        Copyofarray[10]=12;
        Copyofarray[11]=12;

        for (int i =0; i<Copyofarray.length;i++){
            System.out.print( "Copy Of Array" +Copyofarray[i]+" ");
        }
        //!equals(array1, array2)	Checks if both the arrays are equal or not.
        System.out.println();
        System.out.println("Equal=True & !Equal=Falsse");
        System.out.println(Arrays.equals(e1,e2));

        //!static boolean 	deepEquals(Object[] a1, Object[] a2)
        //!Returns true if the two specified arrays are deeply equal to one another.
       
        System.out.println("deepEqual");
        System.out.println(Arrays.deepEquals(a1, a2));

        //!deepHashCode(Object[] a) Returns a hash code based on the "deep contents" of the specified array.

        System.out.println("deepHashCode: "+Arrays.deepHashCode(a2) );
        System.out.println("deepHashCode: "+Arrays.deepToString(a1));

        //!deepToString(Object[] a) Returns a string representation of the "deep contents" of the specified array.
        

        System.out.println("deepToString: "+ Arrays.deepToString(a2));

        //! fill(int[] a, int val) Assigns the specified int value to each element of the specified array of ints.

        Arrays.fill(e1, 2);

        for(int value: e1){
            System.out.print(value);
        }
        System.out.println();

        //!hashCode(int[] a) Returns a hash code based on the contents of the specified array.

        System.out.println("hashCode: "+ Arrays.hashCode(e1));

        //!sort(int[] a) Sorts the specified array into ascending numerical order.
        System.out.println("Sort Funtion: ");

        System.out.println("Original Array: ");

        for(int n :e2){
            System.out.println(n);
        }

        System.out.println("Sorted Array: ");
        
        Arrays.sort(e2);

        for(int n : e2){
            System.out.println(n);
        }

        //! 	toString(int[] a) Returns a string representation of the contents of the specified array.

        System.out.println("ArraysToString: "+ Arrays.toString(e2));

        //!spliterator(originalArray)	Returns a Spliterator covering all of the specified Arrays.

        System.out.println("spliterator"+Arrays.spliterator(a1));

        

    }
}
