package Tugas1;

public class F1D021084 {
    private String nama;
    private String nim;
    private int semester;
    private String kelas;
    private int totalSKS;
    private float ipk;
    private String nomorHP;

    public F1D021084(String nama) {
        this.nama = nama;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getTotalSKS() {
        return totalSKS;
    }

    public void setTotalSKS(int totalSKS) {
        this.totalSKS = totalSKS;
    }

    public float getIPK() {
        return ipk;
    }

    public void setIPK(float ipk) {
        this.ipk = ipk;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    //METHOD LAINNYA
    public void Status(){
        System.out.println("Mahasiswa masih aktif");
    }

}
