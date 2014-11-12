package permutation;

public class Permutation {

    private final boolean[] used;
    private final StringBuilder output = new StringBuilder();
    private final String input;

    /*-----------------------------------------------------------------------*/
    public Permutation(String str) {

        input = str;
        used = new boolean[input.length()];

    }
    /*-----------------------------------------------------------------------*/

    public void permute() {

        if (output.length() == input.length()) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); ++i) {
            if (used[i]) {
                continue;
            }
            output.append(input.charAt(i));
            used[i] = true;
            
            permute();
            
            used[i] = false;
            output.setLength(output.length() - 1);
        }

    }
    /*-----------------------------------------------------------------------*/

    public static void main(String[] args) {
        Permutation perm = new Permutation("kev");
        perm.permute();

    }
    /*-----------------------------------------------------------------------*/
}
