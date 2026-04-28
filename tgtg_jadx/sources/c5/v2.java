package c5;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f7396a = new v2();

    public final boolean a(@NotNull MotionEvent motionEvent, int i11) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i11)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i11)) & Integer.MAX_VALUE) < 2139095040;
    }
}
