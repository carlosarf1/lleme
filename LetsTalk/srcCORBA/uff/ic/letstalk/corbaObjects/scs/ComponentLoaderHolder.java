package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentLoaderHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public final class ComponentLoaderHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.letstalk.corbaObjects.scs.ComponentLoader value = null;

	public ComponentLoaderHolder() {
	}

	public ComponentLoaderHolder(uff.ic.letstalk.corbaObjects.scs.ComponentLoader initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.letstalk.corbaObjects.scs.ComponentLoaderHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.letstalk.corbaObjects.scs.ComponentLoaderHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.letstalk.corbaObjects.scs.ComponentLoaderHelper.type();
	}

}
