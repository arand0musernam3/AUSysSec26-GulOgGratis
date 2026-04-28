package org.bouncycastle.pqc.asn1;

import i4.a;
import j4.s;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f33452h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f33453k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33454t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f33455w;

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            a.f(s.p(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
            throw null;
        }
        this.f33454t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f33454t || aSN1Sequence3.size() != this.f33454t || aSN1Sequence4.size() != this.f33454t) {
            a.f("invalid size of sequences");
            throw null;
        }
        this.f33452h = new int[aSN1Sequence2.size()];
        this.f33455w = new int[aSN1Sequence3.size()];
        this.f33453k = new int[aSN1Sequence4.size()];
        for (int i11 = 0; i11 < this.f33454t; i11++) {
            this.f33452h[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i11));
            this.f33455w[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i11));
            this.f33453k[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i11));
        }
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        a.f(s.f(iIntValueExact, "BigInteger not in Range: "));
        return 0;
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f33452h);
    }

    public int[] getK() {
        return Arrays.clone(this.f33453k);
    }

    public int getT() {
        return this.f33454t;
    }

    public int[] getW() {
        return Arrays.clone(this.f33455w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i11 = 0; i11 < this.f33452h.length; i11++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f33452h[i11]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f33455w[i11]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f33453k[i11]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f33454t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    public ParSet(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f33454t = i11;
        this.f33452h = iArr;
        this.f33455w = iArr2;
        this.f33453k = iArr3;
    }
}
