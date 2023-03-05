package com.hi.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneCallPriceCalculator {
	private int perSecPrice = 3;
	private int perMinPrice = 150;

	public static void main(String... args) {
		PhoneCallPriceCalculator priceCalculator = new PhoneCallPriceCalculator();
		//String str = "00:01:07,400-234-090\n" + "00:05:01,701-080-080\n" + "00:05:00,400-234-090";
		String str = "00:02:07,400-234-090\n"
				+ "00:04:01,701-080-080\n"
				+ "00:05:00,400-234-090\n"
				+ "00:00:01,701-080-080\n"
				+ "00:00:01,702-080-080\n"
				+ "00:06:01,703-080-080\n";
		System.out.println(priceCalculator.solution(str));
	}

	/**
	 * This mehtod returns the price for given list of calls after applying the
	 * promotion
	 * 
	 * @param str
	 *            - list of calls in String format
	 * @return - return the payable price
	 */
	public int solution(String str) {
		String[] calls = str.split("\n");
		String[] callDetails = null;
		String callDurationStr = "00:00:00";
		String[] callDurationSplit = null;
		String callPhoneNum = null;
		int secs = 0;
		int mins = 0;
		int hours = 0;
		int totalPrice = 0;

		Map<String, String> conversationDurationByPhoneNum = new HashMap<String, String>();

		// iterate thru all calls to find out the gross price (before applying
		// promotion)
		for (int i = 0; i < calls.length; i++) {
			int price = 0;
			callDetails = calls[i].split(",");
			callDurationStr = callDetails[0];
			callPhoneNum = callDetails[1];
			if (conversationDurationByPhoneNum.get(callPhoneNum) == null) {
				conversationDurationByPhoneNum.put(callPhoneNum, callDurationStr);
			} else {
				String currentDurations = conversationDurationByPhoneNum.get(callPhoneNum);
				conversationDurationByPhoneNum.put(callPhoneNum, currentDurations + "," + callDurationStr);
			}
			callDurationSplit = callDurationStr.split(":");
			hours = Integer.parseInt(callDurationSplit[0]);
			mins = Integer.parseInt(callDurationSplit[1]);
			secs = Integer.parseInt(callDurationSplit[2]);
			if (hours > 0 || mins >= 5) {
				mins = hours * 60 + mins + (secs > 0 ? 1 : 0);
				price = mins * perMinPrice;
			} else {
				price = (mins * 60 + secs) * perSecPrice;
			}

			System.out.println("Price:" + price);
			totalPrice += price;
		}
		System.out.println("--->totalPrice:" + totalPrice);

		// find the ptomotion discount
		int promotionDiscount = findPromotionDiscount(conversationDurationByPhoneNum);

		// return the result
		return totalPrice - promotionDiscount;
	}

	private int findPromotionDiscount(Map<String, String> conversationsByPhoneNum) {
		Map<String, Integer> conversationLengths = new HashMap<String, Integer>();
		for (String key : conversationsByPhoneNum.keySet()) {
			conversationLengths.put(key, getConversationTime(conversationsByPhoneNum.get(key)));
		}

		int longestDuration = 0;
		Set<String> longestdurationPhoneNums = null;

		// Iterate the keys to find the longestDuration Phonenumber
		for (String key : conversationLengths.keySet()) {
			if (conversationLengths.get(key) > longestDuration) {
				longestdurationPhoneNums = new HashSet<String>();
				longestDuration = conversationLengths.get(key);
				longestdurationPhoneNums.add(key);
			} else if (conversationLengths.get(key) == longestDuration) {
				longestdurationPhoneNums.add(key);
			}
		}
		// find price for all calls to the longest Duration PhoneNumber
		int promotionPrice = getPromotionPrice(conversationsByPhoneNum, longestdurationPhoneNums);
		System.out.println("promotionPrice:" + promotionPrice);
		return promotionPrice;
	}

	/**
	 * Iterate thru the longest duration Numbers, and find the smallest price
	 * promotion
	 * 
	 * @param conversationsByPhoneNum
	 *            - all conversation durations
	 * @param longestdurationPhoneNums
	 *            - longest durationPhone Numbers
	 * @return
	 */
	private int getPromotionPrice(Map<String, String> conversationsByPhoneNum, Set<String> longestdurationPhoneNums) {
		int[] promotionPrices = new int[longestdurationPhoneNums.size()];
		int i = 0;
		for (String longestdurationPhoneNum : longestdurationPhoneNums) {
			int promotionPrice = 0;
			for (String callDurationStr : conversationsByPhoneNum.get(longestdurationPhoneNum).split(",")) {
				String[] callDurationSplit = callDurationStr.split(":");
				int hours = Integer.parseInt(callDurationSplit[0]);
				int mins = Integer.parseInt(callDurationSplit[1]);
				int secs = Integer.parseInt(callDurationSplit[2]);
				int price = 0;
				if (hours > 0 || mins >= 5) {
					mins = hours * 60 + mins + (secs > 0 ? 1 : 0);
					price = mins * perMinPrice;
				} else {
					price = (mins * 60 + secs) * perSecPrice;
				}
				promotionPrice += price;
			}
			promotionPrices[i++] = promotionPrice;
		}
		int promotionPrice = promotionPrices[0];
		for (int j = 0; j < promotionPrices.length; j++) {
			if (promotionPrices[j] < promotionPrice) {
				promotionPrice = promotionPrices[j];
			}
		}
		return promotionPrice;
	}

	/**
	 * @param string
	 *            - all conversation durations
	 * @return - total time in secs
	 */
	private Integer getConversationTime(String string) {
		int totalSecs = 0;
		String[] durations = string.split(",");
		// iterate thru all durations to findout the total duration in secs.
		for (int i = 0; i < durations.length; i++) {
			String[] time = durations[i].split(":");
			int hours = Integer.parseInt(time[0]);
			int mins = Integer.parseInt(time[1]);
			int secs = Integer.parseInt(time[2]);
			totalSecs += secs + (60 * mins) + (3600 * hours);
		}
		return totalSecs;
	}

}
