package im;

import h8.e;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c IS_CHARITY_LOGIN;

    @NotNull
    private final e value;

    static {
        c cVar = new c(new e("isCharityLogin"));
        IS_CHARITY_LOGIN = cVar;
        c[] cVarArr = {cVar};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public c(e eVar) {
        this.value = eVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final e a() {
        return this.value;
    }
}
