/* this program is for searching an element x present in array arr */
public class Main
{
	public static void main(String[] args) {
	int n=5;
	int arr[]=new int[2*n];
	arr[0]=10;
	arr[1]=14;
	arr[2]=19;
	arr[3]=12;
	arr[4]=18;
	int x=12;
	for(int i=0; i<=n;i++){
	    if(arr[i]==x){
	        System.out.println("element is found at "+i);
	    }
	    else{
	        System.out.println("element is not found"); 
	    }
	}
	}
}
