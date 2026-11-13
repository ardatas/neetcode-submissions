class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }
        
        int[] charList1 = new int[26];
        for(int i=0; i < sArr.length ; i++) {
            int index = (int) sArr[i] - 97;
            charList1[index] += 1;
        }

        int[] charList2 = new int[26];
        for(int i=0; i < tArr.length ; i++) {
            int index = (int) tArr[i] - 97;
            charList2[index] += 1;
        }

        boolean isEqual = true;
        for (int i=0; i < charList1.length; i++) {
            if (charList1[i] != charList2[i]) {
                isEqual = false;
            }
        }
        return isEqual;
    }
}
