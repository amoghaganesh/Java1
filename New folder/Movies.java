public class Movies {
    public static void main(String[] args) {
        String[] movies = new String[20];
        movies[0] = "3 Idiots";
        movies[1] = "Dangal";
        movies[2] = "Lagaan";
        movies[3] = "Bahubali: The Beginning";
        movies[4] = "Bahubali 2: The Conclusion";
        movies[5] = "Sholay";
        movies[6] = "PK";
        movies[7] = "Kabhi Khushi Kabhie Gham";
        movies[8] = "Dilwale Dulhania Le Jayenge";
        movies[9] = "Swades";
        movies[10] = "Rang De Basanti";
        movies[11] = "Queen";
        movies[12] = "Barfi";
        movies[13] = "Zindagi Na Milegi Dobara";
        movies[14] = "Gully Boy";
        movies[15] = "Chak De! India";
        movies[16] = "Taare Zameen Par";
        movies[17] = "Black";
        movies[18] = "Padmaavat";
        movies[19] = "Tumbbad";

        for (int i = movies.length - 1; i >= 0; i--) {
            System.out.println(movies[i]);
        }
    }
}
