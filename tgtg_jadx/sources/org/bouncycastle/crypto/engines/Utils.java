package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    public static CryptoServicePurpose getPurpose(boolean z11) {
        return z11 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
