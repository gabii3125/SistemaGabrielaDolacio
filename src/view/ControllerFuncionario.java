/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldFuncionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerFuncionario extends AbstractTableModel {

    private List lstFuncionarios;

    public void setList(List lstFuncionario) {
        this.lstFuncionarios = lstFuncionario;
    }
    
    public GldFuncionarios getBean(int rowIndex) {
        return (GldFuncionarios) lstFuncionarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstFuncionarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldFuncionarios funcionarios = (GldFuncionarios) lstFuncionarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return funcionarios.getGldIdFuncionario();
        } else if (columnIndex ==1) {
            return funcionarios.getGldNome();        
        } else if (columnIndex ==2) {
            return funcionarios.getGldCpf();
        } else if (columnIndex ==3) {
            return funcionarios.getGldTelefone();
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
