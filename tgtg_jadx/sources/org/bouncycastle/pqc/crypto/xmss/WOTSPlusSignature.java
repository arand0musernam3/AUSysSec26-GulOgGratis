package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import i4.a;

/* JADX INFO: loaded from: classes3.dex */
final class WOTSPlusSignature {
    private byte[][] signature;

    public WOTSPlusSignature(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            w.l("params == null");
            throw null;
        }
        if (bArr == null) {
            w.l("signature == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            w.l("signature byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            a.f("wrong signature size");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                a.f("wrong signature format");
                throw null;
            }
        }
        this.signature = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.signature);
    }
}
