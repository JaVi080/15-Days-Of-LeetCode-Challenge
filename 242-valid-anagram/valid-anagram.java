class Solution {
    public boolean isAnagram(String s, String t) {
           HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                 map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i), 0)+1);
            }
            for(int i=0;i<t.length();i++){
                map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i), 0)+1);
            }
            // var-- ref type automatically detect the correct type fron right hand side 
            for(var x:map2.entrySet()){
System.out.println(x.getKey()+"---"+x.getValue());
            }
          if(map1.equals(map2))return true;
        }
        return false; 
    }
}