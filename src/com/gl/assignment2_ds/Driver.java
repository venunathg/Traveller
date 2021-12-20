package com.gl.assignment2_ds;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int amount = 0;
		System.out.println("Enter Denominations count");
		int denominations = sc.nextInt();

		int[] notes = new int[denominations];

		System.out.println("Enter the denominations");

		for (int i = 0; i < denominations; i++) {
			notes[i] = sc.nextInt();
		}

		MergeSort mg = new MergeSort();

		System.out.println("Given denomination of notes");
		mg.printArray(notes);

		mg.sort(notes, 0, notes.length - 1);

		System.out.println("\nSorted denomination of notes");
		mg.printArray(notes);

		System.out.println("Enter amount");

		amount = sc.nextInt();

		NotesCount t = new NotesCount();

		t.notesCountImpl(notes, amount);

	}

}
