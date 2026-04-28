package s0;

import android.util.Size;
import com.app.tgtg.model.local.AppConstants;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e2[] $VALUES;
    public static final e2 MAXIMUM;
    public static final e2 MAXIMUM_16_9;
    public static final e2 MAXIMUM_4_3;
    public static final e2 NOT_SUPPORT;
    public static final e2 PREVIEW;
    public static final e2 RECORD;
    public static final e2 S1080P_16_9;
    public static final e2 S1080P_4_3;
    public static final e2 S1440P_16_9;
    public static final e2 S1440P_4_3;
    public static final e2 S720P_16_9;
    public static final e2 UHD;
    public static final e2 ULTRA_MAXIMUM;
    public static final e2 VGA;
    public static final e2 X_VGA;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f38325id;

    @Nullable
    private final Size relatedFixedSize;

    static {
        e2 e2Var = new e2("VGA", 0, 0, new Size(640, 480));
        VGA = e2Var;
        e2 e2Var2 = new e2("X_VGA", 1, 1, new Size(1024, 768));
        X_VGA = e2Var2;
        e2 e2Var3 = new e2("S720P_16_9", 2, 2, new Size(1280, AppConstants.REQUEST_CODE_HELP_CENTER));
        S720P_16_9 = e2Var3;
        e2 e2Var4 = new e2("PREVIEW", 3, 3, null);
        PREVIEW = e2Var4;
        e2 e2Var5 = new e2("S1080P_4_3", 4, 4, new Size(1440, 1080));
        S1080P_4_3 = e2Var5;
        e2 e2Var6 = new e2("S1080P_16_9", 5, 5, new Size(1920, 1080));
        S1080P_16_9 = e2Var6;
        e2 e2Var7 = new e2("S1440P_4_3", 6, 6, new Size(1920, 1440));
        S1440P_4_3 = e2Var7;
        e2 e2Var8 = new e2("S1440P_16_9", 7, 7, new Size(2560, 1440));
        S1440P_16_9 = e2Var8;
        e2 e2Var9 = new e2("UHD", 8, 8, new Size(3840, 2160));
        UHD = e2Var9;
        e2 e2Var10 = new e2("RECORD", 9, 9, null);
        RECORD = e2Var10;
        e2 e2Var11 = new e2("MAXIMUM", 10, 10, null);
        MAXIMUM = e2Var11;
        e2 e2Var12 = new e2("MAXIMUM_4_3", 11, 11, null);
        MAXIMUM_4_3 = e2Var12;
        e2 e2Var13 = new e2("MAXIMUM_16_9", 12, 12, null);
        MAXIMUM_16_9 = e2Var13;
        e2 e2Var14 = new e2("ULTRA_MAXIMUM", 13, 13, null);
        ULTRA_MAXIMUM = e2Var14;
        e2 e2Var15 = new e2("NOT_SUPPORT", 14, 14, null);
        NOT_SUPPORT = e2Var15;
        e2[] e2VarArr = {e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6, e2Var7, e2Var8, e2Var9, e2Var10, e2Var11, e2Var12, e2Var13, e2Var14, e2Var15};
        $VALUES = e2VarArr;
        $ENTRIES = new a80.b(e2VarArr);
    }

    public e2(String str, int i11, int i12, Size size) {
        this.f38325id = i12;
        this.relatedFixedSize = size;
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) $VALUES.clone();
    }

    public final int a() {
        return this.f38325id;
    }

    public final Size c() {
        return this.relatedFixedSize;
    }
}
