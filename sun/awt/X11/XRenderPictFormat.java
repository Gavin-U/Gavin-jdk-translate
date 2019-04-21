// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XRenderPictFormat extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 32; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XRenderPictFormat(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XRenderPictFormat() {
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
	public long get_id() { log.finest("");return (Native.getLong(pData+0)); }
	public void set_id(long v) { log.finest(""); Native.putLong(pData+0, v); }
	public int get_type() { log.finest("");return (Native.getInt(pData+4)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+4, v); }
	public int get_depth() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_depth(int v) { log.finest(""); Native.putInt(pData+8, v); }
	public XRenderDirectFormat get_direct() { log.finest("");return new XRenderDirectFormat(pData + 12); }
	public long get_colormap() { log.finest("");return (Native.getLong(pData+28)); }
	public void set_colormap(long v) { log.finest(""); Native.putLong(pData+28, v); }


	String getName() {
		return "XRenderPictFormat"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(200);

		ret.append("id = ").append( get_id() ).append(", ");
		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("depth = ").append( get_depth() ).append(", ");
		ret.append("direct = ").append( get_direct() ).append(", ");
		ret.append("colormap = ").append( get_colormap() ).append(", ");
		return ret.toString();
	}


}



