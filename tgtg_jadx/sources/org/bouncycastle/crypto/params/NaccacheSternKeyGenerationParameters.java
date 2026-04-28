package org.bouncycastle.crypto.params;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i11, int i12, int i13, boolean z11) {
        super(secureRandom, i11);
        this.debug = false;
        this.certainty = i12;
        if (i13 % 2 == 1) {
            a.f("cntSmallPrimes must be a multiple of 2");
            throw null;
        }
        if (i13 < 30) {
            a.f("cntSmallPrimes must be >= 30 for security reasons");
            throw null;
        }
        this.cntSmallPrimes = i13;
        this.debug = z11;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getCntSmallPrimes() {
        return this.cntSmallPrimes;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i11, int i12, int i13) {
        this(secureRandom, i11, i12, i13, false);
    }
}
