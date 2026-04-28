package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p EAGER_FLUSHING_EVENT;
    public static final p EVENT_THRESHOLD;
    public static final p EXPLICIT;
    public static final p PERSISTED_EVENTS;
    public static final p SESSION_CHANGE;
    public static final p TIMER;

    static {
        p pVar = new p("EXPLICIT", 0);
        EXPLICIT = pVar;
        p pVar2 = new p("TIMER", 1);
        TIMER = pVar2;
        p pVar3 = new p("SESSION_CHANGE", 2);
        SESSION_CHANGE = pVar3;
        p pVar4 = new p("PERSISTED_EVENTS", 3);
        PERSISTED_EVENTS = pVar4;
        p pVar5 = new p("EVENT_THRESHOLD", 4);
        EVENT_THRESHOLD = pVar5;
        p pVar6 = new p("EAGER_FLUSHING_EVENT", 5);
        EAGER_FLUSHING_EVENT = pVar6;
        $VALUES = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
