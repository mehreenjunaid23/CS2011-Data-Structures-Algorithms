package lecture2;

import java.util.*;

public class lect2
{
//function to check Balanced
public static boolean Balanced(String s) {
HashMap<Character, Character> map = new HashMap<Character, Character>();
map.put('(', ')');
map.put('[', ']');
map.put('{', '}');

Stack<Character> stack = new Stack<Character>();

for (int i = 0; i < s.length(); i++) {
char curr = s.charAt(i);

if (map.keySet().contains(curr)) {
stack.push(curr);
} else if (map.values().contains(curr)) {
if (!stack.empty() && map.get(stack.peek()) == curr) {
stack.pop();
} else {
return false;
}
}
}

return stack.empty();
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
boolean flag=Balanced(s);
if(flag)
System.out.println("True");
else
System.out.println("False");

}
}