package BangunDatar;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(5);
        BangunDatar persegiPanjang1 = new BangunDatar();
        BangunDatar persegiPanjang2 = new BangunDatar(10, 15);

        System.out.println("Luas persegi dengan sisi "+persegi.getSisi()+" adalah "+persegi.hitungLuasPersegi());
        persegi.setValueSisi(6);
        System.out.println("Keliling persegi dengan sisi "+persegi.getSisi()+" adalah "+persegi.hitungKelilingPersegi());
        //persegi panjang default
        System.out.println("Luas persegi panjang dengan panjang "+persegiPanjang1.getPanjang()+" dan lebar "+persegiPanjang1.getLebar()+" adalah "+persegiPanjang1.hitungLuasPersegiPanjang());
        System.out.println("Keliling persegi panjang dengan panjang "+persegiPanjang1.getPanjang()+" dan lebar "+persegiPanjang1.getLebar()+" adalah "+persegiPanjang1.hitungKelilingPersegiPanjang());

        System.out.println("Luas persegi panjang dengan panjang "+persegiPanjang2.getPanjang()+" dan lebar "+persegiPanjang2.getLebar()+" adalah "+persegiPanjang2.hitungLuasPersegiPanjang());
        System.out.println("Keliling persegi panjang dengan panjang "+persegiPanjang2.getPanjang()+" dan lebar "+persegiPanjang2.getLebar()+" adalah "+persegiPanjang2.hitungKelilingPersegiPanjang());
    }
}
