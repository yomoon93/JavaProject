import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LetterRound {
    char[] vowels = {'a', 'e', 'i', 'o' ,'u'};
    char [] consonants = {'b','c', 'd','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w', 'x','y','z'};


    public LetterRound(char[] vowels, char[] consonants) {
        this.vowels = vowels;
        this.consonants = consonants;
    }

    public char[] getVowels() {
        return vowels;
    }

    public char[] getConsonants() {
        return consonants;
    }

    private Random generateVowel(){
        Random random = new Random(vowels.length);
        for (int i = 0; i < vowels.length; i++){
            int arrayElement = random.nextInt(vowels.length);
            System.out.println(vowels[arrayElement]);
        }
        return random;
    }
    private Random generateConsonant(){
        Random random = new Random(consonants.length);
        for (int i = 0; i < consonants.length; i++){
            int arrayElement = random.nextInt(consonants.length);
            System.out.println(vowels[arrayElement]);
        }
        return random;
    }


}
