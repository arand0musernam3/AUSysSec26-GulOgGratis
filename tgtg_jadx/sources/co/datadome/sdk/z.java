package co.datadome.sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f8726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f8727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ z[] f8728c;

    static {
        z zVar = new z("OKHTTP", 0);
        f8726a = zVar;
        z zVar2 = new z("MANUAL", 1);
        f8727b = zVar2;
        f8728c = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f8728c.clone();
    }
}
