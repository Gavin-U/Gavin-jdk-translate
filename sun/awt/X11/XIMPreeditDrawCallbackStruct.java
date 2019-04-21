// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XIMPreeditDrawCallbackStruct extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XIMPreeditDrawCallbackStruct(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XIMPreeditDrawCallbackStruct() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_caret() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_caret(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public int get_chg_first() { log.finest("");return (Native.getInt(pData+4)); }
	public void set_chg_first(int v) { log.finest(""); Native.putInt(pData+4, v); }
	public int get_chg_length() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_chg_length(int v) { log.finest(""); Native.putInt(pData+8, v); }
	public XIMText get_text(int index) { log.finest(""); return (Native.getLong(pData+12) != 0)?(new XIMText(Native.getLong(pData+12)+index*16)):(null); }
	public long get_text() { log.finest("");return Native.getLong(pData+12); }
	public void set_text(long v) { log.finest(""); Native.putLong(pData + 12, v); }


	String getName() {
		return "XIMPreeditDrawCallbackStruct"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(160);

		ret.append("caret = ").append( get_caret() ).append(", ");
		ret.append("chg_first = ").append( get_chg_first() ).append(", ");
		ret.append("chg_length = ").append( get_chg_length() ).append(", ");
		ret.append("text = ").append( get_text() ).append(", ");
		return ret.toString();
	}


}



