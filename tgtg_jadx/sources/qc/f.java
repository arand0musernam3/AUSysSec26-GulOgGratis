package qc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DISK;
    public static final f MEMORY;
    public static final f MEMORY_CACHE;
    public static final f NETWORK;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        MEMORY_CACHE = fVar;
        f fVar2 = new f("MEMORY", 1);
        MEMORY = fVar2;
        f fVar3 = new f("DISK", 2);
        DISK = fVar3;
        f fVar4 = new f("NETWORK", 3);
        NETWORK = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
