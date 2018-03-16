import java.util.Arrays;

public class Playlist {

    public static void main(String[] args) {


        Playlist [] playlist  = new Playlist [100];
        System.out.println(Arrays.toString(playlist));


    }

    int n;
    Song [] songs = new Song[n];
    public Playlist (int n) {
        this.n = n;
    }
    public Playlist(String text, int sec) {

    }
    public void add(Song song){

    }
    public void print (){

    }
}
