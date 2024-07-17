public class Book extends Product{

    private String auther;

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
      public Book(){

    }
    public Book(String auther) {
        this.auther = auther;
    }
    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }
    @Override
    public double getDiscount() {
        return getPrice()*(1-0.3);
    }

    @Override
    public String toString() {
        return super.toString()+ " The auther: "+this.auther+ " , After discount: "+getDiscount();
    }
}
