package org.bouncycastle.crypto.agreement.kdf;

import i4.a;
import j4.s;
import java.io.IOException;
import m0.i1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f33034z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        boolean z11;
        int i13 = i12;
        int i14 = i11;
        if (bArr.length - i13 < i14) {
            i1.r("output buffer too small");
            return 0;
        }
        long j9 = i13;
        int digestSize = this.digest.getDigestSize();
        if (j9 > 8589934591L) {
            a.f("Output length too large");
            return 0;
        }
        long j11 = digestSize;
        int i15 = (int) (((j9 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (true) {
            Digest digest = this.digest;
            if (i17 >= i15) {
                digest.reset();
                return (int) j9;
            }
            byte[] bArr3 = this.f33034z;
            digest.update(bArr3, i16, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i18)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z11 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i16, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z11 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z11, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i13 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i14, digestSize);
                    i14 += digestSize;
                    i13 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i14, i13);
                }
                i18++;
                i17++;
                i16 = 0;
            } catch (IOException e5) {
                a.f(s.g(e5, new StringBuilder("unable to encode parameter info: ")));
                return 0;
            }
        }
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f33034z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
