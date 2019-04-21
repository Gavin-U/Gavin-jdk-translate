// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XConfigureEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 52; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XConfigureEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XConfigureEvent() {
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
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+4)); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+4, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+8)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+8, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+12)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+12, v); }
	public long get_event() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_event(long v) { log.finest(""); Native.putLong(pData+16, v); }
	public long get_window() { log.finest("");return (Native.getLong(pData+20)); }
	public void set_window(long v) { log.finest(""); Native.putLong(pData+20, v); }
	public int get_x() { log.finest("");return (Native.getInt(pData+24)); }
	public void set_x(int v) { log.finest(""); Native.putInt(pData+24, v); }
	public int get_y() { log.finest("");return (Native.getInt(pData+28)); }
	public void set_y(int v) { log.finest(""); Native.putInt(pData+28, v); }
	public int get_width() { log.finest("");return (Native.getInt(pData+32)); }
	public void set_width(int v) { log.finest(""); Native.putInt(pData+32, v); }
	public int get_height() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_height(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public int get_border_width() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_border_width(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public long get_above() { log.finest("");return (Native.getLong(pData+44)); }
	public void set_above(long v) { log.finest(""); Native.putLong(pData+44, v); }
	public boolean get_override_redirect() { log.finest("");return (Native.getBool(pData+48)); }
	public void set_override_redirect(boolean v) { log.finest(""); Native.putBool(pData+48, v); }


	String getName() {
		return "XConfigureEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(520);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("event = ").append( get_event() ).append(", ");
		ret.append("window = " ).append( getWindow(get_window()) ).append(", ");
		ret.append("x = ").append( get_x() ).append(", ");
		ret.append("y = ").append( get_y() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("height = ").append( get_height() ).append(", ");
		ret.append("border_width = ").append( get_border_width() ).append(", ");
		ret.append("above = ").append( get_above() ).append(", ");
		ret.append("override_redirect = ").append( get_override_redirect() ).append(", ");
		return ret.toString();
	}


}



