/*
 * $Id: CustInforVO.java
 *
 * Copyright (c) 2013 HEB
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HEB.
 */
package com.heb.enterprise.coms.model.vo;

import com.heb.enterprise.coms.model.BaseModel;

/**
 * author ha.than
 */
public class BillInforVO extends BaseModel{
	long ordId;
	int seqNbr;
	String paymtStatCd;
	String paymtStatTs;
	String paymtMethCd;
	String authnNbr;
	String paymtRecId;
	String paymtTs;
	String paymtAmt;
	String billingFrstNm;
	String billingMidNm;
	String billingLstNm;
	String billingAdr1Txt;
	String billingAdr2Txt;
	String billingAdr3Txt;
	String billingAdr4Txt;
	String billingCtyTxt;
	String billingStAbb;
	String billingZipCd;
	String billingZipExtnCd;
	String billingCntryNm;
	String cre8Ts;
	String cre8Uid;
	String updtTs;
	String updtUid;
	
	String paymtProcTypCd;
	String paymtActnCd;
	String paymtCardTypCd;
	String paymtCardRefNum;
	String paymtCardRefHash;
	String paymtCardMskdNum;
	String paymtTndrTyp;
	String authnTypCd;
	String authnAmt;
	String paymtRspnCd;
	String paymtRspnMsg;
	String paymtFrdChkCd;
	String paymtFrdRspnCd;
	String paymtFrdRspnMsg;
	
