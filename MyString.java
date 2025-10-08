
/**
 * filename- string.java
 * description- This will perform most of the string operation 
 * author- Agrani Gupta
 */
import java.util.*;

public class MyString {
  String s;

  MyString(String s) {
    this.s = s;
  }

  String append(String newString) {
    this.s = this.s + newString;
    return s;
  }

  int countWords() {
    int index = 0;
    String duplicate = "";
    int cnt = 0;
    while (index < this.s.length()) {
      if (s.charAt(index) == ' ') {
        cnt++;
        index++;
        duplicate = "";
      }
      while (s.charAt(index) == ' ') {
        index++;
      }
      if (s.charAt(index) != ' ') {
        duplicate += s.charAt(index);
      }

      index++;
    }
    cnt++;
    return cnt;
  }

  boolean isPalindrome() {
    int i = 0, j = s.length() - 1;
    while (i <= j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  String replace(char a, char b) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a) {
        arr[i] = b;
      }
    }
    s = new String(arr);
    return s;
  }

  String splice(int start, int len) {
    if (start < 0 || start >= s.length() || len < 0 || start + len > s.length()) {
      System.out.println("invalid input");
      return "";
    }
    String splicedString = s.substring(0, start) + s.substring(start + len);
    return splicedString;
  }

  List<String> split() {
    String a = "";
    List<String> list = new ArrayList<>();
    int i = 0;
    while (i < s.length()) {
      char x = s.charAt(i);
      if (Character.isWhitespace(x)) {
        if (a != null) {
          list.add(a);
          a = "";
        }
      } else {
        a += x;
      }
      i++;
    }
    list.add(a);
    return list;
  }

  char maxrepeat() {
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char x = s.charAt(i);
      arr[x - 'a']++;
    }
    int maxx = 0;
    char finalstring = 'a';
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxx) {
        maxx = arr[i];
        finalstring = (char) ('a' + i);
      }
    }
    return finalstring;
  }

  String shift(int n) {
    // left shift
    String r = s;
    splice(0, n);
    for (int i = 0; i < n; i++) {
      s += r.charAt(i);
    }
    return s;
  }

  String sort() {
    int arr[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char x = s.charAt(i);
      arr[x - 'a']++;
    }
    String answer = "";
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i]; j++) {
        answer += 'a' + i;
      }
    }
    return answer;
  }

  String reverse() {
    String revString = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      revString += this.s.charAt(i);
    }
    return revString;
  }
}
