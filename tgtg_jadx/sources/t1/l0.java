package t1;

import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 Default;
    public static final l0 PreventUserInput;
    public static final l0 UserInput;

    static {
        l0 l0Var = new l0(AnalyticsValueType.DEFAULT_TYPE, 0);
        Default = l0Var;
        l0 l0Var2 = new l0("UserInput", 1);
        UserInput = l0Var2;
        l0 l0Var3 = new l0("PreventUserInput", 2);
        PreventUserInput = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        $VALUES = l0VarArr;
        $ENTRIES = new a80.b(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
