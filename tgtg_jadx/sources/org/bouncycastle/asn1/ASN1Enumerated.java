package org.bouncycastle.asn1;

import e0.f;
import i4.a;
import j4.d;
import j4.s;
import java.io.IOException;
import java.math.BigInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Enumerated extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Enumerated.class, 10) { // from class: org.bouncycastle.asn1.ASN1Enumerated.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Enumerated.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ASN1Enumerated[] cache = new ASN1Enumerated[12];
    private final byte[] contents;
    private final int start;

    public ASN1Enumerated(byte[] bArr, boolean z11) {
        if (ASN1Integer.isMalformed(bArr)) {
            a.f("malformed enumerated");
            throw null;
        }
        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 0) {
            a.f("enumerated must be non-negative");
            throw null;
        }
        this.contents = z11 ? Arrays.clone(bArr) : bArr;
        this.start = ASN1Integer.signBytesToSkip(bArr);
    }

    public static ASN1Enumerated createPrimitive(byte[] bArr, boolean z11) {
        if (bArr.length > 1) {
            return new ASN1Enumerated(bArr, z11);
        }
        if (bArr.length == 0) {
            a.f("ENUMERATED has zero length");
            return null;
        }
        int i11 = bArr[0] & 255;
        ASN1Enumerated[] aSN1EnumeratedArr = cache;
        if (i11 >= aSN1EnumeratedArr.length) {
            return new ASN1Enumerated(bArr, z11);
        }
        ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i11];
        if (aSN1Enumerated != null) {
            return aSN1Enumerated;
        }
        ASN1Enumerated aSN1Enumerated2 = new ASN1Enumerated(bArr, z11);
        aSN1EnumeratedArr[i11] = aSN1Enumerated2;
        return aSN1Enumerated2;
    }

    public static ASN1Enumerated getInstance(Object obj) {
        String strI;
        if (obj == null || (obj instanceof ASN1Enumerated)) {
            return (ASN1Enumerated) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1Enumerated) TYPE.fromByteArray((byte[]) obj);
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
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Enumerated) {
            return Arrays.areEqual(this.contents, ((ASN1Enumerated) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 10, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public BigInteger getValue() {
        return new BigInteger(this.contents);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && ASN1Integer.intValue(this.contents, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public int intValueExact() {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i11 = this.start;
        if (length - i11 <= 4) {
            return ASN1Integer.intValue(bArr, i11, -1);
        }
        d.f("ASN.1 Enumerated out of int range");
        return 0;
    }

    public boolean hasValue(int i11) {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i12 = this.start;
        return length - i12 <= 4 && ASN1Integer.intValue(bArr, i12, -1) == i11;
    }

    public ASN1Enumerated(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            a.f("enumerated must be non-negative");
            throw null;
        }
        this.contents = bigInteger.toByteArray();
        this.start = 0;
    }

    public ASN1Enumerated(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Enumerated(int i11) {
        if (i11 < 0) {
            a.f("enumerated must be non-negative");
            throw null;
        }
        this.contents = BigInteger.valueOf(i11).toByteArray();
        this.start = 0;
    }

    public static ASN1Enumerated getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1Enumerated) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
