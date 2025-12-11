import java.util.HashMap;

public class DictionaryDemo {
    public static void main(String[] args) {

        HashMap<String, String> dict = new HashMap<>();

        dict.put("apel", "buah berwarna merah atau hijau");
        dict.put("kursi", "tempat untuk duduk");
        dict.put("buku", "kumpulan lembaran berisi tulisan");

        System.out.println("apel : " + dict.get("apel"));
        System.out.println("buku : " + dict.get("buku"));
        System.out.println("kursi: " + dict.get("kursi"));
    }
}