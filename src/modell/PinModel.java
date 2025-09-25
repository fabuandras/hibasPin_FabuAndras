package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PinModel {

    private String pin = "";
    private boolean mentve = false;

    public void gombMegnyomva(int szam) {
        if (pin.length() < 4) {
            pin += szam;
        }
    }

    public boolean isMentve() {
        return mentve;
    }

    public String getPin() {
        return pin;
    }

    public void ment() throws IOException {
        if (!mentve && pin.length() == 4) {
            Path file = Path.of("pin.txt");
            Files.writeString(file, pin);
            mentve = true;
        }
    }

    public void reset() {
        pin = "";
        mentve = false;
    }
}
