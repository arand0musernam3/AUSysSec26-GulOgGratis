package o00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static final l0 zza;
    public static final l0 zzb;
    public static final l0 zzc;
    public static final l0 zzd;
    public static final l0 zze;
    private static final /* synthetic */ l0[] zzf;

    static {
        l0 l0Var = new l0("SMALL", 0);
        zza = l0Var;
        l0 l0Var2 = new l0("MEDIUM", 1);
        zzb = l0Var2;
        l0 l0Var3 = new l0("LARGE", 2);
        zzc = l0Var3;
        l0 l0Var4 = new l0("FULL", 3);
        zzd = l0Var4;
        l0 l0Var5 = new l0("NONE", 4);
        zze = l0Var5;
        zzf = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5};
    }

    public static l0[] values() {
        return (l0[]) zzf.clone();
    }
}
