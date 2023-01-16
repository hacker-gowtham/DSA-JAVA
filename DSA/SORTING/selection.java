public class selection {
    public static void main(String[] args) {
        int[] arr={34,89,56,23,67};
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                   int temp =arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                }
            }
        }
            System.out.println("After swapping");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +"  ");
        }
    }
    
}
