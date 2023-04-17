public class Main
{
		public static void main(String []args){
         int n=3;
         int[ ]arr= new int [2*n];
          arr[0]=1;
          arr[1]=2;
          arr[2]=4;
          arr[3]=5;
         int x=2;//deleting 2 between 1 and 4
         int pos=1;
         for (int i=pos;i<arr.length-1;i++){
             arr[i]=arr[i+1];
         }
         for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         }
        
	}
}
