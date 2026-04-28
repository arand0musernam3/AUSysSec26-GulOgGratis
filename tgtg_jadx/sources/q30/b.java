package q30;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NonNull
    public static final b AD_PERSONALIZATION;

    @NonNull
    public static final b AD_STORAGE;

    @NonNull
    public static final b AD_USER_DATA;

    @NonNull
    public static final b ANALYTICS_STORAGE;
    private static final /* synthetic */ b[] zza;

    static {
        b bVar = new b("AD_STORAGE", 0);
        AD_STORAGE = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        ANALYTICS_STORAGE = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        AD_USER_DATA = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        AD_PERSONALIZATION = bVar4;
        zza = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    @NonNull
    public static b valueOf(@NonNull String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    @NonNull
    public static b[] values() {
        return (b[]) zza.clone();
    }
}
