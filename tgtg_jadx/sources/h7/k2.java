package h7;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f21580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a50.c f21581d;

    public k2(Window window, a50.c cVar) {
        this.f21580c = window;
        this.f21581d = cVar;
    }

    @Override // w.b
    public final void P(int i11) {
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                if (i12 == 1) {
                    f0(4);
                } else if (i12 == 2) {
                    f0(2);
                } else if (i12 == 8) {
                    ((e0) this.f21581d.f822b).b();
                }
            }
        }
    }

    @Override // w.b
    public final boolean R() {
        return (this.f21580c.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // w.b
    public final void a0(boolean z11) {
        if (!z11) {
            g0(16);
            return;
        }
        Window window = this.f21580c;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        f0(16);
    }

    @Override // w.b
    public final void b0(boolean z11) {
        if (!z11) {
            g0(8192);
            return;
        }
        Window window = this.f21580c;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        f0(8192);
    }

    @Override // w.b
    public final void d0(int i11) {
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                if (i12 == 1) {
                    g0(4);
                    this.f21580c.clearFlags(1024);
                } else if (i12 == 2) {
                    g0(2);
                } else if (i12 == 8) {
                    ((e0) this.f21581d.f822b).c();
                }
            }
        }
    }

    public final void f0(int i11) {
        View decorView = this.f21580c.getDecorView();
        decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
    }

    public final void g0(int i11) {
        View decorView = this.f21580c.getDecorView();
        decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
    }
}
