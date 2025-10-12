/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerUsuarios extends AbstractTableModel {

    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
    public GldUsuarios getBean(int rowIndex) {
        return (GldUsuarios) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldUsuarios usuarios = (GldUsuarios) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getGldIdUsuarios();
        } else if (columnIndex ==1) {
            return usuarios.getGldNome();        
        } else if (columnIndex ==2) {
            return usuarios.getGldApelido();
        } else if (columnIndex ==3) {
            return usuarios.getGldCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
