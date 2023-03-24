public class Fahrzeug {
    // Eigenschaften des Fahrzeugs
    private String modell;
    private String marke;
    private int jahr;
    private int maxGeschwindigkeit;
    private int anzahlRaeder;
    private String motor;
    private String getriebe;
    private String reifen;
    private String fahrgestellKonfiguration;
    private String radKonfiguration;
    private double gewicht;
    private double zulaessigeGesamtmasse;

    // Konstruktor
    public Fahrzeug(String modell, String marke, int jahr, int maxGeschwindigkeit, int anzahlRaeder, String motor,
            String getriebe, String reifen, String fahrgestellKonfiguration, String radKonfiguration, double gewicht,
            double zulaessigeGesamtmasse) {
        this.modell = modell;
        this.marke = marke;
        this.jahr = jahr;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.anzahlRaeder = anzahlRaeder;
        this.motor = motor;
        this.getriebe = getriebe;
        this.reifen = reifen;
        this.fahrgestellKonfiguration = fahrgestellKonfiguration;
        this.radKonfiguration = radKonfiguration;
        this.gewicht = gewicht;
        this.zulaessigeGesamtmasse = zulaessigeGesamtmasse;
    }

    // Getter-Methoden
    public String getModell() {
        return modell;
    }

    public String getMarke() {
        return marke;
    }

    public int getJahr() {
        return jahr;
    }

    public int getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    public String getMotor() {
        return motor;
    }

    public String getGetriebe() {
        return getriebe;
    }

    public String getReifen() {
        return reifen;
    }

    public String getFahrgestellKonfiguration() {
        return fahrgestellKonfiguration;
    }

    public String getRadKonfiguration() {
        return radKonfiguration;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getZulaessigeGesamtmasse() {
        return zulaessigeGesamtmasse;
    }

    // Setter-Methoden
    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public void setAnzahlRaeder(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }

    public void setMotor(String motor) {
        this.motor = motor;

    }
public void setGetriebe(String getriebe) {
    this.getriebe = getriebe;
}

public void setReifen(String reifen) {
    this.reifen = reifen;
}

public void setFahrgestellKonfiguration(String fahrgestellKonfiguration) {
    this.fahrgestellKonfiguration = fahrgestellKonfiguration;
}

public void setRadKonfiguration(String radKonfiguration) {
    this.radKonfiguration = radKonfiguration;
}

public void setGewicht(double gewicht) {
    this.gewicht = gewicht;
}

public void setZulaessigeGesamtmasse(double zulaessigeGesamtmasse) {
    this.zulaessigeGesamtmasse = zulaessigeGesamtmasse;
}

// Methode zur Bestimmung der verbauten Komponenten basierend auf dem Produktionsdatum
public void bestimmeKomponenten(int produktionsjahr) {
    // Anhand des Produktionsjahres können die verbauten Komponenten bestimmt werden
    if (produktionsjahr >= 2022) {
        this.motor = "Elektromotor";
        this.getriebe = "Direktantrieb";
        this.reifen = "Niederquerschnittsreifen";
    } else if (produktionsjahr >= 2010 && produktionsjahr <= 2021) {
        this.motor = "Verbrennungsmotor";
        this.getriebe = "Schaltgetriebe";
        this.reifen = "Standardreifen";
    } else {
        this.motor = "Verbrennungsmotor";
        this.getriebe = "Automatikgetriebe";
        this.reifen = "Standardreifen";
    }
}

// Methode zur Bestimmung der Fahrgestellkonfiguration basierend auf dem Produktionsdatum
public void bestimmeFahrgestellKonfiguration(int produktionsjahr) {
    // Anhand des Produktionsjahres kann die Fahrgestellkonfiguration bestimmt werden
    if (produktionsjahr >= 2022) {
        this.fahrgestellKonfiguration = "Monocoque";
    } else {
        this.fahrgestellKonfiguration = "Leiterrahmen";
    }
}

// Methode zur Bestimmung der Radkonfiguration basierend auf dem Produktionsdatum
public void bestimmeRadKonfiguration(int produktionsjahr) {
    // Anhand des Produktionsjahres kann die Radkonfiguration bestimmt werden
    if (produktionsjahr >= 2022) {
        this.radKonfiguration = "Allradantrieb";
    } else if (produktionsjahr >= 2010 && produktionsjahr <= 2021) {
        this.radKonfiguration = "Hinterradantrieb";
    } else {
        this.radKonfiguration = "Vorderradantrieb";
    }
}

public static void main(String[] args) {
    // Beispiel für die Verwendung der Klasse
    Fahrzeug fahrzeug = new Fahrzeug("Model 3", "Tesla", 2022, 250, 4, "", "", "", "", "", 2000, 3000);
    fahrzeug.bestimmeKomponenten(fahrzeug.getJahr());
    fahrzeug.bestimmeFahrgestellKonfiguration(fahrzeug.getJahr());
    fahrzeug.bestimmeRadKonfiguration(fahrzeug.getJahr());
    
    System.out.println("Fahrzeug: " + fahrzeug.getModell() + " (" + fahrzeug.getMarke() + ")");
    System.out.println("Produktionsjahr: " + fahrzeug.getJahr());
    System.out.println("Motor: " + fahrzeug.getMotor());
    System.out.println("Getriebe: " + fahrzeug.getGetriebe());
    System.out.println("Reifen: " + fahrzeug.getReifen());
    System.out.println("Fahrgestellkonfiguration: " + fahrzeug.getFahrgestellKonfiguration());
    System.out.println("Radkonfiguration: " + fahrzeug.getRadKonfiguration());
    System.out.println("Gewicht: " + fahrzeug.getGewicht() + " kg");
    System.out.println("Zulässige Gesamtmasse: " + fahrzeug.getZulaessigeGesamtmasse() + " kg");
    }
}