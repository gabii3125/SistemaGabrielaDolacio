/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.GldVendasRoupas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendas extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldVendasRoupas gldVendasRoupas = (GldVendasRoupas) lstVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return gldVendasRoupas.getGldIdVendas();
        } else if (columnIndex ==1) {
            return gldVendasRoupas.getGldDataVenda();        
        } else if (columnIndex ==2) {
            return gldVendasRoupas.getGldTotal();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Data da Venda";         
        } else if ( columnIndex == 2) {
            return "Total";
        }
        return "";
    }
}
