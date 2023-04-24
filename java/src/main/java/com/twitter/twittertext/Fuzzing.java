package com.twitter.twittertext;

import java.util.*;  
import com.twitter.twittertext.TwitterTextParser;

public class Fuzzing {
    
    private Fuzzing() {
    }

    public static void main(String[] args){  
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        parseTweet(str);
    }  

    public static void parseTweet(String input) {
        TwitterTextParseResults result = TwitterTextParser.parseTweet(input);
        System.out.print(result.displayTextRange);
    }
}
