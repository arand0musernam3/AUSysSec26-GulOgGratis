package pm;

import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Expanded;
    public static final j HalfExpanded;
    public static final j Hidden;

    @Nullable
    private Float collapsedSheetFraction;

    static {
        j jVar = new j("Hidden", 0);
        Hidden = jVar;
        j jVar2 = new j("HalfExpanded", 1);
        HalfExpanded = jVar2;
        j jVar3 = new j("Expanded", 2);
        Expanded = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public static a80.a d() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final Float a() {
        return this.collapsedSheetFraction;
    }

    public final float c() {
        int i11 = i.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            Float f11 = this.collapsedSheetFraction;
            if (f11 != null) {
                return f11.floatValue();
            }
            return 0.0f;
        }
        if (i11 == 2) {
            return 0.42f;
        }
        if (i11 == 3) {
            return 1.0f;
        }
        e40.a.f();
        return 0.0f;
    }

    public final void e(Float f11) {
        this.collapsedSheetFraction = f11;
    }
}
