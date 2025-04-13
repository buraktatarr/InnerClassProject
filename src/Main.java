public class Main {

    // Bir çalışan nesnesi oluşturulup bilgilerini ekrana yazdırma;
    public static void main(String[] args) {
        Employee calisan1 = new Employee("Burak", "Tatar", "0555 123 4567", "burak@example.com");

        System.out.println("Çalışan Bilgileri:");
        calisan1.calisanBilgileriniYazdir();
    }
}
