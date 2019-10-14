package demo01.service;

import java.util.ArrayList;

import demo01.data.BossList;
import demo01.pojo.Meeting;

public class MeetingService {

//	模拟开会
	public void theMeeting(Meeting meeting, BossList list) {
		System.out.println("会议主题：" + meeting.getTheme());
//		老板名字
		ArrayList<String> bossNames = meeting.getBossNames();
		System.out.println("参加会议的老板：" + bossNames);
//		老板具体信息
		for(int i = 0;i < bossNames.size();i++) {
			System.out.println(list.getMap().get(bossNames.get(0)).toString());
		}
	}
}
