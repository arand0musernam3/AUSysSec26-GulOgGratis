package q30;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    @NonNull
    public static final a DENIED;

    @NonNull
    public static final a GRANTED;
    private static final /* synthetic */ a[] zza;

    static {
        a aVar = new a("GRANTED", 0);
        GRANTED = aVar;
        a aVar2 = new a("DENIED", 1);
        DENIED = aVar2;
        zza = new a[]{aVar, aVar2};
    }

    @NonNull
    public static a valueOf(@NonNull String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    @NonNull
    public static a[] values() {
        return (a[]) zza.clone();
    }
}
