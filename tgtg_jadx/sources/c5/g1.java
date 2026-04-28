package c5;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f7240a;

    public g1(ViewConfiguration viewConfiguration) {
        this.f7240a = viewConfiguration;
    }

    @Override // c5.u3
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // c5.u3
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // c5.u3
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return h1.b(this.f7240a);
        }
        return 2.0f;
    }

    @Override // c5.u3
    public final float e() {
        return this.f7240a.getScaledMaximumFlingVelocity();
    }

    @Override // c5.u3
    public final float f() {
        return this.f7240a.getScaledTouchSlop();
    }

    @Override // c5.u3
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return h1.a(this.f7240a);
        }
        return 16.0f;
    }
}
