package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
class MapGroup2 {
    public final byte[][][][] f11;
    public final byte[][][][] f12;
    public final byte[][][][] f21;

    public MapGroup2(SnovaParameters snovaParameters) {
        int m11 = snovaParameters.getM();
        int v3 = snovaParameters.getV();
        int o11 = snovaParameters.getO();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.f11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, v3, v3, lsq);
        this.f12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, v3, o11, lsq);
        this.f21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m11, o11, v3, lsq);
    }
}
