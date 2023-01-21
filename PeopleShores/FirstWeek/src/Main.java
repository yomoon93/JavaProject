public class Main {
        public static void main (String[] args){
            // Card is an object variable
            //use this Card and add a variable in this case an instance

            Card aceOfHearts = new Card("heart", "A");
            // new Card its and instance
            Card aceOfDiamond = new Card("diamond", "A");
            Card aceOfSpades = new Card("spade", "A");
            Card fourOfDiamond = new Card("Diamond","4");
            NewCard fourOfSpades = new NewCard("spade", "A", "red");

            // duplicate a line ctrl + d
            //

            // aceHearts holds two things the suit and the number
            System.out.println(aceOfHearts.number()); //"A"
            System.out.println(aceOfDiamond);//[suit: diamond, number:"A"]
            System.out.println(fourOfDiamond.suit());
            System.out.println(fourOfDiamond.number());
            System.out.println("This is light work " + fourOfDiamond.number());

            System.out.printf("Love that this works %s cool right. \n" , aceOfDiamond.number());
            System.out.printf("The card i hold is %s and the color is %s", aceOfDiamond.suit(), fourOfSpades.color);
            System.out.printf("The card i hold is %s and the color is %s", aceOfSpades.suit(), aceOfSpades.number());


        }
        //method and this explains what the parameters are
        record Card(String suit, String number){

        }
    record NewCard(String suit, String number, String color){

    }

    }

