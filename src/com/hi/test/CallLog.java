package com.hi.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CallLog {
	public static void main(String arg[]){
		CallLog cl = new CallLog();
		cl.calculateAmt();
	}
	 void calculateAmt(){
		String s = "00:02:07,400-234-090\n"
				+ "00:04:01,701-080-080\n"
				+ "00:05:00,400-234-090\n"
				+ "00:00:01,701-080-080\n"
				+ "00:00:01,702-080-080\n"
				+ "00:06:01,703-080-080\n";
		String[] totalCalls = s.split("\n");
		if(totalCalls != null){
			Map<String, Integer> totalCallsMap = new HashMap<String, Integer>();
			for(String eachCall:totalCalls){
				String[] callDetails = eachCall.split(",");
				if(callDetails != null){
					String duration = callDetails[0];
					String phone =  callDetails[1];
					Integer durationTotal = 0;
					if(totalCallsMap.containsKey(phone)){
						Integer dur = totalCallsMap.get(phone);
						durationTotal = dur +calDuration(duration);
					}else{
						durationTotal = calDuration(duration);
					}
					totalCallsMap.put(phone, durationTotal);
				}
			}
			System.out.println(totalCallsMap);
			Map.Entry<String, Integer> maxEntry = null;
			for (Map.Entry<String, Integer> entry : totalCallsMap.entrySet())
			{
			    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			    {
			        maxEntry = entry;
			    }
			}
			totalCallsMap.remove(maxEntry.getKey());
			System.out.println(maxEntry);
			System.out.println(totalCallsMap);
			Iterator<String> ite = totalCallsMap.keySet().iterator();
			
			while(ite.hasNext()){
				Integer it = calAmt(totalCallsMap.get(ite.next()));
				System.out.println(it);
			}
		}
	}
	 Integer calAmt(Integer duration){
		 int amount = 0;
		 if(duration < 300){
			 amount = amount + duration*3;
		 }else{
			
			 if(duration%60 == 0){
				 
				 amount = amount + (duration/60)*150;
			 }else{
				 amount = amount + ((duration/60)+1)*150; 
			 }
		 }
		 return amount;
	 }
	 Integer calDuration(String duration){
		String[] time = duration.split(":");
		int hours, minutes, seconds;
		int totalSeconds =0;
		
		if(time != null){
			hours = new Integer(time[0]);
			minutes = new Integer(time[1]);
			seconds = new Integer(time[2]);
			totalSeconds = hours*60*60 + minutes*60 + seconds;
			
		}
		return totalSeconds;
	}
}
