import java.util.*;

public class Main{
    static Scanner  sc=new Scanner(System.in);
    public static void main(String args[]){
        
        
        System.out.println("Enter initial string:");
        String string=sc.nextLine();
        MyString s = new MyString(string);
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
                    String anotheString = sc.nextLine();
                    System.out.println("the appended string is:"+s.append(anotheString));
                    
                    break;
                case 2:
                    System.out.println("the no of words are:"+s.countWords());
                    break;
                case 3:
                    System.out.println("Enter character to be replaced:");
                    char e = sc.nextLine().charAt(0);
                    System.out.println("Enter new character:");
                    char d = sc.nextLine().charAt(0);
                    s.replace(e,d);
                    
                    break;
                case 4:
                    System.out.println("The current string is palindrome or not: "+ s.isPalindrome());
                    break;
                case 5:
                    System.out.println("Enter start index and length for splice:");
                    int index = sc.nextInt();
                    int length = sc.nextInt();
                    sc.nextLine();
                    System.out.println("the spliced string is:"+s.splice(index,length));
                    
                    
                    break;
                case 6:
                    System.out.println("The array of words is:" + s.split());
                    break;
                case 7:
                    System.out.println("Most repeating character: "+ s.maxrepeat());
                    break;
                case 8:
                    System.out.println("the sorted string is:"+s.sort());
                    
                    break;
                case 9:
                    System.out.println("Enter number of positions to left rotate:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("the left rotated string is"+s.shift(n));
                   
                    break;
                case 10:
                    System.out.println("the reversed string is:"+s.reverse());
                    
                    break;
               case 11:
               System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
