/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.tva.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hzouani6
 */
@Entity
public class TvaFacture implements Serializable {

    protected static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @ManyToOne
    private Tva tva;
   
    private String referenceFacture;
    
    private String referenceSociete;
    
  


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



	public Tva getTva() {
		return tva;
	}

	public void setTva(Tva tva) {
		this.tva = tva;
	}

	public String getReferenceFacture() {
		return referenceFacture;
	}

	public void setReferenceFacture(String referenceFacture) {
		this.referenceFacture = referenceFacture;
	}

	public String getReferenceSociete() {
		return referenceSociete;
	}

	public void setReferenceSociete(String referenceSociete) {
		this.referenceSociete = referenceSociete;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TvaFacture)) {
            return false;
        }
        TvaFacture other = (TvaFacture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    

}
