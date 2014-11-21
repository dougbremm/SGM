package br.com.fean.sgm.model;


import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producao_intelectual_pessoa")
public  class ProducaoIntelectualPessoa implements Serializable {


    @Column(name="pip_pin_id",table="producao_intelectual_pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    private int pipPinId;


    @Column(name="pip_pes_id",table="producao_intelectual_pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    private int pipPesId;


    @Column(name="pip_pap_id",table="producao_intelectual_pessoa",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int pipPapId;

    public ProducaoIntelectualPessoa(){

    }


   public int getPipPinId() {
        return this.pipPinId;
    }


  public void setPipPinId (int pipPinId) {
        this.pipPinId = pipPinId;
    }



   public int getPipPesId() {
        return this.pipPesId;
    }


  public void setPipPesId (int pipPesId) {
        this.pipPesId = pipPesId;
    }



   public int getPipPapId() {
        return this.pipPapId;
    }


  public void setPipPapId (int pipPapId) {
        this.pipPapId = pipPapId;
    }

}

