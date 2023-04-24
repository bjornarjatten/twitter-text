package com.ethicalhacking.twittertextfuzzing;

import com.twitter.twittertext.TwitterTextParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Boolean output = TwitterTextParser.parseTweet("hej").isValid;
        System.out.println( output );
    }
}
