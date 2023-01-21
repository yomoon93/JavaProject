import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class NumberRound {
        private List<Integer> numbers;

        private CountDownRandomNumber randomNumberGenerator;


        public NumberRound(CountDownRandomNumber randomNumberGenerator) {
            this.randomNumberGenerator = randomNumberGenerator;
            this.numbers = new ArrayList<>();
        }

        public void addSmallest() {
            numbers.add(randomNumberGenerator.getSmallest());
        }

        public List<Integer> getNumbers() {
            return this.numbers;
        }

        public void addLargest() {
            numbers.add(randomNumberGenerator.getLargest());
        }

        public void guessNumber() {
            if (numbers.size() == 6) {
            } else throw new LessNumberException("You didn't choose right amount numbers");
        }

    }


