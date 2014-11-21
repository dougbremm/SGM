package br.com.fean.sgm.model;


import java.io.Serializable;

import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plano_trabalho")
public  class PlanoTrabalho implements Serializable {


    @Column(name="ptr_qua_id",table="plano_trabalho",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int ptrQuaId;


    @Column(name="ptr_ano",table="plano_trabalho",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer ptrAno;


    @Column(name="ptr_id",table="plano_trabalho",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ptrId;


    @Column(name="ptr_tpi_id",table="plano_trabalho",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int ptrTpiId;


    @Column(name="ptr_pes_id",table="plano_trabalho",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int ptrPesId;

    public PlanoTrabalho(){

    }


   public int getPtrQuaId() {
        return this.ptrQuaId;
    }


  public void setPtrQuaId (int ptrQuaId) {
        this.ptrQuaId = ptrQuaId;
    }



   public Integer getPtrAno() {
        return this.ptrAno;
    }


  public void setPtrAno (Integer ptrAno) {
        this.ptrAno = ptrAno;
    }



   public Integer getPtrId() {
        return this.ptrId;
    }


  public void setPtrId (Integer ptrId) {
        this.ptrId = ptrId;
    }



   public int getPtrTpiId() {
        return this.ptrTpiId;
    }


  public void setPtrTpiId (int ptrTpiId) {
        this.ptrTpiId = ptrTpiId;
    }



   public int getPtrPesId() {
        return this.ptrPesId;
    }


  public void setPtrPesId (int ptrPesId) {
        this.ptrPesId = ptrPesId;
    }

}

