public class endsWithRep {
    public static void main (String[] args) {
	if (endsWithRep("foobarbar", "bar", 2)) {
	    System.out.println ("true");
	}
	else {
	    System.out.println ("false");
	}
    }
    public static boolean endsWithRep(String s1, String s2, int n) {
	int len = s1.length();
	int lenRep = s2.length();
	int i = len - 1;
	while (i >= (len - (lenRep * n))) {
	    for (int j = lenRep - 1; j >= 0; j--) {
		if (s1.charAt(i) != s2.charAt(j)) {
		    return false;
		}
		i--;
	    }
	}
	return true;
    }
}
