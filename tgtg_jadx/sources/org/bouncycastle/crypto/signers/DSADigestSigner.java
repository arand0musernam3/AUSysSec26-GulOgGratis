package org.bouncycastle.crypto.signers;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DSADigestSigner implements Signer {
    private final Digest digest;
    private final DSA dsa;
    private final DSAEncoding encoding;
    private boolean forSigning;

    public DSADigestSigner(DSA dsa, Digest digest) {
        this.dsa = dsa;
        this.digest = digest;
        this.encoding = StandardDSAEncoding.INSTANCE;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        String str;
        if (this.forSigning) {
            byte[] bArr = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr, 0);
            BigInteger[] bigIntegerArrGenerateSignature = this.dsa.generateSignature(bArr);
            try {
                return this.encoding.encode(getOrder(), bigIntegerArrGenerateSignature[0], bigIntegerArrGenerateSignature[1]);
            } catch (Exception unused) {
                str = "unable to encode signature";
            }
        } else {
            str = "DSADigestSigner not initialised for signature generation.";
        }
        h2.b(str);
        return null;
    }

    public BigInteger getOrder() {
        DSA dsa = this.dsa;
        if (dsa instanceof DSAExt) {
            return ((DSAExt) dsa).getOrder();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forSigning = z11;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z11 && !asymmetricKeyParameter.isPrivate()) {
            a.f("Signing Requires Private Key.");
        } else if (!z11 && asymmetricKeyParameter.isPrivate()) {
            a.f("Verification Requires Public Key.");
        } else {
            reset();
            this.dsa.init(z11, cipherParameters);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.digest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            h2.b("DSADigestSigner not initialised for verification");
            return false;
        }
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrDecode = this.encoding.decode(getOrder(), bArr);
            return this.dsa.verifySignature(bArr2, bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }

    public DSADigestSigner(DSAExt dSAExt, Digest digest, DSAEncoding dSAEncoding) {
        this.dsa = dSAExt;
        this.digest = digest;
        this.encoding = dSAEncoding;
    }
}
