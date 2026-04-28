package org.bouncycastle.crypto.generators;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f33146a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33147h;
    private byte[] ios;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f33148k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f33147h = macSize;
        this.f33146a = new byte[macSize];
        this.f33148k = new byte[macSize];
    }

    private void generateNext() {
        int i11 = this.generatedBytes;
        Mac mac = this.prf;
        if (i11 == 0) {
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f33146a, 0);
        } else {
            byte[] bArr2 = this.f33146a;
            mac.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f33146a, 0);
        }
        Mac mac2 = this.prf;
        byte[] bArr3 = this.f33146a;
        mac2.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i12 = (this.generatedBytes / this.f33147h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            h2.b("Unsupported size of counter i");
                            return;
                        }
                        bArr4[0] = (byte) (i12 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i12 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i12 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i12;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac3 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac3.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f33148k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        if (i14 < 0 || i14 >= this.maxSizeExcl) {
            i1.t(k.i(this.maxSizeExcl, " bytes", new StringBuilder("Current KDFCTR may only be used for ")));
            return 0;
        }
        if (i13 % this.f33147h == 0) {
            generateNext();
        }
        int i15 = this.generatedBytes;
        int i16 = this.f33147h;
        int i17 = i15 % i16;
        int iMin = Math.min(i16 - (i15 % i16), i12);
        System.arraycopy(this.f33148k, i17, bArr, i11, iMin);
        this.generatedBytes += iMin;
        int i18 = i12 - iMin;
        while (true) {
            i11 += iMin;
            if (i18 <= 0) {
                return i12;
            }
            generateNext();
            iMin = Math.min(this.f33147h, i18);
            System.arraycopy(this.f33148k, 0, bArr, i11, iMin);
            this.generatedBytes += iMin;
            i18 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            a.f("Wrong type of arguments given");
            return;
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r11 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r11 / 8];
        int iIntValue = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r11).multiply(BigInteger.valueOf(this.f33147h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
        }
        this.maxSizeExcl = iIntValue;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
