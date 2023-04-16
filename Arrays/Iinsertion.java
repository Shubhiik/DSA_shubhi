public class insertion{

     public static void main(String []args){
         int n=3;
         int[ ]arr= new int [2*n];
          arr[0]=1;
          arr[1]=2;
          arr[2]=4;
          arr[3]=5;
         int x=3;//inseting 3 between 2 and 4
         int pos=2;
         n=n+1;
         for (int i=0;i<n;i++)//running elements start to end 
         {
             System.out.print(arr[i]+" ");
         }
         for (int i=n-1;i>=pos+1;i--)//pushing elements to the right
         {
             arr[i]=arr[i-1];//putting elements
         }
         arr[pos]=x;
         for(int i=0;i<n;i++)//display of new array
         {
             System.out.print(arr[i]+"");
         }
     }
}
