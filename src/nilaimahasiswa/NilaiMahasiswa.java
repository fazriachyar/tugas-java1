/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author Fazri Achyar Rozaq
 * NIM : 211011400210
 * Kelas : 04TPLE001
 */
class Mahasiswa {
     
    private double quiz, uts, uas, nAkhir;
    private char index=0;
    private String nama, nim, keterangan;
    
    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }
    public double getUas() {
        return uas;
    }
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama=nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    double getNilaiAkhir(double quiz,double uts,double uas){
        nAkhir=(0.2*quiz)+(0.3*uts)+(0.5*uas);
        return nAkhir;
    }
    public void getIndexNilai(double nAkhir){
        
        if (nAkhir>=80){
            index='A';
            keterangan="SangatBaik";
        }
        else if(nAkhir>=68){
            index='B';
            keterangan="Baik";
        }
        else if(nAkhir>=56){
            index='C';
            keterangan="Cukup";
        }
        else if(nAkhir>=45){
            index='D';
            keterangan="Kurang";
        }
        else if(nAkhir<=45){
            index='E';
            keterangan="Sangat Kurang";
        } 
        
        System.out.println("Index = "+index);
        System.out.println("Keterangan = "+keterangan);
        
    }
    }
public class NilaiMahasiswa{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa oMhs = new Mahasiswa();
            oMhs.setNama("Fazri Achyar Rozaq");
            oMhs.setNim("211011400210");
            oMhs.setQuiz(100);
            oMhs.setUts(100);
            oMhs.setUas(100);
 
        
        for(int i=1;i<=4;i++){
            System.out.println("Nama ke "+i+"\t= "+oMhs.getNama());
        }
        for(int j=8;j>=1;j--){
            System.out.println("Nim ke "+j+"\t= "+oMhs.getNim());
        }
        System.out.println("\n");
        
        double nAkhir=oMhs.getNilaiAkhir(oMhs.getQuiz(), oMhs.getUts(), oMhs.getUas());
        
        System.out.println("Quiz : "+oMhs.getQuiz());
        System.out.println("UTS : "+oMhs.getUts());
        System.out.println("UAS : "+oMhs.getUas());
        System.out.println("\n");
        System.out.println("Nilai Akhir = "+nAkhir);
        System.out.println("\n");
        oMhs.getIndexNilai(nAkhir);
    }
    
}
