package org.bouncycastle.crypto.agreement;

import c50.w;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public final class BasicRawAgreement implements RawAgreement {
    public final BasicAgreement basicAgreement;

    public BasicRawAgreement(BasicAgreement basicAgreement) {
        if (basicAgreement != null) {
            this.basicAgreement = basicAgreement;
        } else {
            w.l("'basicAgreement' cannot be null");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i11) {
        BigIntegers.asUnsignedByteArray(this.basicAgreement.calculateAgreement(cipherParameters), bArr, i11, getAgreementSize());
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return this.basicAgreement.getFieldSize();
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        this.basicAgreement.init(cipherParameters);
    }
}
