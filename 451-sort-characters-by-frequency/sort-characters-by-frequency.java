class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        List<Map.Entry<Character , Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)-> b.getValue().compareTo(a.getValue()));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int count  = entry.getValue();
            for(int i =0;i<count;i++){
                sb.append(ch);
            }
        }
        String ans = sb.toString();
        return ans;
    }
}