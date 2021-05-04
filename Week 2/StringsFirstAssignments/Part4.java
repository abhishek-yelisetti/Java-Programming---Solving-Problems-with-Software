
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class Part4 {
    public void findYoutubeLinks(String url) {
        URLResource urlResource = new URLResource(url);
        
        for (String line : urlResource.lines()) {
            line = line.toLowerCase();
            int youtubeIndex = line.indexOf("youtube.com");
            
            if (youtubeIndex != -1) {
                int startIndex = line.lastIndexOf("\"", youtubeIndex);
                int lastIndex = line.indexOf("\"", youtubeIndex);
                
                System.out.println("Youtube link: " + line.substring(startIndex + 1, lastIndex));
            }
        }
    }
    
    public void test() {
        String url = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
        findYoutubeLinks(url);
    }
    
}
