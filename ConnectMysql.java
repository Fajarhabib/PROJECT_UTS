/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.APP.UTS195;



public class ConnectMysql {
    PelangganDataSource datasource = new PelangganDataSource();
   
        public static void main(String[] args) {
            //Pemanggilan method insert
            new ConnectMysql().testInsert();
           
            //Pemanggilan method update
           new ConnectMysql().testUpdate();
    }
        
    //pembuatan method insert
    public void testInsert(){
        //pemanggilan kelas mahasiswa
        pelanggan mhs = new pelanggan();
        mhs.setIdPart("1");
        mhs.setNamaPart("Anggi");
        mhs.setMerkPart("B");
        mhs.setHarga("34");
        mhs.setJumlah("23");
        
        boolean sukses = datasource.insert(mhs);
        //berhasil
        if (sukses) {
            System.out.println("Insert Data Berhasil!");
        }else{
            System.out.println("Insert Data Gagal!");
        }
    }
    
    //pembuatan method Update
    public void testUpdate(){
        //pemanggilan kelas getByID
        pelanggan mhs = datasource.getByID("a");
        mhs.setIdPart("a a");
        boolean sukses = datasource.update(mhs);
        //berhasil
        if (sukses) {
            System.out.println("Update Data Berhasil!");
        }else{
            System.out.println("Update Data Gagal!");
        }
    }
}
