/**
 * NodeLookupHolder.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from deployment.idl Saturday, December 10, 2005 1:24:06 AM GMT
 */

public final class NodeLookupHolder implements
		org.omg.CORBA.portable.Streamable {
	public NodeLookup value = null;

	public NodeLookupHolder() {
	}

	public NodeLookupHolder(NodeLookup initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = NodeLookupHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		NodeLookupHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return NodeLookupHelper.type();
	}

}
