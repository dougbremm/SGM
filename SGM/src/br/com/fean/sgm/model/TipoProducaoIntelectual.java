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
@Table(name="tipo_producao_intelectual")
public  class TipoProducaoIntelectual implements Serializable {


    @Column(name="tpi_nome",table="tipo_producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=150,scale=0,precision=0)
    @Basic
    private String tpiNome;


    @Column(name="tpi_id",table="tipo_producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer tpiId;


    @Column(name="tpi_spi_id",table="tipo_producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int tpiSpiId;

    public TipoProducaoIntelectual(){

    }


   public String getTpiNome() {
        return this.tpiNome;
    }


  public void setTpiNome (String tpiNome) {
        this.tpiNome = tpiNome;
    }



   public Integer getTpiId() {
        return this.tpiId;
    }


  public void setTpiId (Integer tpiId) {
        this.tpiId = tpiId;
    }



   public int getTpiSpiId() {
        return this.tpiSpiId;
    }


  public void setTpiSpiId (int tpiSpiId) {
        this.tpiSpiId = tpiSpiId;
    }

}

