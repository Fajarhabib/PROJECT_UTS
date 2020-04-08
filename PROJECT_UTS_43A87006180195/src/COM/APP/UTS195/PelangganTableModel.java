/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.APP.UTS195;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rizky Wahyudi
 */
public class PelangganTableModel extends AbstractTableModel{
    //pembuatan generic list
    private List<pelanggan> list;
     
    //pembuatan constructor tanpa parameter
    public PelangganTableModel() {
    }
    //pembuatan constructor dengan parameter
    public PelangganTableModel(List<pelanggan> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        //pembuatan size baris atau data pada list
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //mengikuti entiti pada table
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //memanggil object pada baris dan kolom
        return list.get(rowIndex).getValue(columnIndex);
    }

    private String[] columns = {"ID","Nama","Merk","Harga","Jumlah"}; 
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
