class Solution {
    public int lengthOfLastWord(String s) {
         int n=s.length();
        System.out.println(n);
        int start=0;
        int end=0;
        for(int i=n-1;i>=0;i--){
            if(!Character.isWhitespace(s.charAt(i))){
                end=i;
                System.out.println(end);
                break;
            }  
        }
          for(int i=end;i>=0;i--){
            if(!Character.isWhitespace(s.charAt(i))){
                start=i;
            } else{
                break;
            }
        }
        
        return s.substring(start, end).length()+1;
    }
}