package project1;

import java.awt.SystemColor;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;
import java.util.function.Function;

import javax.lang.model.element.VariableElement;
import javax.sound.midi.Track;
import javax.sound.sampled.spi.AudioFileWriter;

public class main {

	/*
	 * starting point
	 *
	 * Runner
	 */
	public static void main(String[] args) {

		// String name = "LoL";
		// System.out.print("Hello!");

		// int = whole numbers
		int number = 120;

		// wrapper class
		// integer num = 203;

//		double radius;
//		double area;
//
//		radius = 20;
//
//		area = radius * radius * 3.14159;
//
//	   	System.out.println("the area is " + radius + " is " + area);

		System.out.println(Math.random());

		Scanner userInput = new Scanner(System.in);
		userInput.close();

		System.out.println("Enter your name: ");

		String userName = userInput.nextLine();

		System.out.println("My name is " + userName);

	}

}
