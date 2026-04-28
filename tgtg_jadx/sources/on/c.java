package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BEIGE;
    public static final c BLUE;
    public static final c GREEN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f32693id;

    static {
        c cVar = new c("BLUE", 0, 1);
        BLUE = cVar;
        c cVar2 = new c("GREEN", 1, 2);
        GREEN = cVar2;
        c cVar3 = new c("BEIGE", 2, 3);
        BEIGE = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public c(String str, int i11, int i12) {
        this.f32693id = i12;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int a() {
        return this.f32693id;
    }
}
