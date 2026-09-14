import java.util.ArrayList;
import java.util.Scanner;

// Yangi Class  Pitsa
class Pitsa{
    // Quluflanga quti String qutini nomi PIZZA
    private String PIZZA;
    // Quluflangan quti Int Qutini nomi size
    private int size;
    // Quluflanga quti Double qutini nomi Money
    private double Money;

    // Method ochil olamiz
    public void SetMoney(double money2){
        // Agar quluflanga qutini ichidan 75000.0 dan va 39000.0 dan katta yoki teng bo'lsa true bo'lsa quluflanga quti ichidan kerakli son chiqarsilsin
        if(money2 <= 75000.0 || money2 >= 39000.0){
            this.Money = money2;
            System.out.print(" \n💵 To'lo'v 💵 ");
        }// Teng bo'lmasam False qaytarsin yani !! Siz Pul to'lamadaingiz Pulini Oldindan Beriladi !!
        else {
            System.out.println(" !! Siz Pul to'lamadingiz Pulini oldindan beriladi !! ");
        }
    }
    // Method 2 setPizza2 ochvolamiz
    public void setPizza2(String Pizzaturi){
        // Agar Pizzaturida Margarita bo‘lsa true yoki false
        if(Pizzaturi.equalsIgnoreCase("Margarita".toLowerCase().trim())){
            // O'zgaruvchidan kelyotgan Str quluflangan qutiga tushusin
            this.PIZZA = Pizzaturi;
            System.out.print(" Iltimos Biroz kuting Buyurtmangiz tayor bo'ladi 🕛 \n");
        } else if (Pizzaturi.equalsIgnoreCase("Pepperoni".toLowerCase().trim())) {
            // O'zgaruvchidan kelyotgan Str quluflangan qutiga tushusin
            this.PIZZA = Pizzaturi;
            System.out.print(" Iltimos Biroz kuting Buyurtmangiz tayor bo'ladi 🕛 \n");
        } else if (Pizzaturi.equalsIgnoreCase("To'rt Pishloq".toLowerCase().trim())) {
            // O'zgaruvchidan kelyotgan Str quluflangan qutiga tushusin
            this.PIZZA = Pizzaturi;
            System.out.print(" Iltimos Biroz kuting Buyurtmangiz tayor bo'ladi 🕛 \n");
        }else{
            System.out.println("Assorti mahsuloti tugab qoldi ");
        }
    }
    // To'lov Ouput Methodi
    public void Tolov(){
        // quluflangan qutini ichidan kelyotgan Str null ga teng bo'lsa true >>>>  Eslatma Yozishda xato qilgansiz
        // Null ga teng bo'lmasa False chiqarsin va quluflangan qutini ichidan this orqali chaqirib olib outputga chiqaramiz
        ArrayList<String> hm = new ArrayList<>();
        if(this.PIZZA == null){
            System.out.print(" Eslatma Yozishda xato qilgansiz ");
        }else {
            System.out.print("\n-----Buyurtma-----");
            System.out.print("\nPitsani Turi : " + this.PIZZA);
            System.out.print("\nTo'langan puli : " + this.Money);
            System.out.print("\nPitsani Size >>> " + this.size);
            hm.add("\nMargaritani <<< Mahsulotlari bor");
            hm.add("\nPapperoni <<< Mahsulti ham bor ");
            hm.add("\nTo'rt pishloq va Barbekyu << Mahsuloti bor");
            hm.add("\nAssorti Mahsuloti bor");
            hm.remove("\nAssorti Mahsuloti bor");
            System.out.print(hm);
        }
    }
    // Size Methodi bu Pizzani o'lchami
    public void setSize(int Seze){
        // Agar ozgaruvchi tarafdan kiritilyotgan son 10 ga 12 ga va 13 ga teng yoki kichik bo'lsa true bo'lmasa false
        if(Seze >= 10 || Seze <= 12 || Seze >= 13){
            this.size = Seze;
            System.out.print("Qabul qilindi");
        }else {
            System.out.print(" Not founded  ");
        }
    }

}
public class OOP_Pizza{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size2;
        Pitsa Pitsatayorlanishi = new Pitsa();
        System.out.print("""
                            Assalomu Alaykum Pista Code hush kelibsiz
                                          >>> MENU <<<
                               Katta ______ O'rtacha _______ Kichik
                Margarita      75000.0      59000.0          39000.0  💵 So'm
                Barbekyu       95000.0      79000.0          49000.0  💵 So'm
                To'rt Pishloq  95000.0      79000.0          49000.0  💵 So'm
                Pepperoni      89000.0      69000.0          45000.0  💵 So'm
                """);
        System.out.print("Tanlagan pitsangizni Manabu yerga yozing >>>> ");
        String Pizza = sc.nextLine();
        System.out.print(" Pulini To'lang >>>>>  ");
        double money = sc.nextDouble();
        System.out.print(" Pitsani O'lchamini Yozing >>>> ");
        size2 = sc.nextInt();

        // Methodlarni chaqirib olyapmiz
        Pitsatayorlanishi.setPizza2(Pizza);
        Pitsatayorlanishi.SetMoney(money);
        Pitsatayorlanishi.setSize(size2);
        Pitsatayorlanishi.Tolov();


        sc.close();
    }
}