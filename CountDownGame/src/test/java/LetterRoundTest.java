import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.*;
import org.mockito.Mockito.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LetterRoundTest {

    @Mock
    static CountdownRandom randomGenerator;

    @Mock
    static WordList wordList;


    @BeforeEach
    void setup() {
        randomGenerator = mock(CountdownRandom.class);
    }

    @Test
    void addRandomVowel() {
        when(randomGenerator.getVowel()).thenReturn('a');
        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        assertTrue(round.getLetters().contains('a'));
    }

    @Test
    void addRandomConsonant() {
        when(randomGenerator.getConsonant()).thenReturn('b');
        LetterRound round = new LetterRound(randomGenerator);
        round.addConsonant();
        assertTrue(round.getLetters().contains('b'));
    }

    @Test
    void validateThreeVowels() {
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i');
        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        round.addVowel();
        round.addVowel();
        assertEquals(3, round.getLetters().size());
        assertTrue(round.getLetters().contains('a'));
        assertTrue(round.getLetters().contains('e'));
        assertTrue(round.getLetters().contains('i'));
        System.out.println(round.getLetters());
    }

    @Test
    void validateFourConsonants() {
        when(randomGenerator.getConsonant()).thenReturn('r', 's', 't', 'c');
        LetterRound round = new LetterRound(randomGenerator);
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        assertEquals(4, round.getLetters().size());
        assertTrue(round.getLetters().contains('r'));
        assertTrue(round.getLetters().contains('s'));
        assertTrue(round.getLetters().contains('t'));
        assertTrue(round.getLetters().contains('c'));
        System.out.println(round.getLetters());
    }

    @Test
    void addToManyVowels() {
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'o', 'u', 'a');
        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        assertThrows(CountdownTooManyVowelsException.class, round::addVowel);
        System.out.println(round.getLetters());
    }

    @Test
    void addToManyConsonants() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        LetterRound round = new LetterRound(randomGenerator);
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        assertThrows(CountdownTooManyConsonantsException.class, round::addConsonant);
    }

    @Test
    void justTheRightAmountTest() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'o', 'u');
        LetterRound round = new LetterRound(randomGenerator);
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        assertEquals(9, round.getLetters().size());
    }

    @Test
    void listIsLessThanNine() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'o', 'u');
        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        assertThrows(LessThanNineException.class, () -> round.guessWord(""));
    }

    @Test
    void listIsMoreThanNine() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'o', 'u');
        LetterRound round = new LetterRound(randomGenerator);
        assertThrows(MoreThanNineException.class, () -> {
            round.addVowel();
            round.addVowel();
            round.addVowel();
            round.addVowel();
            round.addVowel();
            round.addConsonant();
            round.addConsonant();
            round.addConsonant();
            round.addConsonant();
            round.addConsonant();
        });
    }

    @Test
    void testForOneLetterUsedOnlyOnce() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'a', 'a');

        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        // [a,e,i,a,a,b,c,d,f]
        // round.guessWord("bad")
        //assert we expect it to work
        //round.guessWord("aa")
        //round.guessWord("aaaa")
        //round.guessWord("ii")
        //round
//        round.guessWord("bad");
        assertTrue(round.guessWord("bad"));
        assertTrue(round.guessWord("bad"));
    }

    @Test
    void testIfLettersAreNoTValid() {
        when(randomGenerator.getConsonant()).thenReturn('b', 'c', 'd', 'f', 'g', 'h', 'f');
        when(randomGenerator.getVowel()).thenReturn('a', 'e', 'i', 'a', 'a');
        LetterRound round = new LetterRound(randomGenerator);
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addVowel();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        round.addConsonant();
        assertFalse(round.guessWord("aaaa"));
        assertFalse(round.guessWord("aaao"));
        assertFalse(round.guessWord("bswa"));
    }

    @Test
    void doesTxtFileLoadTest() {
        WordList dictionary = new WordList();
        dictionary.loadFile();
        assertFalse(dictionary.getWords().size() > 0);

    }
    @Test
    void doesWordExistInListTest(){
        WordList dictionary = new WordList();
        dictionary.loadFile();

        assertTrue(dictionary.validWord("cat"));
    }
//    @Test
//    void scoreWordThatIs9Char(){
//        WordList dictionary = new WordList();
//        when(dictionary.getWords()).thenReturn("hippoo");
//        LetterRound round = new LetterRound(randomGenerator);
//        round.addWord();
//        int score = (round.getWords().get(0).toCharArray().length)*2;
//        assertEquals(18, score);
//    }



}

