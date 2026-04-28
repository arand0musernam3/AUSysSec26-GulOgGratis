package i40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IGNORE_CACHE_EXPIRATION;
    public static final c SKIP_CACHE_LOOKUP;
    public static final c USE_CACHE;

    static {
        c cVar = new c("USE_CACHE", 0);
        USE_CACHE = cVar;
        c cVar2 = new c("SKIP_CACHE_LOOKUP", 1);
        SKIP_CACHE_LOOKUP = cVar2;
        c cVar3 = new c("IGNORE_CACHE_EXPIRATION", 2);
        IGNORE_CACHE_EXPIRATION = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
