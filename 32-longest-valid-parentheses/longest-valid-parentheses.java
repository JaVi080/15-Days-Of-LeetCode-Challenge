class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        if(n == 0) return 0;

        for(int i = 0; i < n; i++){
            if(!st.isEmpty() && s.charAt(st.peek()) == '(' && s.charAt(i) == ')'){
                st.pop();
            }
            else st.add(i);
        }

        int[] pre = new int[n];
        Arrays.fill(pre, 1);

        while(!st.isEmpty()){
            int idx = st.pop();
            pre[idx] = 0;
        }

        int ans = pre[0];
        for(int i = 1; i < n; i++){
            if(pre[i] == 1) pre[i] += pre[i - 1];
            ans = Math.max(ans, pre[i]);
        }
        return ans;
    }
}