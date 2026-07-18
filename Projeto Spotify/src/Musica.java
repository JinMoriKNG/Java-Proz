public class Musica {
    private int musicId;
    private String music;
    private String views;

    public Musica(int musicId, String music, String views) {
        this.musicId = musicId;
        this.music = music;
        this.views = views;
    }

    public String getMusic(){return music;}
    public String getViews(){return views;}
}
