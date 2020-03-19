package com.zsmart.tva.ws.rest.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.tva.service.util.*;
import com.zsmart.tva.bean.Tva;
import com.zsmart.tva.ws.rest.vo.TvaVo;

@Component
public class TvaConverter extends AbstractConverter<Tva, TvaVo> {

    private boolean typeTva;

    @Autowired
    private TypeTvaConverter typeTvaConverter;
    private boolean etatTva;

    @Autowired
    private EtatTvaConverter etatTvaConverter;
    private boolean tvaFactures;

    @Autowired
    private TvaFactureConverter tvaFactureConverter;

    @Override
    public Tva toItem(TvaVo vo) {
        if (vo == null) {
            return null;
        } else {
            Tva item = new Tva();

            if (typeTva && vo.getTypeTvaVo() != null) {
                item.setTypeTva(typeTvaConverter.toItem(vo.getTypeTvaVo()));
            }

            if (etatTva && vo.getEtatTvaVo() != null) {
                item.setEtatTva(etatTvaConverter.toItem(vo.getEtatTvaVo()));
            }

            if (StringUtil.isNotEmpty(vo.getDescription())) {
                item.setDescription(vo.getDescription());
            }

            if (StringUtil.isNotEmpty(vo.getReference())) {
                item.setReference(vo.getReference());
            }

            if (StringUtil.isNotEmpty(vo.getReferenceSociete())) {
                item.setReferenceSociete(vo.getReferenceSociete());
            }

            if (StringUtil.isNotEmpty(vo.getReferenceComptableValidateur())) {
                item.setReferenceComptableValidateur(vo.getReferenceComptableValidateur());
            }

            if (StringUtil.isNotEmpty(vo.getReferenceComptableCreateur())) {
                item.setReferenceComptableCreateur(vo.getReferenceComptableCreateur());
            }

            if (vo.getId() != null) {
                item.setId(NumberUtil.toLong(vo.getId()));
            }

            if (vo.getTvaCollectee() != null) {
                item.setTvaCollectee(NumberUtil.toBigDecimal(vo.getTvaCollectee()));
            }

            if (vo.getTvaDeductible() != null) {
                item.setTvaDeductible(NumberUtil.toBigDecimal(vo.getTvaDeductible()));
            }

            if (vo.getDifferenceTva() != null) {
                item.setDifferenceTva(NumberUtil.toBigDecimal(vo.getDifferenceTva()));
            }

            if (vo.getMantantTva() != null) {
                item.setMantantTva(NumberUtil.toBigDecimal(vo.getMantantTva()));
            }

            if (vo.getMantantBaseTva() != null) {
                item.setMantantBaseTva(NumberUtil.toBigDecimal(vo.getMantantBaseTva()));
            }

            if (vo.getMantantRetard() != null) {
                item.setMantantRetard(NumberUtil.toBigDecimal(vo.getMantantRetard()));
            }

            if (vo.getMantantMajoration() != null) {
                item.setMantantMajoration(NumberUtil.toBigDecimal(vo.getMantantMajoration()));
            }

            if (vo.getMantantPenalite() != null) {
                item.setMantantPenalite(NumberUtil.toBigDecimal(vo.getMantantPenalite()));
            }

            if (vo.getNomberMoisRetard() != null) {
                item.setNomberMoisRetard(NumberUtil.toInt(vo.getNomberMoisRetard()));
            }

            if (vo.getDateValidation() != null) {
                item.setDateValidation(DateUtil.parse(vo.getDateValidation()));
            }

            if (vo.getDateCreation() != null) {
                item.setDateCreation(DateUtil.parse(vo.getDateCreation()));
            }

            if (vo.getAnne() != null) {
                item.setAnne(NumberUtil.toInt(vo.getAnne()));
            }

            if (vo.getPeriode() != null) {
                item.setPeriode(NumberUtil.toInt(vo.getPeriode()));
            }

            if (vo.getHonoraire() != null) {
                item.setHonoraire(NumberUtil.toBigDecimal(vo.getHonoraire()));
            }

            if (vo.getPenalite() != null) {
                item.setPenalite(NumberUtil.toBigDecimal(vo.getPenalite()));
            }

            if (vo.getMajoration() != null) {
                item.setMajoration(NumberUtil.toBigDecimal(vo.getMajoration()));
            }

            if (vo.getMontantTotal() != null) {
                item.setMontantTotal(NumberUtil.toBigDecimal(vo.getMontantTotal()));
            }

            if (vo.getDateSaisie() != null) {
                item.setDateSaisie(DateUtil.parse(vo.getDateSaisie()));
            }

            if (ListUtil.isNotEmpty(vo.getTvaFacturesVo()) && tvaFactures) {
                item.setTvaFactures(tvaFactureConverter.toItem(vo.getTvaFacturesVo()));
            }

            return item;
        }
    }

