import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = generatePermutations(nums);
        System.out.println(permutations);
    }

    public static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue;  // Пропускаем повторяющиеся элементы
                }
                tempList.add(nums[i]);
                backtrack(nums, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}