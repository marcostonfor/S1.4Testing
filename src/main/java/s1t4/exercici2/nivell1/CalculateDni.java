package s1t4.exercici2.nivell1;

public class CalculateDni {
    private static final char[] DNI_LETTERS = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };
    private char dniLetter;
    private int dniNumber;

    public CalculateDni(int dniNumber) {
        this.dniNumber = dniNumber;
        this.dniLetter = calculateDniLetter(dniNumber);
    }

    public char getDniLetter() {
        return dniLetter;
    }

    public void setDniLetter(char dniLetter) {
        this.dniLetter = dniLetter;
    }

    public int getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public char calculateDniLetter(int dni) {
        return DNI_LETTERS[dni % 23];
    }

    @Override
    public String toString() {
        return "El numero " + dniNumber + " obtiene la letra " + dniLetter + ".\n" +
                "Resultando el numero de dni: " + dniNumber+dniLetter + ".";
    }
}

/*
* Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi
*  un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
* */
