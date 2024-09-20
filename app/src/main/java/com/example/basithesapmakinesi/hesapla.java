package com.example.basithesapmakinesi;

public class hesapla {
    private  int gelensayi1 ,gelensayi2;

    // constructure oluştur.
    public hesapla(int gelensayi1, int gelensayi2) {
        this.gelensayi1 = gelensayi1;
        this.gelensayi2 = gelensayi2;
    }
    //kullanıcının seçtiği butona göre işlem yaptır. Sonra bunlar mainactivitydeki metot içine yazdır.

    public int toplam(){
        return  gelensayi1+ gelensayi2;
    }
    public int cikar(){
        return gelensayi1-gelensayi2;
    }
    public  int böl(){
        return gelensayi1/ gelensayi2;
    }
    public int carp(){
        return gelensayi1*gelensayi2;
    }

}
