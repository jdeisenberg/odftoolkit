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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCondStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;
import org.odftoolkit.odfdom.changes.TextContainingElement;

/**
 * DOM implementation of OpenDocument base element
 *
 * This class can have any org.w3c.dom.Attribute attribute.
 */
public abstract class TextParagraphElementBase extends TextContainingElement {

	/**
	 * Create the instance of <code>TextParagraphElementBase</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 * @param  elementName	The type is <code>OdfName</code>
	 * @param  styleFamily	The type is <code>OdfStyleFamily</code>
	 * @param  styleAttrName	The type is <code>OdfName</code>
	 */
	public TextParagraphElementBase(OdfFileDom ownerDoc, OdfName elementName, OdfStyleFamily styleFamily, OdfName styleAttrName) {
		super(ownerDoc, elementName, styleFamily, styleAttrName);
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextClassNamesAttribute</code> , See {@odf.attribute text:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextClassNamesAttribute() {
		TextClassNamesAttribute attr = (TextClassNamesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "class-names");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextClassNamesAttribute</code> , See {@odf.attribute text:class-names}
	 *
	 * @param textClassNamesValue   The type is <code>String</code>
	 */
	public void setTextClassNamesAttribute(String textClassNamesValue) {
		TextClassNamesAttribute attr = new TextClassNamesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textClassNamesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCondStyleNameAttribute</code> , See {@odf.attribute text:cond-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCondStyleNameAttribute() {
		TextCondStyleNameAttribute attr = (TextCondStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "cond-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCondStyleNameAttribute</code> , See {@odf.attribute text:cond-style-name}
	 *
	 * @param textCondStyleNameValue   The type is <code>String</code>
	 */
	public void setTextCondStyleNameAttribute(String textCondStyleNameValue) {
		TextCondStyleNameAttribute attr = new TextCondStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCondStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdAttribute() {
		TextIdAttribute attr = (TextIdAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @param textIdValue   The type is <code>String</code>
	 */
	public void setTextIdAttribute(String textIdValue) {
		TextIdAttribute attr = new TextIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute() {
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute(String textStyleNameValue) {
		TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textStyleNameValue);
	}
}
