
package chapter;

import java.util.Scanner;

/*
 * 2024. 03.19
 * 202195057 손패택
 */
public class MultiIfTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner stdIn=new Scanner(System.in);
System.out.print("점수 입력 : ");
int score = stdIn.nextInt();

if(score >=90) {
	System.out.println("A");
}else if(score >= 80) {
	System.out.println("B");
}else if(score >= 70) {
	System.out.println("C");
}else if(score >= 80) {
		System.out.println("D");
}else if(score >= 80) {
			System.out.println("E");
}else if(score >= 80) {
				System.out.println("F");
}
}
}