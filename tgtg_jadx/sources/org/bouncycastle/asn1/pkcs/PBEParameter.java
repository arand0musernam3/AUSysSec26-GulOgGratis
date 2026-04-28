package org.bouncycastle.asn1.pkcs;

import i4.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class PBEParameter extends ASN1Object {
    ASN1Integer iterations;
    ASN1OctetString salt;

    public PBEParameter(byte[] bArr, int i11) {
        if (bArr.length != 8) {
            a.f("salt length must be 8");
            throw null;
        }
        this.salt = new DEROctetString(bArr);
        this.iterations = new ASN1Integer(i11);
    }

    public static PBEParameter getInstance(Object obj) {
        if (obj instanceof PBEParameter) {
            return (PBEParameter) obj;
        }
        if (obj != null) {
            return new PBEParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getIterationCount() {
        return this.iterations.getValue();
    }

    public byte[] getSalt() {
        return this.salt.getOctets();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.salt, this.iterations);
    }

    private PBEParameter(ASN1Sequence aSN1Sequence) {
        this.salt = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.iterations = (ASN1Integer) aSN1Sequence.getObjectAt(1);
    }
}
