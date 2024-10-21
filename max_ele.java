public class max_ele {
    public static void main(String[] args) {
        
        int[] a={1,4,2,5,7,5,8,9};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);

    }
    
}
