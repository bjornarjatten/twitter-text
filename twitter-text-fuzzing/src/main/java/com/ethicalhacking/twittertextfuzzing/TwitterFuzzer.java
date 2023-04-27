package com.ethicalhacking.twittertextfuzzing;

import com.twitter.twittertext.TwitterTextParser;

/**
 * Hello world!
 *
 */
public class TwitterFuzzer 
{
    public static void main( String[] args )
    {
        Boolean output = TwitterTextParser.parseTweet("hej").isValid;
        System.out.println( output );
    }
}
