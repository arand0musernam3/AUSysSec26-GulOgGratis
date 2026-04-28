package ye;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private static final Set<e> ALL;
    public static final e APP_LIFECYCLES;

    @NotNull
    public static final d Companion;
    public static final e DEEP_LINKS;
    public static final e ELEMENT_INTERACTIONS;
    public static final e FRUSTRATION_INTERACTIONS;
    public static final e SCREEN_VIEWS;
    public static final e SESSIONS;

    static {
        e eVar = new e("SESSIONS", 0);
        SESSIONS = eVar;
        e eVar2 = new e("APP_LIFECYCLES", 1);
        APP_LIFECYCLES = eVar2;
        e eVar3 = new e("DEEP_LINKS", 2);
        DEEP_LINKS = eVar3;
        e eVar4 = new e("SCREEN_VIEWS", 3);
        SCREEN_VIEWS = eVar4;
        e eVar5 = new e("ELEMENT_INTERACTIONS", 4);
        ELEMENT_INTERACTIONS = eVar5;
        e eVar6 = new e("FRUSTRATION_INTERACTIONS", 5);
        FRUSTRATION_INTERACTIONS = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
        Companion = new d();
        ALL = kotlin.collections.y.W(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6});
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
