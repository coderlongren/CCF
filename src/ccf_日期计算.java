import java.util.Scanner;

public class ccf_ÈÕÆÚ¼ÆËã {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scanner = new Scanner(System.in);
		int y,d;
		y = scanner.nextInt();
		d = scanner.nextInt();
		if (y %4 == 0 && y %100 != 0 || y % 400 == 0){
			days[1] = 29;
		}
		for (int i = 0; i <days.length ;i++){
			if (d > days[i]){
				d = d - days[i];
			}
			else{
				System.out.println(i + 1);
				System.out.println(d);
				break;
			}
			
		}
		
	}

}
