package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortCharByFrequency {
public static List<String> sortChar(String s, List<String> exclude) {
	String[] words = s.split("\\s+");
	Map<String,Integer> map = new HashMap<>();
	List<String> result = new ArrayList<>();
	for(String word: words) {
		int value =0;
		word = word.toLowerCase().replaceAll("'s","").replace(".","");
		if(map.containsKey(word)){
	    	 value = map.get(word);
	     }
		map.put(word, value +1);
	}
    for (Map.Entry<String,Integer>  e : map.entrySet()) {
    	if(exclude(e.getKey(),exclude,e.getValue())){
    		result.add(e.getKey());
    	}
    }
    return result;
}


public static List<String> sortChar1(String s, List<String> exclude) {
	String[] words = s.split("\\s+");
    Map<String,Integer> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    
    for(String word: words){
        int value=0;
        word= word.toLowerCase().replaceAll("'s","").replaceAll(".","");
        if(map.containsKey(word)){
            value= map.get(word);
        }
        map.put(word,value+1);
    }
   
    for(Map.Entry<String,Integer> entry: map.entrySet()){
        if(exclude(entry.getKey(),exclude,entry.getValue())){
            result.add(entry.getKey());
        }
    }
    return result;
}
public static boolean exclude(String freqWord, List<String> wordsToExclude, int count ){
		boolean flag = true;
        for(String exclude :wordsToExclude){
             if(exclude != null && exclude.equals(freqWord) || count<2){
                 flag = false;
             }
        }
        return flag;
}
public static void printfrequent(String[] input){
	for(int i=0; i<input.length; i++){
    char[] word = input[i].toCharArray();
    Arrays.sort(word);
    //{e,h,l,l,o}
    Map<Character, Integer> countMap = new HashMap<>();
    for(int j=0; j<word.length;j++){
        char c = word[j];
        countMap.compute(c, (key,val)->{
        if(val==null)
            return 1;
        else
            return val+1;   
        });
    }
    List<Map.Entry<Character, Integer>> countList = new ArrayList<>(countMap.entrySet());
    countList.sort((Entry<Character, Integer> arg0,Entry<Character, Integer> arg2)->arg0.getValue()-arg2.getValue());
    Collections.sort(countList, new Comparator<Map.Entry<Character,Integer>>(){
		@Override
		public int compare(Entry<Character, Integer> arg0,
				Entry<Character, Integer> arg1) {
			return arg1.getValue()-arg0.getValue();
		}
    });
    
    String result="";
    for(Map.Entry<Character, Integer> c : countList ){
    	for(int j=0; j<c.getValue(); j++){
    		System.out.println(c.getKey());
    	}
    }
     }
}
	public static void main(String[] args) {
	/*String word = "test's. test's my dear code code code dear dear dear test";
	List<String> exclude = new ArrayList<>();
	exclude.add(null);
	exclude.add("code");
	sortChar(word,exclude);*/
		String[] s={"hello"};
		printfrequent(s);	
	}

}
