package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;

/* JADX INFO: loaded from: classes3.dex */
final class WOTSPlusPublicKeyParameters {
    private final byte[][] publicKey;

    public WOTSPlusPublicKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            w.l("params == null");
            throw null;
        }
        if (bArr == null) {
            w.l("publicKey == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            w.l("publicKey byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            a.f("wrong publicKey size");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                a.f("wrong publicKey format");
                throw null;
            }
        }
        this.publicKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.publicKey);
    }
}
