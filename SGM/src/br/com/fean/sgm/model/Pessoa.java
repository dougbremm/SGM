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
@Table(name="pessoa")
public  class Pessoa implements Serializable {


    @Column(name="pes_id",table="pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer pesId;


    @Column(name="pes_senha",table="pessoa",unique=false,updatable=true,insertable=true,nullable=true,length=10,scale=0,precision=0)
    @Basic
    private String pesSenha;


    @Column(name="pes_tur_id",table="pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pesTurId;


    @Column(name="pes_fone",table="pessoa",unique=false,updatable=true,insertable=true,nullable=true,length=50,scale=0,precision=0)
    @Basic
    private String pesFone;


    @Column(name="pes_nome",table="pessoa",unique=false,updatable=true,insertable=true,nullable=true,length=100,scale=0,precision=0)
    @Basic
    private String pesNome;


    @Column(name="pes_email",table="pessoa",unique=false,updatable=true,insertable=true,nullable=true,length=100,scale=0,precision=0)
    @Basic
    private String pesEmail;


    @Column(name="pes_tpe_id",table="pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pesTpeId;

    public Pessoa(){

    }


   public Integer getPesId() {
        return this.pesId;
    }


  public void setPesId (Integer pesId) {
        this.pesId = pesId;
    }



   public String getPesSenha() {
        return this.pesSenha;
    }


  public void setPesSenha (String pesSenha) {
        this.pesSenha = pesSenha;
    }



   public int getPesTurId() {
        return this.pesTurId;
    }


  public void setPesTurId (int pesTurId) {
        this.pesTurId = pesTurId;
    }



   public String getPesFone() {
        return this.pesFone;
    }


  public void setPesFone (String pesFone) {
        this.pesFone = pesFone;
    }



   public String getPesNome() {
        return this.pesNome;
    }


  public void setPesNome (String pesNome) {
        this.pesNome = pesNome;
    }



   public String getPesEmail() {
        return this.pesEmail;
    }


  public void setPesEmail (String pesEmail) {
        this.pesEmail = pesEmail;
    }



   public int getPesTpeId() {
        return this.pesTpeId;
    }


  public void setPesTpeId (int pesTpeId) {
        this.pesTpeId = pesTpeId;
    }

}

