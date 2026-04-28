package org.bouncycastle.asn1;

import e0.f;
import i4.a;
import j4.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Boolean extends ASN1Primitive {
    private static final byte FALSE_VALUE = 0;
    private final byte value;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Boolean.class, 1) { // from class: org.bouncycastle.asn1.ASN1Boolean.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Boolean.createPrimitive(dEROctetString.getOctets());
        }
    };
    public static final ASN1Boolean FALSE = new ASN1Boolean((byte) 0);
    private static final byte TRUE_VALUE = -1;
    public static final ASN1Boolean TRUE = new ASN1Boolean(TRUE_VALUE);

    private ASN1Boolean(byte b8) {
        this.value = b8;
    }

    public static ASN1Boolean createPrimitive(byte[] bArr) {
        if (bArr.length == 1) {
            byte b8 = bArr[0];
            return b8 != -1 ? b8 != 0 ? new ASN1Boolean(b8) : FALSE : TRUE;
        }
        a.f("BOOLEAN value should have 1 byte in it");
        return null;
    }

    public static ASN1Boolean getInstance(Object obj) {
        String strJ;
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1Boolean) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e5) {
                strJ = s.g(e5, new StringBuilder("failed to construct boolean from byte[]: "));
            }
        } else {
            strJ = f.j(obj, "illegal object in getInstance: ");
        }
        a.f(strJ);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && isTrue() == ((ASN1Boolean) aSN1Primitive).isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 1, this.value);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    public boolean isTrue() {
        return this.value != 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return isTrue() ? TRUE : FALSE;
    }

    public String toString() {
        return isTrue() ? "TRUE" : "FALSE";
    }

    public static ASN1Boolean getInstance(int i11) {
        return i11 != 0 ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1Boolean) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }

    public static ASN1Boolean getInstance(boolean z11) {
        return z11 ? TRUE : FALSE;
    }
}
