/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldFuncionarios;
import bean.GldProdutosRoupas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasFuncionarios extends AbstractTableModel {

    private List lstFuncionarios;

    public void setList(List lstFuncionarios) {
        this.lstFuncionarios = lstFuncionarios;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstFuncionarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldFuncionarios gldFuncionarios = (GldFuncionarios) lstFuncionarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return gldFuncionarios.getGldIdFuncionario();
        } else if (columnIndex ==1) {
            return gldFuncionarios.getGldNome();        
        } else if (columnIndex ==2) {
            return gldFuncionarios.getGldCpf();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Cpf";
        }
        return "";
    }
}
