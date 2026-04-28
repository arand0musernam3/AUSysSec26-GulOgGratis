package z7;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public abstract int clampViewPositionHorizontal(View view, int i11, int i12);

    public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
        return 0;
    }

    public int getViewHorizontalDragRange(@NonNull View view) {
        return 0;
    }

    public int getViewVerticalDragRange(@NonNull View view) {
        return 0;
    }

    public boolean onEdgeLock(int i11) {
        return false;
    }

    public abstract void onViewPositionChanged(View view, int i11, int i12, int i13, int i14);

    public abstract void onViewReleased(View view, float f11, float f12);

    public abstract boolean tryCaptureView(View view, int i11);

    public int getOrderedChildIndex(int i11) {
        return i11;
    }

    public void onViewDragStateChanged(int i11) {
    }

    public void onEdgeDragStarted(int i11, int i12) {
    }

    public void onEdgeTouched(int i11, int i12) {
    }

    public void onViewCaptured(@NonNull View view, int i11) {
    }
}
