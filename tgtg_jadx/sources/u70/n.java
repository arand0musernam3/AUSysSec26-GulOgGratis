package u70;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
        super(str);
    }

    public n() {
        this(null, 1, null);
    }
}
