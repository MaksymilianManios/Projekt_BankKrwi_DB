/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

/**
 *
 * @author krystofair
 */
public class GrupaKrwi {
    private int idgrupykrwi;
    private String wskaznikrh, rodzaj;

    public void setIdgrupykrwi(int idgrupykrwi) {
        this.idgrupykrwi = idgrupykrwi;
    }

    public void setWskaznikrh(String wskaznikrh) {
        this.wskaznikrh = wskaznikrh;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public int getIdgrupykrwi() {
        return idgrupykrwi;
    }

    public String getWskaznikrh() {
        return wskaznikrh;
    }

    public String getRodzaj() {
        return rodzaj;
    }
    
}