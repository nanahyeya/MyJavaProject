package lab.music.entity;

public class MP3 extends DigitalMedia implements Playable {
    private String fileSize;
    private int volume;
    
    public MP3(String title, String artist, String fileSize) {
        this(title, artist, "MP3", fileSize);
    }
    
    public MP3(String title, String artist, String format, String fileSize) {
        super(title, artist, format);
        this.fileSize = fileSize;
        this.volume = 5; // 기본 볼륨 설정
    }
    
    @Override
    public void play() {
        super.play();
        System.out.println("현재 볼륨: " + volume);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("파일 크기: " + fileSize);
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨이 " + volume + "로 설정되었습니다.");
    }
    
    @Override
    public void stop() {
        System.out.println(format + " 재생이 중지되었습니다.");
    }
}