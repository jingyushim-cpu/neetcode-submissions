class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for(String str : strs){
            encodedString.append(str.length());
            encodedString.append("#");
            encodedString.append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decoded = new ArrayList<>();

        int index = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c =='#'){
                int length = Integer.parseInt(str.substring(index, i));

                decoded.add(str.substring(i+1, i+1+length));

                i += 1 + length;
                index = i;
            }
        }

        return decoded;
    }
}
