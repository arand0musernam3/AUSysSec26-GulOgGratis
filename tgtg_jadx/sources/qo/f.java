package qo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ADD_EMAIL;
    public static final f ADD_PHONE_NUMBER;
    public static final f ADD_REMINDER;
    public static final f END;
    private boolean needPrompt = false;

    static {
        f fVar = new f("ADD_EMAIL", 0);
        ADD_EMAIL = fVar;
        f fVar2 = new f("ADD_REMINDER", 1);
        ADD_REMINDER = fVar2;
        f fVar3 = new f("ADD_PHONE_NUMBER", 2);
        ADD_PHONE_NUMBER = fVar3;
        f fVar4 = new f("END", 3);
        END = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public f(String str, int i11) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final void a() {
        this.needPrompt = false;
    }
}
