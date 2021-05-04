
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public double cgRatio(String dna) {
        int countOccurences = 0;
        
        for (int i = 0; i < dna.length(); i++) {
            if (dna.toUpperCase().charAt(i) == 'C' || dna.toUpperCase().charAt(i) == 'G') {
                countOccurences++;
            }
         }
         
         return (double) countOccurences / dna.length();
    }
    
    public void testcgRatio() {
        String dna = "ACGTATGCCATAGTACGT";
        System.out.println("cgRatio of " + dna + " = " + cgRatio(dna));
    }
    
    public int countCTG(String dna) {
        int countOccurences = 0;
        int start = 0;
        
        while(true) {
            int index = dna.toUpperCase().indexOf("CTG", start);
            
            if (index == -1) {
                break;
            }
            
            countOccurences++;
            
            start = index + 3;
        }
        
        return countOccurences;
    }
    
    public void testCountCTG() {
        String dna = "TGCTCTGCTGCCTGGCTCGGCTG";
        System.out.println("CTG occurences of " + dna + " = " + countCTG(dna));
    }
}
