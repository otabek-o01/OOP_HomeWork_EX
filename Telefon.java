public class Telefon {

    // Telefon nomi
    private String nomi;

    // Telefon modeli
    private String modeli;

    // Telefon narxi
    private double narxi;

    // Telefon xotirasi
    private int xotira;

    // Telefon batareyasi
    private int batareya;

    // Telefonni yoqish
    public void yoqish() {
        System.out.println("Telefon yoqildi");
    }

    // Telefonni o'chirish
    public void ochirish() {
        System.out.println("Telefon o'chirildi");
    }

    // Telefon haqida ma'lumot chiqarish
    public void malumot() {
        System.out.println(nomi + " " + modeli + " " + xotira + "GB");
    }
}