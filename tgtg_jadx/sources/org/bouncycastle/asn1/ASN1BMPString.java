package org.bouncycastle.asn1;

import c50.w;
import e0.f;
import i4.a;
import j4.s;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    public ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            w.l("'string' cannot be null");
            throw null;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            a.f("malformed BMPString encoding encountered");
            throw null;
        }
        int i11 = length / 2;
        char[] cArr = new char[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            int i13 = i12 * 2;
            cArr[i12] = (char) ((bArr[i13 + 1] & 255) | (bArr[i13] << 8));
        }
        this.string = cArr;
    }

    public static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        String strI;
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
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
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z11, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i11 = length & (-4);
        int i12 = 0;
        while (i12 < i11) {
            char[] cArr = this.string;
            char c3 = cArr[i12];
            char c7 = cArr[i12 + 1];
            char c8 = cArr[i12 + 2];
            char c11 = cArr[i12 + 3];
            i12 += 4;
            bArr[0] = (byte) (c3 >> '\b');
            bArr[1] = (byte) c3;
            bArr[2] = (byte) (c7 >> '\b');
            bArr[3] = (byte) c7;
            bArr[4] = (byte) (c8 >> '\b');
            bArr[5] = (byte) c8;
            bArr[6] = (byte) (c11 >> '\b');
            bArr[7] = (byte) c11;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i12 < length) {
            int i13 = 0;
            do {
                char c12 = this.string[i12];
                i12++;
                int i14 = i13 + 1;
                bArr[i13] = (byte) (c12 >> '\b');
                i13 += 2;
                bArr[i14] = (byte) c12;
            } while (i12 < length);
            aSN1OutputStream.write(bArr, 0, i13);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }

    public static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public ASN1BMPString(String str) {
        if (str != null) {
            this.string = str.toCharArray();
        } else {
            w.l("'string' cannot be null");
            throw null;
        }
    }

    public ASN1BMPString(char[] cArr) {
        if (cArr != null) {
            this.string = cArr;
        } else {
            w.l("'string' cannot be null");
            throw null;
        }
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1BMPString) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
