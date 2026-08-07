class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=numRows-1;i++){
            List<Integer> list2 = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list2.add(1);
                }else{
                    int value = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    list2.add(value);
                }
            }
            list.add(list2);
        }
        return list;
    }
}