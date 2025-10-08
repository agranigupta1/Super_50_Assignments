/**
 * filename- string.java
 * description- This will perform most of the string operation 
 * author- Agrani Gupta
 */
import java.util.*;
 public class MyString{
    String s;
    void setdata(String s){
        this.s = s;
    }
    void showdata(){
        System.out.println("the string is:" + s);
    }
    String append(String newString){
        this.s = this.s + newString;
        return s;
    }
  int countWords(){
        
       
        int f=0;
        int i=0;
        String r="";
        int cnt=0;
        while(i<this.s.length()){
          if(s.charAt(i)==' '){
            cnt++;
            i++;
            r="";
          }
           while(s.charAt(i)==' '){
             i++;
           }
            if(s.charAt(i)!=' '){
              r+=s.charAt(i);
           }

           i++;
        }
        cnt++;
        return cnt;
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
        String r="";
        for(int i=s.length()-1;i>=0;i--){
           r+=this.s.charAt(i);
        }
        this.s=r;
    }
}
