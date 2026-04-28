package cp;

import com.app.tgtg.R;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c GENERIC;
    public static final c NONE;
    public static final c TOO_BIG;

    @Nullable
    private final Integer message;

    static {
        c cVar = new c("NONE", 0, null);
        NONE = cVar;
        c cVar2 = new c("TOO_BIG", 1, Integer.valueOf(R.string.rating_picture_too_big));
        TOO_BIG = cVar2;
        c cVar3 = new c("GENERIC", 2, Integer.valueOf(R.string.rating_invalid_picture));
        GENERIC = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public c(String str, int i11, Integer num) {
        this.message = num;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.message;
    }
}
