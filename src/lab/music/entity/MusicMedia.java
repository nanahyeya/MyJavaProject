package lab.music.entity;

public abstract class MusicMedia {
    protected String title;
    protected String artist;
    
    public MusicMedia(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public abstract void play();
    
    public void displayInfo() {
        System.out.println("제목: " + title + ", 아티스트: " + artist);
    }
}