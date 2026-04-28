package nf;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e APP_BUILD;
    public static final e APP_VERSION;
    public static final e Events;
    public static final e LAST_EVENT_ID;
    public static final e LAST_EVENT_TIME;
    public static final e OPT_OUT;
    public static final e PREVIOUS_SESSION_ID;
    public static final e REMOTE_CONFIG;
    public static final e REMOTE_CONFIG_TIMESTAMP;

    @NotNull
    private final String rawVal;

    static {
        e eVar = new e("LAST_EVENT_ID", 0, "last_event_id");
        LAST_EVENT_ID = eVar;
        e eVar2 = new e("PREVIOUS_SESSION_ID", 1, "previous_session_id");
        PREVIOUS_SESSION_ID = eVar2;
        e eVar3 = new e("LAST_EVENT_TIME", 2, "last_event_time");
        LAST_EVENT_TIME = eVar3;
        e eVar4 = new e("OPT_OUT", 3, "opt_out");
        OPT_OUT = eVar4;
        e eVar5 = new e("Events", 4, "events");
        Events = eVar5;
        e eVar6 = new e("APP_VERSION", 5, "app_version");
        APP_VERSION = eVar6;
        e eVar7 = new e("APP_BUILD", 6, "app_build");
        APP_BUILD = eVar7;
        e eVar8 = new e("REMOTE_CONFIG", 7, "remote_config");
        REMOTE_CONFIG = eVar8;
        e eVar9 = new e("REMOTE_CONFIG_TIMESTAMP", 8, "remote_config_timestamp");
        REMOTE_CONFIG_TIMESTAMP = eVar9;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public e(String str, int i11, String str2) {
        this.rawVal = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String a() {
        return this.rawVal;
    }
}
