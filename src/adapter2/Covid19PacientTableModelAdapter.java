package adapter2;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] {"Symptom", "Weight" };
	protected Vector<Symptom> symptoms;

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient=p;
		symptoms = new Vector<Symptom>(pacient.getSymptoms());
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		return pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		if(col == 0) {
			return symptoms.get(row).getName();
		} else if (col == 1) {
			return pacient.getWeight(symptoms.get(row));  
		}
		return null;
	}
}
