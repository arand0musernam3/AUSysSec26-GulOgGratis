package jl;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h WHAT_BRINGS_YOU_HERE;
    public static final h WHEN_DO_YOU_PREFER_TO_COLLECT;

    @NotNull
    private final String value;

    static {
        h hVar = new h("WHAT_BRINGS_YOU_HERE", 0, "what_brings_you_here");
        WHAT_BRINGS_YOU_HERE = hVar;
        h hVar2 = new h("WHEN_DO_YOU_PREFER_TO_COLLECT", 1, "when_do_you_prefer_to_collect");
        WHEN_DO_YOU_PREFER_TO_COLLECT = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public h(String str, int i11, String str2) {
        this.value = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
