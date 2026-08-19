class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(s.length()!=goal.length()){
            return false;
        }
        char[] arr = s.toCharArray();

        for(int i=0;i<n;i++){
            char last = arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0] = last;
            String rotated = new String(arr);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }
}