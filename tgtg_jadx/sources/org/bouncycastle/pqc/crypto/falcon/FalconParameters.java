package org.bouncycastle.pqc.crypto.falcon;

import i4.a;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class FalconParameters implements CipherParameters {
    private final int logn;
    private final String name;
    private final int nonce_length;
    public static final FalconParameters falcon_512 = new FalconParameters("falcon-512", 9, 40);
    public static final FalconParameters falcon_1024 = new FalconParameters("falcon-1024", 10, 40);

    private FalconParameters(String str, int i11, int i12) {
        if (i11 < 1 || i11 > 10) {
            a.f("Log N degree should be between 1 and 10");
            throw null;
        }
        this.name = str;
        this.logn = i11;
        this.nonce_length = i12;
    }

    public int getLogN() {
        return this.logn;
    }

    public String getName() {
        return this.name;
    }

    public int getNonceLength() {
        return this.nonce_length;
    }
}
