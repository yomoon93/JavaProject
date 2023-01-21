public class ArtApplication {


    public static void main(String[] args) {
        Art a = new Art("Munar", "The Moon" , 1993);
        Art b = new Art("Napoleon Crossing the Alps", "Jacques-Louis David" , 1801);
        Valuation k = new Valuation(30000,2012);
        Valuation kev = new Valuation(50000);
        a.setValuation(kev);


//        System.out.println(a);
//        System.out.println(b);
//        a.setArtist("Bonaparte");
//        System.out.println(a);
//        System.out.println(a.add());
        b.setValuation(k);
//
//        System.out.println(b);
//        System.out.println(a);
        System.out.println("Most Expensive artwork?");
        System.out.println(Art.mostExpensive(a,b));
    }



    
}
