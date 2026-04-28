package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z LookaheadMeasurement;
    public static final z LookaheadPlacement;
    public static final z Measurement;
    public static final z Placement;

    static {
        z zVar = new z("LookaheadMeasurement", 0);
        LookaheadMeasurement = zVar;
        z zVar2 = new z("LookaheadPlacement", 1);
        LookaheadPlacement = zVar2;
        z zVar3 = new z("Measurement", 2);
        Measurement = zVar3;
        z zVar4 = new z("Placement", 3);
        Placement = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        $VALUES = zVarArr;
        $ENTRIES = new a80.b(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
