package org.bouncycastle.crypto.params;

import i4.a;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final byte[] f33246ki;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f33247r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i11, boolean z11) {
        if (bArr == null) {
            a.f("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f33246ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr2);
        }
        if (i11 != 8 && i11 != 16 && i11 != 24 && i11 != 32) {
            a.f("Length of counter should be 8, 16, 24 or 32");
            throw null;
        }
        this.f33247r = i11;
        this.useCounter = z11;
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i11) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i11, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getKI() {
        return this.f33246ki;
    }

    public int getR() {
        return this.f33247r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
