package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Main {

	public static void main(String[] args) {

		// Setting up Scanner and Locale
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Collecting the number of students
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		// Setting up vector
		Students[] vect = new Students[n];

		// Creating a "for" to read Students data
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();

			// Instantiating Students class and filling the vector with it
			vect[i] = new Students(name, grade1, grade2);
		}

		// Printing the approved students
		System.out.println("Alunos aprovados:");

		for (int i = 0; i < vect.length; i++) {
			if ((vect[i].getGrade1() + vect[i].getGrade2()) / 2 >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}

}
