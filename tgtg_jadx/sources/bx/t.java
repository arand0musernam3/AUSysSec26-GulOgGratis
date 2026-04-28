package bx;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t IAPParameters;

    @NotNull
    private final String value = "iap_parameters";

    static {
        t tVar = new t();
        IAPParameters = tVar;
        $VALUES = new t[]{tVar};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
