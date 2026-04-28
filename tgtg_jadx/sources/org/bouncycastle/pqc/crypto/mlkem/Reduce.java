package org.bouncycastle.pqc.crypto.mlkem;

/* JADX INFO: loaded from: classes3.dex */
class Reduce {
    public static short barretReduce(short s7) {
        return (short) (s7 - ((short) (((short) ((((short) 20159) * s7) >> 26)) * 3329)));
    }

    public static short conditionalSubQ(short s7) {
        short s8 = (short) (s7 - 3329);
        return (short) (s8 + ((s8 >> 15) & MLKEMEngine.KyberQ));
    }

    public static short montgomeryReduce(int i11) {
        return (short) ((i11 - (((short) (MLKEMEngine.KyberQinv * i11)) * 3329)) >> 16);
    }
}
