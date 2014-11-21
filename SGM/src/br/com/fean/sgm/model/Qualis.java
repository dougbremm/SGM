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
@Table(name="qualis")
public  class Qualis implements Serializable {


    @Column(name="qua_nome",table="qualis",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String quaNome;


    @Column(name="qua_importancia",table="qualis",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer quaImportancia;


    @Column(name="qua_id",table="qualis",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer quaId;

    public Qualis(){

    }


   public String getQuaNome() {
        return this.quaNome;
    }


  public void setQuaNome (String quaNome) {
        this.quaNome = quaNome;
    }



   public Integer getQuaImportancia() {
        return this.quaImportancia;
    }


  public void setQuaImportancia (Integer quaImportancia) {
        this.quaImportancia = quaImportancia;
    }



   public Integer getQuaId() {
        return this.quaId;
    }


  public void setQuaId (Integer quaId) {
        this.quaId = quaId;
    }

}

