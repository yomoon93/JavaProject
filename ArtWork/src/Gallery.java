import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Gallery {
   private String name;
    private List<Art> emptyList ;

    public Gallery(String name,List<Art> collection){
        this.emptyList = collection;
        this.name = name;
    }
    public Gallery(String name ){
                    // this creates a new empty array
        this(name, new ArrayList<Art>());
    }



    public void addArtWork(Art a){
        if(!emptyList.contains(a)){
            emptyList.add(a);
        }
    }
    public Art oldArtWork(){
        Art oldest = this.emptyList.get(0);
        for(Art b : this.emptyList){
            if(oldest.getYear() > b.getYear()){
                oldest = b;
            }
        }
    return oldest;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", EmptyList=" + emptyList +
                '}';
    }
}
