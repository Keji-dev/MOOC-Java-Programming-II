
public class CD implements Packable {
    
    private String artist;
    private String nameCD;
    private int publicationYear;
    private double weight = 0.1;

    public CD(String artist, String nameCD, int publicationYear) {
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return  artist + ": " + nameCD + " (" + publicationYear + ")";
    }
    
    
}
