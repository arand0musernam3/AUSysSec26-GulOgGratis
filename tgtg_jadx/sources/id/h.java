package id;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DISK;
    public static final h MEMORY;
    public static final h MEMORY_CACHE;
    public static final h NETWORK;

    static {
        h hVar = new h("MEMORY_CACHE", 0);
        MEMORY_CACHE = hVar;
        h hVar2 = new h("MEMORY", 1);
        MEMORY = hVar2;
        h hVar3 = new h("DISK", 2);
        DISK = hVar3;
        h hVar4 = new h("NETWORK", 3);
        NETWORK = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
