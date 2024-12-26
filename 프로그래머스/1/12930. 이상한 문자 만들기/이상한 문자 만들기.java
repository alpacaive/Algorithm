class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        int index = 0;
        String result = "";
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals(" ")) {
                index = 0;
            } else if(index % 2 == 0) {
                strArr[i] = strArr[i].toUpperCase();
                index++;
            } else if(index % 2 != 0) {
                strArr[i] = strArr[i].toLowerCase();
                index++;
            }
            result += strArr[i];
        }
        
        return result;
    }
}