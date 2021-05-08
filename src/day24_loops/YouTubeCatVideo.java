package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("");
        String video = "World's smallest Cat - \uD83D\uDC08 BBc";
        int seconds = 0;

        while (seconds <= 117) {
            System.out.println("Watching \uD83D\uDC08 " + " at seconds:  " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching: " + video + "!\nLet's start another video!");
    }
}
