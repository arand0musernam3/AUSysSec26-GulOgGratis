package androidx.datastore.preferences.protobuf;

import com.braze.h2;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f2954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f2955e;

    public /* synthetic */ e1(o2 o2Var) {
        this.f2951a = 1;
        Objects.requireNonNull(o2Var);
        this.f2955e = o2Var;
        this.f2952b = -1;
    }

    public Iterator a() {
        if (this.f2954d == null) {
            this.f2954d = ((c1) this.f2955e).f2941b.entrySet().iterator();
        }
        return this.f2954d;
    }

    public Iterator b() {
        if (this.f2954d == null) {
            this.f2954d = ((o2) this.f2955e).f11685c.entrySet().iterator();
        }
        return this.f2954d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2951a) {
            case 0:
                int i11 = this.f2952b + 1;
                c1 c1Var = (c1) this.f2955e;
                if (i11 >= c1Var.f2940a.size()) {
                    return !c1Var.f2941b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i12 = this.f2952b + 1;
                o2 o2Var = (o2) this.f2955e;
                if (i12 >= o2Var.f11684b) {
                    return !o2Var.f11685c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2951a) {
            case 0:
                this.f2953c = true;
                int i11 = this.f2952b + 1;
                this.f2952b = i11;
                c1 c1Var = (c1) this.f2955e;
                return i11 < c1Var.f2940a.size() ? (Map.Entry) c1Var.f2940a.get(this.f2952b) : (Map.Entry) a().next();
            default:
                this.f2953c = true;
                int i12 = this.f2952b + 1;
                this.f2952b = i12;
                o2 o2Var = (o2) this.f2955e;
                return i12 < o2Var.f11684b ? (p2) o2Var.f11683a[i12] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i11 = this.f2951a;
        AbstractMap abstractMap = this.f2955e;
        switch (i11) {
            case 0:
                c1 c1Var = (c1) abstractMap;
                if (!this.f2953c) {
                    h2.b("remove() was called before next()");
                } else {
                    this.f2953c = false;
                    int i12 = c1.f2939f;
                    c1Var.b();
                    if (this.f2952b >= c1Var.f2940a.size()) {
                        a().remove();
                    } else {
                        int i13 = this.f2952b;
                        this.f2952b = i13 - 1;
                        c1Var.i(i13);
                    }
                }
                break;
            default:
                if (!this.f2953c) {
                    h2.b("remove() was called before next()");
                } else {
                    this.f2953c = false;
                    o2 o2Var = (o2) abstractMap;
                    o2Var.g();
                    int i14 = this.f2952b;
                    if (i14 >= o2Var.f11684b) {
                        b().remove();
                    } else {
                        this.f2952b = i14 - 1;
                        o2Var.e(i14);
                    }
                }
                break;
        }
    }

    public e1(c1 c1Var) {
        this.f2951a = 0;
        this.f2955e = c1Var;
        this.f2952b = -1;
    }
}
