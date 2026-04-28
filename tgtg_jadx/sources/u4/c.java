package u4;

import android.view.KeyEvent;
import b4.t;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i11) {
        long j9 = (((long) i11) << 32) | (((long) 0) & 4294967295L);
        int i12 = a.F;
        return j9;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final t d(t tVar, Function1 function1) {
        return tVar.then(new d(function1, null));
    }

    public static final t e(t tVar, Function1 function1) {
        return tVar.then(new d(null, function1));
    }
}
