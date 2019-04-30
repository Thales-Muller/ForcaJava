/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca.modelo;

import java.util.Random;

/**
 *
 * @author Thales Muller
 */
public class Forca {
    private String lista[] = new String[]{"amizade","jogo","comida"};
    private String forca[] =  new String[7];
    private int erros;
    private int indicePalavraSorteada;
    
    public Forca(){
        Random r = new Random();
        indicePalavraSorteada = r.nextInt(2);
        erros = 0;
        forca[0] = "----- \n"
                 + "|    |\n"
                 + "     |\n"
                 + "     |\n"
                 + "     |\n"
                 + "    ===\n";
        
        forca[1] = "----- \n"
                 + "|    |\n"
                 + "0    |\n"
                 + "     |\n"
                 + "     |\n"
                 + "    ===\n";
        forca[2] = "----- \n"
                 + "|    |\n"
                 + "0    |\n"
                 + "|    |\n"
                 + "     |\n"
                 + "    ===\n";
        forca[3] = " ----- \n"
                 + " |    |\n"
                 + " 0    |\n"
                 + "/|    |\n"
                 + "      |\n"
                 + "     ===\n";
        forca[4] = " ----- \n"
                 + " |    |\n"
                 + " 0    |\n"
                 + "/|\\   |\n"
                 + "      |\n"
                 + "     ===\n";
        forca[5] = " ----- \n"
                 + " |    |\n"
                 + " 0    |\n"
                 + "/|\\   |\n"
                 + "/     |\n"
                 + "     ===\n";
        forca[6] = " ----- \n"
                 + " |    |\n"
                 + " 0    |\n"
                 + "/|\\   |\n"
                 + "/ \\   |\n"
                 + "     ===\n";
    }

    public String getEstagioEsforcamento() {
        return forca[erros];
    }

    public String[] getLista() {
        return lista;
    }

    public int getIndicePalavraSorteada() {
        return indicePalavraSorteada;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }
    
    
    
}
