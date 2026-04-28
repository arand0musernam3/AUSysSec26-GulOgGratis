package org.bouncycastle.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public interface MLDSAKey extends Key {
    MLDSAParameterSpec getParameterSpec();
}
