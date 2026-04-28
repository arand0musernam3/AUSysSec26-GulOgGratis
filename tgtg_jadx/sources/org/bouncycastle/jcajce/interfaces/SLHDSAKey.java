package org.bouncycastle.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.jcajce.spec.SLHDSAParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public interface SLHDSAKey extends Key {
    SLHDSAParameterSpec getParameterSpec();
}
