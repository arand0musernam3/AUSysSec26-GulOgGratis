package t00;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    @NonNull
    public static final d LATEST;

    @NonNull
    @Deprecated
    public static final d LEGACY;
    private static final /* synthetic */ d[] zza;

    static {
        d dVar = new d("LEGACY", 0);
        LEGACY = dVar;
        d dVar2 = new d("LATEST", 1);
        LATEST = dVar2;
        zza = new d[]{dVar, dVar2};
    }

    @NonNull
    public static d valueOf(@NonNull String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    @NonNull
    public static d[] values() {
        return (d[]) zza.clone();
    }
}
