package u50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d FNC_1;
    public static final d ONE_DIGIT;
    public static final d TWO_DIGITS;
    public static final d UNCODABLE;

    static {
        d dVar = new d("UNCODABLE", 0);
        UNCODABLE = dVar;
        d dVar2 = new d("ONE_DIGIT", 1);
        ONE_DIGIT = dVar2;
        d dVar3 = new d("TWO_DIGITS", 2);
        TWO_DIGITS = dVar3;
        d dVar4 = new d("FNC_1", 3);
        FNC_1 = dVar4;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
