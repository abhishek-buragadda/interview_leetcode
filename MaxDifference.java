public class MaxDifference {


    public int maxDifference(int[] a ){
        int max_diff = -1;
        if(a.length < 2) return max_diff;
        int min_element = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > min_element) {
               if(a[i] - min_element > max_diff)
                    max_diff = a[i] - min_element;
            }
            else if (a[i] < min_element)
                min_element = a[i];

        }
        return max_diff;
    }
}
