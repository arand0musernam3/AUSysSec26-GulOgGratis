package q90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;

    @NotNull
    public static final e0 Companion;
    public static final f0 H2_PRIOR_KNOWLEDGE;
    public static final f0 HTTP_1_0;
    public static final f0 HTTP_1_1;
    public static final f0 HTTP_2;
    public static final f0 HTTP_3;
    public static final f0 QUIC;

    @u70.d
    public static final f0 SPDY_3;

    @NotNull
    private final String protocol;

    static {
        f0 f0Var = new f0("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = f0Var;
        f0 f0Var2 = new f0("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = f0Var2;
        f0 f0Var3 = new f0("SPDY_3", 2, "spdy/3.1");
        SPDY_3 = f0Var3;
        f0 f0Var4 = new f0("HTTP_2", 3, "h2");
        HTTP_2 = f0Var4;
        f0 f0Var5 = new f0("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        H2_PRIOR_KNOWLEDGE = f0Var5;
        f0 f0Var6 = new f0("QUIC", 5, "quic");
        QUIC = f0Var6;
        f0 f0Var7 = new f0("HTTP_3", 6, "h3");
        HTTP_3 = f0Var7;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7};
        $VALUES = f0VarArr;
        $ENTRIES = new a80.b(f0VarArr);
        Companion = new e0();
    }

    public f0(String str, int i11, String str2) {
        this.protocol = str2;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
