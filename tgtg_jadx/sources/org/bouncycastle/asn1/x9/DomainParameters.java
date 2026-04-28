package org.bouncycastle.asn1.x9;

import i4.a;
import j4.s;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ASN1Integer f33001g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ASN1Integer f33002j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ASN1Integer f33003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ASN1Integer f33004q;
    private final ValidationParams validationParams;

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            a.f(s.p(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f33003p = ASN1Integer.getInstance(objects.nextElement());
        this.f33001g = ASN1Integer.getInstance(objects.nextElement());
        this.f33004q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.f33002j = null;
        } else {
            this.f33002j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParams = ValidationParams.getInstance(next.toASN1Primitive());
        } else {
            this.validationParams = null;
        }
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger getG() {
        return this.f33001g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f33002j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f33003p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f33004q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f33003p);
        aSN1EncodableVector.add(this.f33001g);
        aSN1EncodableVector.add(this.f33004q);
        ASN1Integer aSN1Integer = this.f33002j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams = this.validationParams;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams) {
        if (bigInteger == null) {
            a.f("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            a.f("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 == null) {
            a.f("'q' cannot be null");
            throw null;
        }
        this.f33003p = new ASN1Integer(bigInteger);
        this.f33001g = new ASN1Integer(bigInteger2);
        this.f33004q = new ASN1Integer(bigInteger3);
        this.f33002j = bigInteger4 != null ? new ASN1Integer(bigInteger4) : null;
        this.validationParams = validationParams;
    }
}
