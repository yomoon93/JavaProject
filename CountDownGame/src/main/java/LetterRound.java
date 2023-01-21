import java.util.*;

public class LetterRound {
    private List<Character> letters;
    private CountdownRandom randomGenerator;
//
//    private WordList wordList

    public LetterRound(CountdownRandom randomGenerator) {
        this.randomGenerator = randomGenerator;
        this.letters = new ArrayList<>();
    }


//    public int countConsonant(){
//        int consonants = 0;
//        for (Character c : this.letters) {
//            if ("bcdfghjklmnpqrstvwxyz".indexOf(c) < 0) { consonants++; }
//        }
//        return consonants;
//        }

    public int countConsonant(){
        int consonants = 0;

        for(int i = 0; i < letters.size(); i++){
            if(!(letters.get(i) == 'a' || letters.get(i) == 'e' || letters.get(i) == 'i' || letters.get(i) == 'o' ||letters.get(i) == 'u')){
                consonants++;
            }
        }
        return consonants;
    }


    public int countVowels(){
        int vowels = 0;

        for(int i = 0; i < letters.size(); i++){
            if(letters.get(i) == 'a' || letters.get(i) == 'e' || letters.get(i) == 'i' || letters.get(i) == 'o' ||letters.get(i) == 'u'){
                vowels++;
            }
        }
        return vowels;
    }

    public void addVowel() {
        if (countVowels()  >= 5){
            throw new CountdownTooManyVowelsException();
        }else if(letters.size() >= 9) throw new MoreThanNineException("This is awful");
        letters.add(randomGenerator.getVowel());
    }
    public void addConsonant() {
        if(countConsonant() >= 6){
            throw new CountdownTooManyConsonantsException();
        }else if(letters.size() >= 9) throw new MoreThanNineException("This is awful");
        letters.add(randomGenerator.getConsonant());
    }


    public List<Character> getLetters() {
        return this.letters;
    }

    public boolean guessWord(String word) {
        List<Character> chars = new ArrayList<>(letters);
        if (letters.size() ==9){

            for (Character c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    return false;
                }else{
                    chars.remove(c);
                }

            }
            return true;
        }
        else if (letters.size() > 9) {
            throw new MoreThanNineException("This is awful coding mister");
        }else throw new LessThanNineException();

    }
//        if(letters.size() == 9){
//            boolean flag = false;
//            //baw
//        for (Character c : word.toCharArray()){
//            if(!letters.contains(c)){
//
//                flag = false;
//                break;
//
//            }else flag = true;
//
//        }
//            return flag;
//
//
//        }

    public boolean lettersIsValid() {

        return true;
    }
}
