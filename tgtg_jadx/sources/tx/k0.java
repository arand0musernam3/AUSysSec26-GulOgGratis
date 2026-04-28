package tx;

import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum k0 {
    None("None"),
    Enabled("Enabled"),
    RequireConfirm("RequireConfirm");


    @NotNull
    private static final EnumSet<k0> ALL;

    @NotNull
    public static final j0 Companion = new j0();
    private final long value;

    static {
        EnumSet<k0> enumSetAllOf = EnumSet.allOf(k0.class);
        enumSetAllOf.getClass();
        ALL = enumSetAllOf;
    }

    k0(String str) {
        this.value = j;
    }

    public final long c() {
        return this.value;
    }
}
