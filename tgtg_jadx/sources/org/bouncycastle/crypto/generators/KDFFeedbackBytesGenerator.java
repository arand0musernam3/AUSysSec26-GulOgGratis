package org.bouncycastle.crypto.generators;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFFeedbackParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33149h;
    private byte[] ios;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33150iv;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f33151k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f33149h = macSize;
        this.f33151k = new byte[macSize];
    }

    private void generateNext() {
        int i11 = this.generatedBytes;
        Mac mac = this.prf;
        if (i11 == 0) {
            byte[] bArr = this.f33150iv;
            mac.update(bArr, 0, bArr.length);
        } else {
            byte[] bArr2 = this.f33151k;
            mac.update(bArr2, 0, bArr2.length);
        }
        if (this.useCounter) {
            int i12 = (this.generatedBytes / this.f33149h) + 1;
            byte[] bArr3 = this.ios;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            h2.b("Unsupported size of counter i");
                            return;
                        }
                        bArr3[0] = (byte) (i12 >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i12 >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i12 >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i12;
            this.prf.update(bArr3, 0, bArr3.length);
        }
        Mac mac2 = this.prf;
        byte[] bArr4 = this.fixedInputData;
        mac2.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f33151k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        if (i14 < 0 || i14 >= this.maxSizeExcl) {
            i1.t(k.i(this.maxSizeExcl, " bytes", new StringBuilder("Current KDFCTR may only be used for ")));
            return 0;
        }
        if (i13 % this.f33149h == 0) {
            generateNext();
        }
        int i15 = this.generatedBytes;
        int i16 = this.f33149h;
        int i17 = i15 % i16;
        int iMin = Math.min(i16 - (i15 % i16), i12);
        System.arraycopy(this.f33151k, i17, bArr, i11, iMin);
        this.generatedBytes += iMin;
        int i18 = i12 - iMin;
        while (true) {
            i11 += iMin;
            if (i18 <= 0) {
                return i12;
            }
            generateNext();
            iMin = Math.min(this.f33149h, i18);
            System.arraycopy(this.f33151k, 0, bArr, i11, iMin);
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
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            a.f("Wrong type of arguments given");
            return;
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.fixedInputData = kDFFeedbackParameters.getFixedInputData();
        int r11 = kDFFeedbackParameters.getR();
        this.ios = new byte[r11 / 8];
        int iIntValue = Integer.MAX_VALUE;
        if (kDFFeedbackParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r11).multiply(BigInteger.valueOf(this.f33149h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
        }
        this.maxSizeExcl = iIntValue;
        this.f33150iv = kDFFeedbackParameters.getIV();
        this.useCounter = kDFFeedbackParameters.useCounter();
        this.generatedBytes = 0;
    }
}
