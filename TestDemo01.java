package demo01.test;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo01.data.BossList;
import demo01.data.MeetingList;
import demo01.pojo.Meeting;
import demo01.service.MeetingService;

public class TestDemo01 {
	public static void main(String[] args) {
		String xmlPath = "demo01/config/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		MeetingService ms = (MeetingService) applicationContext.getBean("meetingService");
		MeetingList ml = (MeetingList) applicationContext.getBean("meetingList");
		BossList list = (BossList) applicationContext.getBean("bossList");
		ms.theMeeting(ml.getList().get(0), list);
		
	}
}
