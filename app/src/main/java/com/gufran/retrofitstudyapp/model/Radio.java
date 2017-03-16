
package com.gufran.retrofitstudyapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Radio {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("browserUrl")
    @Expose
    private String browserUrl;
    @SerializedName("httpAddress")
    @Expose
    private String httpAddress;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("dataFormat")
    @Expose
    private String dataFormat;
    @SerializedName("bitRate")
    @Expose
    private Integer bitRate;
    @SerializedName("numberOfListeners")
    @Expose
    private Integer numberOfListeners;
    @SerializedName("numberOfUpVotes")
    @Expose
    private Integer numberOfUpVotes;
    @SerializedName("numberOfDownVotes")
    @Expose
    private Integer numberOfDownVotes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrowserUrl() {
        return browserUrl;
    }

    public void setBrowserUrl(String browserUrl) {
        this.browserUrl = browserUrl;
    }

    public String getHttpAddress() {
        return httpAddress;
    }

    public void setHttpAddress(String httpAddress) {
        this.httpAddress = httpAddress;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Integer getNumberOfListeners() {
        return numberOfListeners;
    }

    public void setNumberOfListeners(Integer numberOfListeners) {
        this.numberOfListeners = numberOfListeners;
    }

    public Integer getNumberOfUpVotes() {
        return numberOfUpVotes;
    }

    public void setNumberOfUpVotes(Integer numberOfUpVotes) {
        this.numberOfUpVotes = numberOfUpVotes;
    }

    public Integer getNumberOfDownVotes() {
        return numberOfDownVotes;
    }

    public void setNumberOfDownVotes(Integer numberOfDownVotes) {
        this.numberOfDownVotes = numberOfDownVotes;
    }

}
