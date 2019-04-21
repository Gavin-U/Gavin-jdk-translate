// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XIMText extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XIMText(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XIMText() {
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
	public short get_length() { log.finest("");return (Native.getShort(pData+0)); }
	public void set_length(short v) { log.finest(""); Native.putShort(pData+0, v); }
	public long get_feedback(int index) { log.finest(""); return Native.getLong(pData+4)+index*Native.getLongSize(); }
	public long get_feedback() { log.finest("");return Native.getLong(pData+4); }
	public void set_feedback(long v) { log.finest(""); Native.putLong(pData + 4, v); }
	public boolean get_encoding_is_wchar() { log.finest("");return (Native.getBool(pData+8)); }
	public void set_encoding_is_wchar(boolean v) { log.finest(""); Native.putBool(pData+8, v); }
	public long get_string(int index) { log.finest(""); return Native.getLong(pData+12)+index*Native.getLongSize(); }
	public long get_string() { log.finest("");return Native.getLong(pData+12); }
	public void set_string(long v) { log.finest(""); Native.putLong(pData + 12, v); }


	String getName() {
		return "XIMText"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(160);

		ret.append("length = ").append( get_length() ).append(", ");
		ret.append("feedback = ").append( get_feedback() ).append(", ");
		ret.append("encoding_is_wchar = ").append( get_encoding_is_wchar() ).append(", ");
		ret.append("string = ").append( get_string() ).append(", ");
		return ret.toString();
	}


}



