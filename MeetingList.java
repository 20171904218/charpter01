package demo01.data;

import java.util.ArrayList;

import demo01.pojo.Meeting;

public class MeetingList {

	private ArrayList<Meeting> list = new ArrayList<Meeting>();

	public MeetingList() {
		super();
		Object[] arr = new BossList().getMap().keySet().toArray();
		ArrayList<String> li = new ArrayList<String>();
		for(int i = 0;i<arr.length;i++) {
			li.add((String) arr[i]);
		}
		this.list.add(new Meeting("会议01", li));
	}

	public MeetingList(ArrayList<Meeting> list) {
		super();
		this.list = list;
	}

	public ArrayList<Meeting> getList() {
		return list;
	}

	public void setList(ArrayList<Meeting> list) {
		this.list = list;
	}
	
}
