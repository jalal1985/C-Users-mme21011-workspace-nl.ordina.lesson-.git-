package nl.ordina.lesson.webbasedSap;

public class AanvraagData {
	// class always with capital P
	private String name;
	 int dossiernummer;
// Voorbeeld van een class waarin een aantal velden iedere keer ingevoerd kunnen worden 
	

	 public AanvraagData(String newName, int newDossierNummer) {
		name = newName;
		dossiernummer = newDossierNummer;
	
	}

	public void setNameAnddossiernummer(String newName, int newDossierNummer) {
		name = newName;
		dossiernummer = newDossierNummer;
	}

	public String getNameAndAge() {
		return name ;

	}
	
	public void set(int newDossierNummer){
		dossiernummer=newDossierNummer;
	}

	public int getAge(int newDossierNummer) {
		return dossiernummer;

	}
}
