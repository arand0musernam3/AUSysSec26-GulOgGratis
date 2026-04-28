package k;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ContentFrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25589i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.a aVar, androidx.appcompat.view.c cVar) {
        super(cVar);
        this.f25589i = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f25589i.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x11 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (x11 < -5 || y5 < -5 || x11 > getWidth() + 5 || y5 > getHeight() + 5) {
                androidx.appcompat.app.a aVar = this.f25589i;
                aVar.Q(aVar.X(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        setBackgroundDrawable(b0.a0.x(getContext(), i11));
    }
}
