package Jung;

import java.util.Scanner;

//  1291 : 구구단
public class Main1291 {

	public static void gugudan(int s, int e) {
		// 처음입력단이 두번째 입력단보다 클때
		if(s>e) {//      5  3   -> 5 4 3
			for(int i=1; i<=9; i++) {
				for(int d=s; d>=e; d-- ) {//단
					guguPrint(d, i);
				}
				System.out.println();
			}
		}else {//      3  5   -> 3 4 5
			for(int i=1; i<=9; i++) {
				for(int d=s; d<=e; d++) {
					guguPrint(d, i);
				}
				System.out.println();
			}
		}
	}
	public static void guguPrint(int d, int i) {
		System.out.printf("%d * %d = %2d   ", d, i, d*i );
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int s = scan.nextInt();//시작단
			int e = scan.nextInt();//끝단
			
			//범위안의 단인지 확인
			if(s<2 || s>9 || e<2 || e>9) {
				System.out.println("INPUT ERROR!");
			}else {
				//      5  3   -> 5 4 3
				//      3  5   -> 3 4 5
				gugudan(s, e);
				break;
			}
		}

	}

}
