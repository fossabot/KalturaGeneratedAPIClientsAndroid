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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuthenticatedCondition.Tokenizer.class)
public class AuthenticatedCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> privileges();
	}

	/**
	 * The privelege needed to remove the restriction
	 */
	private List<StringValue> privileges;

	// privileges:
	public List<StringValue> getPrivileges(){
		return this.privileges;
	}
	public void setPrivileges(List<StringValue> privileges){
		this.privileges = privileges;
	}


	public AuthenticatedCondition() {
		super();
	}

	public AuthenticatedCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		privileges = GsonParser.parseArray(jsonObject.getAsJsonArray("privileges"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuthenticatedCondition");
		kparams.add("privileges", this.privileges);
		return kparams;
	}


    public static final Creator<AuthenticatedCondition> CREATOR = new Creator<AuthenticatedCondition>() {
        @Override
        public AuthenticatedCondition createFromParcel(Parcel source) {
            return new AuthenticatedCondition(source);
        }

        @Override
        public AuthenticatedCondition[] newArray(int size) {
            return new AuthenticatedCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.privileges != null) {
            dest.writeInt(this.privileges.size());
            dest.writeList(this.privileges);
        } else {
            dest.writeInt(-1);
        }
    }

    public AuthenticatedCondition(Parcel in) {
        super(in);
        int privilegesSize = in.readInt();
        if( privilegesSize > -1) {
            this.privileges = new ArrayList<>();
            in.readList(this.privileges, StringValue.class.getClassLoader());
        }
    }
}

