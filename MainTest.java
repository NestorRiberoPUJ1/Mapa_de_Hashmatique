import java.util.HashMap;

class MainTest {
    public static void main(String[] args) {
        
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("La Pachanga","Pásame más tinto, se vino la pachanga");
        trackList.put("Mojada","Nada que hablar ni para dar, me vas a odiar, te voy amar");
        trackList.put("Te quiero tanto","Te quiero tanto mi amor te quiero");
        trackList.put("Verano Traidor","Cómo calienta el sol y sé que no está, Me duele como un Dios la ciudad");

        System.out.println(trackList.get("La Pachanga"));


    }
}