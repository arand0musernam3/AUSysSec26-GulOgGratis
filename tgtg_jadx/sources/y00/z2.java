package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum z2 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    z2(int i11) {
        this.zzg = i11;
    }

    public static z2 c(int i11) {
        for (z2 z2Var : values()) {
            if (z2Var.zzg == i11) {
                return z2Var;
            }
        }
        return UNKNOWN;
    }

    public final int a() {
        return this.zzg;
    }
}
