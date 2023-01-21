public class GallaryApp {
    public static void main(String[] args) {
        Gallery boom = new Gallery("Kevin");
        Art a = new Art("Munar", "The Moon" , 1993);
        Art b = new Art("Napoleon Crossing the Alps", "Jacques-Louis David" , 1801);
        Art c = new Art("Jason from Periera", "Juan Pabalo",1756);
        boom.addArtWork(a);
        boom.addArtWork(b);
        boom.addArtWork(c);
        System.out.println(boom);
        System.out.println(boom.oldArtWork()); ;
    }


}
