package br.com.fean.sgm.model;


import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="papel")
public  class Papel implements Serializable {


    @Column(name="pap_id",table="papel",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer papId;


    @Column(name="pap_nome",table="papel",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String papNome;

    public Papel(){

    }


   public Integer getPapId() {
        return this.papId;
    }


  public void setPapId (Integer papId) {
        this.papId = papId;
    }



   public String getPapNome() {
        return this.papNome;
    }


  public void setPapNome (String papNome) {
        this.papNome = papNome;
    }

}

