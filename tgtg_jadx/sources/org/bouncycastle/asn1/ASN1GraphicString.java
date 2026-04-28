package org.bouncycastle.asn1;

import c50.w;
import e0.f;
import i4.a;
import j4.s;
import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1GraphicString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GraphicString.class, 25) { // from class: org.bouncycastle.asn1.ASN1GraphicString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GraphicString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1GraphicString(byte[] bArr, boolean z11) {
        if (bArr != null) {
            this.contents = z11 ? Arrays.clone(bArr) : bArr;
        } else {
            w.l("'contents' cannot be null");
            throw null;
        }
    }

    public static ASN1GraphicString createPrimitive(byte[] bArr) {
        return new DERGraphicString(bArr, false);
    }

    public static ASN1GraphicString getInstance(Object obj) {
        String strI;
        if (obj == null || (obj instanceof ASN1GraphicString)) {
            return (ASN1GraphicString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GraphicString) {
                return (ASN1GraphicString) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1GraphicString) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e5) {
                strI = s.i(e5, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strI = f.j(obj, "illegal object in getInstance: ");
        }
        a.f(strI);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GraphicString) {
            return Arrays.areEqual(this.contents, ((ASN1GraphicString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 25, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public static ASN1GraphicString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1GraphicString) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
