package org.bouncycastle.asn1.x9;

import i4.a;
import j4.s;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DHValidationParms extends ASN1Object {
    private ASN1Integer pgenCounter;
    private ASN1BitString seed;

    private DHValidationParms(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a.f(s.p(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        this.seed = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(0));
        this.pgenCounter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static DHValidationParms getInstance(Object obj) {
        if (obj instanceof DHValidationParms) {
            return (DHValidationParms) obj;
        }
        if (obj != null) {
            return new DHValidationParms(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer getPgenCounter() {
        return this.pgenCounter;
    }

    public ASN1BitString getSeed() {
        return this.seed;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.seed, this.pgenCounter);
    }

    public static DHValidationParms getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public DHValidationParms(ASN1BitString aSN1BitString, ASN1Integer aSN1Integer) {
        if (aSN1BitString == null) {
            a.f("'seed' cannot be null");
            throw null;
        }
        if (aSN1Integer == null) {
            a.f("'pgenCounter' cannot be null");
            throw null;
        }
        this.seed = aSN1BitString;
        this.pgenCounter = aSN1Integer;
    }
}
