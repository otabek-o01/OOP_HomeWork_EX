public class Restoran {

    // Restoran nomi
    private String nomi;

    // Restoran manzili
    private String manzil;

    // Restorandagi stol soni
    private int stolSoni;

    // Restorandagi taom nomi
    private String taom;

    // Taom narxi
    private double narx;

    // Taom buyurtma qilish
    public void buyurtmaBerish() {
        System.out.println("Taom buyurtma qilindi");
    }

    // Stol band qilish
    public void stolBandQilish() {
        System.out.println("Stol band qilindi");
    }

    // Restoran haqida ma'lumot chiqarish
    public void malumot() {
        System.out.println(nomi + " - " + manzil);
    }
}