package com.datetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(now);
		System.out.println();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(dtf.format(now));
		System.out.println();
		DateTimeFormatter dtfone= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		System.out.println(dtfone.format(now));
		System.out.println();
		DateTimeFormatter dtftwo= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dtftwo.format(now));
		System.out.println();
		DateTimeFormatter dtfthree= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		System.out.println(dtfthree.format(now));
		System.out.println();
		DateTimeFormatter dtffour= DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS");
		System.out.println(dtffour.format(now));
		System.out.println();
		DateTimeFormatter dtffive= DateTimeFormatter.ofPattern("MMM dd, yyyy");
		System.out.println(dtffive.format(now));
		System.out.println();
		DateTimeFormatter dtfsix= DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss");
		System.out.println(dtfsix.format(now));
		System.out.println();
		DateTimeFormatter dtfseven= DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z");
		System.out.println(dtfseven.format(zdt));
		System.out.println();
		DateTimeFormatter dtfeight= DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'Z");
		System.out.println(dtfeight.format(zdt));
		System.out.println();
		DateTimeFormatter dtfnine= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		System.out.println(dtfnine.format(now));
		System.out.println();
		DateTimeFormatter dtften= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
		System.out.println(dtften.format(zdt));
		System.out.println();
		DateTimeFormatter dtfeleven= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		System.out.println(dtfeleven.format(now));
		System.out.println();
		DateTimeFormatter dtftwelve= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		System.out.println(dtftwelve.format(zdt));
		System.out.println();
		DateTimeFormatter dtfthirteen= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		System.out.println(dtfthirteen.format(now));
		System.out.println();
		DateTimeFormatter dtffourteen= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(dtffourteen.format(now));
		System.out.println();
		DateTimeFormatter dtffifteen= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
		System.out.println(dtffifteen.format(zdt));
		System.out.println();
		DateTimeFormatter dtfsixteen= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(dtfsixteen.format(now));
		System.out.println();
		DateTimeFormatter dtfseventeen= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSXXX");
		System.out.println(dtfseventeen.format(zdt));
		System.out.println();
	}
}
