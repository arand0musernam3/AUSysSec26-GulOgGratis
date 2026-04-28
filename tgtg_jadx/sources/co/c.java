package co;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c END;
    public static final c START;

    static {
        c cVar = new c("START", 0);
        START = cVar;
        c cVar2 = new c("END", 1);
        END = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
        Companion = new a();
    }

    public static a80.a c() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final float a(q qVar, int i11) {
        qVar.getClass();
        int i12 = b.$EnumSwitchMapping$1[ordinal()];
        if (i12 == 1) {
            int i13 = b.$EnumSwitchMapping$0[qVar.ordinal()];
            if (i13 == 1) {
                return -d70.b.d(48);
            }
            if (i13 == 2) {
                return -d70.b.d(32);
            }
            e40.a.f();
            return 0.0f;
        }
        if (i12 != 2) {
            e40.a.f();
            return 0.0f;
        }
        int i14 = b.$EnumSwitchMapping$0[qVar.ordinal()];
        if (i14 == 1) {
            return i11 - d70.b.d(72);
        }
        if (i14 == 2) {
            return i11 - d70.b.d(112);
        }
        e40.a.f();
        return 0.0f;
    }
}