    @Override
    public TvaVo toVo(Tva item) {
        if (item == null) {
            return null;
        } else {
            TvaVo vo = new TvaVo();

            if (typeTva && item.getTypeTva() != null) {
                vo.setTypeTvaVo(typeTvaConverter.toVo(item.getTypeTva()));
            }

            if (etatTva && item.getEtatTva() != null) {
                vo.setEtatTvaVo(etatTvaConverter.toVo(item.getEtatTva()));
            }

            if (StringUtil.isNotEmpty(item.getDescription())) {
                vo.setDescription(item.getDescription());
            }

            if (StringUtil.isNotEmpty(item.getReference())) {
                vo.setReference(item.getReference());
            }

            if (StringUtil.isNotEmpty(item.getReferenceSociete())) {
                vo.setReferenceSociete(item.getReferenceSociete());
            }

            if (StringUtil.isNotEmpty(item.getReferenceComptableValidateur())) {
                vo.setReferenceComptableValidateur(item.getReferenceComptableValidateur());
            }

            if (StringUtil.isNotEmpty(item.getReferenceComptableCreateur())) {
                vo.setReferenceComptableCreateur(item.getReferenceComptableCreateur());
            }

            if (item.getId() != null) {
                vo.setId(NumberUtil.toString(item.getId()));
            }

            if (item.getTvaCollectee() != null) {
                vo.setTvaCollectee(NumberUtil.toString(item.getTvaCollectee()));
            }

            if (item.getTvaDeductible() != null) {
                vo.setTvaDeductible(NumberUtil.toString(item.getTvaDeductible()));
            }

            if (item.getDifferenceTva() != null) {
                vo.setDifferenceTva(NumberUtil.toString(item.getDifferenceTva()));
            }

            if (item.getMantantTva() != null) {
                vo.setMantantTva(NumberUtil.toString(item.getMantantTva()));
            }

            if (item.getMantantBaseTva() != null) {
                vo.setMantantBaseTva(NumberUtil.toString(item.getMantantBaseTva()));
            }

            if (item.getMantantRetard() != null) {
                vo.setMantantRetard(NumberUtil.toString(item.getMantantRetard()));
            }

            if (item.getMantantMajoration() != null) {
                vo.setMantantMajoration(NumberUtil.toString(item.getMantantMajoration()));
            }

            if (item.getMantantPenalite() != null) {
                vo.setMantantPenalite(NumberUtil.toString(item.getMantantPenalite()));
            }

            if (item.getNomberMoisRetard() != null) {
                vo.setNomberMoisRetard(NumberUtil.toString(item.getNomberMoisRetard()));
            }

            if (item.getDateValidation() != null) {
                vo.setDateValidation(DateUtil.formateDate(item.getDateValidation()));
            }

            if (item.getDateCreation() != null) {
                vo.setDateCreation(DateUtil.formateDate(item.getDateCreation()));
            }

            if (item.getAnne() != null) {
                vo.setAnne(NumberUtil.toString(item.getAnne()));
            }

            if (item.getPeriode() != null) {
                vo.setPeriode(NumberUtil.toString(item.getPeriode()));
            }

            if (item.getHonoraire() != null) {
                vo.setHonoraire(NumberUtil.toString(item.getHonoraire()));
            }

            if (item.getPenalite() != null) {
                vo.setPenalite(NumberUtil.toString(item.getPenalite()));
            }

            if (item.getMajoration() != null) {
                vo.setMajoration(NumberUtil.toString(item.getMajoration()));
            }

            if (item.getMontantTotal() != null) {
                vo.setMontantTotal(NumberUtil.toString(item.getMontantTotal()));
            }

            if (item.getDateSaisie() != null) {
                vo.setDateSaisie(DateUtil.formateDate(item.getDateSaisie()));
            }

            if (ListUtil.isNotEmpty(item.getTvaFactures()) && tvaFactures) {
                vo.setTvaFacturesVo(tvaFactureConverter.toVo(item.getTvaFactures()));
            }

            return vo;
        }
    }

    public void init() {

        typeTva = true;

        etatTva = true;

        tvaFactures = true;
    }
}
