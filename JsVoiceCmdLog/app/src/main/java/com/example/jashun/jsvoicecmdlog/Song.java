package com.example.jashun.jsvoicecmdlog;

public class Song {
	private long id;
	private String songName;
	private String album;
	private String ktvFilePath;
	private String normalFilePath;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setKtvFilePath(String ktvFilePath){this.ktvFilePath = ktvFilePath;}
	public String getKtvFilePath(){return ktvFilePath;}
	public void setNormalFilePath(String normalFilePath){this.normalFilePath = normalFilePath;}
	public String getNormalFilePath(){return normalFilePath;}
}
