public class Song {
    public static void main(String[] args) {
        Song song = new Song("When I'm Sixty-Four","Beatles",157);
        //song1.setTitel("When I'm Sixty-Four");
        //  song1.setBand("Beatles");
        //  song1.setLaenge(157);
        song.print();
}

    private String titel;
    private String band;
    private long laenge;

    public String getTitel() {
        return titel;
    }

    public String getBand() {
        return band;
    }

    public long getLaenge() {
        return laenge;
    }

    public Song (String titel, String band, long laenge){
        this.titel = titel;
        this.band = band;  //KONSTRUKTOR
        this.laenge = laenge;
    }
    public void print() {
        System.out.println(band + ": " + titel + " (" + laenge + ")");
    }
}
