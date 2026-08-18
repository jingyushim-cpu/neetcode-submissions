class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        
        if(strs.size() == 0) return "";

        List<Integer> sizes = new ArrayList<>();

        for(String s : strs){
            sizes.add(s.length());
        }

        for(int i = 0; i < strs.size(); i++){
            encoded_string.append(sizes.get(i) + "#");
            encoded_string.append(strs.get(i));
        }

        return encoded_string.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int j = 0;

        for(int i = 0; i < str.length(); i++){
            
            if('#' == str.charAt(i)){
                int size = Integer.parseInt(str.substring(j, i));

                result.add(str.substring(i+1, i+1+size));
                i += size;
                j = i + 1;
            }
        }

        return result;

    }
}
