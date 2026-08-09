public class Problem26 {
    public static int [] RemoveDuplicate(int arr[]){
        int n = arr.length;//length of the array
        //if the length of the array is 0 or 1 then return the array as it is
        if(n==0 || n==1){
            //returning the array as it is
            return arr;
        }//sorting the array
        int j=0;
        //traversing the array and checking if the current element is not equal to the next element then add it to the new array
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }//adding the last element of the array to the new array
        arr[j++]=arr[n-1];
        int [] result = new int[j];
        for(int i=0;i<j;i++){
            result[i]=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5};
        int result[] = RemoveDuplicate(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
