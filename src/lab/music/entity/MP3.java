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
        this.volume = 5; // �⺻ ���� ����
    }
    
    @Override
    public void play() {
        super.play();
        System.out.println("���� ����: " + volume);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("���� ũ��: " + fileSize);
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("������ " + volume + "�� �����Ǿ����ϴ�.");
    }
    
    @Override
    public void stop() {
        System.out.println(format + " ����� �����Ǿ����ϴ�.");
    }
}