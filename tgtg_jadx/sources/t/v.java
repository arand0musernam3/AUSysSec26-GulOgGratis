package t;

import a3.i3;
import android.os.Looper;
import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class v extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f39313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.a f39314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i3 f39315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f39316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public oz.m f39317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oz.m f39318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f39319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f39320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39321i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39323k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o0 f39328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o0 f39329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o0 f39330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o0 f39331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o0 f39332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o0 f39333v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o0 f39335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o0 f39336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o0 f39337z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39322j = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39334w = true;

    public static void d(o0 o0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            o0Var.k(obj);
        } else {
            o0Var.i(obj);
        }
    }

    public final int a() {
        if (this.f39315c != null) {
            return this.f39316d != null ? 15 : 255;
        }
        return 0;
    }

    public final void b(e eVar) {
        if (this.f39329r == null) {
            this.f39329r = new o0();
        }
        d(this.f39329r, eVar);
    }

    public final void c(boolean z11) {
        if (this.f39332u == null) {
            this.f39332u = new o0();
        }
        d(this.f39332u, Boolean.valueOf(z11));
    }
}
