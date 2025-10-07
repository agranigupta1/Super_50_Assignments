import java.util.*;
class MyString{
    String s;
    void setdata(String s){
        this.s = s;
    }
    void showdata(){
        System.out.println("the string is:" + s);
    }
    String append(String newString){
        s = s + newString;
        return s;
    }
    void countWords(){
        String trimmed = s.trim();
        if(trimmed.isEmpty()){
            System.out.println("the no of words are:0");
            return;
        }
        String[] words = trimmed.split("\\s+");
        System.out.println("the no of words are:" + words.length);
    }
    boolean isPalindrome(){
        int i = 0, j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    String replace(char a,char b){
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                arr[i] = b;
            }
        }
        s = new String(arr);
        return s;
    }
    void splice(int start,int len){
        if(start < 0 || start >= s.length() || len < 0 || start + len > s.length()){
            System.out.println("invalid input");
            return;
        }
        s = s.substring(0, start) + s.substring(start + len);
    }
    List<String> split(){ 
      String a=""; 
      List<String> list = new ArrayList<>();
       int i=0; 
       while(i<s.length()){
         char x=s.charAt(i);
          if(Character.isWhitespace(x)){ 
            if(a!=null){ list.add(a); a=""; }
           } 
           else{
             a+=x; 
          } 
          i++; 
        }
         list.add(a);
         return list;
         }
     
       char maxrepeat(){
         int[] arr = new int[26];
          for(int i=0;i<s.length();i++){
             char x=s.charAt(i); arr[x-'a']++; 
            } 
            int maxx=0; 
            char fin='a';
             for(int i=0;i<arr.length;i++){ 
              if(arr[i]>maxx){
                 maxx=arr[i];
                 fin=(char)('a'+i); 
                } 
              } 
              return fin;
             }
    String shift(int n){
        //left shift
         String r= s; 
         splice(0,n); 
         for(int i=0;i<n;i++){
           s+=r.charAt(i); 
          }
           return s;
    }
    void sort(){
      int arr[]=new int[26];
       for(int i=0;i<s.length();i++){ 
        char x=s.charAt(i); arr[x-'a']++; 
      } 
      String ans="";
       for(int i=0;i<arr.length;i++){ 
        for(int j=0;j<arr[i];j++){
           ans+='a'+i; 
          }
           }
    }
    void reverse(){
        s = new StringBuilder(s).reverse().toString();
    }
}
public class string{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        MyString s1 = new MyString();
        System.out.println("Enter initial string:");
        s1.setdata(sc.nextLine());
        while(true){
            System.out.println("1.Append");
            System.out.println("2.Count words in current string");
            System.out.println("3.Replace characters");
            System.out.println("4.Check palindrome");
            System.out.println("5.Splice");
            System.out.println("6.Create array of string");
            System.out.println("7.Find the most repeating character");
            System.out.println("8.Sort the characters of string");
            System.out.println("9.Left rotate the string");
            System.out.println("10.Reverse the string");
            System.out.println("11. For Exit");
            System.out.println("Enter choice from 1 to 11:");
            int c = sc.nextInt();
            sc.nextLine();
            switch(c){
                case 1:
                    System.out.println("Enter a string to be appended:");
                    String r = sc.nextLine();
                    s1.append(r);
                    s1.showdata();
                    break;
                case 2:
                    s1.countWords();
                    break;
                case 3:
                    System.out.println("Enter character to be replaced:");
                    char e = sc.nextLine().charAt(0);
                    System.out.println("Enter new character:");
                    char d = sc.nextLine().charAt(0);
                    s1.replace(e,d);
                    s1.showdata();
                    break;
                case 4:
                    System.out.println("The current string is palindrome or not: "+ s1.isPalindrome());
                    break;
                case 5:
                    System.out.println("Enter start index and length for splice:");
                    int ind = sc.nextInt();
                    int len = sc.nextInt();
                    sc.nextLine();
                    s1.splice(ind,len);
                    s1.showdata();
                    break;
                case 6:
                    System.out.println("The array of words is:" + s1.split());
                    break;
                case 7:
                    System.out.println("Most repeating character: "+ s1.maxrepeat());
                    break;
                case 8:
                    s1.sort();
                    s1.showdata();
                    break;
                case 9:
                    System.out.println("Enter number of positions to left rotate:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    s1.shift(n);
                    s1.showdata();
                    break;
                case 10:
                    s1.reverse();
                    s1.showdata();
                    break;
               case 11:
               System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
