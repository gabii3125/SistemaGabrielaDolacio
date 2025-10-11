/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerClientes extends AbstractTableModel {

    private List lstClientes;

    public void setList(List lstClientes) {
        this.lstClientes = lstClientes;
    }
    
    public GldClientes getBean(int rowIndex) {
        return (GldClientes) lstClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldClientes clientes = (GldClientes) lstClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return clientes.getGldIdClientes();
        } else if (columnIndex ==1) {
            return clientes.getGldNome();        
        } else if (columnIndex ==2) {
            return clientes.getGldCpf();
        } else if (columnIndex ==3) {
            return clientes.getGldTelefone();
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
        } else if ( columnIndex == 3) {
            return "Telefone";
        } 
        return "";
    }
}
