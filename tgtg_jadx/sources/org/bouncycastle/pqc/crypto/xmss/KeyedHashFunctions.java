package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes3.dex */
final class KeyedHashFunctions {
    private final Digest digest;
    private final int digestSize;

    public KeyedHashFunctions(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i11) {
        if (aSN1ObjectIdentifier == null) {
            w.l("digest == null");
            throw null;
        }
        this.digest = DigestUtil.getDigest(aSN1ObjectIdentifier);
        this.digestSize = i11;
    }

    private byte[] coreDigest(int i11, byte[] bArr, byte[] bArr2) {
        byte[] bytesBigEndian = XMSSUtil.toBytesBigEndian(i11, this.digestSize);
        this.digest.update(bytesBigEndian, 0, bytesBigEndian.length);
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        int i12 = this.digestSize;
        byte[] bArr3 = new byte[i12];
        Digest digest = this.digest;
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr3, 0, i12);
            return bArr3;
        }
        digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public byte[] F(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.digestSize;
        if (length != i11) {
            a.f("wrong key length");
            return null;
        }
        if (bArr2.length == i11) {
            return coreDigest(0, bArr, bArr2);
        }
        a.f("wrong in length");
        return null;
    }

    public byte[] H(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.digestSize;
        if (length != i11) {
            a.f("wrong key length");
            return null;
        }
        if (bArr2.length == i11 * 2) {
            return coreDigest(1, bArr, bArr2);
        }
        a.f("wrong in length");
        return null;
    }

    public byte[] HMsg(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.digestSize * 3) {
            return coreDigest(2, bArr, bArr2);
        }
        a.f("wrong key length");
        return null;
    }

    public byte[] PRF(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.digestSize) {
            a.f("wrong key length");
            return null;
        }
        if (bArr2.length == 32) {
            return coreDigest(3, bArr, bArr2);
        }
        a.f("wrong address length");
        return null;
    }
}
