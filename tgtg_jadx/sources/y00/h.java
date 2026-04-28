package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum h {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    h(char c3) {
        this.zzk = c3;
    }

    public static h a(char c3) {
        for (h hVar : values()) {
            if (hVar.zzk == c3) {
                return hVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char c() {
        return this.zzk;
    }
}
