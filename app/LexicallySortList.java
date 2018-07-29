package amazon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicallySortList {
	
	public static List<String> sortList(List<String> list){
		
		Pattern p =  Pattern.compile("\\d+");
		list.add("b4 xi me nu");
		list.add("br8 eat, nim did");
		list.add("f3 52 54 31");
		list.add("r1 box ape bit");
		list.add("t2 13 121 98");
		list.add("w1 has uni gry");
	
        Collections.sort(list,new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		String[] sArray1 = s1.split(" ");
        		String[] sArray2= s2.split(" ");
        		
            	for(int i=1; i<Math.min(sArray1.length, sArray1.length);i++){
            		Matcher m = p.matcher(sArray1[i]);
                    Matcher s = p.matcher(sArray2[i]);
                    
                    if(m.find() && !s.find()){
                    	return 1;
                    }
                    if(!m.find() && s.find()){
                    	return -1;
                    }
	            	if(m.find() && s.find()){
	            		return new Integer(m.group())- new Integer(s.group());
	            	}else{
	            		  return sArray1[i].compareTo(sArray2[i]);
	            	}
            }
            	return sArray1.length-sArray1.length;
            }
        });
    
		return list;
	}
	

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		System.out.println(sortList(list));
	}

}
