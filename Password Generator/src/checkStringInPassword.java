
public class checkStringInPassword {
	String P1;
	String S1;
    int P1Length;
    int S1Length;

    public checkStringInPassword(String Password, String searchString) {
        P1 = Password;
        S1 = searchString;
        P1Length = Password.length();
        S1Length = searchString.length();
    }
    

    private int[] computeLPSArray(String searchString) {
        int len = 0; // Length of the previous longest prefix-suffix
        int i = 1;
        int[] lps = new int[searchString.length()];

        while (i < searchString.length()) {
            if (searchString.charAt(i) == searchString.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }


    public String stringExistOrNot() {
        int[] lps = computeLPSArray(S1);
        int i = 0; // Index for Password
        int j = 0; // Index for searchString

        while (i < P1.length()) {
            if (S1.charAt(j) == P1.charAt(i)) {
                i++;
                j++;
            }

            if (j == S1.length()) {
            	System.out.println("The string found at " + Integer.toString(i-j + 1) + "character");
                return "true"; // The searchString is found in the Password
            } else if (i < P1.length() && S1.charAt(j) != P1.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return "false"; // The searchString is not found in the Password
    }

    @Override
    public String toString() {
        return P1;
    }	    
}

