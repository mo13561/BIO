import java.util.*;

public class C27122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt(); int m = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) nums.add(sc.nextInt());
        set.addAll(nums);
        Collections.sort(nums);
        int min = nums.get(0);
        int total = 0;
        int ans = 0;
        for (int i : nums) total += i;
        while (total > m) {
            int max = nums.get(nums.size() - 1);
            if (set.size() != 1) {
                int sz = nums.size();
                total -= nums.get(sz - 1) - nums.get(0);
                nums.set(sz - 1, min);
                if (!nums.contains(max)) set.remove(max);
                ans++;
            } else {
                break;
            }
            Collections.sort(nums);
        }
        if (total > m) {
            ans += total - m;
        }
        System.out.println(ans);
    }
}
