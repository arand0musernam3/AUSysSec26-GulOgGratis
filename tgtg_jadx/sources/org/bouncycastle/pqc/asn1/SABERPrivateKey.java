package org.bouncycastle.pqc.asn1;

import i4.a;
import j4.s;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f33456s;
    private int version;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f33457z;

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iIntValueExact = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
        this.version = iIntValueExact;
        if (iIntValueExact != 0) {
            a.f("unrecognized version");
            throw null;
        }
        this.f33457z = s.D(aSN1Sequence, 1);
        this.f33456s = s.D(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = s.D(aSN1Sequence, 4);
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.f33456s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.f33457z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f33457z));
        aSN1EncodableVector.add(new DEROctetString(this.f33456s));
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPrivateKey(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i11;
        if (i11 != 0) {
            a.f("unrecognized version");
            throw null;
        }
        this.f33457z = bArr;
        this.f33456s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    public SABERPrivateKey(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i11;
        if (i11 != 0) {
            a.f("unrecognized version");
            throw null;
        }
        this.f33457z = bArr;
        this.f33456s = bArr2;
        this.hpk = bArr3;
    }
}
