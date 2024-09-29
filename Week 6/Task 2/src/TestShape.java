public class TestShape {
    public static void main(String[] args) {
        // Membuat objek Shape dengan constructor default
        Shape shape1 = new Shape();
        System.out.println(shape1);  // Menguji toString() untuk shape1

        // Membuat objek Shape dengan constructor parameter
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);  // Menguji toString() untuk shape2

        // Mengubah atribut shape1
        shape1.setColor("blueh");
        shape1.setFilled(false);
        System.out.println(shape1);  // Menguji toString() setelah perubahan atribut

        // Mengubah atribut shape2
        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println(shape2);  // Menguji toString() setelah perubahan atribut
    }
}
