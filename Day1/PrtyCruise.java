class PrtyCruise {
    static int findMaxCruise(int E[], int L[], int t, int max) {
        int i = 0;
        int curr=0;
        while (i < t) {
            curr += E[i] - L[i];
            max = Math.max(curr, max);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] E = new int[] { 7, 0, 5, 1, 3 };
        int[] L = new int[] { 1, 2, 1, 3, 4 };
        int t = 5;
        int max = Integer.MIN_VALUE;
        System.out.println("Result is: " + findMaxCruise(E, L, t, max));
    }
}