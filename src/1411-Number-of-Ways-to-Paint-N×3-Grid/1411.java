class Solution {
    public int numOfWays(int n) {
        long aba = 6, abc = 6, t_aba, t_abc, mod = 1000000007;
        for (int i = 0; i < n - 1; i++) {
            t_aba = aba * 3 + abc * 2;
            t_abc = aba * 2 + abc * 2;
            aba = t_aba % mod;
            abc = t_abc % mod;
        }
        return (int)((aba + abc) % mod);
    }
}