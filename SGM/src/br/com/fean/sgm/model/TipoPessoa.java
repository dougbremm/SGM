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
@Table(name="tipo_pessoa")
public  class TipoPessoa implements Serializable {


    @Column(name="tpe_id",table="tipo_pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer tpeId;


    @Column(name="tpe_nome",table="tipo_pessoa",unique=false,updatable=true,insertable=true,nullable=true,length=100,scale=0,precision=0)
    @Basic
    private String tpeNome;

    public TipoPessoa(){

    }


   public Integer getTpeId() {
        return this.tpeId;
    }


  public void setTpeId (Integer tpeId) {
        this.tpeId = tpeId;
    }



   public String getTpeNome() {
        return this.tpeNome;
    }


  public void setTpeNome (String tpeNome) {
        this.tpeNome = tpeNome;
    }

}

