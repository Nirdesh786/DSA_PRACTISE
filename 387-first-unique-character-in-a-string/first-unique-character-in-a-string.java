class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            boolean isUnique = true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return i;
            }
        }
        return -1;
    }
}