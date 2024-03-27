package LCD;

public class LCD {
    //isi bagian ini
    private String status;
    private int volume;
    private int brightness;
    private String[] cables ={"VGA", "DVI", "HDMI", "DisplayPort"};
    private String cablesType;
    
    public LCD(){
        this.status="Mati";
        this.volume = 0;
        this.brightness = 0;
        this.cablesType= "Belum Tersambung";
    }
    public void turnOn(){
        this.status ="Menyala";//
    }

    public void turnOff(){
        this.status= "Mati";
    }
    public void Freeze(){
        this.status = "Freeze";
    }

    public void setVolume(int volume){
        if (volume >=0 && volume <=100) {
            this.volume = volume;
        } else {
            System.out.println("Rentang volume 0-100");
        }
    }

    public void volumeUp(){
            this.volume++;
    }
    public void volumeDown(){
            this.volume--;
    }
    public void setBrightness(int brightness) {
            this.brightness = brightness;
    }
    public void brightnessUp(){
            this.brightness++;
        }
    public void brightnessDown(){
            this.brightness--;
    }

    public void setCable(int option) {
            this.cablesType = cables[option];//lengkapi method ini dengan mennggunakan array
    }
    
    public void displayMessage() {
       System.out.println("LCD Status: " + this.status);
       System.out.println("Volume: " + this.volume);
       System.out.println("Brightness: " + this.brightness);
       System.out.println("Cable: " + this.cablesType); //lengkapi method ini
    }
}