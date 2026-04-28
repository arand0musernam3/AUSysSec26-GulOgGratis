package org.bouncycastle.pqc.crypto.rainbow;

import i4.a;
import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {
    short[][][] l1_Q3;
    short[][][] l1_Q5;
    short[][][] l1_Q6;
    short[][][] l1_Q9;
    short[][][] l2_Q9;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    short[][][] f33587pk;
    byte[] pk_seed;

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr) {
        super(false, rainbowParameters);
        int m11 = rainbowParameters.getM();
        int n11 = rainbowParameters.getN();
        Version version = getParameters().getVersion();
        Version version2 = Version.CLASSIC;
        Class cls = Short.TYPE;
        if (version != version2) {
            this.pk_seed = Arrays.copyOfRange(bArr, 0, rainbowParameters.getLen_pkseed());
            this.l1_Q3 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getV1(), rainbowParameters.getO2());
            this.l1_Q5 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO1());
            this.l1_Q6 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO2());
            this.l1_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO2(), rainbowParameters.getO2());
            this.l2_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO2(), rainbowParameters.getO2(), rainbowParameters.getO2());
            int len_pkseed = rainbowParameters.getLen_pkseed();
            int iLoadEncoded = len_pkseed + RainbowUtil.loadEncoded(this.l1_Q3, bArr, len_pkseed, false);
            int iLoadEncoded2 = iLoadEncoded + RainbowUtil.loadEncoded(this.l1_Q5, bArr, iLoadEncoded, true);
            int iLoadEncoded3 = iLoadEncoded2 + RainbowUtil.loadEncoded(this.l1_Q6, bArr, iLoadEncoded2, false);
            int iLoadEncoded4 = iLoadEncoded3 + RainbowUtil.loadEncoded(this.l1_Q9, bArr, iLoadEncoded3, true);
            if (iLoadEncoded4 + RainbowUtil.loadEncoded(this.l2_Q9, bArr, iLoadEncoded4, true) == bArr.length) {
                return;
            }
            a.f("unparsed data in key encoding");
            throw null;
        }
        this.f33587pk = (short[][][]) Array.newInstance((Class<?>) cls, m11, n11, n11);
        int i11 = 0;
        for (int i12 = 0; i12 < n11; i12++) {
            for (int i13 = 0; i13 < n11; i13++) {
                for (int i14 = 0; i14 < m11; i14++) {
                    short[][][] sArr = this.f33587pk;
                    if (i12 > i13) {
                        sArr[i14][i12][i13] = 0;
                    } else {
                        sArr[i14][i12][i13] = (short) (bArr[i11] & 255);
                        i11++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return getParameters().getVersion() != Version.CLASSIC ? Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(this.pk_seed, RainbowUtil.getEncoded(this.l1_Q3, false)), RainbowUtil.getEncoded(this.l1_Q5, true)), RainbowUtil.getEncoded(this.l1_Q6, false)), RainbowUtil.getEncoded(this.l1_Q9, true)), RainbowUtil.getEncoded(this.l2_Q9, true)) : RainbowUtil.getEncoded(this.f33587pk, true);
    }

    public short[][][] getPk() {
        return RainbowUtil.cloneArray(this.f33587pk);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5) {
        super(false, rainbowParameters);
        this.pk_seed = (byte[]) bArr.clone();
        this.l1_Q3 = RainbowUtil.cloneArray(sArr);
        this.l1_Q5 = RainbowUtil.cloneArray(sArr2);
        this.l1_Q6 = RainbowUtil.cloneArray(sArr3);
        this.l1_Q9 = RainbowUtil.cloneArray(sArr4);
        this.l2_Q9 = RainbowUtil.cloneArray(sArr5);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, short[][][] sArr12) {
        super(false, rainbowParameters);
        int v12 = rainbowParameters.getV1();
        int o12 = rainbowParameters.getO1();
        int o22 = rainbowParameters.getO2();
        this.f33587pk = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, rainbowParameters.getM(), rainbowParameters.getN(), rainbowParameters.getN());
        for (int i11 = 0; i11 < o12; i11++) {
            for (int i12 = 0; i12 < v12; i12++) {
                System.arraycopy(sArr[i11][i12], 0, this.f33587pk[i11][i12], 0, v12);
                System.arraycopy(sArr2[i11][i12], 0, this.f33587pk[i11][i12], v12, o12);
                System.arraycopy(sArr3[i11][i12], 0, this.f33587pk[i11][i12], v12 + o12, o22);
            }
            for (int i13 = 0; i13 < o12; i13++) {
                int i14 = i13 + v12;
                System.arraycopy(sArr4[i11][i13], 0, this.f33587pk[i11][i14], v12, o12);
                System.arraycopy(sArr5[i11][i13], 0, this.f33587pk[i11][i14], v12 + o12, o22);
            }
            for (int i15 = 0; i15 < o22; i15++) {
                System.arraycopy(sArr6[i11][i15], 0, this.f33587pk[i11][i15 + v12 + o12], v12 + o12, o22);
            }
        }
        for (int i16 = 0; i16 < o22; i16++) {
            for (int i17 = 0; i17 < v12; i17++) {
                int i18 = i16 + o12;
                System.arraycopy(sArr7[i16][i17], 0, this.f33587pk[i18][i17], 0, v12);
                System.arraycopy(sArr8[i16][i17], 0, this.f33587pk[i18][i17], v12, o12);
                System.arraycopy(sArr9[i16][i17], 0, this.f33587pk[i18][i17], v12 + o12, o22);
            }
            for (int i19 = 0; i19 < o12; i19++) {
                int i21 = i16 + o12;
                int i22 = i19 + v12;
                System.arraycopy(sArr10[i16][i19], 0, this.f33587pk[i21][i22], v12, o12);
                System.arraycopy(sArr11[i16][i19], 0, this.f33587pk[i21][i22], v12 + o12, o22);
            }
            for (int i23 = 0; i23 < o22; i23++) {
                System.arraycopy(sArr12[i16][i23], 0, this.f33587pk[i16 + o12][i23 + v12 + o12], v12 + o12, o22);
            }
        }
    }
}
