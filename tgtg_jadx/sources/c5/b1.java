package c5;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f7121a;

    public b1(c1 c1Var) {
        this.f7121a = c1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        this.f7121a.f7139c.removeCallbacks(this);
        c1.A0(this.f7121a);
        c1 c1Var = this.f7121a;
        synchronized (c1Var.f7140d) {
            if (c1Var.f7145i) {
                c1Var.f7145i = false;
                ArrayList arrayList = c1Var.f7142f;
                c1Var.f7142f = c1Var.f7143g;
                c1Var.f7143g = arrayList;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((Choreographer.FrameCallback) arrayList.get(i11)).doFrame(j9);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1.A0(this.f7121a);
        c1 c1Var = this.f7121a;
        synchronized (c1Var.f7140d) {
            if (c1Var.f7142f.isEmpty()) {
                c1Var.f7138b.removeFrameCallback(this);
                c1Var.f7145i = false;
            }
        }
    }
}
