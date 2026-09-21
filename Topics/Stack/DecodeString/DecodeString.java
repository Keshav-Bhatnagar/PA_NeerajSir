class Solution {
    public String decodeString(String s) {
        Stack<Integer> cStack = new Stack<>();
        Stack<String> sStack = new Stack<>();
        String cString="";
        int cNumber=0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                cNumber=cNumber*10+(ch-'0');
            }else if(ch=='['){
                cStack.push(cNumber);
                sStack.push(cString);
                cNumber=0;
                cString="";
            }else if(ch==']'){
                int c = cStack.pop();
                String pString=sStack.pop();
                StringBuilder temp=new StringBuilder();
                for(int i =0 ;i<c;i++){
                    temp.append(cString);
                }
                cString=pString+temp.toString();
            }else{
                    cString+=ch;
            }
        }
        return cString;
    }
}