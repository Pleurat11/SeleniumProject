package PracticeJava;

public class Shfrytezuesi {
    private String kodi;
    private boolean isPremium;
    private double ip;

    public Shfrytezuesi(String kodi, boolean isPremium, double ip) {
        this.kodi = kodi;
        this.isPremium = isPremium;
        this.ip = ip;
    }

    public String getKodi() {
        return kodi;
    }

    public void setKodi(String kodi) {
        this.kodi = kodi;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public double getIp() {
        return ip;
    }

    public void setIp(double ip) {
        this.ip = ip;
    }

}





