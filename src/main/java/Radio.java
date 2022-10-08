public class Radio {
    protected int currentRadio;
    protected int currentVolume;

    public void next() {
        if (currentRadio < 9) {
            currentRadio++;
        } else {
            currentRadio = 0;
        }
    }

    public void prev() {
        if (currentRadio > 0) {
            currentRadio--;
        } else {
            currentRadio = 9;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
