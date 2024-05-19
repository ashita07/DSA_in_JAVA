public class Main {
    public static void main(String[] args) {
        int ans=maximumEnergy(new int[]{5,-7,8,-9,0,6,-3,1},2);
        System.out.println(ans);
    }
        public static int maximumEnergy(int[] energy, int k) {
            int n = energy.length;
            for (int j = n - k - 1; j >= 0; j--) {
                energy[j] += energy[j + k];
            }
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, energy[i]);
            }
            return ans;
        }
    }
