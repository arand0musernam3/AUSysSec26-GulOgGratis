package vf;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BAD_REQUEST;
    public static final f FAILED;
    public static final f PAYLOAD_TOO_LARGE;
    public static final f SUCCESS;
    public static final f TIMEOUT;
    public static final f TOO_MANY_REQUESTS;

    @NotNull
    private final IntRange range;

    static {
        f fVar = new f("SUCCESS", 0, new IntRange(200, 299, 1));
        SUCCESS = fVar;
        f fVar2 = new f("BAD_REQUEST", 1, 400);
        BAD_REQUEST = fVar2;
        f fVar3 = new f("TIMEOUT", 2, 408);
        TIMEOUT = fVar3;
        f fVar4 = new f("PAYLOAD_TOO_LARGE", 3, 413);
        PAYLOAD_TOO_LARGE = fVar4;
        f fVar5 = new f("TOO_MANY_REQUESTS", 4, 429);
        TOO_MANY_REQUESTS = fVar5;
        f fVar6 = new f("FAILED", 5, new IntRange(500, 599, 1));
        FAILED = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public f(String str, int i11, int i12) {
        this(str, i11, new IntRange(i12, i12, 1));
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final IntRange a() {
        return this.range;
    }

    public final int c() {
        return this.range.f26553a;
    }

    public f(String str, int i11, IntRange intRange) {
        this.range = intRange;
    }
}
