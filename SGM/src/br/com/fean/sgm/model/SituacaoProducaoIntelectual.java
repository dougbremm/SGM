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
@Table(name="situacao_producao_intelectual")
public  class SituacaoProducaoIntelectual implements Serializable {


    @Column(name="spi_nome",table="situacao_producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=150,scale=0,precision=0)
    @Basic
    private String spiNome;


    @Column(name="spi_id",table="situacao_producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer spiId;

    public SituacaoProducaoIntelectual(){

    }


   public String getSpiNome() {
        return this.spiNome;
    }


  public void setSpiNome (String spiNome) {
        this.spiNome = spiNome;
    }



   public Integer getSpiId() {
        return this.spiId;
    }


  public void setSpiId (Integer spiId) {
        this.spiId = spiId;
    }

}

