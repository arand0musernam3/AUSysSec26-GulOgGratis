package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public interface MLDSAPrivateKey extends PrivateKey, MLDSAKey {
    byte[] getPrivateData();

    MLDSAPrivateKey getPrivateKey(boolean z11);

    MLDSAPublicKey getPublicKey();

    byte[] getSeed();
}
