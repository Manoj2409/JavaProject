package fundamentals.RandomStuffs.Practice;

public class stringProblems {
    public static void reverseWordsInString(String string){
        String[] strings=string.split("\\.");

        for(int i=strings.length-1;i>=0;){
            System.out.print(strings[i]);
            i=i-1;
            if(i>=0){
                System.out.print(".");
            }
        }
    }

   /* public static void main(String[] args) {
        reverseWordsInString("i.like.this.program.very.much");
    }*/


        public static void main(String[] args) {
            String input = "abc";
            permutation(input);
        }

        public static void permutation(String str) {
            permutation(str, "");
        }

        private static void permutation(String str, String prefix) {
            if (str.length() == 0) {
                System.out.println(prefix);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    String rem = str.substring(0, i) + str.substring(i + 1);
                    permutation(rem, prefix + str.charAt(i));
                }
            }
        }

}
