package gy;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c V_1;
    public static final c V_2;
    public static final c V_3;
    public static final c V_4;
    public static final c V_5;
    public static final c V_6;
    private final int intValue;

    static {
        c cVar = new c("V_1", 0, 1);
        V_1 = cVar;
        c cVar2 = new c("V_2", 1, 2);
        V_2 = cVar2;
        c cVar3 = new c("V_3", 2, 3);
        V_3 = cVar3;
        c cVar4 = new c("V_4", 3, 4);
        V_4 = cVar4;
        c cVar5 = new c("V_5", 4, 5);
        V_5 = cVar5;
        c cVar6 = new c("V_6", 5, 6);
        V_6 = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
        Companion = new b();
    }

    public c(String str, int i11, int i12) {
        this.intValue = i12;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
