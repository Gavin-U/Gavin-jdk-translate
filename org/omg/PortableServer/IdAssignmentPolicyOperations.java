package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-WFA7ig/openjdk-8-8u162-b12/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, March 15, 2018 9:30:35 PM UTC
*/


/**
	 * IdAssignmentPolicy specifies whether Object Ids in 
	 * the created POA are generated by the application or 
	 * by the ORB. The default is SYSTEM_ID.
	 */
public interface IdAssignmentPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.IdAssignmentPolicyValue value ();
} // interface IdAssignmentPolicyOperations
