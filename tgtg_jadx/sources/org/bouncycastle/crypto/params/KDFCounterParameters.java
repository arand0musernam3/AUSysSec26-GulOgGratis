package org.bouncycastle.crypto.params;

import i4.a;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class KDFCounterParameters implements DerivationParameters {
    private byte[] fixedInputDataCounterPrefix;
    private byte[] fixedInputDataCounterSuffix;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private byte[] f33244ki;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33245r;

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        if (bArr == null) {
            a.f("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f33244ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputDataCounterPrefix = new byte[0];
        } else {
            this.fixedInputDataCounterPrefix = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.fixedInputDataCounterSuffix = new byte[0];
        } else {
            this.fixedInputDataCounterSuffix = Arrays.clone(bArr3);
        }
        if (i11 == 8 || i11 == 16 || i11 == 24 || i11 == 32) {
            this.f33245r = i11;
        } else {
            a.f("Length of counter should be 8, 16, 24 or 32");
            throw null;
        }
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getFixedInputDataCounterPrefix() {
        return Arrays.clone(this.fixedInputDataCounterPrefix);
    }

    public byte[] getFixedInputDataCounterSuffix() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getKI() {
        return this.f33244ki;
    }

    public int getR() {
        return this.f33245r;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i11) {
        this(bArr, null, bArr2, i11);
    }
}
