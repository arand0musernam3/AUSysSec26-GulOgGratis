package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum ah {
    SMALL(10),
    MEDIUM(20),
    LARGE(50),
    FULL(-1),
    NONE(0);

    private final int zzf;

    ah(int i11) {
        this.zzf = i11;
    }

    public final int a() {
        return this.zzf;
    }
}
