package javaexampl;

import java.util.Scanner;

public class Zoho {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter input count");
		int count=obj.nextInt();
		String [] values= new String[count];
		System.out.println("Enter the "+count+" String word");
		for(int i=0;i<count;i++) {
			String word =obj.next();
			String WORD=word.toUpperCase();
			if(WORD.length()%2 !=0) {
				values[i]=WORD;
			}
			else
			{
				System.out.println("**OOPS** Invalid input.Your input length should be have only ODD values ");
				System.exit(0);
				
			}
		}
		
		for(int i=0;i<count;i++) {
			String temp=values[i];
			int len= temp.length(),mid=len/2,mid2=mid-1,b=mid+1;
			
			for(int j=0;j<len;j++) {
				
				if(j<=mid) {
					b--;
					mid2++;
				for(int k=0;k<len;k++) {
					if(k==0||k==len-1) {
						System.out.print(temp.charAt(mid2));
						
					}
					else if(j>0 && (k==len-j-1||k==j)) {
						System.out.print(temp.charAt(b));
						
					}
					else {System.out.print(" ");
					}
				}
				System.out.println();
				}
				else if(j>mid) {
					b++;
					mid2--;
					for(int k=0;k<len;k++) {
						if(k==0||k==len-1) {
							System.out.print(temp.charAt(mid2));
							
						}
						else if(j>0 && (k==len-j-1||k==j)) {
							System.out.print(temp.charAt(b));
							
						}
						else {System.out.print(" ");
						}
					}
					System.out.println("");
					}
				}
				}		
	}
}
