package m0;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f28503b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28502a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f28504c = new HashSet();

    public f0(n0 n0Var) {
        this.f28503b = n0Var;
    }

    @Override // m0.n0
    public k0 Y() {
        return this.f28503b.Y();
    }

    public final void a(e0 e0Var) {
        synchronized (this.f28502a) {
            this.f28504c.add(e0Var);
        }
    }

    @Override // m0.n0
    public int b() {
        return this.f28503b.b();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f28503b.close();
        synchronized (this.f28502a) {
            hashSet = new HashSet(this.f28504c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d(this);
        }
    }

    @Override // m0.n0
    public final Image f0() {
        return this.f28503b.f0();
    }

    @Override // m0.n0
    public final int getFormat() {
        return this.f28503b.getFormat();
    }

    @Override // m0.n0
    public int getHeight() {
        return this.f28503b.getHeight();
    }

    @Override // m0.n0
    public final jd.f[] o() {
        return this.f28503b.o();
    }
}
