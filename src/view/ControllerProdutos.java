/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldProdutosRoupas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerProdutos extends AbstractTableModel {

    private List lstProdutosRoupas;

    public void setList(List lstProdutosRoupas) {
        this.lstProdutosRoupas = lstProdutosRoupas;
    }
    
    public GldProdutosRoupas getBean(int rowIndex) {
        return (GldProdutosRoupas) lstProdutosRoupas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutosRoupas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldProdutosRoupas produtosRoupas = (GldProdutosRoupas) lstProdutosRoupas.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtosRoupas.getGldIdProdutos();
        } else if (columnIndex ==1) {
            return produtosRoupas.getGldNome();        
        } else if (columnIndex ==2) {
            return produtosRoupas.getGldCategoria();
        } else if (columnIndex ==3) {
            return produtosRoupas.getGldTamanho();
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
            return "Categoria";
        } else if ( columnIndex == 3) {
            return "Tamanho";
        } 
        return "";
    }
}
