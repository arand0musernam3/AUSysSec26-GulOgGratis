package c5;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends v80.x {
    public static final u70.t l = u70.l.b(q0.f7327g);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a1 f7137m = new a1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Choreographer f7138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7139c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7145i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e1 f7147k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7140d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.collections.t f7141e = new kotlin.collections.t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f7142f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f7143g = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1 f7146j = new b1(this);

    public c1(Choreographer choreographer, Handler handler) {
        this.f7138b = choreographer;
        this.f7139c = handler;
        this.f7147k = new e1(choreographer, this);
    }

    public static final void A0(c1 c1Var) {
        Runnable runnable;
        boolean z11;
        do {
            synchronized (c1Var.f7140d) {
                kotlin.collections.t tVar = c1Var.f7141e;
                runnable = (Runnable) (tVar.isEmpty() ? null : tVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c1Var.f7140d) {
                    kotlin.collections.t tVar2 = c1Var.f7141e;
                    runnable = (Runnable) (tVar2.isEmpty() ? null : tVar2.removeFirst());
                }
            }
            synchronized (c1Var.f7140d) {
                if (c1Var.f7141e.isEmpty()) {
                    z11 = false;
                    c1Var.f7144h = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f7140d) {
            this.f7141e.addLast(runnable);
            if (!this.f7144h) {
                this.f7144h = true;
                this.f7139c.post(this.f7146j);
                if (!this.f7145i) {
                    this.f7145i = true;
                    this.f7138b.postFrameCallback(this.f7146j);
                }
            }
        }
    }
}
