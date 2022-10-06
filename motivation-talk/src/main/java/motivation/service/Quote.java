package motivation.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Quote {
 
public String myQuoteArray() {
		
		String first = "we cannot solve problems with the kind of thinking we employed when we came up with them. — Albert Einstein";
		String second = "Learn as if you will live forever, live like you will die tomorrow";
		String third = "Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too";
		String fourth = "Success is not final; failure is not fatal: It is the courage to continue that counts.";
		String fifth="It is better to fail in originality than to succeed in imitation.";
		String sixth="The road to success and the road to failure are almost exactly the same.";
		String seventh="I never dreamed about success. I worked for it.";
		String eigth="Success is getting what you want, happiness is wanting what you get.";
		String ninth="Don’t let yesterday take up too much of today.";
		String tenth="If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you.";

		
	ArrayList<String> myQuoteArray= new ArrayList<>();
		
		myQuoteArray.add(first);
		myQuoteArray.add(second);
		myQuoteArray.add(third);
		myQuoteArray.add(fourth);
		myQuoteArray.add(fifth);
		myQuoteArray.add(sixth);
		myQuoteArray.add(seventh);
		myQuoteArray.add(eigth);
		myQuoteArray.add(ninth);
		myQuoteArray.add(tenth);
		
		
		return "";
	}
}
