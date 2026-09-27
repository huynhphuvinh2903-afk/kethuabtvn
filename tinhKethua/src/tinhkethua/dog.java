
package tinhkethua;

public class dog extends pet{
    private String tiengkeu;

    public dog(String tiengkeu,String name, int age, int weigh) {
        super(name, age, weigh);
        this.tiengkeu = tiengkeu;
    }

    public String getTiengkeu() {
        return tiengkeu;
    }

    public void setTiengkeu(String tiengkeu) {
        this.tiengkeu = tiengkeu;
        
    }
    //ghi def
    @Override
    public void speak(){
        System.out.println("Dog is barking");
    }
            public static void main(String[] args) {
                //Dog 1
                dog dog1 = new dog("gao gao", "lucky", 3, 30);
                System.out.println(dog1.getName());
                //Dog 2
                dog dog2 = new dog("mimi", "chuha", 2, 21);
                System.out.println(dog2.getAge());
                
                dog2.speak();
                
                   //danhsach
            pet[] danhsachpet = new pet[10];
            danhsachpet[0] = dog1;
            danhsachpet[1] = dog2;
                        
           
    }
       
}
