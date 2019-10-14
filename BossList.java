package demo01.data;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Set;

import demo01.pojo.Boss;

public class BossList {

//	private ArrayList<Boss> list;
	private TreeMap<String, Boss> map = new TreeMap<String, Boss>();
	
	public BossList() {
		super();
//		this.list.add(new Boss("老板01","公司01","红旗01","苹果01"));
//		this.list.add(new Boss("老板02","公司02","大众02","橘子02"));
//		this.list.add(new Boss("老板02","公司02","奔驰03","香蕉03"));
		this.map.put("老板01", new Boss("老板01","公司01","红旗01","苹果01"));
		this.map.put("老板02", new Boss("老板02","公司02","大众02","橘子02"));
		this.map.put("老板03", new Boss("老板02","公司02","奔驰03","香蕉03"));
	}

	public BossList(TreeMap<String, Boss> map) {
		super();
		this.map = map;
	}

	public TreeMap<String, Boss> getMap() {
		return map;
	}

	public void setMap(TreeMap<String, Boss> map) {
		this.map = map;
	}
	
}
