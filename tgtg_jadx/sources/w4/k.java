package w4;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static long a(MotionEvent motionEvent, int i11) {
        float rawX = motionEvent.getRawX(i11);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i11))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
