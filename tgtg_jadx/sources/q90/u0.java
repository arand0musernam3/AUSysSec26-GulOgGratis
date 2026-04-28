package q90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;

    @NotNull
    public static final t0 Companion;
    public static final u0 SSL_3_0;
    public static final u0 TLS_1_0;
    public static final u0 TLS_1_1;
    public static final u0 TLS_1_2;
    public static final u0 TLS_1_3;

    @NotNull
    private final String javaName;

    static {
        u0 u0Var = new u0("TLS_1_3", 0, "TLSv1.3");
        TLS_1_3 = u0Var;
        u0 u0Var2 = new u0("TLS_1_2", 1, "TLSv1.2");
        TLS_1_2 = u0Var2;
        u0 u0Var3 = new u0("TLS_1_1", 2, "TLSv1.1");
        TLS_1_1 = u0Var3;
        u0 u0Var4 = new u0("TLS_1_0", 3, "TLSv1");
        TLS_1_0 = u0Var4;
        u0 u0Var5 = new u0("SSL_3_0", 4, "SSLv3");
        SSL_3_0 = u0Var5;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5};
        $VALUES = u0VarArr;
        $ENTRIES = new a80.b(u0VarArr);
        Companion = new t0();
    }

    public u0(String str, int i11, String str2) {
        this.javaName = str2;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final String a() {
        return this.javaName;
    }
}
