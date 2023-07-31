package first_project;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class IntersectionArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 5, 7, 9, 11};

        int[] result = intersection(arr1, arr2);

        for (int i : result) {
            System.out.print(i + " ");
        }
	}
	public static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j && !list.contains(i)) {
                    list.add(i);
                    break;  } } }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
	}
}
