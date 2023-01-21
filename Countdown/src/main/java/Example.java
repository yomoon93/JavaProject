import java.util.Random;

public class Example {
    private MyRandom random;
    private NumberRound numberRound;



    private char[] vowels = {'a', 'e', 'i', 'o' ,'u'};
    private char [] consonants = {'b','c', 'd','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w', 'x','y','z'};

    public Example(MyRandom rand) {
        this.random = rand;
    }

    public Example() {
        this.random = new MyRandom();
    }

    /**
     * Example of a method that generates random data which would be hard to test
     * @return
     */
    public char getRandomVowels() {
        int index = random.nextInt(vowels.length);
        return vowels[index];
    }

    public char getRandomConsonant(){
        int index = random.nextInt(consonants.length);
        return consonants[index];
    }



    /**
     * Example of a method that relies on another instance method that behaves randomly
     * @return
     */
//    public String getReversedRandomName() {
//
//        char[] name = getRandomVowels().toCharArray();
//        for (int i = 0; i < name.length / 2; i++) {
//            char tmp = name[i];
//
//            name[i] = name[name.length-i-1];
//            name[name.length-i-1] = tmp;
//        }
//        return String.valueOf(name);
//    }

    public static void main(String[] args) {

        Example example = new Example();
        char randomVowels = example.getRandomVowels();
        char randomConsonant = example.getRandomConsonant();

        int num = new NumberRound().threeDigitNumber();
//        System.out.println(num);

        for (int i = 0; i < 10; i++) {

//            System.out.printf("Random letter %d is %s%n", i, randomVowels);
        }
        System.out.println(randomVowels);
        System.out.println(randomConsonant);
    }
}