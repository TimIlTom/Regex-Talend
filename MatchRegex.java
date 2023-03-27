package routines;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchRegex {
	
	/*returnStringRegex:
		To get the text that matches a regex use the static function "returnStringRegex" with the following parameters:
 			-text: text where you want to use your regex
 			-regex: the regex you want to use
 			-nGroup: if 0 it take all the matche, if is not 0 (es. 1) it take the 1st capturing group
	*/
	public static List<String> returnStringRegex(String text, String regex, int nGroup) {
		
		List<String> matchesList = new ArrayList<String>();
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher match = pattern.matcher(text);
		
		if(nGroup > 0) {
			while (match.find()) {
			
				matchesList.add(match.group(nGroup));
			}
		}
		
		if(nGroup == 0) {
			
			while (match.find()) {
				
				matchesList.add(match.group());
			}
		}
		
		return matchesList;
	}
	
	/*regexMatchResult:
	 	Return true if the regex as at least 1 match in the text input, otherwise it return false
	 		-text: text where you want to use your regex
 			-regex: the regex you want to use 
	*/
	
	public static boolean regexMatchResult (String text, String regex) {
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher match = pattern.matcher(text);
		
		return match.matches();
	}
}
