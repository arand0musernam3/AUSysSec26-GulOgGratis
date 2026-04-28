package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    Animatable2.AnimationCallback mPlatformCallback;

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new b(this);
        }
        return this.mPlatformCallback;
    }

    public abstract void onAnimationEnd(Drawable drawable);

    public void onAnimationStart(Drawable drawable) {
    }
}
