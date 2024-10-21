/**
 * Min_ele
 */
public class Min_ele {

    public static void main(String[] args) {
        int[] a={1,4,2,5,7,5,8,9};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            
        }
        System.out.println(min);


    }
}