package a40;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f ARM64;
    public static final f ARMV6;
    public static final f ARMV7;
    public static final f ARMV7S;
    public static final f ARM_UNKNOWN;
    public static final f PPC;
    public static final f PPC64;
    public static final f UNKNOWN;
    public static final f X86_32;
    public static final f X86_64;
    private static final Map<String, f> matcher;

    static {
        f fVar = new f("X86_32", 0);
        X86_32 = fVar;
        f fVar2 = new f("X86_64", 1);
        X86_64 = fVar2;
        f fVar3 = new f("ARM_UNKNOWN", 2);
        ARM_UNKNOWN = fVar3;
        f fVar4 = new f("PPC", 3);
        PPC = fVar4;
        f fVar5 = new f("PPC64", 4);
        PPC64 = fVar5;
        f fVar6 = new f("ARMV6", 5);
        ARMV6 = fVar6;
        f fVar7 = new f("ARMV7", 6);
        ARMV7 = fVar7;
        f fVar8 = new f("UNKNOWN", 7);
        UNKNOWN = fVar8;
        f fVar9 = new f("ARMV7S", 8);
        ARMV7S = fVar9;
        f fVar10 = new f("ARM64", 9);
        ARM64 = fVar10;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        HashMap map = new HashMap(4);
        matcher = map;
        map.put("armeabi-v7a", fVar7);
        map.put("armeabi", fVar6);
        map.put("arm64-v8a", fVar10);
        map.put("x86", fVar);
    }

    public static f a() {
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str)) {
            f fVar = matcher.get(str.toLowerCase(Locale.US));
            return fVar == null ? UNKNOWN : fVar;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        return UNKNOWN;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
