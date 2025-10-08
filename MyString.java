
/**
 * filename- string.java
 * description- This will perform most of the string operation 
 * author- Agrani Gupta
 */
import java.util.*;

public class MyString {
  String string;

  MyString(String s) {
    string = s;
  }

  String append(String newString) {
    this.string = this.string + newString;
    return string;
  }

  int countWords() {
    int index = 0;
    String duplicate = "";
    int cnt = 0;
    while (index < this.string.length()) {
      if (this.string.charAt(index) == ' ') {
        cnt++;
        index++;
        duplicate = "";
      }
      while (this.string.charAt(index) == ' ') {
        index++;
      }
      if (this.string.charAt(index) != ' ') {
        duplicate += this.string.charAt(index);
      }

      index++;
    }
    cnt++;
    return cnt;
  }

  boolean isPalindrome() {
    int i = 0, j = this.string.length() - 1;
    while (i <= j) {
      if (this.string.charAt(i) != this.string.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  String replace(char a, char b) {
    char[] arr = this.string.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a) {
        arr[i] = b;
      }
    }
    this.string = new String(arr);
    return this.string;
  }

  String splice(int start, int len) {
    if (start < 0 || start >= this.string.length() || len < 0 || start + len > this.string.length()) {
      System.out.println("invalid input");
      return "";
    }
    String splicedString = this.string.substring(0, start) + this.string.substring(start + len);
    return splicedString;
  }

  String[] split() {
    String string = "";
    String[] list = {};
    int size=countWords();
    int i = 0;
    int j=0;
    while (i < this.string.length()) {
      char character = this.string.charAt(i);
      if (Character.isWhitespace(character)) {
        if (string != null) {
          list[j++]=string;
          string = "";
        }
      } else {
        string += character;
      }
      i++;
    }
    list[size-1]=string;
    return list;
  }

  char getmaxrepeat() {
    int[] arr = new int[26];
    for (int i = 0; i < this.string.length(); i++) {
      char x = this.string.charAt(i);
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
    String shiftedstring = this.string;
    splice(0, n);
    for (int i = 0; i < n; i++) {
      this.string += shiftedstring.charAt(i);
    }
    return this.string;
  }

  String sort() {
    int arr[] = new int[26];
    for (int i = 0; i < this.string.length(); i++) {
      char x = this.string.charAt(i);
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
    String reverseString = "";
    for (int i = this.string.length() - 1; i >= 0; i--) {
      reverseString += this.string.charAt(i);
    }
    return reverseString;
  }
}
