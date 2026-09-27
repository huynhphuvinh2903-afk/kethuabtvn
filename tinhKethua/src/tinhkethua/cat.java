
package tinhkethua;


public class cat extends pet{
    private String mauLong;

    public cat(String mauLong,String name, int age, int weigh) {
        super(name,age,weigh);
        this.mauLong = mauLong;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
    @Override
      public void speak(){
            System.out.println("Cat is meowing");
        }
    public static void main(String[] args) {
//        cat1
        cat cat1 = new cat("vang", "mao mun", 1, 13);
        System.out.println(cat1.getWeight());
//        cat2
cat cat2 = new cat("den", "meoden", 3, 7);
        System.out.println(cat2.getName());
        cat2.fetchball();
        
           //danhsach
            pet[] danhsachpet = new pet[10];
            danhsachpet[0] = cat1;
            danhsachpet[1] = cat2;
    }
}
