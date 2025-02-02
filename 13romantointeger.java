class Solution {
    public int romanToInt(String s) {
        int x=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        List<Map.Entry<Character, Integer>> entry = new ArrayList<>(map.entrySet());
            for(int i=0;i<s.length();i++){
                int val=map.get(s.charAt(i));
                if(i+1<s.length() && val<map.get(s.charAt(i+1))){
                    x-=val;
                }else{
                    x+=val;
                }
            }
            return x;
    }
}
