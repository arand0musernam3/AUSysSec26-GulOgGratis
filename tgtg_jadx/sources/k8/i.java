package k8;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.braze.h2;
import java.util.ArrayList;
import qa.e0;
import qa.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f26147p = new f(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f26148q = new f(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f26149r = new f(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f26150s = new f(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f26151t = new f(5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f26152u = new f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f26157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f26163k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f26164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f26165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26166o;

    public i(Object obj, h hVar) {
        this.f26153a = 0.0f;
        this.f26154b = Float.MAX_VALUE;
        this.f26155c = false;
        this.f26158f = false;
        this.f26159g = Float.MAX_VALUE;
        this.f26160h = -3.4028235E38f;
        this.f26161i = 0L;
        this.f26163k = new ArrayList();
        this.l = new ArrayList();
        this.f26156d = obj;
        this.f26157e = hVar;
        if (hVar == f26149r || hVar == f26150s || hVar == f26151t) {
            this.f26162j = 0.1f;
        } else if (hVar == f26152u) {
            this.f26162j = 0.00390625f;
        } else if (hVar == f26147p || hVar == f26148q) {
            this.f26162j = 0.002f;
        } else {
            this.f26162j = 1.0f;
        }
        this.f26164m = null;
        this.f26165n = Float.MAX_VALUE;
        this.f26166o = false;
    }

    public static e b() {
        ThreadLocal threadLocal = e.f26136i;
        if (threadLocal.get() == null) {
            threadLocal.set(new e(new d(0)));
        }
        return (e) threadLocal.get();
    }

    public final void a(float f11) {
        if (this.f26158f) {
            this.f26165n = f11;
            return;
        }
        if (this.f26164m == null) {
            this.f26164m = new j(f11);
        }
        j jVar = this.f26164m;
        double d3 = f11;
        jVar.f26175i = d3;
        double d11 = (float) d3;
        if (d11 > this.f26159g) {
            h2.a("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d11 < this.f26160h) {
            h2.a("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f26162j * 0.75f);
        jVar.f26170d = dAbs;
        jVar.f26171e = dAbs * 62.5d;
        d dVar = b().f26141e;
        dVar.getClass();
        if (Thread.currentThread() != ((Looper) dVar.f26135c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z11 = this.f26158f;
        if (z11 || z11) {
            return;
        }
        this.f26158f = true;
        if (!this.f26155c) {
            this.f26154b = this.f26157e.a(this.f26156d);
        }
        float f12 = this.f26154b;
        if (f12 > this.f26159g || f12 < this.f26160h) {
            i4.a.f("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f11) {
        ArrayList arrayList;
        this.f26157e.b(f11, this.f26156d);
        int i11 = 0;
        while (true) {
            arrayList = this.l;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) != null) {
                v vVar = (v) arrayList.get(i11);
                float f12 = this.f26154b;
                e0 e0Var = vVar.f36743h;
                long jMax = Math.max(-1L, Math.min(e0Var.f36773z + 1, Math.round(f12)));
                e0Var.J(jMax, vVar.f36736a);
                vVar.f36736a = jMax;
            }
            i11++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.f26164m.f26168b <= 0.0d) {
            h2.a("Spring animations can only come to an end when there is damping");
            return;
        }
        d dVar = b().f26141e;
        dVar.getClass();
        if (Thread.currentThread() != ((Looper) dVar.f26135c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f26158f) {
            this.f26166o = true;
        }
    }

    public i(d2.e eVar) {
        this.f26153a = 0.0f;
        this.f26154b = Float.MAX_VALUE;
        this.f26155c = false;
        this.f26158f = false;
        this.f26159g = Float.MAX_VALUE;
        this.f26160h = -3.4028235E38f;
        this.f26161i = 0L;
        this.f26163k = new ArrayList();
        this.l = new ArrayList();
        this.f26156d = null;
        this.f26157e = new g(eVar);
        this.f26162j = 1.0f;
        this.f26164m = null;
        this.f26165n = Float.MAX_VALUE;
        this.f26166o = false;
    }
}
