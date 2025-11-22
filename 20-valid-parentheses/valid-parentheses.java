class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack1=new Stack();
        int i=0;
       
        while(i<s.length()){
            Character ele=s.charAt(i);

            if(ele==']'||ele=='}'||ele==')'){
                if(stack1.empty())return false;

                else if(!stack1.empty()){
                Character poping_ele=stack1.pop();
                     if(ele==']'&&poping_ele!='['||ele==')'&&poping_ele!='('||ele=='}'&&poping_ele!='{')return false;
                }
            }else{
        stack1.push(ele);
            }
        i++;  
        }
        return stack1.empty();
    }
}