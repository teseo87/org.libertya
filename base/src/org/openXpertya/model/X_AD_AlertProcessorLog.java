/** Modelo Generado - NO CAMBIAR MANUALMENTE - Copyright (C) 2006 FUNDESLE */
package org.openXpertya.model;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.openXpertya.util.*;
/** Modelo Generado por AD_AlertProcessorLog
 *  @author Comunidad de Desarrollo openXpertya*         *Basado en Codigo Original Modificado, Revisado y Optimizado de:*         * Jorg Janke 
 *  @version  - 2008-01-03 10:26:21.906 */
public class X_AD_AlertProcessorLog extends PO
{
/** Constructor estándar */
public X_AD_AlertProcessorLog (Properties ctx, int AD_AlertProcessorLog_ID, String trxName)
{
super (ctx, AD_AlertProcessorLog_ID, trxName);
/** if (AD_AlertProcessorLog_ID == 0)
{
setAD_AlertProcessorLog_ID (0);
setAD_AlertProcessor_ID (0);
setIsError (false);
}
 */
}
/** Load Constructor */
public X_AD_AlertProcessorLog (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=699 */
public static final int Table_ID=699;

/** TableName=AD_AlertProcessorLog */
public static final String Table_Name="AD_AlertProcessorLog";

protected static KeyNamePair Model = new KeyNamePair(699,"AD_AlertProcessorLog");
protected static BigDecimal AccessLevel = new BigDecimal(6);

/** Load Meta Data */
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_AlertProcessorLog[").append(getID()).append("]");
return sb.toString();
}
/** Set Alert Processor Log.
Result of the execution of the Alert Processor */
public void setAD_AlertProcessorLog_ID (int AD_AlertProcessorLog_ID)
{
set_ValueNoCheck ("AD_AlertProcessorLog_ID", new Integer(AD_AlertProcessorLog_ID));
}
/** Get Alert Processor Log.
Result of the execution of the Alert Processor */
public int getAD_AlertProcessorLog_ID() 
{
Integer ii = (Integer)get_Value("AD_AlertProcessorLog_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Alert Processor.
Alert Processor/Server Parameter */
public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID)
{
set_ValueNoCheck ("AD_AlertProcessor_ID", new Integer(AD_AlertProcessor_ID));
}
/** Get Alert Processor.
Alert Processor/Server Parameter */
public int getAD_AlertProcessor_ID() 
{
Integer ii = (Integer)get_Value("AD_AlertProcessor_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set BinaryData.
Binary Data */
public void setBinaryData (byte[] BinaryData)
{
set_Value ("BinaryData", BinaryData);
}
/** Get BinaryData.
Binary Data */
public byte[] getBinaryData() 
{
return (byte[])get_Value("BinaryData");
}
/** Set Description.
Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Set Error.
An Error occured in the execution */
public void setIsError (boolean IsError)
{
set_Value ("IsError", new Boolean(IsError));
}
/** Get Error.
An Error occured in the execution */
public boolean isError() 
{
Object oo = get_Value("IsError");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Reference.
Reference for this record */
public void setReference (String Reference)
{
if (Reference != null && Reference.length() > 60)
{
log.warning("Length > 60 - truncated");
Reference = Reference.substring(0,59);
}
set_Value ("Reference", Reference);
}
/** Get Reference.
Reference for this record */
public String getReference() 
{
return (String)get_Value("Reference");
}
/** Set Summary.
Textual summary of this request */
public void setSummary (String Summary)
{
if (Summary != null && Summary.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Summary = Summary.substring(0,1999);
}
set_Value ("Summary", Summary);
}
/** Get Summary.
Textual summary of this request */
public String getSummary() 
{
return (String)get_Value("Summary");
}
/** Set Text Message.
Text Message */
public void setTextMsg (String TextMsg)
{
if (TextMsg != null && TextMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
TextMsg = TextMsg.substring(0,1999);
}
set_Value ("TextMsg", TextMsg);
}
/** Get Text Message.
Text Message */
public String getTextMsg() 
{
return (String)get_Value("TextMsg");
}
}
