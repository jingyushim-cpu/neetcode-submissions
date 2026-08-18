class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find #
            while (str.charAt(j) != '#') {
                j++;
            }

            // Read length
            int length = Integer.parseInt(str.substring(i, j));

            // Move past #
            j++;

            // Read the actual string
            result.add(str.substring(j, j + length));

            // Move to next encoded string
            i = j + length;
        }

        return result;
    }
}