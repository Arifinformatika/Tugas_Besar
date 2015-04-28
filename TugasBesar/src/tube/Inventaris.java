package tube;
import java.util.Scanner;
public class Inventaris {
	Scanner in = new Scanner(System.in);
	RuangKelas ruang = new RuangKelas();
	
	public void Insertdata(){
		System.out.println("Masukkan nama ruangan : ");
		ruang.setNamaruang(in.next());
		System.out.println("\n");
		System.out.println("Masukkan Lokasi Ruangan : ");
		ruang.setLokasiruang(in.next());
		System.out.println("\n");
		System.out.println("Masukka Program Studi anda : ");
		ruang.setStudi(in.next());
		System.out.println("\n");
		System.out.println("Masukkan nama Fakultas anda : ");
		ruang.setFakultas(in.next());
		System.out.println("\n");
		
	}
	public void kondisi(){
		System.out.println("Kondisi Ruang Kelas\n");
		System.out.println("Masukkan panjang ruangan : ");
		ruang.setPanjang(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan lebar ruangan : ");
		ruang.setLebar(in.nextInt());
		System.out.println("\n");
		System.out.println("masukan jumlah kursi : ");
		ruang.setJumlahkursi(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah pintu : ");
		ruang.setJumlahpintu(in.nextInt());
		System.out.println("\n");
		
	
	}
	public double Hitungluas(){
		return ruang.getPanjang()*ruang.getLebar();
	}
	public void BentukRuang(){
		if(ruang.getPanjang()==ruang.getLebar()){
			System.out.println("Bentuk Ruangan Persegi");
		}else{
			System.out.println("Bentuk Ruangan Persegi Panjang");
		}
	}
	
	public double rasio(){
		return Hitungluas()/ruang.getJumlahkursi();
	}
	
	public void AnalisaPintu(){
		if(ruang.getJumlahpintu()>=2){
			System.out.println("Jumlah Pintu = Sesuai");
		}else{
			System.out.println("Jumlah Pintu = tidak sesuai");
		}
	}
	public void AnalisaJendela(){
		if(ruang.getJumlahjendela()>=1){
			System.out.println("Jumlah Jendela = Sesuai");
		}else{
			System.out.println("Jumlah Jendela = Tidak Sesuai");
		}
	}
	
	public void JmlhkondisidanposisiSarana(){
		System.out.println("Masukkan jumlah steker diruangan : ");
		ruang.setJumlahstopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		ruang.setKondisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		ruang.setPosisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kabel LCD : ");
		ruang.setKabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		ruang.setPosisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah lampu diruangan : ");
		ruang.setJumlahlampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n 2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		ruang.setPosisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		ruang.setJumlahkipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		ruang.setPosisikipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah AC dalam ruangan : ");
		ruang.setJumlahAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		ruang.setPosisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
		ruang.setSSID(in.nextInt());
		System.out.println("\n");
		System.out.println("Apaka anda bisa Login : \n1. Ya \n2. Tidak");
		ruang.setLogin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah Bandwidth : ");
		ruang.setBandwidth(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah CCTV diruangan : ");
		ruang.setJumlahCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		ruang.setKondisiCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		ruang.setPosisiCCTV(in.nextInt());
		System.out.println("\n");
	}
	public void AnalisaKelistrikan(){
		if(ruang.getJumlahstopkontak()>=4){
			System.out.println("Jumlah StopKontak = Sesuai");
		}else{
			System.out.println("Jumlah StopKontak = tidak sesuai");
		}
		if(ruang.getKondisistopkontak()==1||ruang.getKondisistopkontak()==2){
			System.out.println("Kondisi StopKontak = Sesuai");
		}else{
			System.out.println("Kondisi StopKontak = tidak sesuai");
		}
		if(ruang.getPosisistopkontak()==1||ruang.getPosisistopkontak()==2){
			System.out.println("Posisi StopKontak = Sesuai");
		}else{
			System.out.println("Posisi StopKontak = tidak sesuai");
		}
	}
	public void AnalisisLCD(){
		if(ruang.getKabelLCD()>=1){
			System.out.println("jumlah kabel LCD = sesuai");
		}else{
			System.out.println("jumlah kabel LCD = tidak sesuai");
		}
		if(ruang.getKondisikabelLCD()==1||ruang.getKondisikabelLCD()==2){
			System.out.println("Kondisi Kabel LCD = Sesuai");
		}else{
			System.out.println("Kondisi Kabel LCD = tidak sesuai");
		}
		if(ruang.getPosisikabelLCD()==1){
			System.out.println("Posisi Kabel LCD = sesuai");
		}else{
			System.out.println("Posisi Kabel LCD = tidak sesuai");
		}
	}
	public void AnalisisLampu(){
		if(ruang.getJumlahlampu()>=18){
			System.out.println("Jumlah Lampu = Sesuai");
		}else{
			System.out.println("Jumlah Lampu = tidak sesuai");
		}
		if(ruang.getKondisilampu()==1){
			System.out.println("Kondisi Lampu = Sesuai");
		}else{
			System.out.println("Kondisi Lampu = tidak sesuai");
		}
		if(ruang.getPosisilampu()==1){
			System.out.println("Posisi Lampu = Sesuai");
		}else{
			System.out.println("Posisi Lampu = tidak sesuai");
		}
	}
	public void AnalisisKipas(){
		if(ruang.getJumlahkipasangin()>=2){
			System.out.println("Jumlah Kipas Angin = Sesuai");
		}else{
			System.out.println("Jumlah Kipas Angin = tidak sesuai");
		}
		if(ruang.getKondisikipasangin()==1){
			System.out.println("Kondisi Kipas Angin = Sesuai");
		}else{
			System.out.println("Kondisi Kipas Angin = tidak sesuai");
		}
		if(ruang.getPosisikipasangin()==1){
			System.out.println("Posisi Kipas Angin = Sesuai");
		}else{
			System.out.println("Posisi Kipas Angin = tidak Sesuai");
		}
	}
	public void AnalisisAC(){
		if(ruang.getJumlahAC()>=1){
			System.out.println("Jumlah AC = Sesuai");
		}else{
			System.out.println("Jumlah AC = tidak sesuai");
		}
		if(ruang.getKondisiAC()==1){
			System.out.println("Kondisi AC = Sesuai");
		}else{
			System.out.println("Kondisi AC = tidak sesuai");
		}
		if(ruang.getPosisiAC()==1||ruang.getPosisiAC()==2){
			System.out.println("Posisi AC = Sesuai");
		}else{
			System.out.println("Posisi AC = tidak Sesuai");
		}
	}
	public void AnalisisInternet(){
		if(ruang.getSSID()==1){
			System.out.println("SSID = Sesuai");
		}else{
			System.out.println("SSID = tidak sesuai");
		}
		if(ruang.getLogin()==1){
			System.out.println("Berhasil Login = Sesuai");
		}else{
			System.out.println("Tidak Berhasil Login = tidak sesuai");
		}
	}
	public void AnalisisCCTV(){
		if(ruang.getJumlahCCTV()==2){
			System.out.println("Jumlah CCTV = Sesuai");
		}else{
			System.out.println("Jumlah CCTV = tidak sesuai");
		}
		if(ruang.getKondisiCCTV()==1){
			System.out.println("Kondisi CCTV = Sesuai");
		}else{
			System.out.println("Kondisi CCTV = tidak Sesuai");
		}
		if(ruang.getPosisiCCTV()==1||ruang.getPosisiCCTV()==3){
			System.out.println("Posisi CCTV = Sesuai");
		}else{
			System.out.println("Posisi CCTV = tidak sesuai");
		}
	}
	public void lingkungan(){
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}
	public void AnalisisKebersihan(){
		if(ruang.getKondisilantai()==1){
			if(ruang.getKondisidinding()==1)
				if(ruang.getKondisiatap()==1)
					if(ruang.getKondisipintu()==1)
						if(ruang.getKondisijendela()==1)
							System.out.println("Kebersihan Ruangan = sesuai");
		}else{
			System.out.println("Kebersihan Ruangan = tidak sesuai");
		}
	}
	public void Kebersihan(){
		System.out.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
		ruang.setSirkulasiudara(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan nilai pencahayaan : ");
		ruang.setNilaipencahayaan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa kelembapan diruangan : ");
		ruang.setKelembapan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa suhu dalam ruangan : ");
		ruang.setSuhu(in.nextInt());
		System.out.println("\n");
	}
	public void AnalisisSirkulasiUdara(){
		if(ruang.getSirkulasiudara()==1)
			System.out.println("Sirkulasi Udara = sesuai");
		else
			System.out.println("Sirkulasi Udara = tidak sesuai");
		
	}
	public void AnalisisPencahayaan(){
		if(ruang.getNilaipencahayaan()==1)
			System.out.println("Pencahayaan = sesuai");
		else
			System.out.println("Pencahayaan = tidak sesuai");
	}
	public void AnalisisKelembapan(){
		if(ruang.getKelembapan()==1)
			System.out.println("Kelembapan = sesuai");
		else
			System.out.println("Kelembapan = tidak sesuai");
	}
	public void AnalisisSuhu(){
		if(ruang.getSuhu()==1)
			System.out.println("Suhu = sesuai");
		else
			System.out.println("Suhu = tidak sesuai");
	}
	public void Kenyamanan(){

		System.out.println("Kondisi Kebisingan : \n1. tidak bising \n2. bising");
		ruang.setKebisingan(in.nextInt());
		System.out.println("\n");
		System.out.println("kondisi bau ruangan : \n1. tidak bau \n2. bauk");
		ruang.setBau(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Kebocoran ruangan : \n1. tidak bocor \n2. bocor");
		ruang.setKebocoran(in.nextInt());
		System.out.println("\n");
		System.out.println("Konsisi kerusakan ruangan : \n1. tidak rusak \n2. rusak");
		ruang.setKerusakan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Keausan Ruangan : \n1.tidak aus \n2. sudah aus");
		ruang.setKeausan(in.nextInt());
		System.out.println("\n");
	}
	public void AnalisisKebisingan(){
		if(ruang.getKebisingan()==1)
			System.out.println("Tingkat Kebisingan = Sesuai");
		else
			System.out.println("Tingkat Kebisingan = tidak sesuai");
	}
	public void AnalisisBau(){
		if(ruang.getBau()==1)
			System.out.println("Bau Ruangan = Sesuai");
		else
			System.out.println("Bau Ruangan = tidak sesuai");
	}
	public void AnalisisKebocoran(){
		if(ruang.getKebocoran()==1)
			System.out.println("Tingkat Kebocoran = Sesuai");
		else
			System.out.println("Tingkat Kebocoran = tidak sesuai");
	}
	public void AnalisisKerusakan(){
		if(ruang.getKerusakan()==1)
			System.out.println("Tingkat Kerusakan = Sesuai");
		else
			System.out.println("Tingkat Kerusakan = tidak sesuai");
	}
	public void AnalisisKeausan(){
		if(ruang.getKeausan()==1)
			System.out.println("Tingkat Keausan = Sesuai");
		else
			System.out.println("Tingkat Keausan = tidak sesuai");
	}
	public void Keamanan(){
		System.out.println("Kekokohan ruangan : \n1. kokoh \n2. tidak kokoh");
		ruang.setKekokohan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci pintu ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci jendela ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncijendela(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi bahaya ruangan : \n1.aman \n2. tidak aman");
		ruang.setBahaya(in.nextInt());
		System.out.println("\n");
	}
	public void AnalisisKekokohan(){
		if(ruang.getKekokohan()==1)
			System.out.println("Tingkat Kekokohan = Sesuai");
		else
			System.out.println("Tingkat Kekokohan = tidak sesuai");
	}
	public void AnalisisKunciPintu(){
		if(ruang.getKuncipintu()==1)
			System.out.println("Kunci pintu = Sesuai");
		else
			System.out.println("Kunci pintu = tidak sesuai");
	}
	public void AnalisisKunciJendela(){
		if(ruang.getKuncijendela()==1)
			System.out.println("Kunci Jendela = Sesuai");
		else
			System.out.println("Kunci Jendela = tidak sesuai");
	}
	public void AnalisisKeamananRuang(){
		if(ruang.getBahaya()==1)
			System.out.println("Tingkat Keamanan Ruangan = Sesuai");
		else
			System.out.println("Tingkat Keamanan Ruangan = tidak sesuai");
	}
	public void ListInputan(){
		Inventaris baru = new Inventaris();
		System.out.println(""+ruang.getNamaruang());
		System.out.println(""+ruang.getLokasiruang());
		System.out.println(""+ruang.getStudi());
		System.out.println(""+ruang.getPanjang());
		System.out.println(""+ruang.getLebar());
		System.out.println(" Hasil = "+Hitungluas());
		baru.BentukRuang();
		System.out.println(""+ruang.getJumlahkursi());
		System.out.println("luas rasio = "+rasio());
		System.out.println(""+ruang.getJumlahpintu());
		System.out.println(""+ruang.getJumlahjendela());
		baru.AnalisaPintu();
		baru.AnalisaJendela();
		System.out.println(""+ruang.getJumlahstopkontak());
		System.out.println(""+ruang.getKondisistopkontak());
		System.out.println(""+ruang.getPosisistopkontak());
		baru.AnalisaKelistrikan();
		System.out.println(""+ruang.getKabelLCD());
		System.out.println(""+ruang.getKondisikabelLCD());
		System.out.println(""+ruang.getPosisikabelLCD());
		baru.AnalisisLCD();
		System.out.println(""+ruang.getJumlahlampu());
		System.out.println(""+ruang.getKondisilampu());
		System.out.println(""+ruang.getPosisilampu());
		baru.AnalisisLampu();
		System.out.println(""+ruang.getJumlahkipasangin());
		System.out.println(""+ruang.getKondisikipasangin());
		System.out.println(""+ruang.getPosisikipasangin());
		baru.AnalisisKipas();
		System.out.println(""+ruang.getJumlahAC());
		System.out.println(""+ruang.getKondisiAC());
		System.out.println(""+ruang.getPosisiAC());
		baru.AnalisisAC();
		System.out.println(""+ruang.getSSID());
		System.out.println(""+ruang.getBandwidth());
		baru.AnalisisInternet();
		System.out.println(""+ruang.getJumlahCCTV());
		System.out.println(""+ruang.getKondisiCCTV());
		System.out.println(""+ruang.getPosisiCCTV());
		baru.AnalisisCCTV();
		System.out.println(""+ruang.getKondisilantai());
		System.out.println(""+ruang.getKondisidinding());
		System.out.println(""+ruang.getKondisiatap());
		System.out.println(""+ruang.getKondisipintu());
		System.out.println(""+ruang.getKondisijendela());
		baru.AnalisisKebersihan();
		System.out.println(""+ruang.getSirkulasiudara());
		baru.AnalisisKebisingan();
		System.out.println(""+ruang.getBau());
		baru.AnalisisBau();
		System.out.println(""+ruang.getKebocoran());
		baru.AnalisisKebocoran();
		System.out.println(""+ruang.getKerusakan());
		baru.AnalisisKerusakan();
		System.out.println(""+ruang.getKeausan());
		baru.AnalisisKeausan();
		System.out.println(""+ruang.getKekokohan());
		baru.AnalisisKekokohan();
		System.out.println(""+ruang.getKuncipintu());
		baru.AnalisisKunciPintu();
		System.out.println(""+ruang.getKuncijendela());
		baru.AnalisisKunciJendela();
		System.out.println(""+ruang.getBahaya());
		AnalisisKeamananRuang();
	}
}
