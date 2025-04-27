package lab.music.control;

import lab.music.entity.*;

public class MusicPlayerTest {
    public static void main(String[] args) {
        System.out.println("===== ���� ��� �ý��� �׽�Ʈ =====");
        System.out.println();
        
        // MP3 �׽�Ʈ
        System.out.println("--- MP3 �׽�Ʈ ---");
        MP3 mp3 = new MP3("Dynamite", "BTS", "5MB");
        mp3.displayInfo();
        mp3.play();
        mp3.setVolume(8);
        mp3.play();
        mp3.stop();
        System.out.println();
        
        // Vinyl �׽�Ʈ
        System.out.println("--- Vinyl �׽�Ʈ ---");
        Vinyl vinyl = new Vinyl("Yesterday", "The Beatles", 33);
        vinyl.displayInfo();
        vinyl.play();
        vinyl.clean();
        System.out.println();
        
        // ������ �׽�Ʈ
        System.out.println("--- ������ �׽�Ʈ ---");
        MusicMedia media = new MP3("Butter", "BTS", "4MB");
        media.displayInfo();
        media.play();
        System.out.println();
        
        // ĳ���� �׽�Ʈ
        System.out.println("--- ĳ���� �׽�Ʈ ---");
        Playable playable = (Playable)media;
        playable.setVolume(3);
//        playable.play();
        playable.setVolume(7);
        playable.stop();
    }
}