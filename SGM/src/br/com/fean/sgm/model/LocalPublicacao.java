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
@Table(name="local_publicacao")
public  class LocalPublicacao implements Serializable {


    @Column(name="lpu_url",table="local_publicacao",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String lpuUrl;


    @Column(name="lpu_id",table="local_publicacao",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer lpuId;


    @Column(name="lpu_qua_id",table="local_publicacao",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int lpuQuaId;


    @Column(name="lpu_nome",table="local_publicacao",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String lpuNome;

    public LocalPublicacao(){

    }


   public String getLpuUrl() {
        return this.lpuUrl;
    }


  public void setLpuUrl (String lpuUrl) {
        this.lpuUrl = lpuUrl;
    }



   public Integer getLpuId() {
        return this.lpuId;
    }


  public void setLpuId (Integer lpuId) {
        this.lpuId = lpuId;
    }



   public int getLpuQuaId() {
        return this.lpuQuaId;
    }


  public void setLpuQuaId (int lpuQuaId) {
        this.lpuQuaId = lpuQuaId;
    }



   public String getLpuNome() {
        return this.lpuNome;
    }


  public void setLpuNome (String lpuNome) {
        this.lpuNome = lpuNome;
    }

}

