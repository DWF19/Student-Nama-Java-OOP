package Tugas1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa 1 dan 2
        F1D021084 mahasiswa1 = new F1D021084("dhira wahyu febrian");
        F1D021084 mahasiswa2 = new F1D021084("Ramadoni al qadri");

        // Menggunakan setter untuk mahasiswa 1
        mahasiswa1.setNim("F1D021084");
        mahasiswa1.setSemester(6);
        mahasiswa1.setKelas("A");
        mahasiswa1.setTotalSKS(110);
        mahasiswa1.setIPK(3.9f);
        mahasiswa1.setNomorHP("085339052714");

        // Menggunakan getter untuk mengambil dan menampilkan informasi mahasiswa 1
        System.out.println("Informasi Mahasiswa 1 :");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Semester: " + mahasiswa1.getSemester());
        System.out.println("Kelas: " + mahasiswa1.getKelas());
        System.out.println("Total SKS: " + mahasiswa1.getTotalSKS());
        System.out.println("IPK: " + mahasiswa1.getIPK());
        System.out.println("Nomor HP: " + mahasiswa1.getNomorHP());
        mahasiswa1.Status();
        System.out.println();

        // Menggunakan setter untuk mahasiswa 2
        mahasiswa2.setNim("F1D021132");
        mahasiswa2.setSemester(14);
        mahasiswa2.setKelas("B");
        mahasiswa2.setTotalSKS(130);
        mahasiswa2.setIPK(2.14f);
        mahasiswa2.setNomorHP("08433899329239");

        // Menggunakan getter untuk mengambil dan menampilkan informasi mahasiswa 2
        System.out.println("Informasi Mahasiswa 2:");
        System.out.println("Nama: " + mahasiswa2.getNama());
        System.out.println("NIM: " + mahasiswa2.getNim());
        System.out.println("Semester: " + mahasiswa2.getSemester());
        System.out.println("Kelas: " + mahasiswa2.getKelas());
        System.out.println("Total SKS: " + mahasiswa2.getTotalSKS());
        System.out.println("IPK: " + mahasiswa2.getIPK());
        System.out.println("Nomor HP: " + mahasiswa2.getNomorHP());
        mahasiswa2.Status();
    }
}
