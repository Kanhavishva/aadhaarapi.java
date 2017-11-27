/***************************************************************************************************
 * Aadhaar API for Java
 * Copyright © 2017 Souvik Dey Chowdhury
 *
 * This file is part of Aadhaar API for Java.
 *
 * Aadhaar API for Java is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * Aadhaar API for Java is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Aadhaar API
 * for Java. If not, see http://www.gnu.org/licenses.
 **************************************************************************************************/

package uidai.aadhaar.agency;

import java.time.OffsetDateTime;

/**
 * Represents an OTP response.
 */
public class OtpResponse extends ApiResponse {
    private boolean otpSent;
    private String transactionId;
    private OffsetDateTime timestamp;
    private String responseCode;
    private String info;

    public boolean isOtpSent() {
        return otpSent;
    }

    public OtpResponse setOtpSent(boolean otpSent) {
        this.otpSent = otpSent;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public OtpResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public OtpResponse setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public OtpResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public OtpResponse setInfo(String info) {
        this.info = info;
        return this;
    }
}