package o00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 {
    public static final q1 zza;
    public static final q1 zzb;
    public static final q1 zzc;
    private static final /* synthetic */ q1[] zzd;

    static {
        q1 q1Var = new q1("LOW_POWER", 0);
        zza = q1Var;
        q1 q1Var2 = new q1("HIGH_SPEED", 1);
        zzb = q1Var2;
        q1 q1Var3 = new q1("INTERACTIVE", 2);
        zzc = q1Var3;
        zzd = new q1[]{q1Var, q1Var2, q1Var3};
    }

    public static q1[] values() {
        return (q1[]) zzd.clone();
    }
}
