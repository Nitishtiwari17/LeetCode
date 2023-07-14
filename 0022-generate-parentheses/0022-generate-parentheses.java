class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,"",0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans,String cu,int open,int close,int max){
        if(cu.length()==max*2){
            ans.add(cu);
            return;
        }
        if(open<max){
            backtrack(ans,cu+"(", open+1,close,max);
        }
        if(close<open){
            backtrack(ans,cu+")",open,close+1,max);
        }
    }
}