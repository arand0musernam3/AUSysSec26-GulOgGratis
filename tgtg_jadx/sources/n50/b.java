package n50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b AZTEC_LAYERS;
    public static final b CHARACTER_SET;
    public static final b DATA_MATRIX_SHAPE;
    public static final b ERROR_CORRECTION;
    public static final b GS1_FORMAT;
    public static final b MARGIN;

    @Deprecated
    public static final b MAX_SIZE;

    @Deprecated
    public static final b MIN_SIZE;
    public static final b PDF417_COMPACT;
    public static final b PDF417_COMPACTION;
    public static final b PDF417_DIMENSIONS;
    public static final b QR_VERSION;

    static {
        b bVar = new b("ERROR_CORRECTION", 0);
        ERROR_CORRECTION = bVar;
        b bVar2 = new b("CHARACTER_SET", 1);
        CHARACTER_SET = bVar2;
        b bVar3 = new b("DATA_MATRIX_SHAPE", 2);
        DATA_MATRIX_SHAPE = bVar3;
        b bVar4 = new b("MIN_SIZE", 3);
        MIN_SIZE = bVar4;
        b bVar5 = new b("MAX_SIZE", 4);
        MAX_SIZE = bVar5;
        b bVar6 = new b("MARGIN", 5);
        MARGIN = bVar6;
        b bVar7 = new b("PDF417_COMPACT", 6);
        PDF417_COMPACT = bVar7;
        b bVar8 = new b("PDF417_COMPACTION", 7);
        PDF417_COMPACTION = bVar8;
        b bVar9 = new b("PDF417_DIMENSIONS", 8);
        PDF417_DIMENSIONS = bVar9;
        b bVar10 = new b("AZTEC_LAYERS", 9);
        AZTEC_LAYERS = bVar10;
        b bVar11 = new b("QR_VERSION", 10);
        QR_VERSION = bVar11;
        b bVar12 = new b("GS1_FORMAT", 11);
        GS1_FORMAT = bVar12;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
