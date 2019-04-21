package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/_InitialNameServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-WFA7ig/openjdk-8-8u162-b12/src/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, March 15, 2018 9:30:35 PM UTC
*/

public class _InitialNameServiceStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.spi.activation.InitialNameService
{


  // bind initial name
  public void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind", true);
                $out.write_string (name);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $out.write_boolean (isPersistant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/InitialNameService/NameAlreadyBound:1.0"))
                    throw com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind (name, obj, isPersistant        );
            } finally {
                _releaseReply ($in);
            }
  } // bind

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:activation/InitialNameService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _InitialNameServiceStub
