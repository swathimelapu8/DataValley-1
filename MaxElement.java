import java.util.*;
public class MaxElement
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++){
		    array[i]=input.nextInt();
		}
		int maximum_element=array[0];
		for(int i=1;i<n;i++){
		    if(array[i]>maximum_element){
		        maximum_element=array[i];
		    }
		}
		System.out.println(maximum_element);
		
	}
}
