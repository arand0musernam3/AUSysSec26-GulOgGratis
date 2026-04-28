package m0;

import a3.i3;
import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements s0.f1, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.g f28575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e.b f28577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i3 f28579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0.e1 f28580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f28581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray f28582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray f28583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28584k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f28585m;

    public p0(int i11, int i12, int i13, int i14) {
        i3 i3Var = new i3(ImageReader.newInstance(i11, i12, i13, i14));
        this.f28574a = new Object();
        this.f28575b = new g1.g(this, 1);
        this.f28576c = 0;
        this.f28577d = new e.b(this, 28);
        this.f28578e = false;
        this.f28582i = new LongSparseArray();
        this.f28583j = new LongSparseArray();
        this.f28585m = new ArrayList();
        this.f28579f = i3Var;
        this.f28584k = 0;
        this.l = new ArrayList(i());
    }

    @Override // s0.f1
    public final n0 a() {
        synchronized (this.f28574a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.f28584k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.l.size() - 1; i11++) {
                    if (!this.f28585m.contains(this.l.get(i11))) {
                        arrayList.add((n0) this.l.get(i11));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n0) it.next()).close();
                }
                int size = this.l.size();
                ArrayList arrayList2 = this.l;
                this.f28584k = size;
                n0 n0Var = (n0) arrayList2.get(size - 1);
                this.f28585m.add(n0Var);
                return n0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s0.f1
    public final int b() {
        int iB;
        synchronized (this.f28574a) {
            iB = this.f28579f.b();
        }
        return iB;
    }

    @Override // s0.f1
    public final int c() {
        int iC;
        synchronized (this.f28574a) {
            iC = this.f28579f.c();
        }
        return iC;
    }

    @Override // s0.f1
    public final void close() {
        synchronized (this.f28574a) {
            try {
                if (this.f28578e) {
                    return;
                }
                Iterator it = new ArrayList(this.l).iterator();
                while (it.hasNext()) {
                    ((n0) it.next()).close();
                }
                this.l.clear();
                this.f28579f.close();
                this.f28578e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m0.e0
    public final void d(f0 f0Var) {
        synchronized (this.f28574a) {
            f(f0Var);
        }
    }

    @Override // s0.f1
    public final void e() {
        synchronized (this.f28574a) {
            this.f28579f.e();
            this.f28580g = null;
            this.f28581h = null;
            this.f28576c = 0;
        }
    }

    public final void f(f0 f0Var) {
        synchronized (this.f28574a) {
            try {
                int iIndexOf = this.l.indexOf(f0Var);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i11 = this.f28584k;
                    if (iIndexOf <= i11) {
                        this.f28584k = i11 - 1;
                    }
                }
                this.f28585m.remove(f0Var);
                if (this.f28576c > 0) {
                    h(this.f28579f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(a1 a1Var) {
        s0.e1 e1Var;
        Executor executor;
        synchronized (this.f28574a) {
            try {
                if (this.l.size() < i()) {
                    a1Var.a(this);
                    this.l.add(a1Var);
                    e1Var = this.f28580g;
                    executor = this.f28581h;
                } else {
                    wd.a.p("TAG", "Maximum image number reached.");
                    a1Var.close();
                    e1Var = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (e1Var != null) {
            if (executor != null) {
                executor.execute(new com.google.firebase.messaging.r(28, this, e1Var));
            } else {
                e1Var.d(this);
            }
        }
    }

    @Override // s0.f1
    public final int getHeight() {
        int height;
        synchronized (this.f28574a) {
            height = this.f28579f.getHeight();
        }
        return height;
    }

    @Override // s0.f1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f28574a) {
            surface = this.f28579f.getSurface();
        }
        return surface;
    }

    public final void h(s0.f1 f1Var) {
        n0 n0VarJ;
        synchronized (this.f28574a) {
            try {
                if (this.f28578e) {
                    return;
                }
                int size = this.f28583j.size() + this.l.size();
                if (size >= f1Var.i()) {
                    wd.a.p("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        n0VarJ = f1Var.j();
                        if (n0VarJ != null) {
                            this.f28576c--;
                            size++;
                            this.f28583j.put(n0VarJ.Y().getTimestamp(), n0VarJ);
                            l();
                        }
                    } catch (IllegalStateException e5) {
                        if (wd.a.B(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e5);
                        }
                        n0VarJ = null;
                    }
                    if (n0VarJ == null || this.f28576c <= 0) {
                        break;
                    }
                } while (size < f1Var.i());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s0.f1
    public final int i() {
        int i11;
        synchronized (this.f28574a) {
            i11 = this.f28579f.i();
        }
        return i11;
    }

    @Override // s0.f1
    public final n0 j() {
        synchronized (this.f28574a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.f28584k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i11 = this.f28584k;
                this.f28584k = i11 + 1;
                n0 n0Var = (n0) arrayList.get(i11);
                this.f28585m.add(n0Var);
                return n0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s0.f1
    public final void k(s0.e1 e1Var, Executor executor) {
        synchronized (this.f28574a) {
            e1Var.getClass();
            this.f28580g = e1Var;
            executor.getClass();
            this.f28581h = executor;
            this.f28579f.k(this.f28577d, executor);
        }
    }

    public final void l() {
        synchronized (this.f28574a) {
            try {
                for (int size = this.f28582i.size() - 1; size >= 0; size--) {
                    k0 k0Var = (k0) this.f28582i.valueAt(size);
                    long timestamp = k0Var.getTimestamp();
                    n0 n0Var = (n0) this.f28583j.get(timestamp);
                    if (n0Var != null) {
                        this.f28583j.remove(timestamp);
                        this.f28582i.removeAt(size);
                        g(new a1(n0Var, null, k0Var));
                    }
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        synchronized (this.f28574a) {
            try {
                if (this.f28583j.size() != 0 && this.f28582i.size() != 0) {
                    long jKeyAt = this.f28583j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f28582i.keyAt(0);
                    pd.g.j(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f28583j.size() - 1; size >= 0; size--) {
                            if (this.f28583j.keyAt(size) < jKeyAt2) {
                                ((n0) this.f28583j.valueAt(size)).close();
                                this.f28583j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f28582i.size() - 1; size2 >= 0; size2--) {
                            if (this.f28582i.keyAt(size2) < jKeyAt) {
                                this.f28582i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
