package org.bouncycastle.pqc.asn1;

import j4.s;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class FalconPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f33441h;

    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        this.f33441h = s.D(aSN1Sequence, 0);
    }

    public static FalconPublicKey getInstance(Object obj) {
        if (obj instanceof FalconPublicKey) {
            return (FalconPublicKey) obj;
        }
        if (obj != null) {
            return new FalconPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getH() {
        return this.f33441h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f33441h));
        return new DERSequence(aSN1EncodableVector);
    }

    public FalconPublicKey(byte[] bArr) {
        this.f33441h = bArr;
    }
}
