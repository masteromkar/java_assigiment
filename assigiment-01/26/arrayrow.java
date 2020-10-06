class arrayrow
{
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        int c[]={9,10,11,12};
        int d[]={13,14,15,16};
        int e[]={17};

        int arr[][]=new int[5][];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        int sum=0;
        for(int[] i : arr)
         for(int j:i)
           sum=sum+j;
       
        System.out.println("sum of element is "+sum);
    }
}