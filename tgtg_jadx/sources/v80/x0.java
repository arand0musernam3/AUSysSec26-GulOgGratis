package v80;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 implements Runnable, Comparable, r0 {

    @Nullable
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f42172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42173b = -1;

    public x0(long j9) {
        this.f42172a = j9;
    }

    @Override // v80.r0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                a90.v vVar = f0.f42084b;
                if (obj == vVar) {
                    return;
                }
                y0 y0Var = obj instanceof y0 ? (y0) obj : null;
                if (y0Var != null) {
                    synchronized (y0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof a90.a0 ? (a90.a0) obj2 : null) != null) {
                            y0Var.b(this.f42173b);
                        }
                    }
                }
                this._heap = vVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j9 = this.f42172a - ((x0) obj).f42172a;
        if (j9 > 0) {
            return 1;
        }
        return j9 < 0 ? -1 : 0;
    }

    public final int d(long j9, y0 y0Var, z0 z0Var) {
        synchronized (this) {
            if (this._heap == f0.f42084b) {
                return 2;
            }
            synchronized (y0Var) {
                try {
                    x0[] x0VarArr = y0Var.f1007a;
                    x0 x0Var = x0VarArr != null ? x0VarArr[0] : null;
                    if (z0.f42180h.get(z0Var) == 1) {
                        return 1;
                    }
                    if (x0Var == null) {
                        y0Var.f42176c = j9;
                    } else {
                        long j11 = x0Var.f42172a;
                        if (j11 - j9 < 0) {
                            j9 = j11;
                        }
                        if (j9 - y0Var.f42176c > 0) {
                            y0Var.f42176c = j9;
                        }
                    }
                    long j12 = this.f42172a;
                    long j13 = y0Var.f42176c;
                    if (j12 - j13 < 0) {
                        this.f42172a = j13;
                    }
                    y0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e(y0 y0Var) {
        if (this._heap != f0.f42084b) {
            this._heap = y0Var;
        } else {
            i4.a.f("Failed requirement.");
        }
    }

    public String toString() {
        return w.a0.r(new StringBuilder("Delayed[nanos="), this.f42172a, ']');
    }
}
