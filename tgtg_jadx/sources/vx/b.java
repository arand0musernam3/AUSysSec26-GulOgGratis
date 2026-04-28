package vx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Analysis;
    public static final b AnrReport;
    public static final b CrashReport;
    public static final b CrashShield;
    public static final b ThreadCheck;
    public static final b Unknown;

    static {
        b bVar = new b("Unknown", 0);
        Unknown = bVar;
        b bVar2 = new b("Analysis", 1);
        Analysis = bVar2;
        b bVar3 = new b("AnrReport", 2);
        AnrReport = bVar3;
        b bVar4 = new b("CrashReport", 3);
        CrashReport = bVar4;
        b bVar5 = new b("CrashShield", 4);
        CrashShield = bVar5;
        b bVar6 = new b("ThreadCheck", 5);
        ThreadCheck = bVar6;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i11 = a.$EnumSwitchMapping$0[ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
    }
}
