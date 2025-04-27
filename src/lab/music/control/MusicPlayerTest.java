package lab.music.control;

import lab.music.entity.*;

public class MusicPlayerTest {
    public static void main(String[] args) {
        System.out.println("===== 음악 재생 시스템 테스트 =====");
        System.out.println();
        
        // MP3 테스트
        System.out.println("--- MP3 테스트 ---");
        MP3 mp3 = new MP3("Dynamite", "BTS", "5MB");
        mp3.displayInfo();
        mp3.play();
        mp3.setVolume(8);
        mp3.play();
        mp3.stop();
        System.out.println();
        
        // Vinyl 테스트
        System.out.println("--- Vinyl 테스트 ---");
        Vinyl vinyl = new Vinyl("Yesterday", "The Beatles", 33);
        vinyl.displayInfo();
        vinyl.play();
        vinyl.clean();
        System.out.println();
        
        // 다형성 테스트
        System.out.println("--- 다형성 테스트 ---");
        MusicMedia media = new MP3("Butter", "BTS", "4MB");
        media.displayInfo();
        media.play();
        System.out.println();
        
        // 캐스팅 테스트
        System.out.println("--- 캐스팅 테스트 ---");
        Playable playable = (Playable)media;
        playable.setVolume(3);
//        playable.play();
        playable.setVolume(7);
        playable.stop();
    }
}