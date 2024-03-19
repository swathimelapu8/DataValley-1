import java.util.*;
public class Elementcount
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++){
		    array[i]=input.nextInt();
		}
		int temperory=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(array[j]>array[j+1]){
		            temperory=array[j];
		            array[j]=array[j+1];
		            array[j+1]=temperory;
		        }
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:array){
		    if(map.containsKey(i)){
		        map.put(i,map.get(i)+1);
		    }else{
		        map.put(i,1);
		    }
		}
		int num_count=input.nextInt();
		System.out.println(map.get(num_count));
		
	}
}
