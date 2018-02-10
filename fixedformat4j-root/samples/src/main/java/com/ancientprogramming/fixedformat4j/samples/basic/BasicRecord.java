/*
 * Copyright 2004 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ancientprogramming.fixedformat4j.samples.basic;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * A record containing some simple datatypes to show basic parsing and
 * formatting.
 *
 * @author Jacob von Eyben - http://www.ancientprogramming.com
 * @since 1.2.0
 */

// START-SNIPPET: basicrecord
@Record
public class BasicRecord {

    private String branchCode;
    private String cashAccountCode;
    private String drcrIndicator;
    private String cashTxnAmount;
    private String valueDate;
    private String cashAcctCode;
    private String drcrIndicatorContraEntry;
    private String amountInContraEntry;
    private String categoryCode;
    private String narrative;

    /**
     * Returns the value of the field called 'branchCode'.
     * 
     * @return Returns the branchCode.
     */
    @Field(offset = 1, length = 3)
    public String getBranchCode() {
        return this.branchCode;
    }

    /**
     * Sets the field called 'branchCode' to the given value.
     * 
     * @param branchCode
     *            The branchCode to set.
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * Returns the value of the field called 'cashAccountCode'.
     * 
     * @return Returns the cashAccountCode.
     */
    @Field(offset = 4, length = 8)
    public String getCashAccountCode() {
        return this.cashAccountCode;
    }

    /**
     * Sets the field called 'cashAccountCode' to the given value.
     * 
     * @param cashAccountCode
     *            The cashAccountCode to set.
     */
    public void setCashAccountCode(String cashAccountCode) {
        this.cashAccountCode = cashAccountCode;
    }

    /**
     * Returns the value of the field called 'drcrIndicator'.
     * 
     * @return Returns the drcrIndicator.
     */
    @Field(offset = 12, length = 1)
    public String getDrcrIndicator() {
        return this.drcrIndicator;
    }

    /**
     * Sets the field called 'drcrIndicator' to the given value.
     * 
     * @param drcrIndicator
     *            The drcrIndicator to set.
     */
    public void setDrcrIndicator(String drcrIndicator) {
        this.drcrIndicator = drcrIndicator;
    }

    /**
     * Returns the value of the field called 'cashTxnAmount'.
     * 
     * @return Returns the cashTxnAmount.
     */
    @Field(offset = 13, length = 7)
    public String getCashTxnAmount() {
        return this.cashTxnAmount;
    }

    /**
     * Sets the field called 'cashTxnAmount' to the given value.
     * 
     * @param cashTxnAmount
     *            The cashTxnAmount to set.
     */
    public void setCashTxnAmount(String cashTxnAmount) {
        this.cashTxnAmount = cashTxnAmount;
    }

    /**
     * Returns the value of the field called 'valueDate'.
     * 
     * @return Returns the valueDate.
     */
    @Field(offset = 20, length = 8)
    public String getValueDate() {
        return this.valueDate;
    }

    /**
     * Sets the field called 'valueDate' to the given value.
     * 
     * @param valueDate
     *            The valueDate to set.
     */
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * Returns the value of the field called 'cashAcctCode'.
     * 
     * @return Returns the cashAcctCode.
     */
    @Field(offset = 28, length = 8)
    public String getCashAcctCode() {
        return this.cashAcctCode;
    }

    /**
     * Sets the field called 'cashAcctCode' to the given value.
     * 
     * @param cashAcctCode
     *            The cashAcctCode to set.
     */
    public void setCashAcctCode(String cashAcctCode) {
        this.cashAcctCode = cashAcctCode;
    }

    /**
     * Returns the value of the field called 'drcrIndicatorContraEntry'.
     * 
     * @return Returns the drcrIndicatorContraEntry.
     */
    @Field(offset = 36, length = 1)
    public String getDrcrIndicatorContraEntry() {
        return this.drcrIndicatorContraEntry;
    }

    /**
     * Sets the field called 'drcrIndicatorContraEntry' to the given value.
     * 
     * @param drcrIndicatorContraEntry
     *            The drcrIndicatorContraEntry to set.
     */
    public void setDrcrIndicatorContraEntry(String drcrIndicatorContraEntry) {
        this.drcrIndicatorContraEntry = drcrIndicatorContraEntry;
    }

    /**
     * Returns the value of the field called 'amountInContraEntry'.
     * 
     * @return Returns the amountInContraEntry.
     */
    @Field(offset = 37, length = 7)
    public String getAmountInContraEntry() {
        return this.amountInContraEntry;
    }

    /**
     * Sets the field called 'amountInContraEntry' to the given value.
     * 
     * @param amountInContraEntry
     *            The amountInContraEntry to set.
     */
    public void setAmountInContraEntry(String amountInContraEntry) {
        this.amountInContraEntry = amountInContraEntry;
    }

    /**
     * Returns the value of the field called 'categoryCode'.
     * 
     * @return Returns the categoryCode.
     */
    @Field(offset = 44, length = 9)
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * Sets the field called 'categoryCode' to the given value.
     * 
     * @param categoryCode
     *            The categoryCode to set.
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * Returns the value of the field called 'narrative'.
     * 
     * @return Returns the narrative.
     */
    @Field(offset = 53, length = 27)
    public String getNarrative() {
        return this.narrative;
    }

    /**
     * Sets the field called 'narrative' to the given value.
     * 
     * @param narrative
     *            The narrative to set.
     */
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    /*
     * private String stringData; private Integer integerData; private Date
     * dateData;
     * 
     * @Field(offset = 1, length = 10) public String getStringData() { return
     * stringData; }
     * 
     * public void setStringData(String stringData) { this.stringData = stringData;
     * }
     * 
     * @Field(offset = 11, length = 5, align = Align.RIGHT, paddingChar = '0')
     * public Integer getIntegerData() { return integerData; }
     * 
     * public void setIntegerData(Integer integerData) { this.integerData =
     * integerData; }
     * 
     * @Field(offset = 16, length = 10)
     * 
     * @FixedFormatPattern("yyyy-MM-dd") public Date getDateData() { return
     * dateData; }
     * 
     * public void setDateData(Date dateData) { this.dateData = dateData; }
     */
}
// END-SNIPPET: basicrecord
