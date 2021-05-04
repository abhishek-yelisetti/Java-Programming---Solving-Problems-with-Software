
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public int howMany(String stringa, String stringb) {
        int countOccurrences = 0;
        int start = 0;
        
        while (true) {
            int index = stringb.indexOf(stringa, start);
            
            if (index == -1) {
                break;
            }
            
            countOccurrences++;
            start = index + stringa.length();
        }
        
        return countOccurrences;
    }
    
    public void testHowMany() {
        String stringa = "GAA";
        String stringb = "ATGAACGAATTGAATC";
        System.out.println("Total occurences of " + stringa + " in " + stringb + " = " + howMany(stringa, stringb));
        
        stringa = "AA";
        stringb = "ATAAAA";
        System.out.println("Total occurences of " + stringa + " in " + stringb + " = " + howMany(stringa, stringb));
    }
}
