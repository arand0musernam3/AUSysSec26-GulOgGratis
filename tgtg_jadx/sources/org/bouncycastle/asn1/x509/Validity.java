package org.bouncycastle.asn1.x509;

import c50.w;
import i4.a;
import j4.s;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class Validity extends ASN1Object {
    private final Time notAfter;
    private final Time notBefore;

    private Validity(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        if (size != 2) {
            a.f(s.f(size, "Bad sequence size: "));
            throw null;
        }
        this.notBefore = Time.getInstance(aSN1Sequence.getObjectAt(0));
        this.notAfter = Time.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static Validity getInstance(Object obj) {
        if (obj instanceof Validity) {
            return (Validity) obj;
        }
        if (obj != null) {
            return new Validity(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Time getNotAfter() {
        return this.notAfter;
    }

    public Time getNotBefore() {
        return this.notBefore;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.notBefore, this.notAfter);
    }

    public static Validity getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return new Validity(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public Validity(Time time, Time time2) {
        if (time == null) {
            w.l("'notBefore' cannot be null");
            throw null;
        }
        if (time2 == null) {
            w.l("'notAfter' cannot be null");
            throw null;
        }
        this.notBefore = time;
        this.notAfter = time2;
    }
}
