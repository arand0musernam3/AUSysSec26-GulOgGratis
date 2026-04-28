package o00;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f31756a;

    public v0(Level level, Set set, h hVar) {
        this.f31756a = set;
    }

    public final cl.f a(String str) {
        w0 w0Var = new w0(str);
        if (str.length() > 23) {
            int i11 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str = str.substring(i11 + 1);
        }
        String strConcat = "".concat(str);
        strConcat.substring(0, Math.min(strConcat.length(), 23));
        return w0Var;
    }
}