	String paymtStatDes;
	String paymtMethDes;
	/**
	 * @return the ordId
	 */
	public long getOrdId() {
		return ordId;
	}
	/**
	 * @param ordId the ordId to set
	 */
	public void setOrdId(long ordId) {
		this.ordId = ordId;
	}
	/**
	 * @return the seqNbr
	 */
	public int getSeqNbr() {
		return seqNbr;
	}
	/**
	 * @param seqNbr the seqNbr to set
	 */
	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}
	/**
	 * @return the paymtStatCd
	 */
	public String getPaymtStatCd() {
		return paymtStatCd;
	}
	/**
	 * @param paymtStatCd the paymtStatCd to set
	 */
	public void setPaymtStatCd(String paymtStatCd) {
		this.paymtStatCd = paymtStatCd;
	}
	/**
	 * @return the paymtStatTs
	 */
	public String getPaymtStatTs() {
		return paymtStatTs;
	}
	/**
	 * @param paymtStatTs the paymtStatTs to set
	 */
	public void setPaymtStatTs(String paymtStatTs) {
		this.paymtStatTs = paymtStatTs;
	}
	/**
	 * @return the paymtMethCd
	 */
	public String getPaymtMethCd() {
		return paymtMethCd;
	}
	/**
	 * @param paymtMethCd the paymtMethCd to set
	 */
	public void setPaymtMethCd(String paymtMethCd) {
		this.paymtMethCd = paymtMethCd;
	}
	/**
	 * @return the authnNbr
	 */
	public String getAuthnNbr() {
		return authnNbr;
	}
	/**
	 * @param authnNbr the authnNbr to set
	 */
	public void setAuthnNbr(String authnNbr) {
		this.authnNbr = authnNbr;
	}
	/**
	 * @return the paymtRecId
	 */
	public String getPaymtRecId() {
		return paymtRecId;
	}
	/**
	 * @param paymtRecId the paymtRecId to set
	 */
	public void setPaymtRecId(String paymtRecId) {
		this.paymtRecId = paymtRecId;
	}
	/**
	 * @return the paymtTs
	 */
	public String getPaymtTs() {
		return paymtTs;
	}
	/**
	 * @param paymtTs the paymtTs to set
	 */
	public void setPaymtTs(String paymtTs) {
		this.paymtTs = paymtTs;
	}
	/**
	 * @return the paymtAmt
	 */
	public String getPaymtAmt() {
		return paymtAmt;
	}
	/**
	 * @param paymtAmt the paymtAmt to set
	 */
	public void setPaymtAmt(String paymtAmt) {
		this.paymtAmt = paymtAmt;
	}
	/**
	 * @return the billingFrstNm
	 */
	public String getBillingFrstNm() {
		return billingFrstNm;
	}
	/**
	 * @param billingFrstNm the billingFrstNm to set
	 */
	public void setBillingFrstNm(String billingFrstNm) {
		this.billingFrstNm = billingFrstNm;
	}
	/**
	 * @return the billingMidNm
	 */
	public String getBillingMidNm() {
		return billingMidNm;
	}
	/**
	 * @param billingMidNm the billingMidNm to set
	 */
	public void setBillingMidNm(String billingMidNm) {
		this.billingMidNm = billingMidNm;
	}
	/**
	 * @return the billingLstNm
	 */
	public String getBillingLstNm() {
		return billingLstNm;
	}
	/**
	 * @param billingLstNm the billingLstNm to set
	 */
	public void setBillingLstNm(String billingLstNm) {
		this.billingLstNm = billingLstNm;
	}
	/**
	 * @return the billingAdr1Txt
	 */
	public String getBillingAdr1Txt() {
		return billingAdr1Txt;
	}
	/**
	 * @param billingAdr1Txt the billingAdr1Txt to set
	 */
	public void setBillingAdr1Txt(String billingAdr1Txt) {
		this.billingAdr1Txt = billingAdr1Txt;
	}
	/**
	 * @return the billingAdr2Txt
	 */
	public String getBillingAdr2Txt() {
		return billingAdr2Txt;
	}
	/**
	 * @param billingAdr2Txt the billingAdr2Txt to set
	 */
	public void setBillingAdr2Txt(String billingAdr2Txt) {
		this.billingAdr2Txt = billingAdr2Txt;
	}
	/**
	 * @return the billingAdr3Txt
	 */
	public String getBillingAdr3Txt() {
		return billingAdr3Txt;
	}
	/**
	 * @param billingAdr3Txt the billingAdr3Txt to set
	 */
	public void setBillingAdr3Txt(String billingAdr3Txt) {
		this.billingAdr3Txt = billingAdr3Txt;
	}
	/**
	 * @return the billingAdr4Txt
	 */
	public String getBillingAdr4Txt() {
		return billingAdr4Txt;
	}
	/**
	 * @param billingAdr4Txt the billingAdr4Txt to set
	 */
	public void setBillingAdr4Txt(String billingAdr4Txt) {
		this.billingAdr4Txt = billingAdr4Txt;
	}
	/**
	 * @return the billingCtyTxt
	 */
	public String getBillingCtyTxt() {
		return billingCtyTxt;
	}
	/**
	 * @param billingCtyTxt the billingCtyTxt to set
	 */
	public void setBillingCtyTxt(String billingCtyTxt) {
		this.billingCtyTxt = billingCtyTxt;
	}
	/**
	 * @return the billingStAbb
	 */
	public String getBillingStAbb() {
		return billingStAbb;
	}
	/**
	 * @param billingStAbb the billingStAbb to set
	 */
	public void setBillingStAbb(String billingStAbb) {
		this.billingStAbb = billingStAbb;
	}
	/**
	 * @return the billingZipCd
	 */
	public String getBillingZipCd() {
		return billingZipCd;
	}
	/**
	 * @param billingZipCd the billingZipCd to set
	 */
	public void setBillingZipCd(String billingZipCd) {
		this.billingZipCd = billingZipCd;
	}
	/**
	 * @return the billingZipExtnCd
	 */
	public String getBillingZipExtnCd() {
		return billingZipExtnCd;
	}
	/**
	 * @param billingZipExtnCd the billingZipExtnCd to set
	 */
	public void setBillingZipExtnCd(String billingZipExtnCd) {
		this.billingZipExtnCd = billingZipExtnCd;
	}
	/**
	 * @return the billingCntryNm
	 */
	public String getBillingCntryNm() {
		return billingCntryNm;
	}
	/**
	 * @param billingCntryNm the billingCntryNm to set
	 */
	public void setBillingCntryNm(String billingCntryNm) {
		this.billingCntryNm = billingCntryNm;
	}
	/**
	 * @return the cre8Ts
	 */
	public String getCre8Ts() {
		return cre8Ts;
	}
	/**
	 * @param cre8Ts the cre8Ts to set
	 */
	public void setCre8Ts(String cre8Ts) {
		this.cre8Ts = cre8Ts;
	}
	/**
	 * @return the cre8Uid
	 */
	public String getCre8Uid() {
		return cre8Uid;
	}
	/**
	 * @param cre8Uid the cre8Uid to set
	 */
	public void setCre8Uid(String cre8Uid) {
		this.cre8Uid = cre8Uid;
	}
	/**
	 * @return the updtTs
	 */
	public String getUpdtTs() {
		return updtTs;
	}
	/**
	 * @param updtTs the updtTs to set
	 */
	public void setUpdtTs(String updtTs) {
		this.updtTs = updtTs;
	}
	/**
	 * @return the updtUid
	 */
	public String getUpdtUid() {
		return updtUid;
	}
	/**
	 * @param updtUid the updtUid to set
	 */
	public void setUpdtUid(String updtUid) {
		this.updtUid = updtUid;
	}
	/**
	 * @return the paymtProcTypCd
	 */
	public String getPaymtProcTypCd() {
		return paymtProcTypCd;
	}
	/**
	 * @param paymtProcTypCd the paymtProcTypCd to set
	 */
	public void setPaymtProcTypCd(String paymtProcTypCd) {
		this.paymtProcTypCd = paymtProcTypCd;
	}
	/**
	 * @return the paymtActnCd
	 */
	public String getPaymtActnCd() {
		return paymtActnCd;
	}
	/**
	 * @param paymtActnCd the paymtActnCd to set
	 */
	public void setPaymtActnCd(String paymtActnCd) {
		this.paymtActnCd = paymtActnCd;
	}
	/**
	 * @return the paymtCardTypCd
	 */
	public String getPaymtCardTypCd() {
		return paymtCardTypCd;
	}
	/**
	 * @param paymtCardTypCd the paymtCardTypCd to set
	 */
	public void setPaymtCardTypCd(String paymtCardTypCd) {
		this.paymtCardTypCd = paymtCardTypCd;
	}
	/**
	 * @return the paymtCardRefNum
	 */
	public String getPaymtCardRefNum() {
		return paymtCardRefNum;
	}
	/**
	 * @param paymtCardRefNum the paymtCardRefNum to set
	 */
	public void setPaymtCardRefNum(String paymtCardRefNum) {
		this.paymtCardRefNum = paymtCardRefNum;
	}
	/**
	 * @return the paymtCardRefHash
	 */
	public String getPaymtCardRefHash() {
		return paymtCardRefHash;
	}
	/**
	 * @param paymtCardRefHash the paymtCardRefHash to set
	 */
	public void setPaymtCardRefHash(String paymtCardRefHash) {
		this.paymtCardRefHash = paymtCardRefHash;
	}
	/**
	 * @return the paymtCardMskdNum
	 */
	public String getPaymtCardMskdNum() {
		return paymtCardMskdNum;
	}
	/**
	 * @param paymtCardMskdNum the paymtCardMskdNum to set
	 */
	public void setPaymtCardMskdNum(String paymtCardMskdNum) {
		this.paymtCardMskdNum = paymtCardMskdNum;
	}
	/**
	 * @return the paymtTndrTyp
	 */
	public String getPaymtTndrTyp() {
		return paymtTndrTyp;
	}
	/**
	 * @param paymtTndrTyp the paymtTndrTyp to set
	 */
	public void setPaymtTndrTyp(String paymtTndrTyp) {
		this.paymtTndrTyp = paymtTndrTyp;
	}
	/**
	 * @return the authnTypCd
	 */
	public String getAuthnTypCd() {
		return authnTypCd;
	}
	/**
	 * @param authnTypCd the authnTypCd to set
	 */
	public void setAuthnTypCd(String authnTypCd) {
		this.authnTypCd = authnTypCd;
	}
	/**
	 * @return the authnAmt
	 */
	public String getAuthnAmt() {
		return authnAmt;
	}
	/**
	 * @param authnAmt the authnAmt to set
	 */
	public void setAuthnAmt(String authnAmt) {
		this.authnAmt = authnAmt;
	}
	/**
	 * @return the paymtRspnCd
	 */
	public String getPaymtRspnCd() {
		return paymtRspnCd;
	}
	/**
	 * @param paymtRspnCd the paymtRspnCd to set
	 */
	public void setPaymtRspnCd(String paymtRspnCd) {
		this.paymtRspnCd = paymtRspnCd;
	}
	/**
	 * @return the paymtRspnMsg
	 */
	public String getPaymtRspnMsg() {
		return paymtRspnMsg;
	}
	/**
	 * @param paymtRspnMsg the paymtRspnMsg to set
	 */
	public void setPaymtRspnMsg(String paymtRspnMsg) {
		this.paymtRspnMsg = paymtRspnMsg;
	}
	/**
	 * @return the paymtFrdChkCd
	 */
	public String getPaymtFrdChkCd() {
		return paymtFrdChkCd;
	}
	/**
	 * @param paymtFrdChkCd the paymtFrdChkCd to set
	 */
	public void setPaymtFrdChkCd(String paymtFrdChkCd) {
		this.paymtFrdChkCd = paymtFrdChkCd;
	}
	/**
	 * @return the paymtFrdRspnCd
	 */
	public String getPaymtFrdRspnCd() {
		return paymtFrdRspnCd;
	}
	/**
	 * @param paymtFrdRspnCd the paymtFrdRspnCd to set
	 */
	public void setPaymtFrdRspnCd(String paymtFrdRspnCd) {
		this.paymtFrdRspnCd = paymtFrdRspnCd;
	}
	/**
	 * @return the paymtFrdRspnMsg
	 */
	public String getPaymtFrdRspnMsg() {
		return paymtFrdRspnMsg;
	}
	/**
	 * @param paymtFrdRspnMsg the paymtFrdRspnMsg to set
	 */
	public void setPaymtFrdRspnMsg(String paymtFrdRspnMsg) {
		this.paymtFrdRspnMsg = paymtFrdRspnMsg;
	}
	/**
	 * @return the paymtStatDes
	 */
	public String getPaymtStatDes() {
		return paymtStatDes;
	}
	/**
	 * @param paymtStatDes the paymtStatDes to set
	 */
	public void setPaymtStatDes(String paymtStatDes) {
		this.paymtStatDes = paymtStatDes;
	}
	/**
	 * @return the paymtMethDes
	 */
	public String getPaymtMethDes() {
		return paymtMethDes;
	}
	/**
	 * @param paymtMethDes the paymtMethDes to set
	 */
	public void setPaymtMethDes(String paymtMethDes) {
		this.paymtMethDes = paymtMethDes;
	}
}
