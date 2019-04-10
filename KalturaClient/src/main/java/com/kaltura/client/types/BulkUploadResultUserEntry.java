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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResultUserEntry.Tokenizer.class)
public class BulkUploadResultUserEntry extends BulkUploadResult {
	
	public interface Tokenizer extends BulkUploadResult.Tokenizer {
		String userEntryId();
	}

	private Integer userEntryId;

	// userEntryId:
	public Integer getUserEntryId(){
		return this.userEntryId;
	}
	public void setUserEntryId(Integer userEntryId){
		this.userEntryId = userEntryId;
	}

	public void userEntryId(String multirequestToken){
		setToken("userEntryId", multirequestToken);
	}


	public BulkUploadResultUserEntry() {
		super();
	}

	public BulkUploadResultUserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userEntryId = GsonParser.parseInt(jsonObject.get("userEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResultUserEntry");
		kparams.add("userEntryId", this.userEntryId);
		return kparams;
	}


    public static final Creator<BulkUploadResultUserEntry> CREATOR = new Creator<BulkUploadResultUserEntry>() {
        @Override
        public BulkUploadResultUserEntry createFromParcel(Parcel source) {
            return new BulkUploadResultUserEntry(source);
        }

        @Override
        public BulkUploadResultUserEntry[] newArray(int size) {
            return new BulkUploadResultUserEntry[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.userEntryId);
    }

    public BulkUploadResultUserEntry(Parcel in) {
        super(in);
        this.userEntryId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}
