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
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f32962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f32963b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f32964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f32965q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f32966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f32967y;

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f32962a = (ASN1Integer) objects.nextElement();
        this.f32963b = (ASN1Integer) objects.nextElement();
        this.f32964p = (ASN1Integer) objects.nextElement();
        this.f32965q = (ASN1Integer) objects.nextElement();
        this.f32966x = (ASN1Integer) objects.nextElement();
        this.f32967y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        a.f(f.j(obj, "Invalid GOST3410Parameter: "));
        return null;
    }

    public BigInteger getA() {
        return this.f32962a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f32964p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f32965q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f32962a);
        aSN1EncodableVector.add(this.f32963b);
        aSN1EncodableVector.add(this.f32964p);
        aSN1EncodableVector.add(this.f32965q);
        aSN1EncodableVector.add(this.f32966x);
        aSN1EncodableVector.add(this.f32967y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, BigInteger bigInteger5) {
        this.f32962a = new ASN1Integer(bigInteger);
        this.f32963b = new ASN1Integer(bigInteger2);
        this.f32964p = new ASN1Integer(bigInteger3);
        this.f32965q = new ASN1Integer(bigInteger4);
        this.f32966x = new ASN1Integer(i11);
        this.f32967y = new ASN1Integer(bigInteger5);
    }
}
