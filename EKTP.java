/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.ktp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class EKTP {

    public static void main(String[] args) {
  
        HashMap<String, ArrayList> dataHash = new HashMap<>();
        ArrayList<String> dataList = new ArrayList<String>();
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Kode Kelurahan  :   (1.Kelurahan Sukamaju)  (2.Kelurahan Sehat Sejahtera)");
        int kode=input.nextInt();
        if(kode==1||kode==2){
            System.out.println("Masukan Asal RT : (1-4)");
            int asalrt=input.nextInt();
            if(asalrt==1||asalrt==2||asalrt==3||asalrt==4){
            for (int i = 0; i < 3; i++) {
                    System.out.println("Nama            : ");
                    String nm=input.next();
                    System.out.println("Agama           : ");
                    String agm=input.next();
        
                    NamaAgama data1= new NamaAgama(nm, agm);
        
                    System.out.println("Jenis Kelamin   : ");
                    String jk=input.next();
                    System.out.println("Pekerjaaan      : ");
                    String pk=input.next();
                    JenisKelaminPekerjaan  data2=new JenisKelaminPekerjaan(jk, pk);
        
                    System.out.println("Golongan darah  : ");
                    String golD=input.next();
                    System.out.println("Kelurahan       : ");
                    String kelh=input.next();
                    GolonganDarahKelurahan data3=new GolonganDarahKelurahan(golD, kelh);
        
                    System.out.println("RT              : ");
                    String rt=input.next();
                    System.out.println("Tempat Lahir    : ");
                    String tmpt=input.next();
                    RTTempatLahir data4=new RTTempatLahir(rt, tmpt);
        
                    System.out.println("Tanggal Lahir   : ");
                    String tgl=input.next();
                    System.out.println("Kewargaanegaraan: ");
                    String kwgr=input.next();
                    TanggalLahirKewarganegaraan data5=new TanggalLahirKewarganegaraan(tgl, kwgr);
        
                    dataList.add(" "+data1+" "+data2+" "+data3+" "+ data4+" "+ data5);
                            
                    dataHash.put(nm,dataList);
                    Collections.sort(dataList);
                }
                for(String a: dataHash.keySet()){
                    System.out.println("Nama    :   "+a);
                }
            }
        }
    }
}
