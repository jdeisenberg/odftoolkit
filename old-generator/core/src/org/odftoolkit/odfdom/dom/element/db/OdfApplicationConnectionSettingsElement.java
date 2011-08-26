/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.db.OdfBooleanComparisonModeType;

;

/**
 * ODF DOM Element implementation for element "<db:application-connection-settings>".
 */
public abstract class OdfApplicationConnectionSettingsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "application-connection-settings" );

    public OdfApplicationConnectionSettingsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "db:is-table-name-length-limited".
     */
    public Boolean getIsTableNameLengthLimited()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-table-name-length-limited" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-table-name-length-limited".
     */
    public void setIsTableNameLengthLimited( Boolean _aIsTableNameLengthLimited )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsTableNameLengthLimited );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-table-name-length-limited" ), aStringVal );
    }

    /**
     * Get value of attribute "db:enable-sql92-check".
     */
    public Boolean getEnableSql92Check()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "enable-sql92-check" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:enable-sql92-check".
     */
    public void setEnableSql92Check( Boolean _aEnableSql92Check )
    {                    
        String aStringVal = OdfBoolean.toString( _aEnableSql92Check );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "enable-sql92-check" ), aStringVal );
    }

    /**
     * Get value of attribute "db:append-table-alias-name".
     */
    public Boolean getAppendTableAliasName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "append-table-alias-name" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:append-table-alias-name".
     */
    public void setAppendTableAliasName( Boolean _aAppendTableAliasName )
    {                    
        String aStringVal = OdfBoolean.toString( _aAppendTableAliasName );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "append-table-alias-name" ), aStringVal );
    }

    /**
     * Get value of attribute "db:ignore-driver-privileges".
     */
    public Boolean getIgnoreDriverPrivileges()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "ignore-driver-privileges" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:ignore-driver-privileges".
     */
    public void setIgnoreDriverPrivileges( Boolean _aIgnoreDriverPrivileges )
    {                    
        String aStringVal = OdfBoolean.toString( _aIgnoreDriverPrivileges );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "ignore-driver-privileges" ), aStringVal );
    }

    /**
     * Get value of attribute "db:boolean-comparison-mode".
     */
    public OdfBooleanComparisonModeType getBooleanComparisonMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "boolean-comparison-mode" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "equal-integer";
        }

        return OdfBooleanComparisonModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:boolean-comparison-mode".
     */
    public void setBooleanComparisonMode( OdfBooleanComparisonModeType _aBooleanComparisonMode )
    {                    
        String aStringVal = OdfBooleanComparisonModeType.toString( _aBooleanComparisonMode );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "boolean-comparison-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "db:use-catalog".
     */
    public Boolean getUseCatalog()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "use-catalog" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:use-catalog".
     */
    public void setUseCatalog( Boolean _aUseCatalog )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseCatalog );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "use-catalog" ), aStringVal );
    }

    /**
     * Get value of attribute "db:max-row-count".
     */
    public Integer getMaxRowCount()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "max-row-count" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:max-row-count".
     */
    public void setMaxRowCount( Integer _aMaxRowCount )
    {                    
        String aStringVal = Integer.toString( _aMaxRowCount );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "max-row-count" ), aStringVal );
    }

    /**
     * Get value of attribute "db:suppress-version-columns".
     */
    public Boolean getSuppressVersionColumns()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "suppress-version-columns" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:suppress-version-columns".
     */
    public void setSuppressVersionColumns( Boolean _aSuppressVersionColumns )
    {                    
        String aStringVal = OdfBoolean.toString( _aSuppressVersionColumns );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "suppress-version-columns" ), aStringVal );
    }

    /**
    * Create child element "db:table-filter".
    */
    public OdfTableFilterElement createTableFilterElement()
    {
        OdfTableFilterElement  _nTableFilter = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableFilterElement.class);
        this.appendChild( _nTableFilter);
        return  _nTableFilter;
    }                   
               
    /**
    * Create child element "db:table-type-filter".
    */
    public OdfTableTypeFilterElement createTableTypeFilterElement()
    {
        OdfTableTypeFilterElement  _nTableTypeFilter = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfTableTypeFilterElement.class);
        this.appendChild( _nTableTypeFilter);
        return  _nTableTypeFilter;
    }                   
               
    /**
    * Create child element "db:data-source-settings".
    */
    public OdfDataSourceSettingsElement createDataSourceSettingsElement()
    {
        OdfDataSourceSettingsElement  _nDataSourceSettings = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDataSourceSettingsElement.class);
        this.appendChild( _nDataSourceSettings);
        return  _nDataSourceSettings;
    }                   
               
}