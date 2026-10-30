package iterator;

import java.util.Iterator;

import adapter.*;
import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {


	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Ane", 29, new FactorySymptom());
		p.addSymptomByName("fiebre", 3);
		p.addSymptomByName("tos seca", 2);
		p.addSymptomByName("astenia", 3);
		p.addSymptomByName("expectoracion", 1);
		p.addSymptomByName("disnea", 2);

		InvertedIterator adapter = new Covid19PacientInvertedIterator(p.getSymptoms());

		System.out.println("symptomName: ");
		Iterator i1 = Sorting.sortedIterator(adapter, new SymptomNameComparator());
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("severityIndex: ");
		Iterator i2 = Sorting.sortedIterator(adapter, new SeverityIndexComparator());
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}