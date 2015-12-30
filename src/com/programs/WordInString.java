package com.programs;

import java.util.Scanner;
public class WordInString {

public static void main(String[] args) {
String text = "the sweet home. the best of person's life. place to be happy.";
String[] sentences =text.split("\\.");

String word = "the";
System.out.println("Search for word: "+word);
getSentence(sentences, word);
}

private static void getSentence(String[] sentences, String word){
System.out.println("Matched Sentences:");
for (int i = 0; i < sentences.length; i++) {
if (sentences[i].contains(word)) {
System.out.println(sentences[i]);
break;
}
}

}
}