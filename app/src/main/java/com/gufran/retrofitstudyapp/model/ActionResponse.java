
package com.gufran.retrofitstudyapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActionResponse {

    @SerializedName("userid")
    @Expose
    private String userid;
    @SerializedName("instruction")
    @Expose
    private String instruction;
    @SerializedName("radiostationid")
    @Expose
    private String radiostationid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getRadiostationid() {
        return radiostationid;
    }

    public void setRadiostationid(String radiostationid) {
        this.radiostationid = radiostationid;
    }

}
