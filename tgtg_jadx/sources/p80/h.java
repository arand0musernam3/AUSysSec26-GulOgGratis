package p80;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DAYS;
    public static final h HOURS;
    public static final h MICROSECONDS;
    public static final h MILLISECONDS;
    public static final h MINUTES;
    public static final h NANOSECONDS;
    public static final h SECONDS;

    @NotNull
    private final TimeUnit timeUnit;

    static {
        h hVar = new h("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        NANOSECONDS = hVar;
        h hVar2 = new h("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MICROSECONDS = hVar2;
        h hVar3 = new h("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        MILLISECONDS = hVar3;
        h hVar4 = new h("SECONDS", 3, TimeUnit.SECONDS);
        SECONDS = hVar4;
        h hVar5 = new h("MINUTES", 4, TimeUnit.MINUTES);
        MINUTES = hVar5;
        h hVar6 = new h("HOURS", 5, TimeUnit.HOURS);
        HOURS = hVar6;
        h hVar7 = new h("DAYS", 6, TimeUnit.DAYS);
        DAYS = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public h(String str, int i11, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final TimeUnit a() {
        return this.timeUnit;
    }
}
