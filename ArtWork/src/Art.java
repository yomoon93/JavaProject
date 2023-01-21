public class Art {
    private String artist;
    private String title;
    private int year;
    private Valuation valuation;

    public Art(String aArtist ,String aTitle, int aYear){
        this.artist = aArtist;
        this.title = aTitle;
        this.year = aYear;
    }

    public void setValuation(Valuation valuation) {
        this.valuation = valuation;
//        this.valuation.;
    }

    public Valuation getValuation() {
        return valuation;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int add(){
        return 2022 - this.year;
    }

    @Override
    public String toString() {
        if (this.valuation != null) {
            // There IS a vauluation
            return "Artwork{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", year=" + year +
                    '}' + "(Last valuation: $"+valuation.getPrice()+" in "+valuation.getYearValuation()+")";
        } else {
            return "Artwork{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", year=" + year +
                    "} (No valuation data found)";
        }
    }

    public static Art mostExpensive(Art l, Art o){
        if(l.valuation !=null && o.valuation != null ){
            if (l.valuation.getPrice() >= o.valuation.getPrice()){
                return l;
            }return o;
        } else if (l.valuation == null && o.valuation !=null) {
            return o;
        } else if (o.valuation == null && l.valuation !=null) {
            return l;
        }else return null;

    }
}
