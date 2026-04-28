package y00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w3 {
    public static final w3 zza;
    public static final w3 zzb;
    public static final w3 zzc;
    public static final w3 zzd;
    private static final /* synthetic */ w3[] zze;

    static {
        w3 w3Var = new w3("CONSENT", 0);
        zza = w3Var;
        w3 w3Var2 = new w3("LEGITIMATE_INTEREST", 1);
        zzb = w3Var2;
        w3 w3Var3 = new w3("FLEXIBLE_CONSENT", 2);
        zzc = w3Var3;
        w3 w3Var4 = new w3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        zzd = w3Var4;
        zze = new w3[]{w3Var, w3Var2, w3Var3, w3Var4};
    }

    public static w3[] values() {
        return (w3[]) zze.clone();
    }
}
