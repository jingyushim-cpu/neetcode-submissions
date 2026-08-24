class Solution {

    public String encode(List<String> strs) {
        StringBuilder temp = new StringBuilder();

        for(String s : strs){
            temp.append(s.length());
            temp.append("#");
            temp.append(s);
        }

        return temp.toString();
    }

    public List<String> decode(String str) {
        int index = 0;
        List<String> result = new ArrayList();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '#') continue;
            
            int length = Integer.parseInt(str.substring(index,i));
            result.add(str.substring(i+1, i+1+length));
            i += length + 1;
            index = i;
            
        }
        return result;
    }
}
