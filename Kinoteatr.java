public class Kinoteatr {

    // Kinoteatr nomi
    private String nomi;

    // Film nomi
    private String filmNomi;

    // Film davomiyligi
    private int davomiyligi;

    // Chipta narxi
    private double chiptaNarxi;

    // Zaldagi o'rindiqlar soni
    private int orinlarSoni;

    // Chipta sotib olish
    public void chiptaSotibOlish() {
        System.out.println("Chipta sotib olindi");
    }

    // Filmni boshlash
    public void filmniBoshlash() {
        System.out.println("Film boshlandi");
    }

    // Film haqida ma'lumot chiqarish
    public void malumot() {
        System.out.println(filmNomi + " - " + davomiyligi + " daqiqa");
    }
}