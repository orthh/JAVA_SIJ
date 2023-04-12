
public class Model {
	// Music 설계도 작성
	
	// VO(Value Object)
	
	// 필드
	private String songName;   // 음악제목
	private String singer;     // 가수이름
	private int playTime;      // 음악길이(s)
	private String musicPath;  // 음악파일 경로

	// 생성자
	public Model(String songName, String singer, int playTime, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}

	// getter, setter	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	

	
	
}
