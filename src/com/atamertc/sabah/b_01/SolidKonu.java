package com.barisd;

public class SolidKonu {
/*
 * Uncle Bob Robert Martin
 * Kötü Tasarım:
 * Katılık: Sisteminize değişiklik yapmakta zorluk yaşıyorsanız bunun sebebi yazılımınızın katı olmasıdır.
 * Kırılganlık: Sisteminizde meydana gelen bir hatayı ortadan kaldırırken başka yerlerden hatalar ortaya çıkması
 * Taşınamazlık: Tasarımınızda tekrar kodu kullanmakta zorluk yaşıyorsanız tasarım hatalıdır.
 * 
 * SOLID:
 * Kötü tasarımlardan kaçınmak için öne sürülen yöntemler. 
 * Hedef: Tasarımlarınızın esnke anlaşılır ve yönetilebilir olmasını sağlamak.
 * 
 * Single Responsibility Principle-SRP
 * 
 * Oluşturulan yapılar(metod-sınıf-interface) tek bir görevi yerine getirmelidir. Belli bir işi yapmalıdır.
 * Bu yapılarda değişime gitmek için yalnızca bir sebebiniz olmamınızdır.
 * 
 * İsviçre çakısını biz sevmiyoruz!
 * Superman class da sevmiyoruz.
 * Giant Hulk classıları istemiyoruz.
 * 
 * Cümle birden fazla iş yapıyorsa metoda çevirmeyi düşünün.
 * Eğer metod birden fazla iş yapıyorsa cut-paste ile farklı metodlar oluşturun.
 * Sınıfım birden fazla işlev barındırıyorsa yeni sınıflar açıp o işlevleri taşıyın.
 * 
 * kaydet()
 * findById()
 * findAll()
 * 
 * kaydet(Musteri m,islemTuru t){
 *   servisTur(t)
 * }
 * 
 * 
 * 
 * 
 * 
 * Open Closed Principle-OCP
 * 
 * Projeye ait tüm yapıların gelişime açık ama değişime kapalı olması.
 * Yazılan kodların kendisinde değişim ihtiyacı bulunmadan yeni eklemeler yapılabilmesi
 * Kodunuzu eğer değişim gerektirmeyecek şekilde yapılandırabilirseniz çok doğru yoldasınız.
 * 
 * Liskov Substitution Principle-LSP
 * Interface Segregation Principle- ISP
 * Dependency Inversion Principle -DIP
 */
	public static void main(String[] args) {
		
	}
}

class Isci{
	
}

class İsciYonetici{
	public void isciEkle(OracleDatabase database,Isci isci) {
		//...
	}
}

class OracleDatabase{
	public void veritabaninaEkle(Isci isci) {
		
	}
}

class MySqlDatabase{
	public void veritabaninaEkle(Isci isci) {
		
	}
}

