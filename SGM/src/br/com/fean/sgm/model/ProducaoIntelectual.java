package br.com.fean.sgm.model;


import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="producao_intelectual")
public  class ProducaoIntelectual implements Serializable {


    @Column(name="pin_titulo",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=150,scale=0,precision=0)
    @Basic
    private String pinTitulo;


    @Column(name="pin_resumo",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=65535,scale=0,precision=0)
    @Lob
    @Basic
    private String pinResumo;


    @Column(name="pin_data_publicacao",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date pinDataPublicacao;


    @Column(name="pin_tpi_id",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pinTpiId;


    @Column(name="pin_data_envio",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date pinDataEnvio;


    @Column(name="pin_id",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer pinId;


    @Column(name="pin_observacao",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=true,length=65535,scale=0,precision=0)
    @Lob
    @Basic
    private String pinObservacao;


    @Column(name="pin_lpu_id",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pinLpuId;


    @Column(name="pin_spi_id",table="producao_intelectual",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pinSpiId;

    public ProducaoIntelectual(){

    }


   public String getPinTitulo() {
        return this.pinTitulo;
    }


  public void setPinTitulo (String pinTitulo) {
        this.pinTitulo = pinTitulo;
    }



   public String getPinResumo() {
        return this.pinResumo;
    }


  public void setPinResumo (String pinResumo) {
        this.pinResumo = pinResumo;
    }



   public Date getPinDataPublicacao() {
        return this.pinDataPublicacao;
    }


  public void setPinDataPublicacao (Date pinDataPublicacao) {
        this.pinDataPublicacao = pinDataPublicacao;
    }



   public int getPinTpiId() {
        return this.pinTpiId;
    }


  public void setPinTpiId (int pinTpiId) {
        this.pinTpiId = pinTpiId;
    }



   public Date getPinDataEnvio() {
        return this.pinDataEnvio;
    }


  public void setPinDataEnvio (Date pinDataEnvio) {
        this.pinDataEnvio = pinDataEnvio;
    }



   public Integer getPinId() {
        return this.pinId;
    }


  public void setPinId (Integer pinId) {
        this.pinId = pinId;
    }



   public String getPinObservacao() {
        return this.pinObservacao;
    }


  public void setPinObservacao (String pinObservacao) {
        this.pinObservacao = pinObservacao;
    }



   public int getPinLpuId() {
        return this.pinLpuId;
    }


  public void setPinLpuId (int pinLpuId) {
        this.pinLpuId = pinLpuId;
    }



   public int getPinSpiId() {
        return this.pinSpiId;
    }


  public void setPinSpiId (int pinSpiId) {
        this.pinSpiId = pinSpiId;
    }

}

