package org.bouncycastle.asn1.x9;

import e0.f;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: classes3.dex */
public class DHPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ASN1Integer f33000y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.f33000y = new ASN1Integer(bigInteger);
        } else {
            a.f("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        a.f(f.j(obj, "Invalid DHPublicKey: "));
        return null;
    }

    public BigInteger getY() {
        return this.f33000y.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f33000y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            this.f33000y = aSN1Integer;
        } else {
            a.f("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z11));
    }
}
