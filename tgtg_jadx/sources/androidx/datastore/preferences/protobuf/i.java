package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.eh;
import com.google.android.gms.internal.measurement.wf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2988b;

    public i(eh ehVar, int i11) {
        if (ehVar == null) {
            i4.a.f("format options cannot be null");
            throw null;
        }
        if (i11 < 0) {
            i4.a.f(e0.f.h(i11, "invalid index: ", new StringBuilder(String.valueOf(i11).length() + 15)));
            throw null;
        }
        this.f2987a = i11;
        this.f2988b = ehVar;
    }

    public abstract void a(int i11);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i11);

    public abstract int e(int i11);

    public abstract boolean f();

    public abstract f g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i11);

    public void y() throws InvalidProtocolBufferException {
        int iU;
        do {
            iU = u();
            if (iU == 0) {
                return;
            }
            int i11 = this.f2987a;
            if (i11 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2987a = i11 + 1;
            this.f2987a--;
        } while (x(iU));
    }

    public abstract void z(wf wfVar, Object obj);
}
