// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2019  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PartnerPublicInfo.Tokenizer.class)
public class PartnerPublicInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String analyticsUrl();
		String ottEnvironmentUrl();
	}

	private String analyticsUrl;
	private String ottEnvironmentUrl;

	// analyticsUrl:
	public String getAnalyticsUrl(){
		return this.analyticsUrl;
	}
	public void setAnalyticsUrl(String analyticsUrl){
		this.analyticsUrl = analyticsUrl;
	}

	public void analyticsUrl(String multirequestToken){
		setToken("analyticsUrl", multirequestToken);
	}

	// ottEnvironmentUrl:
	public String getOttEnvironmentUrl(){
		return this.ottEnvironmentUrl;
	}
	public void setOttEnvironmentUrl(String ottEnvironmentUrl){
		this.ottEnvironmentUrl = ottEnvironmentUrl;
	}

	public void ottEnvironmentUrl(String multirequestToken){
		setToken("ottEnvironmentUrl", multirequestToken);
	}


	public PartnerPublicInfo() {
		super();
	}

	public PartnerPublicInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		analyticsUrl = GsonParser.parseString(jsonObject.get("analyticsUrl"));
		ottEnvironmentUrl = GsonParser.parseString(jsonObject.get("ottEnvironmentUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPartnerPublicInfo");
		kparams.add("analyticsUrl", this.analyticsUrl);
		kparams.add("ottEnvironmentUrl", this.ottEnvironmentUrl);
		return kparams;
	}


    public static final Creator<PartnerPublicInfo> CREATOR = new Creator<PartnerPublicInfo>() {
        @Override
        public PartnerPublicInfo createFromParcel(Parcel source) {
            return new PartnerPublicInfo(source);
        }

        @Override
        public PartnerPublicInfo[] newArray(int size) {
            return new PartnerPublicInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.analyticsUrl);
        dest.writeString(this.ottEnvironmentUrl);
    }

    public PartnerPublicInfo(Parcel in) {
        super(in);
        this.analyticsUrl = in.readString();
        this.ottEnvironmentUrl = in.readString();
    }
}

