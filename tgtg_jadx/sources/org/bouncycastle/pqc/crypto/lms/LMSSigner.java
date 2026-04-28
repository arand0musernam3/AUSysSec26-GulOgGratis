package org.bouncycastle.pqc.crypto.lms;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* JADX INFO: loaded from: classes3.dex */
public class LMSSigner implements MessageSigner {
    private LMSPrivateKeyParameters privKey;
    private LMSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return LMS.generateSign(this.privKey, bArr).getEncoded();
        } catch (IOException e5) {
            h2.b(s.g(e5, new StringBuilder("unable to encode signature: ")));
            return null;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            if (!(cipherParameters instanceof HSSPrivateKeyParameters)) {
                this.privKey = (LMSPrivateKeyParameters) cipherParameters;
                return;
            }
            HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) cipherParameters;
            if (hSSPrivateKeyParameters.getL() == 1) {
                this.privKey = hSSPrivateKeyParameters.getRootKey();
                return;
            } else {
                a.f("only a single level HSS key can be used with LMS");
                return;
            }
        }
        if (!(cipherParameters instanceof HSSPublicKeyParameters)) {
            this.pubKey = (LMSPublicKeyParameters) cipherParameters;
            return;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) cipherParameters;
        if (hSSPublicKeyParameters.getL() == 1) {
            this.pubKey = hSSPublicKeyParameters.getLMSPublicKey();
        } else {
            a.f("only a single level HSS key can be used with LMS");
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return LMS.verifySignature(this.pubKey, LMSSignature.getInstance(bArr2), bArr);
        } catch (IOException e5) {
            h2.b(s.g(e5, new StringBuilder("unable to decode signature: ")));
            return false;
        }
    }
}
