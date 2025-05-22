package fundamentals.RandomStuffs.String;

public class skipTheOccurance {
    public static void main(String[] args) {
        /*
        input : abcaadea
        output : bcde
         */
        String input="abcappleadea";
        //String output= skiptheoccurrence(input,'a');
        //skiptheoccurrence2("",input,'a');
        //String output=skip(input);
        skipTheWords("",input,"apple");
        //System.out.println(output);
    }
    public static String skiptheoccurrence(String string, char occurancechar){
        StringBuilder stringBuilder=new StringBuilder();
        for(char a:string.toCharArray()){
            if(a!=occurancechar){
                stringBuilder.append(a);
            }
        }
        return stringBuilder.toString();
    }
    public static void skiptheoccurrence2(String output,String input,char occurrence){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch=input.charAt(0);
        if(ch=='a'){
            skiptheoccurrence2(output,input.substring(1),occurrence);
        }else{
            skiptheoccurrence2(output+ch,input.substring(1),occurrence);
        }
    }
    public static String skip(String string){
        if(string.isEmpty()){
            return "";
        }
        char ch=string.charAt(0);
        if(ch=='a'){
            return skip(string.substring(1));
        }else{
            return ch+skip(string.substring(1));
        }
    }

    public static void skipTheWords(String output, String input, String word){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch=input.charAt(0);
        if(input.startsWith(word)){
            skipTheWords(output,input.substring(5),word);
        }else{
            skipTheWords(output+ch,input.substring(1),word);
        }
    }
}
