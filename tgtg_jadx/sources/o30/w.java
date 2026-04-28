package o30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w ALL_INPUT_FUTURES_PROCESSED;
    public static final w OUTPUT_FUTURE_DONE;

    static {
        w wVar = new w("OUTPUT_FUTURE_DONE", 0);
        OUTPUT_FUTURE_DONE = wVar;
        w wVar2 = new w("ALL_INPUT_FUTURES_PROCESSED", 1);
        ALL_INPUT_FUTURES_PROCESSED = wVar2;
        $VALUES = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
