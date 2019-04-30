/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca.tela;

import forca.modelo.Forca;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Thales Muller
 */
public class Principal {

    public static void main(String[] args) {
        Forca forca = new Forca();
        String letra;
        StringBuilder advinhacao = new StringBuilder("");
        //definindo a palavra
        String palavra = forca.getLista()[forca.getIndicePalavraSorteada()];
        //Validador de Letras
        boolean validador = false;
        //contador de erros e acertos
        int contER = 0, contAC = 0;
        //Criando area de exibiçao
        //letras erradas
        String letrasER="",espacinho="";
        JTextArea textoForca = new JTextArea();
        textoForca.setFont(new Font("Monospaced", Font.BOLD, 20));

        //Colocando _ para cada letra
        for (int i = 0; i < palavra.length(); i++) {
            advinhacao.append("_ ");
        }
        //Inicio do jogo
        while (forca.getErros() < 7) {
            if (contAC == palavra.length()) {
                break;
            }

            textoForca.setText(letrasER+espacinho+forca.getEstagioEsforcamento() + advinhacao);
            letra = JOptionPane.showInputDialog(null, textoForca);

            validador = palavra.contains(letra);
            if (!validador) {
                contER++;
                forca.setErros(contER);
                if(!letrasER.contains(letra))letrasER+=letra+" ";
                if(contER==1) espacinho+="\n\n";
                
            } else {
                char l;
                for (int i = 0; i < palavra.length(); i++) {
                    l = palavra.charAt(i);
                    if (letra.equals(String.valueOf(l))) {
                        advinhacao.setCharAt(i*2, l);
                        
                        contAC++;
                    }
                }
            }

        }
        if (contER == 7) {
            String fim = "GameOver\n";
            forca.setErros(6);
            textoForca.setText(fim + forca.getEstagioEsforcamento() + palavra);
            JOptionPane.showMessageDialog(null, textoForca);

        } else {
            String fim = "Vitória\n";
            textoForca.setText(fim + forca.getEstagioEsforcamento() + palavra);
            JOptionPane.showMessageDialog(null, textoForca);
        }
    }
}
