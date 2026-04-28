package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final x zza;
    public static final x zzb;
    public static final x zzc;
    public static final x zzd;
    private static final /* synthetic */ x[] zze;

    static {
        x xVar = new x("BOOLEAN", 0);
        zza = xVar;
        x xVar2 = new x("STRING", 1);
        zzb = xVar2;
        x xVar3 = new x("LONG", 2);
        zzc = xVar3;
        x xVar4 = new x("DOUBLE", 3);
        zzd = xVar4;
        zze = new x[]{xVar, xVar2, xVar3, xVar4};
    }

    public static /* synthetic */ x a(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        i4.a.d("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }

    public static x[] values() {
        return (x[]) zze.clone();
    }
}
