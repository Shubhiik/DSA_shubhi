public class Main {

    public static void main(String[] args) {
        int arr[]= {2,8,5,3,1};
        int n= arr.length;
        for(int i=0; i<n-1;i++){
            int min_value = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_value]){
                    min_value=j;
                    int temp=arr[min_value];
                    arr[min_value]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
