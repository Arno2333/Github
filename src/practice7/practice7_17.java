package practice7;
import java.util.Scanner;
import java.util.Arrays;

public class practice7_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������ѧ�������� ");
		int n=input.nextInt();
		String[] name=new String[n];
		int[] scores=new int[n];
		for(int i=0; i<name.length; i++) {
			System.out.print("�������"+(i+1)+"��ѧ���������ͳɼ��� ");  
			name[i]=input.next();	
			scores[i]=input.nextInt();		
		}	
		java.util.Arrays.parallelSort(scores);	
		for(int i=name.length-1; i>=0; i--) {
			System.out.println(name[i]);
		}		
	}
}

