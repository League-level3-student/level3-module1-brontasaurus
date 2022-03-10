package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
ArrayList<String> strings = new ArrayList<>();
        // 2. Add five Strings to your list
strings.add("bleh");
strings.add("bloh");
strings.add("eurg");
strings.add("hurk");
strings.add("gurg");
        // 3. Print all the Strings using a standard for-loop
for (int i = 0; i < strings.size(); i++) {
	String s = strings.get(i);
    System.out.println("strings: " + i + " " + s);
}
        // 4. Print all the Strings using a for-each loop
for (String s : strings) {
	System.out.println(s);
}
        // 5. Print only the even numbered elements in the list.
for (int i = 0; i < strings.size(); i++) {
	if (i%2 == 0) {
    System.out.println(strings.get(i));
	}
}
        // 6. Print all the Strings in reverse order.
for (int i = strings.size()-1; i >= 0; i--) {
    System.out.println(strings.get(i));
	
}
        // 7. Print only the Strings that have the letter 'e' in them.
for (String s : strings) {
	if (s.contains("e")){
		System.out.println(s);
	}
	
}

    }
}
