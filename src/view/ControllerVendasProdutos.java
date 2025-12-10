/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.GldVendasRoupasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstGldVendasRoupasProdutos;

    public void setList(List lstGldVendasRoupasProdutos) {
        this.lstGldVendasRoupasProdutos = lstGldVendasRoupasProdutos;
        this.fireTableDataChanged();
    }

    public GldVendasRoupasProdutos getBean(int rowIndex) {
        return (GldVendasRoupasProdutos) lstGldVendasRoupasProdutos.get(rowIndex);
    }

    public void addBean(GldVendasRoupasProdutos gldVendasRoupasProdutos) {
        lstGldVendasRoupasProdutos.add(gldVendasRoupasProdutos);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        lstGldVendasRoupasProdutos.remove(rowIndex);
        this.fireTableDataChanged();
    }

    public double getTotal() {
        double total = 0;

        for (Object obj : lstGldVendasRoupasProdutos) {
            GldVendasRoupasProdutos gldVendasRoupasProdutos = (GldVendasRoupasProdutos) obj;
            int quantidade = gldVendasRoupasProdutos.getGldQuantidade();
            double valorUnitario = gldVendasRoupasProdutos.getGldValorUnitario();
            total += quantidade * valorUnitario;
        }

        return total;
    }

    @Override
    public int getRowCount() {
        return lstGldVendasRoupasProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GldVendasRoupasProdutos gldVendasRoupasProdutos = (GldVendasRoupasProdutos) lstGldVendasRoupasProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return gldVendasRoupasProdutos.getGldProdutosRoupas().getGldIdProdutos();
        } else if (columnIndex == 1) {
            return gldVendasRoupasProdutos.getGldProdutosRoupas().getGldNome();
        } else if (columnIndex == 2) {
            return gldVendasRoupasProdutos.getGldQuantidade();
        } else if (columnIndex == 3) {
            return gldVendasRoupasProdutos.getGldValorUnitario();
        } else if (columnIndex == 4) {
            return gldVendasRoupasProdutos.getGldValorUnitario() * gldVendasRoupasProdutos.getGldQuantidade();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}
