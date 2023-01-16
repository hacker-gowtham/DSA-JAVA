public class bubble{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int[] arr= new int[5];
//         for(int i=0;i<5;i++){
//             System.out.println("Enter the array element of"+i);
//             arr[i]=sc.nextInt();
//         }

//         for (int i=0;i<arr.length-2;i++){
//             for(int j=0;j<arr.length-2-i;j++)     //linkedin pseudo code 
//             {
//                 if(arr[j]>arr[j+1]){
//                   int tmp= arr[j+1];
//                   arr[j+1]=arr[j];
//                   arr[j]=tmp;


//                 }
//             }
//         }

//         for(int k=0;k<5;k++)

//         {
//             System.out.println("element after sorting");
//             System.out.println(arr[k]);
//         }


//     }
// }



public static void main(String[] args) {
    int[]  a={20,60,14,67,89};
    int n =a.length;
    for(int i=1;i<=n;i++){
        for(int j=0;j<n-i;j++){
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    System.out.println("element after sorting");
    for(int k=0;k<5;k++)

             {
               
                System.out.println(a[k] +" ");
             }
    
}
}