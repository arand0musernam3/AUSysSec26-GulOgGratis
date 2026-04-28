package org.bouncycastle.asn1.x509;

import i4.a;
import j4.s;
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
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f32991g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f32992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f32993q;

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            a.f(s.p(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f32992p = ASN1Integer.getInstance(objects.nextElement());
        this.f32993q = ASN1Integer.getInstance(objects.nextElement());
        this.f32991g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f32991g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f32992p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f32993q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f32992p);
        aSN1EncodableVector.add(this.f32993q);
        aSN1EncodableVector.add(this.f32991g);
        return new DERSequence(aSN1EncodableVector);
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f32992p = new ASN1Integer(bigInteger);
        this.f32993q = new ASN1Integer(bigInteger2);
        this.f32991g = new ASN1Integer(bigInteger3);
    }
}
