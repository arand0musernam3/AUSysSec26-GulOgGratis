package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;
    private final int l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33220n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i11, int i12, int i13, SecureRandom secureRandom, int i14) {
        this.l = i11;
        this.f33220n = i12;
        this.certainty = i13;
        this.usageIndex = i14;
        this.random = secureRandom;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.l;
    }

    public int getN() {
        return this.f33220n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i11, int i12, int i13, SecureRandom secureRandom) {
        this(i11, i12, i13, secureRandom, -1);
    }
}
