// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XkbAccessXNotifyEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 44; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XkbAccessXNotifyEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XkbAccessXNotifyEvent() {
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
	public long get_serial() { log.finest("");return (Native.getULong(pData+4)); }
	public void set_serial(long v) { log.finest(""); Native.putULong(pData+4, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+8)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+8, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+12)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+12, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+16)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+16, v); }
	public int get_xkb_type() { log.finest("");return (Native.getInt(pData+20)); }
	public void set_xkb_type(int v) { log.finest(""); Native.putInt(pData+20, v); }
	public int get_device() { log.finest("");return (Native.getInt(pData+24)); }
	public void set_device(int v) { log.finest(""); Native.putInt(pData+24, v); }
	public int get_detail() { log.finest("");return (Native.getInt(pData+28)); }
	public void set_detail(int v) { log.finest(""); Native.putInt(pData+28, v); }
	public int get_keycode() { log.finest("");return (Native.getInt(pData+32)); }
	public void set_keycode(int v) { log.finest(""); Native.putInt(pData+32, v); }
	public int get_sk_delay() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_sk_delay(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public int get_debounce_delay() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_debounce_delay(int v) { log.finest(""); Native.putInt(pData+40, v); }


	String getName() {
		return "XkbAccessXNotifyEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(440);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("time = ").append( get_time() ).append(", ");
		ret.append("xkb_type = ").append( get_xkb_type() ).append(", ");
		ret.append("device = ").append( get_device() ).append(", ");
		ret.append("detail = ").append( get_detail() ).append(", ");
		ret.append("keycode = ").append( get_keycode() ).append(", ");
		ret.append("sk_delay = ").append( get_sk_delay() ).append(", ");
		ret.append("debounce_delay = ").append( get_debounce_delay() ).append(", ");
		return ret.toString();
	}


}



