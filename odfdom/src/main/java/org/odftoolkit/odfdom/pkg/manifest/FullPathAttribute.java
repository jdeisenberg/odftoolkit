/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;

/** Manifest implementation of OpenDocument attribute {@odf.attribute manifest:full-path}. */
public class FullPathAttribute extends OdfAttribute {

  public static final OdfName ATTRIBUTE_NAME =
      OdfName.newName(OdfPackageNamespace.MANIFEST, "full-path");

  /**
   * Create the instance of OpenDocument attribute {@odf.attribute manifest:full-path}.
   *
   * @param ownerDocument The type is <code>OdfFileDom</code>
   */
  public FullPathAttribute(OdfFileDom ownerDocument) {
    super(ownerDocument, ATTRIBUTE_NAME);
  }

  /**
   * Returns the attribute name.
   *
   * @return the <code>OdfName</code> for {@odf.attribute manifest:full-path}.
   */
  @Override
  public OdfName getOdfName() {
    return ATTRIBUTE_NAME;
  }

  /** @return Returns the name of this attribute. */
  @Override
  public String getName() {
    return ATTRIBUTE_NAME.getLocalName();
  }

  /**
   * Returns the default value of {@odf.attribute manifest:full-path}.
   *
   * @return the default value as <code>String</code> dependent of its element name return <code>
   *     null</code> if the default value does not exist
   */
  @Override
  public String getDefault() {
    return null;
  }

  /**
   * Default value indicator. As the attribute default value is dependent from its element, the
   * attribute has only a default, when a parent element exists.
   *
   * @return <code>true</code> if {@odf.attribute manifest:full-path} has an element parent
   *     otherwise return <code>false</code> as undefined.
   */
  @Override
  public boolean hasDefault() {
    return false;
  }

  /** @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?) */
  @Override
  public boolean isId() {
    return false;
  }
}
