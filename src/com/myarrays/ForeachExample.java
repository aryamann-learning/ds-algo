package com.myarrays;

public class ForeachExample {
	public static void main(String[] args) {
		String[] states = { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chattisgarh", "Goa", "Gujarat",
				"Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", " Maharastra",
				"Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu",
				"Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" };

		for (String state : states) {
			System.out.println(state);

			/*if (state == "Telangana") {
				continue;
			}
			System.out.println(state);*/
		}
	}

}
