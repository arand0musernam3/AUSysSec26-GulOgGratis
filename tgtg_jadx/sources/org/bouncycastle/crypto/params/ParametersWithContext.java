package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ParametersWithContext implements CipherParameters {
    private byte[] context;
    private CipherParameters parameters;

    public ParametersWithContext(CipherParameters cipherParameters, byte[] bArr) {
        if (bArr == null) {
            w.l("'context' cannot be null");
            throw null;
        }
        this.parameters = cipherParameters;
        this.context = Arrays.clone(bArr);
    }

    public void copyContextTo(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.context;
        if (bArr2.length == i12) {
            System.arraycopy(bArr2, 0, bArr, i11, i12);
        } else {
            a.f("len");
        }
    }

    public byte[] getContext() {
        return Arrays.clone(this.context);
    }

    public int getContextLength() {
        return this.context.length;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
