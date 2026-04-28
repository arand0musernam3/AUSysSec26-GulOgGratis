package org.bouncycastle.asn1.cryptopro;

import e0.f;
import i4.a;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f32969a;
    int keySize;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f32970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f32971q;

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).intValueExact();
        this.f32970p = (ASN1Integer) objects.nextElement();
        this.f32971q = (ASN1Integer) objects.nextElement();
        this.f32969a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        a.f(f.j(obj, "Invalid GOST3410Parameter: "));
        return null;
    }

    public BigInteger getA() {
        return this.f32969a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f32970p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f32971q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f32970p);
        aSN1EncodableVector.add(this.f32971q);
        aSN1EncodableVector.add(this.f32969a);
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public GOST3410ParamSetParameters(int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i11;
        this.f32970p = new ASN1Integer(bigInteger);
        this.f32971q = new ASN1Integer(bigInteger2);
        this.f32969a = new ASN1Integer(bigInteger3);
    }
}
