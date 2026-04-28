package org.bouncycastle.asn1.x9;

import i4.a;
import j4.s;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class ValidationParams extends ASN1Object {
    private ASN1Integer pgenCounter;
    private ASN1BitString seed;

    private ValidationParams(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a.f(s.p(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        this.seed = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(0));
        this.pgenCounter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static ValidationParams getInstance(Object obj) {
        if (obj instanceof ValidationParams) {
            return (ValidationParams) obj;
        }
        if (obj != null) {
            return new ValidationParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getPgenCounter() {
        return this.pgenCounter.getPositiveValue();
    }

    public byte[] getSeed() {
        return this.seed.getBytes();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.seed, this.pgenCounter);
    }

    public static ValidationParams getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public ValidationParams(DERBitString dERBitString, ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            a.f("'seed' cannot be null");
            throw null;
        }
        if (aSN1Integer == null) {
            a.f("'pgenCounter' cannot be null");
            throw null;
        }
        this.seed = dERBitString;
        this.pgenCounter = aSN1Integer;
    }

    public ValidationParams(byte[] bArr, int i11) {
        if (bArr == null) {
            a.f("'seed' cannot be null");
            throw null;
        }
        this.seed = new DERBitString(bArr);
        this.pgenCounter = new ASN1Integer(i11);
    }
}
