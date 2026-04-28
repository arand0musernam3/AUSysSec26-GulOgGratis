package pg;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a8.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f34808u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ComposeView f34809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f34810t;

    public c0(a8.b bVar, View view, ComposeView composeView) {
        super(0, view, bVar);
        this.f34809s = composeView;
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34810t = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34810t != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }

    public final void f0() {
        synchronized (this) {
            this.f34810t = 1L;
        }
        e0();
    }
}
