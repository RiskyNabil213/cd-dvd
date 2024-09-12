public class dvd extends product {
    
    // DVD
    private int leght;
    private String rating ;
    private String studio ;

    public dvd(){
        super();
        leght = 0;
        rating = "";
        studio = "";
    }
    //Constructor parameter
    public dvd (int number, String nama, int quantity, double price, String artist, int nomorlagu, String label) {
        super(number, nama, quantity, price);
        this.leght=leght;
        this.rating=rating;
        this.studio=studio;

    }

    public int getLeght() {
        return this.leght;
    }

    public void setLeght(int leght) {
        this.leght = leght;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("leght : "+ leght);
        System.out.println("rating : "+ rating);
        System.out.println("studio : "+studio);
    }
    
}
