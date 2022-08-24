/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsPasswordRequiredAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbLoginTimeoutAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbUseSystemUserAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbUserNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:login}.
 *
 */
public class DbLoginElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "login");

	/**
	 * Create the instance of <code>DbLoginElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbLoginElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:login}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIsPasswordRequiredAttribute</code> , See {@odf.attribute db:is-password-required}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIsPasswordRequiredAttribute() {
		DbIsPasswordRequiredAttribute attr = (DbIsPasswordRequiredAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "is-password-required");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(DbIsPasswordRequiredAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIsPasswordRequiredAttribute</code> , See {@odf.attribute db:is-password-required}
	 *
	 * @param dbIsPasswordRequiredValue   The type is <code>Boolean</code>
	 */
	public void setDbIsPasswordRequiredAttribute(Boolean dbIsPasswordRequiredValue) {
		DbIsPasswordRequiredAttribute attr = new DbIsPasswordRequiredAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(dbIsPasswordRequiredValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbLoginTimeoutAttribute</code> , See {@odf.attribute db:login-timeout}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDbLoginTimeoutAttribute() {
		DbLoginTimeoutAttribute attr = (DbLoginTimeoutAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "login-timeout");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbLoginTimeoutAttribute</code> , See {@odf.attribute db:login-timeout}
	 *
	 * @param dbLoginTimeoutValue   The type is <code>Integer</code>
	 */
	public void setDbLoginTimeoutAttribute(Integer dbLoginTimeoutValue) {
		DbLoginTimeoutAttribute attr = new DbLoginTimeoutAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(dbLoginTimeoutValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbUseSystemUserAttribute</code> , See {@odf.attribute db:use-system-user}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbUseSystemUserAttribute() {
		DbUseSystemUserAttribute attr = (DbUseSystemUserAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "use-system-user");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbUseSystemUserAttribute</code> , See {@odf.attribute db:use-system-user}
	 *
	 * @param dbUseSystemUserValue   The type is <code>Boolean</code>
	 */
	public void setDbUseSystemUserAttribute(Boolean dbUseSystemUserValue) {
		DbUseSystemUserAttribute attr = new DbUseSystemUserAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(dbUseSystemUserValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbUserNameAttribute</code> , See {@odf.attribute db:user-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbUserNameAttribute() {
		DbUserNameAttribute attr = (DbUserNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "user-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbUserNameAttribute</code> , See {@odf.attribute db:user-name}
	 *
	 * @param dbUserNameValue   The type is <code>String</code>
	 */
	public void setDbUserNameAttribute(String dbUserNameValue) {
		DbUserNameAttribute attr = new DbUserNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbUserNameValue);
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}