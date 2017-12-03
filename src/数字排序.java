import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Êı×ÖÅÅĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n;i++){
			array[i] = scanner.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++){
			if (!map.containsKey(array[i])){
				map.put(array[i], 1);
			}
			else{
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		
		
	}
}
