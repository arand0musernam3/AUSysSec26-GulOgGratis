package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static w a(Lifecycle.State state) {
        state.getClass();
        int i11 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return w.ON_DESTROY;
        }
        if (i11 == 2) {
            return w.ON_STOP;
        }
        if (i11 != 3) {
            return null;
        }
        return w.ON_PAUSE;
    }

    public static w b(Lifecycle.State state) {
        state.getClass();
        int i11 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return w.ON_START;
        }
        if (i11 == 2) {
            return w.ON_RESUME;
        }
        if (i11 != 5) {
            return null;
        }
        return w.ON_CREATE;
    }

    public static w c(Lifecycle.State state) {
        state.getClass();
        int i11 = t.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return w.ON_CREATE;
        }
        if (i11 == 2) {
            return w.ON_START;
        }
        if (i11 != 3) {
            return null;
        }
        return w.ON_RESUME;
    }
}
