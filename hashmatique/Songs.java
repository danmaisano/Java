import java.util.HashMap;
import java.util.Set;
public class Songs {
    public static void main(String[] args){
        HashMap<String, String> album = new HashMap<String, String>();

        album.put("hey", "hey hey hey");
        album.put("song2", "woohoooooo");
        album.put("californication", "psychic spies from china");
        album.put("lana", "danger zone");

        String song = album.get("song2");
        // System.out.println(song); // one song output

        Set<String> keys = album.keySet();
        for(String key: keys){
            System.out.println(key + " : " + album.get(key));
        }
    }
}