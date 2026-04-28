package co.datadome.sdk;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f8703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ r[] f8704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a80.a f8705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f8706d = "co.datadome.sdk.advanced_signals_collection";

    static {
        r rVar = new r();
        f8703a = rVar;
        r[] rVarArr = {rVar};
        f8704b = rVarArr;
        f8705c = new a80.b(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f8704b.clone();
    }

    public final String a() {
        return this.f8706d;
    }
}
