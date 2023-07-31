package first_project;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 3, 7, 9, 5, 8, 1, 1};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));

	}
	 public static int[] removeDuplicates(int[] arr) {
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int i : arr) {
	            if (!list.contains(i)) {
	                list.add(i);
	            }
	        }
	        int[] result = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            result[i] = list.get(i);
	        }
	        return result;
	 }
}
