package org.bouncycastle.asn1.ua;

import i4.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32977k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32978m;

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f32978m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f32977k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
            return;
        }
        if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
            a.f("object parse error");
            throw null;
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f32977k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
        this.f32976j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
        this.l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f32977k;
    }

    public int getK2() {
        return this.f32976j;
    }

    public int getK3() {
        return this.l;
    }

    public int getM() {
        return this.f32978m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(this.f32978m));
        if (this.f32976j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f32977k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(this.f32977k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f32976j));
            aSN1EncodableVector2.add(new ASN1Integer(this.l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i11, int i12, int i13, int i14) {
        this.f32978m = i11;
        this.f32977k = i12;
        this.f32976j = i13;
        this.l = i14;
    }

    public DSTU4145BinaryField(int i11, int i12) {
        this(i11, i12, 0, 0);
    }
}
