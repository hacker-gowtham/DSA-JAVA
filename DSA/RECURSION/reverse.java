package RECURSION;

public class reverse {
    public static String reverse(String str){
        if(str==null||str.isEmpty()){
            return str;
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse("gowtham"));
        
    }
}
