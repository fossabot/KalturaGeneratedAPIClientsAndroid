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
@MultiRequestBuilder.Tokenizer(QuizUserEntryFilter.Tokenizer.class)
public class QuizUserEntryFilter extends QuizUserEntryBaseFilter {
	
	public interface Tokenizer extends QuizUserEntryBaseFilter.Tokenizer {
		String versionEqual();
	}

	private Integer versionEqual;

	// versionEqual:
	public Integer getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(Integer versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}


	public QuizUserEntryFilter() {
		super();
	}

	public QuizUserEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuizUserEntryFilter");
		kparams.add("versionEqual", this.versionEqual);
		return kparams;
	}


    public static final Creator<QuizUserEntryFilter> CREATOR = new Creator<QuizUserEntryFilter>() {
        @Override
        public QuizUserEntryFilter createFromParcel(Parcel source) {
            return new QuizUserEntryFilter(source);
        }

        @Override
        public QuizUserEntryFilter[] newArray(int size) {
            return new QuizUserEntryFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.versionEqual);
    }

    public QuizUserEntryFilter(Parcel in) {
        super(in);
        this.versionEqual = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

