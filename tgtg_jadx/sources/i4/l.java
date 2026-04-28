package i4;

import android.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final h a() {
        return new h(new Path());
    }

    public static final Path.Direction b(p0 p0Var) {
        int i11 = k.$EnumSwitchMapping$0[p0Var.ordinal()];
        if (i11 == 1) {
            return Path.Direction.CCW;
        }
        if (i11 == 2) {
            return Path.Direction.CW;
        }
        e40.a.f();
        return null;
    }

    public static final void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
