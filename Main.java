package dizidekiEnYakinElemanlar;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hangi say�ya yak�n elemanlar� bulmak istiyorsunuz: ");
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		int num=scanner.nextInt();
		int minNum=list[0];
		int maxNum=list[0];
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		for(int i=0;i<list.length;i++) {
			if(num<=list[i]) {
				maxNum=list[i];				
				break;
			}
			if(num>=list[i]) {
				minNum=list[i];
				
			}
			
		}
		System.out.println("Girilen say�ya en yak�n b�y�k say�: "+maxNum);
		System.out.println("Girilen say�ya en yak�n k���k say�: "+minNum);
	}

}
