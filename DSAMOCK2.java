// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:
// Input: s = "leetcode"
// Output: 0

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1

// Constraints:
// a. 1 <= s.length <= 10^5
// b. s consists of only lowercase English letters.
import java.util.*;
import java.util.Scanner;
public class DSAMOCK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solution(s));
    }
    public static int solution(String s){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
