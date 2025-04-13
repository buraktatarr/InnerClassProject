public class Employee {
    private String ad;
    private String soyad;
    private ContactInfo contactInfo;

    // Constructor oluşturma;
    public Employee(String ad, String soyad, String telefon, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.contactInfo = new ContactInfo(telefon, email);
    }

    // Inner class (İletişim bilgileri için) oluşturma;
    public class ContactInfo {
        private String telefon;
        private String email;

        public ContactInfo(String telefon, String email) {
            this.telefon = telefon;
            this.email = email;
        }

        public void iletisimBilgileriniYazdir() {
            System.out.println("Telefon: " + telefon);
            System.out.println("E-posta: " + email);
        }
    }

    // Tüm çalışan bilgilerini yazdıran metodu oluşturma;
    public void calisanBilgileriniYazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        contactInfo.iletisimBilgileriniYazdir();
    }
}
