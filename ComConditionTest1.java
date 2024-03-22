package chapter;

public class ComConditionTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		publicclassComConditionTest1{

			 

			publicstaticvoidmain(String[]args){

			ScannerstdIn=newScanner(System.in);

			 

			// 1. 정수를 입력 받는다.

			System.out.print("정수 입력 : ");

			intmonth=stdIn.nextInt();

			 

			if(month>=1&&month<=12){

			if(month>=3&&month<6){

			System.out.println(month+"월은 봄 입니다.");

			}

			elseif(month>=6&&month<9){

			System.out.println(month+"월은 여름 입니다.");

			}

			elseif(month>=10&&month<12){

			System.out.println(month+"월은 가을 입니다.");

			}

			else{

			System.out.println(month+"월은 겨울 입니다.");

			}

			}

			else{

			System.out.println("해당 월은 없습니다.");

			}

			}

			}
	}

}
