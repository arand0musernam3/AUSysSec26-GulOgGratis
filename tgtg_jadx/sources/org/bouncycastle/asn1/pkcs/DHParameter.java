package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f32972g;
    ASN1Integer l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f32973p;

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f32973p = ASN1Integer.getInstance(objects.nextElement());
        this.f32972g = ASN1Integer.getInstance(objects.nextElement());
        this.l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f32972g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f32973p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f32973p);
        aSN1EncodableVector.add(this.f32972g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f32973p = new ASN1Integer(bigInteger);
        this.f32972g = new ASN1Integer(bigInteger2);
        this.l = i11 != 0 ? new ASN1Integer(i11) : null;
    }
}
