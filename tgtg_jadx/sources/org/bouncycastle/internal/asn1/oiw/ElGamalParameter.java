package org.bouncycastle.internal.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f33280g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f33281p;

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f33281p = (ASN1Integer) objects.nextElement();
        this.f33280g = (ASN1Integer) objects.nextElement();
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f33280g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f33281p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f33281p, this.f33280g);
    }

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f33281p = new ASN1Integer(bigInteger);
        this.f33280g = new ASN1Integer(bigInteger2);
    }
}
