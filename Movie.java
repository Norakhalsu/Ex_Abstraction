
public class Movie extends Product{

     private String director ;

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String drector) {
        super(name, price);
        this.director = drector;
    }

    public String getdirector() {
        return director;
    }

    public void setdirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice()*(1-0.5)  ; // %50
    }

    @Override
    public String toString() {
        return super.toString()+ " ,director : "+this.director  +" , After discount "+getDiscount();
    }
}
