package p20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c BOTH;
    public static final c LEFT;
    public static final c NONE;
    public static final c RIGHT;

    static {
        c cVar = new c("BOTH", 0);
        BOTH = cVar;
        c cVar2 = new c("LEFT", 1);
        LEFT = cVar2;
        c cVar3 = new c("RIGHT", 2);
        RIGHT = cVar3;
        c cVar4 = new c("NONE", 3);
        NONE = cVar4;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
