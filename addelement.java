import java.util.*;
public class addelement
{
    
    public static void main(String []args)
    {
        int array[]={2,5,3,4};

        //print the original array
        for(int i=0;i<array.length;i++)
        {
           System.out.print(array[i]+ " ");
        }

        System.out.println("\n");

        //add new element at 2nd position
        //increase the array size by one.so create a new array

        int result[]=new int [array.length+1];

        int element=8;
        int position=2;

        //copy the array element until the position 2

        for(int i=0;i<position;i++)
        {
            result[i]=array[i];
        }

        //insert new element in position

        result[position]=element;

        //copy the remaining elements
        for(int j=position+1;j<result.length;j++)
        {
            result[j]=array[j-1];
        }

        //print the new array
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result [i]+" ");
        }
    }
}



