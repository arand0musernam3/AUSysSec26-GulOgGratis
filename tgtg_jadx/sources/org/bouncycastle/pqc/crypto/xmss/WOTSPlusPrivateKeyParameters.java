package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;

/* JADX INFO: loaded from: classes3.dex */
final class WOTSPlusPrivateKeyParameters {
    private final byte[][] privateKey;

    public WOTSPlusPrivateKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            w.l("params == null");
            throw null;
        }
        if (bArr == null) {
            w.l("privateKey == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            w.l("privateKey byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            a.f("wrong privateKey format");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                a.f("wrong privateKey format");
                throw null;
            }
        }
        this.privateKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.privateKey);
    }
}
