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
import com.kaltura.client.enums.ScheduleResourceStatus;
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
@MultiRequestBuilder.Tokenizer(ScheduleResource.Tokenizer.class)
public abstract class ScheduleResource extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String parentId();
		String partnerId();
		String name();
		String systemName();
		String description();
		String status();
		String tags();
		String createdAt();
		String updatedAt();
	}

	/**
	 * Auto-generated unique identifier
	 */
	private Integer id;
	private Integer parentId;
	private Integer partnerId;
	/**
	 * Defines a short name
	 */
	private String name;
	/**
	 * Defines a unique system-name
	 */
	private String systemName;
	private String description;
	private ScheduleResourceStatus status;
	private String tags;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Last update as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// parentId:
	public Integer getParentId(){
		return this.parentId;
	}
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	public void parentId(String multirequestToken){
		setToken("parentId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// status:
	public ScheduleResourceStatus getStatus(){
		return this.status;
	}
	public void setStatus(ScheduleResourceStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}


	public ScheduleResource() {
		super();
	}

	public ScheduleResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		parentId = GsonParser.parseInt(jsonObject.get("parentId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		status = ScheduleResourceStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleResource");
		kparams.add("parentId", this.parentId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.parentId);
        dest.writeValue(this.partnerId);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.description);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeString(this.tags);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
    }

    public ScheduleResource(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.parentId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.description = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : ScheduleResourceStatus.values()[tmpStatus];
        this.tags = in.readString();
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

