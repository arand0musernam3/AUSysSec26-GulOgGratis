package wr;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BUSINESS;
    public static final h CONSUMER;

    @NotNull
    private final b[] reasons;

    static {
        b bVar = b.NO_SELECTION;
        h hVar = new h("CONSUMER", 0, bVar, b.BAD_ORDER_EXPERIENCE, b.APP_QUESTION, b.STORE_SUGGESTION, b.CONSUMER_GENERAL_QUESTION, b.COMPLIMENT);
        CONSUMER = hVar;
        h hVar2 = new h("BUSINESS", 1, bVar, b.MY_STORE, b.PACKAGING, b.INVOICES, b.BUSINESS_GENERAL_QUESTION);
        BUSINESS = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public h(String str, int i11, b... bVarArr) {
        this.reasons = bVarArr;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final b[] a() {
        return this.reasons;
    }
}
