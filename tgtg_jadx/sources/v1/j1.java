package v1;

import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 Default;
    public static final j1 PreventUserInput;
    public static final j1 UserInput;

    static {
        j1 j1Var = new j1(AnalyticsValueType.DEFAULT_TYPE, 0);
        Default = j1Var;
        j1 j1Var2 = new j1("UserInput", 1);
        UserInput = j1Var2;
        j1 j1Var3 = new j1("PreventUserInput", 2);
        PreventUserInput = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        $VALUES = j1VarArr;
        $ENTRIES = new a80.b(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
