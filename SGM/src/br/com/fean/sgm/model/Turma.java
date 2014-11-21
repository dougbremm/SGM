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
@Table(name="turma")
public  class Turma implements Serializable {


    @Column(name="tur_id",table="turma",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer turId;


    @Column(name="tur_ano",table="turma",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer turAno;


    @Column(name="tur_semestre",table="turma",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer turSemestre;


    @Column(name="tur_nome",table="turma",unique=false,updatable=true,insertable=true,nullable=true,length=100,scale=0,precision=0)
    @Basic
    private String turNome;

    public Turma(){

    }

    public Turma(String turNome) {
        this.turNome= turNome;
    }

   public Integer getTurId() {
        return this.turId;
    }


  public void setTurId (Integer turId) {
        this.turId = turId;
    }



   public Integer getTurAno() {
        return this.turAno;
    }


  public void setTurAno (Integer turAno) {
        this.turAno = turAno;
    }



   public Integer getTurSemestre() {
        return this.turSemestre;
    }


  public void setTurSemestre (Integer turSemestre) {
        this.turSemestre = turSemestre;
    }



   public String getTurNome() {
        return this.turNome;
    }


  public void setTurNome (String turNome) {
        this.turNome = turNome;
    }

}

