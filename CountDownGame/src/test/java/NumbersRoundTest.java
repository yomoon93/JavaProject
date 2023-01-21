import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumbersRoundTest {

    @Mock
    static CountDownRandomNumber  randomNumberGenerator;

    @BeforeEach
    void setup(){
        randomNumberGenerator = mock(CountDownRandomNumber.class);
    }

    @Test
    void addRandomSmallestNumber(){
        when(randomNumberGenerator.getSmallest()).thenReturn(3,4,7);
        NumberRound nRound = new NumberRound(randomNumberGenerator);
        nRound.addSmallest();
        assertTrue(nRound.getNumbers().contains(3));
        assertFalse(nRound.getNumbers().contains(4));
    }

    @Test
    void addRandomLargestNubmer(){
        when(randomNumberGenerator.getLargest()).thenReturn(35, 60, 50, 15);
        NumberRound nRound = new NumberRound(randomNumberGenerator);
        nRound.addLargest();
        assertTrue(nRound.getNumbers().contains(35));
        assertFalse(nRound.getNumbers().contains(60));
    }

    @Test
    void checkTotalNumbersSix(){
        when(randomNumberGenerator.getSmallest()).thenReturn(3,4,7);
        when(randomNumberGenerator.getLargest()).thenReturn(35, 60, 50, 15);
        NumberRound nRound = new NumberRound(randomNumberGenerator);
        nRound.addLargest();
        nRound.addLargest();
        nRound.addSmallest();
        nRound.addSmallest();
        nRound.addSmallest();
        nRound.addSmallest();
        assertEquals(6, nRound.getNumbers().size());
    }

    @Test
    void validTotalNumbersNotLessSixBeforStartGame(){
        when(randomNumberGenerator.getSmallest()).thenReturn(3,4,7);
        when(randomNumberGenerator.getLargest()).thenReturn(35, 60, 50, 15);
        NumberRound nRound = new NumberRound(randomNumberGenerator);
        nRound.addLargest();
        nRound.addLargest();
        nRound.addSmallest();
        nRound.addSmallest();
        nRound.addSmallest();

        // assertThrows(TooLesslettersException.class, () -> { lRound.guessWord("");});
        assertThrows(LessNumberException.class, () -> nRound.guessNumber());
    }

}