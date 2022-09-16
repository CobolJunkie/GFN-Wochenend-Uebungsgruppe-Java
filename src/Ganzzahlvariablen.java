

public class Ganzzahlvariablen {
    public static void main(String[] args) {
        System.out.println("Hallo Freunde!");

        // Variablen in Java können in verschiedenen Datentypen angelegt werden.
        // Diese können unterschiedliche Mengen an Daten und unterschiedliche Typen von Daten enthalten.
        // Für Ganzzahlen stehen folgende Typen zur Verfügung

        byte b = 127;
        System.out.println(b);
        // Der Variablentyp Byte kann Zahlen im Bereich -128 bis +127 darstellen
        // er ist mit 8 bits (1 byte) Speicherbelegung sehr klein, und kann keine Kommastellen darstellen
        // sein Standardwert ist 0.

        short s = 30000;
        System.out.println(s);
        // Der Variablentyp Short kann Zahlen im bereich von -32768 bis 32,767 darstellen.
        // er belegt 16 bit speicher (2 bytes) doppelt so viel wie "byte" und halb so viel wie "int"
        // sein Standardwert ist 0.

        int i = 5;
        System.out.println(i);
        // Der Variablentyp Short kann Zahlen im bereich von -2,147,483,648 bis 2,147,483,647 darstellen.
        // Er belegt 32 bit speicher (4 bytes) doppelt so viel wie "short" und halb so viel wie "long"
        // sein Standardwert ist 0.

        long l = 1000000000;
        System.out.println(l);
        // Der Variablentyp Short kann Zahlen im bereich von -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807 darstellen.
        // er belegt 64 bit speicher (8 bytes) doppelt so viel wie "int"
        // sein Standardwert ist 0.

        // ------------------------------------------------------------------------------------------------------------------------

        // Was passiert wenn wir den gültigen Bereich über oder unterschreiten?
        // in diesem Beispiel nehmen wir den wert i im Datenformat INT und setzen ihn mittels einer Methode auf den
        // maximalen zulässigen wert

        char c ;
        c = 'a';
        System.out.println(c);
        c = 100;
        System.out.println(c);
        c = 'a' +2;
        System.out.println(c);

        i = Integer.MAX_VALUE;

        float f = 1.3f;
        double d = 1.3;

//        System.out.println(c);
        // Der wert von i beträgt nun 2.147.483.647
//        System.out.printf("Wir haben den Wert i auf MAX_VALUE gesetzt. Er beträgt nun: %s%n", i);
//        i = i + 1;
//        System.out.printf("Wir haben den Wert i um 1 erhöht, mehr als sein maximalwert zulässt. Er beträgt nun: %s%n", i);

        // Wollen wir Zahlen mit Kommastellen darstellen so benötigen wir andere Datentypen.

    }


}
