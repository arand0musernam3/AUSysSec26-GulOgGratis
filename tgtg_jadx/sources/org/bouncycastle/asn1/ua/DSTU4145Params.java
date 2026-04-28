package org.bouncycastle.asn1.ua;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145Params extends ASN1Object {
    private static final byte[] DEFAULT_DKE = {-87, -42, -21, 69, -15, 60, 112, -126, ByteCompanionObject.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private byte[] dke;
    private DSTU4145ECBinary ecbinary;
    private ASN1ObjectIdentifier namedCurve;

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
        this.dke = Arrays.clone(bArr);
    }

    public static byte[] getDefaultDKE() {
        return Arrays.clone(DEFAULT_DKE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r4.length == org.bouncycastle.asn1.ua.DSTU4145Params.DEFAULT_DKE.length) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.asn1.ua.DSTU4145Params getInstance(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof org.bouncycastle.asn1.ua.DSTU4145Params
            if (r0 == 0) goto L7
            org.bouncycastle.asn1.ua.DSTU4145Params r4 = (org.bouncycastle.asn1.ua.DSTU4145Params) r4
            return r4
        L7:
            java.lang.String r0 = "object parse error"
            if (r4 == 0) goto L48
            org.bouncycastle.asn1.ASN1Sequence r4 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r4)
            r1 = 0
            org.bouncycastle.asn1.ASN1Encodable r2 = r4.getObjectAt(r1)
            boolean r2 = r2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r2 == 0) goto L26
            org.bouncycastle.asn1.ua.DSTU4145Params r2 = new org.bouncycastle.asn1.ua.DSTU4145Params
            org.bouncycastle.asn1.ASN1Encodable r1 = r4.getObjectAt(r1)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(r1)
            r2.<init>(r1)
            goto L33
        L26:
            org.bouncycastle.asn1.ua.DSTU4145Params r2 = new org.bouncycastle.asn1.ua.DSTU4145Params
            org.bouncycastle.asn1.ASN1Encodable r1 = r4.getObjectAt(r1)
            org.bouncycastle.asn1.ua.DSTU4145ECBinary r1 = org.bouncycastle.asn1.ua.DSTU4145ECBinary.getInstance(r1)
            r2.<init>(r1)
        L33:
            int r1 = r4.size()
            r3 = 2
            if (r1 != r3) goto L4d
            r1 = 1
            byte[] r4 = j4.s.C(r4, r1)
            r2.dke = r4
            int r4 = r4.length
            byte[] r1 = org.bouncycastle.asn1.ua.DSTU4145Params.DEFAULT_DKE
            int r1 = r1.length
            if (r4 != r1) goto L48
            goto L4d
        L48:
            i4.a.f(r0)
            r4 = 0
            return r4
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ua.DSTU4145Params.getInstance(java.lang.Object):org.bouncycastle.asn1.ua.DSTU4145Params");
    }

    public byte[] getDKE() {
        return Arrays.clone(this.dke);
    }

    public DSTU4145ECBinary getECBinary() {
        return this.ecbinary;
    }

    public ASN1ObjectIdentifier getNamedCurve() {
        return this.namedCurve;
    }

    public boolean isNamedCurve() {
        return this.namedCurve != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Encodable aSN1Encodable = this.namedCurve;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.ecbinary;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        if (!Arrays.areEqual(this.dke, DEFAULT_DKE)) {
            aSN1EncodableVector.add(new DEROctetString(this.dke));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
    }

    public DSTU4145Params(DSTU4145ECBinary dSTU4145ECBinary) {
        this.dke = DEFAULT_DKE;
        this.ecbinary = dSTU4145ECBinary;
    }
}
