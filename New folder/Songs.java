public class Songs {
    public static void main(String[] args) {
        String[] songs = new String[10];
        songs[0] = "Jai Ho";
        songs[1] = "3 Peg";
        songs[2] = "Munjane Manjalli";
        songs[3] = "Just Math Mathalli";
        songs[4] = "Maa Tujhe Salaam";
        songs[5] = "Bombe heluthithe";
        songs[6] = "Tujh Mein Rab Dikhta Hai";
        songs[7] = "Tum Mile";
        songs[8] = "Ae Watan";
        songs[9] = "Kabira";

        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println(songs[i]);
        }
    }
}
