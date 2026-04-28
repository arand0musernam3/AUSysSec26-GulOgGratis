package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;

    @NotNull
    public static final u Companion;
    public static final w ON_ANY;
    public static final w ON_CREATE;
    public static final w ON_DESTROY;
    public static final w ON_PAUSE;
    public static final w ON_RESUME;
    public static final w ON_START;
    public static final w ON_STOP;

    static {
        w wVar = new w("ON_CREATE", 0);
        ON_CREATE = wVar;
        w wVar2 = new w("ON_START", 1);
        ON_START = wVar2;
        w wVar3 = new w("ON_RESUME", 2);
        ON_RESUME = wVar3;
        w wVar4 = new w("ON_PAUSE", 3);
        ON_PAUSE = wVar4;
        w wVar5 = new w("ON_STOP", 4);
        ON_STOP = wVar5;
        w wVar6 = new w("ON_DESTROY", 5);
        ON_DESTROY = wVar6;
        w wVar7 = new w("ON_ANY", 6);
        ON_ANY = wVar7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
        $VALUES = wVarArr;
        $ENTRIES = new a80.b(wVarArr);
        Companion = new u();
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final Lifecycle.State a() {
        switch (v.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                e40.a.f();
                return null;
        }
    }
}
