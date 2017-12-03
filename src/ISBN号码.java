import java.util.Scanner;

public class ISBNºÅÂë {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] res = string.toCharArray();
		string = string.replace("-", "");
		char[] array = string.toCharArray();
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < array.length - 1;i++){
			sum  = sum + (array[i] - '0')*(i + 1);
		}
		sum = sum%11;
		if (sum == 10){
			if ('X' == array[array.length - 1] - '0'){
				flag = true;
			}
			else {
				res[res.length - 1] = 'X';
			}
		}else{
			if (sum == array[array.length - 1] - '0'){
				flag = true;
			}
			else {
				String temp = sum + "";
				res[res.length - 1] = temp.charAt(0);
			}
		}
		
		if (flag){
			System.out.println("Right");
		}
		else {
			for (int i = 0; i < res.length; i++){
				System.out.print(res[i]);
			}
		}
		
	}

	 
}
