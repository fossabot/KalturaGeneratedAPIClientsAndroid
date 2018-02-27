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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AccessControlDrmPolicyAction.Tokenizer.class)
public class AccessControlDrmPolicyAction extends RuleAction {
	
	public interface Tokenizer extends RuleAction.Tokenizer {
		String policyId();
	}

	/**
	 * Drm policy id
	 */
	private Integer policyId;

	// policyId:
	public Integer getPolicyId(){
		return this.policyId;
	}
	public void setPolicyId(Integer policyId){
		this.policyId = policyId;
	}

	public void policyId(String multirequestToken){
		setToken("policyId", multirequestToken);
	}


	public AccessControlDrmPolicyAction() {
		super();
	}

	public AccessControlDrmPolicyAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		policyId = GsonParser.parseInt(jsonObject.get("policyId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAccessControlDrmPolicyAction");
		kparams.add("policyId", this.policyId);
		return kparams;
	}


    public static final Creator<AccessControlDrmPolicyAction> CREATOR = new Creator<AccessControlDrmPolicyAction>() {
        @Override
        public AccessControlDrmPolicyAction createFromParcel(Parcel source) {
            return new AccessControlDrmPolicyAction(source);
        }

        @Override
        public AccessControlDrmPolicyAction[] newArray(int size) {
            return new AccessControlDrmPolicyAction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.policyId);
    }

    public AccessControlDrmPolicyAction(Parcel in) {
        super(in);
        this.policyId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

