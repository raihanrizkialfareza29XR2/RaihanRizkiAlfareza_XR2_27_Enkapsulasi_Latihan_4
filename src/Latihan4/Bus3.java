package Latihan4;

public class Bus3 {
    private int penumpang;
    private int maxPenumpang;

    //Konstruktor kelas Bus
    public Bus3 (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //Method mutator untuk menambahkan penumpang
    public void addPenumpang (int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else {
            this.penumpang = temp;
        }
    }
    public void getPenumpang (int password){
        if (password == 24){
            System.out.println("Password Benar");
        }
        else {
            System.out.println("Password Salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
