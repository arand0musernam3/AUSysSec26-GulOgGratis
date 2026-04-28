package m2;

import android.R;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 Autofill;
    public static final j1 Copy;
    public static final j1 Cut;
    public static final j1 Paste;
    public static final j1 SelectAll;
    private final int drawableId;

    @NotNull
    private final Object key;
    private final int stringId;

    static {
        j1 j1Var = new j1("Cut", 0, p2.e.f34134a, R.string.cut, R.attr.actionModeCutDrawable);
        Cut = j1Var;
        j1 j1Var2 = new j1("Copy", 1, p2.e.f34135b, R.string.copy, R.attr.actionModeCopyDrawable);
        Copy = j1Var2;
        j1 j1Var3 = new j1("Paste", 2, p2.e.f34136c, R.string.paste, R.attr.actionModePasteDrawable);
        Paste = j1Var3;
        j1 j1Var4 = new j1("SelectAll", 3, p2.e.f34137d, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        SelectAll = j1Var4;
        j1 j1Var5 = new j1("Autofill", 4, p2.e.f34138e, Build.VERSION.SDK_INT <= 26 ? com.app.tgtg.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);
        Autofill = j1Var5;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3, j1Var4, j1Var5};
        $VALUES = j1VarArr;
        $ENTRIES = new a80.b(j1VarArr);
    }

    public j1(String str, int i11, Object obj, int i12, int i13) {
        this.key = obj;
        this.stringId = i12;
        this.drawableId = i13;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }

    public final int a() {
        return this.drawableId;
    }

    public final Object c() {
        return this.key;
    }

    public final int d() {
        return this.stringId;
    }
}
