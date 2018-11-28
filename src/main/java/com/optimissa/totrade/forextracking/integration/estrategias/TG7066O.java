/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optimissa.totrade.forextracking.integration.estrategias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Aarón Delgado
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TG7066I", propOrder = {
    "codretorno",
    "nomestr"
})
public class TG7066O {
    
    private String codretorno;
    private String nomestr;

    public String getCodretorno() {
        return codretorno;
    }

    public void setCodretorno(String codretorno) {
        this.codretorno = codretorno;
    }

    public String getNomestr() {
        return nomestr;
    }

    public void setNomestr(String nomestr) {
        this.nomestr = nomestr;
    }
   
}
