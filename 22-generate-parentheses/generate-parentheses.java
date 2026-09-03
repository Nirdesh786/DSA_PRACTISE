class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtracking("",list,0,0,n);
        return list;
    }
    private void backtracking(String current_string,List<String> list,int open_count,int close_count,int n){
        if(current_string.length()== n*2){
            list.add(current_string);
            return;
        }
        if(open_count<n){
            backtracking(current_string.concat("("),list,open_count+1,close_count,n);
        }
        if(close_count<open_count){
            backtracking(current_string.concat(")"),list,open_count,close_count+1,n);
        }
    }
}