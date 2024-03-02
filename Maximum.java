
import java.util.Arrays;

public class Maximum 
{
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > array[m])
            {
                m = i;
            } 
            i++;
        }
        return m;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > temmaximum)
               temmaximum = array[i];
            i++;
        }
         
        return temmaximum;
    }
    public static int minimum(int [] array)
    {
        int temminimum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] < temminimum)
               temminimum = array[i];
            i++;
        }
         
        return temminimum;
    }
    public static int minima(int [] array)
    {
        int m = 0;
        int i =1;
        while (i < array.length){
            if (array[i] < array[m])
                m = 1;
            i++;
        } 
        return m;
    }
    public static int[] extrema(int [] array)
   {
      if (array.length == 0)
      {
         return null;
      }
      int ele = 1;
      int max = array[0];
      int min = array[0];
      while (ele < array.length)
      {
         if (array[ele] > max)
         {
            max = array[ele];
         }
         else if (array[ele] < min)
         {
            min = array[ele];
         }
         ele++;
      }
      int[] result =
      {
         min, max
      };
      return result;
   }
        static int count = 0;
    static boolean compare(int x, int y) {
        count++;
        return x > y;
    }
    public static int[] extremal(int[] array) {
    if (array.length == 0) {
        return null;
    }
    int max = array[0];
    int min = array[0];
    for (int ele = 1; ele < array.length; ele++) {
        if (compare(array[ele], max)) {
            max = array[ele];
        }
        else if (compare(min, array[ele])) {
            min = array[ele];
        }
    }
    int[] result = {min, max};
    return result;
    }    
    // test driver
    public static void main(String[] args) 
    {
       int [] arr = new int[]{342,34,233,456};
       System.out.println(maximum(arr));
       System.out.println(maxima(arr));
       System.out.println(minimum(arr));
       System.out.println(minima(arr));
       System.out.println(Arrays.toString(extrema(arr)));
    }
}