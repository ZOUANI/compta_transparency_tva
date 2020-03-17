/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.tva.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


/**
 *
 * @author hzouani6
 */
@Entity
public class Tva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "tva")
    private List<TvaFacture> tvaFactures;
    @Column(precision = 16, scale = 4)
    private BigDecimal tvaCollectee;
    @Column(precision = 16, scale = 4)
    private BigDecimal tvaDeductible;
    @Column(precision = 16, scale = 4)
    private BigDecimal differenceTva;
    @Column(precision = 16, scale = 4)
    private BigDecimal mantantTva;
    @Column(precision = 16, scale = 4)
    private BigDecimal mantantBaseTva;
    @Column(precision = 16, scale = 4)
    private BigDecimal mantantRetard;
    @Column(precision = 16, scale = 4)
    private BigDecimal mantantMajoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal mantantPenalite;

    private Integer nomberMoisRetard;
    @ManyToOne
    private TypeTva typeTva;

    private String description;
    private String reference;
    private String referenceSociete;
    private String referenceComptableValidateur;
    private String referenceComptableCreateur;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateValidation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    private Integer anne;
    private Integer periode;// numero de mois ou de trim
    @Column(precision = 16, scale = 4)
    private BigDecimal honoraire;
    @Column(precision = 16, scale = 4)
    private BigDecimal penalite;
    @Column(precision = 16, scale = 4)
    private BigDecimal majoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantTotal;
    @ManyToOne
    private EtatTva etatTva;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSaisie;

    public List<TvaFacture> getTvaFactures() {
        return tvaFactures;
    }

    public void setTvaFactures(List<TvaFacture> tvaFactures) {
        this.tvaFactures = tvaFactures;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  
    public BigDecimal getTvaCollectee() {
        return tvaCollectee;
    }

    public void setTvaCollectee(BigDecimal tvaCollectee) {
        this.tvaCollectee = tvaCollectee;
    }

    public BigDecimal getTvaDeductible() {
        return tvaDeductible;
    }

    public void setTvaDeductible(BigDecimal tvaDeductible) {
        this.tvaDeductible = tvaDeductible;
    }

    public BigDecimal getDifferenceTva() {
        return differenceTva;
    }

    public void setDifferenceTva(BigDecimal differenceTva) {
        this.differenceTva = differenceTva;
    }

    public BigDecimal getMantantTva() {
        return mantantTva;
    }

    public void setMantantTva(BigDecimal mantantTva) {
        this.mantantTva = mantantTva;
    }

    public BigDecimal getMantantBaseTva() {
        return mantantBaseTva;
    }

    public void setMantantBaseTva(BigDecimal mantantBaseTva) {
        this.mantantBaseTva = mantantBaseTva;
    }

    public BigDecimal getMantantRetard() {
        return mantantRetard;
    }

    public void setMantantRetard(BigDecimal mantantRetard) {
        this.mantantRetard = mantantRetard;
    }

    public BigDecimal getMantantMajoration() {
        return mantantMajoration;
    }

    public void setMantantMajoration(BigDecimal mantantMajoration) {
        this.mantantMajoration = mantantMajoration;
    }

    public BigDecimal getMantantPenalite() {
        return mantantPenalite;
    }

    public void setMantantPenalite(BigDecimal mantantPenalite) {
        this.mantantPenalite = mantantPenalite;
    }

    public Integer getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(Integer nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public TypeTva getTypeTva() {
        return typeTva;
    }

    public void setTypeTva(TypeTva typeTva) {
        this.typeTva = typeTva;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceSociete() {
        return referenceSociete;
    }

    public void setReferenceSociete(String referenceSociete) {
        this.referenceSociete = referenceSociete;
    }

    public String getReferenceComptableValidateur() {
        return referenceComptableValidateur;
    }

    public void setReferenceComptableValidateur(String referenceComptableValidateur) {
        this.referenceComptableValidateur = referenceComptableValidateur;
    }

    public String getReferenceComptableCreateur() {
        return referenceComptableCreateur;
    }

    public void setReferenceComptableCreateur(String referenceComptableCreateur) {
        this.referenceComptableCreateur = referenceComptableCreateur;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getAnne() {
        return anne;
    }

    public void setAnne(Integer anne) {
        this.anne = anne;
    }

    public Integer getPeriode() {
        return periode;
    }

    public void setPeriode(Integer periode) {
        this.periode = periode;
    }

    public BigDecimal getHonoraire() {
        return honoraire;
    }

    public void setHonoraire(BigDecimal honoraire) {
        this.honoraire = honoraire;
    }

    public BigDecimal getPenalite() {
        return penalite;
    }

    public void setPenalite(BigDecimal penalite) {
        this.penalite = penalite;
    }

    public BigDecimal getMajoration() {
        return majoration;
    }

    public void setMajoration(BigDecimal majoration) {
        this.majoration = majoration;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public EtatTva getEtatTva() {
        return etatTva;
    }

    public void setEtatTva(EtatTva etatTva) {
        this.etatTva = etatTva;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
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
        if (!(object instanceof Tva)) {
            return false;
        }
        Tva other = (Tva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
