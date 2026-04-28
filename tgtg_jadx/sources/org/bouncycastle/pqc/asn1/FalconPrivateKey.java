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
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class FalconPrivateKey extends ASN1Object {
    private byte[] F;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f33439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f33440g;
    private FalconPublicKey publicKey;
    private int version;

    private FalconPrivateKey(ASN1Sequence aSN1Sequence) {
        int iIntValueExact = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
        this.version = iIntValueExact;
        if (iIntValueExact != 0) {
            a.f("unrecognized version");
            throw null;
        }
        this.f33439f = s.D(aSN1Sequence, 1);
        this.f33440g = s.D(aSN1Sequence, 2);
        this.F = s.D(aSN1Sequence, 3);
        if (aSN1Sequence.size() == 5) {
            this.publicKey = FalconPublicKey.getInstance(aSN1Sequence.getObjectAt(4));
        }
    }

    public static FalconPrivateKey getInstance(Object obj) {
        if (obj instanceof FalconPrivateKey) {
            return (FalconPrivateKey) obj;
        }
        if (obj != null) {
            return new FalconPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getF() {
        return Arrays.clone(this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f33440g);
    }

    public FalconPublicKey getPublicKey() {
        return this.publicKey;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getf() {
        return Arrays.clone(this.f33439f);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f33439f));
        aSN1EncodableVector.add(new DEROctetString(this.f33440g));
        aSN1EncodableVector.add(new DEROctetString(this.F));
        FalconPublicKey falconPublicKey = this.publicKey;
        if (falconPublicKey != null) {
            aSN1EncodableVector.add(new FalconPublicKey(falconPublicKey.getH()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public FalconPrivateKey(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, FalconPublicKey falconPublicKey) {
        this.version = i11;
        this.f33439f = bArr;
        this.f33440g = bArr2;
        this.F = bArr3;
        this.publicKey = falconPublicKey;
    }

    public FalconPrivateKey(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(i11, bArr, bArr2, bArr3, null);
    }
}
