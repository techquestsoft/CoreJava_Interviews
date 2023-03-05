package com.hi.test;
public class CharTesting {
	public static void main(String[] args) {
		String line = "0029029070999991901010106004+64333+023450FM-12+000599999V0202701N015919999999N0000001N9-00781+99999102001ADDGF108991999999999999999999";

		String year = line.substring(15, 19);
		System.out.println("Yeat==="+year);
		String month = line.substring(19, 21);
		System.out.println("month==="+month);
		String day = line.substring(21, 23);
		System.out.println("day==="+day);
	    int airTemperature;
	    if (line.charAt(87) == '+') { // parseInt doesn't like leading plus signs
	      airTemperature = Integer.parseInt(line.substring(88, 92));
	      System.out.println("airTemperature==="+airTemperature);
	    } else {
	      airTemperature = Integer.parseInt(line.substring(87, 92));
	      System.out.println("airTemperature1==="+airTemperature);
	    }
	    String quality = line.substring(92, 93);
	    System.out.println("quality==="+quality);
	    /*if (airTemperature != MISSING && quality.matches("[01459]")) {
	      output.collect(new Text(year), new IntWritable(airTemperature));
	    }*/

		/*StringBuffer lineBuff = new StringBuffer(line);
		lineBuff.insert(4, ",");
		lineBuff.insert(11, ",");
		lineBuff.insert(17, ",");
		lineBuff.insert(22, ",");
		lineBuff.insert(25, ",");
		lineBuff.insert(28, ",");
		lineBuff.insert(33, ",");
		lineBuff.insert(35, ",");
		lineBuff.insert(11, ",");
		lineBuff.insert(17, ",");
		lineBuff.insert(22, ",");
		lineBuff.insert(25, ",");
		lineBuff.insert(28, ",");
		lineBuff.insert(33, ",");
		lineBuff.insert(35, ",");
		
		Character plus = '+';
		Character minus = '-';
		// System.out.println(lineBuff.toString());
		// System.out.println("lineBuff.charAt(37)====" + lineBuff.charAt(36));
		boolean charRemoved = false;
		if (new Character(lineBuff.charAt(36)).compareTo(plus) == 0) {
			lineBuff.deleteCharAt(36);
			lineBuff.insert(41, ",");
			charRemoved = true;
		} else {
			lineBuff.insert(43, ",");
		}
		// System.out.println(lineBuff.toString());
		if (charRemoved) {
			if (new Character(lineBuff.charAt(42)).compareTo(plus) == 0) {
				lineBuff.deleteCharAt(42);
				lineBuff.insert(47, ",");
			} else {
				lineBuff.insert(48, ",");
			}
		} else {
			if (new Character(lineBuff.charAt(43)).compareTo(plus) == 0) {
				lineBuff.deleteCharAt(43);
				lineBuff.insert(48, ",");
			} else {
				lineBuff.insert(49, ",");
			}
		}
		// System.out.println(lineBuff.toString());
*/	}
}
