package demo01.pojo;

import java.util.ArrayList;

//	会议类
public class Meeting {
	
	private String theme;
	private ArrayList<String> bossNames;
	public Meeting() {
		super();
	}
	public Meeting(String theme, ArrayList<String> bossNames) {
		super();
		this.theme = theme;
		this.bossNames = bossNames;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public ArrayList<String> getBossNames() {
		return bossNames;
	}
	public void setBossNames(ArrayList<String> bossNames) {
		this.bossNames = bossNames;
	}
	
}
