package q9;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d6.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f36397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f36399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36400f;

    public o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i11) {
        this.f36397c = onBackInvokedDispatcher;
        this.f36398d = i11;
        this.f36399e = Build.VERSION.SDK_INT == 33 ? new v(this, 4) : new n(this);
    }

    @Override // q9.h
    public final void b(boolean z11) {
        if (z11 && !this.f36400f) {
            this.f36397c.registerOnBackInvokedCallback(this.f36398d, this.f36399e);
            this.f36400f = true;
        } else {
            if (z11 || !this.f36400f) {
                return;
            }
            this.f36397c.unregisterOnBackInvokedCallback(this.f36399e);
            this.f36400f = false;
        }
    }
}
