/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabid
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
    }
    
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            if(componentes [i] instanceof JTextField){
            ((JTextField)componentes[i]).setText("");
            }
            if(componentes [i] instanceof JComboBox){
                ((JComboBox)componentes[i]).setSelectedIndex(-1);
            }
            if(componentes [i] instanceof JFormattedTextField){
                ((JFormattedTextField)componentes[i]).setText("");
            }
        }
        
    }
    
  

public static void mensagem(String cad){
    JOptionPane.showMessageDialog(null, cad);
}
public static boolean pergunta(String cad){
    int resposta = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
    return resposta == JOptionPane.YES_OPTION;
}


public static boolean validarSenha(String senha) {
    boolean tamanho = senha.length() >= 8;
    boolean Maiuscula = senha.matches(".*[A-Z].*");
    boolean Numero = senha.matches(".*[0-9].*");

    if (!tamanho|| !Maiuscula || !Numero) {
        JOptionPane.showMessageDialog(null,
            "A senha deve conter:\n- Pelo menos 8 caracteres\n- Pelo menos 1 letra maiúscula\n- Pelo menos 1 número");
        return false;
    }
    return true;
}
public static int strToInt(String num){
    return Integer.parseInt(num); 
}
public static String IntTostr(int num){
    return String.valueOf(num); 
}
public static double strToDouble(String num){
      try {
        return Double.parseDouble(num);
    } catch (NumberFormatException e) {
        return 0.0; 
    }
}
public static String DoubleTostr(String num){
     return String.valueOf(num);
}
public static java.util.Date strToData(String dataStr) {
    try {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dataStr);
    } catch (Exception e) {
        return null; 
    }
}
public static String DataTostr(java.util.Date data) {
   if (data == null) return "";
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.format(data);
}
}
