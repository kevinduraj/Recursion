package permutation;

public class Permutation {

    /*-----------------------------------------------------------------------*/
    public void permute(String input, StringBuilder output, boolean[] used) {

        if (output.length() == input.length()) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); ++i) {
            
            if (used[i]) continue;                 // equal true, do not permute
            
            output.append(input.charAt(i));        // add 1 char
            used[i] = true;

            permute(input, output, used);          // permutation

            used[i] = false;
            output.setLength(output.length() - 1); // cutoff 1 char
        }

    }
    /*-----------------------------------------------------------------------*/

    public static void main(String[] args) {

        String input = "kev";
        boolean[] used = new boolean[input.length()];
        StringBuilder output = new StringBuilder();

        Permutation permute = new Permutation();
        permute.permute(input, output, used);
    }
    /*-----------------------------------------------------------------------*/
}
