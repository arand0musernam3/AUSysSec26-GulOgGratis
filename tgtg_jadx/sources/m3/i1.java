package m3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends z3.e0 implements Parcelable, z3.p, c3, b1 {

    @NotNull
    public static final Parcelable.Creator<i1> CREATOR = new f1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f29304b;

    public i1(long j9) {
        z3.g gVarJ = z3.l.j();
        t2 t2Var = new t2(gVarJ.g(), j9);
        if (!(gVarJ instanceof z3.b)) {
            t2Var.f47000b = new t2(1, j9);
        }
        this.f29304b = t2Var;
    }

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f29304b;
    }

    @Override // z3.p
    public final v2 c() {
        return f.f29275g;
    }

    @Override // m3.b1
    public final Object component1() {
        return Long.valueOf(h());
    }

    @Override // m3.b1
    public final Function1 component2() {
        return new jd.a(this, 27);
    }

    @Override // z3.d0
    public final z3.f0 d(z3.f0 f0Var, z3.f0 f0Var2, z3.f0 f0Var3) {
        if (((t2) f0Var2).f29448c == ((t2) f0Var3).f29448c) {
            return f0Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // z3.d0
    public final void e(z3.f0 f0Var) {
        f0Var.getClass();
        this.f29304b = (t2) f0Var;
    }

    @Override // m3.c3
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((t2) z3.l.t(this.f29304b, this)).f29448c;
    }

    public final void i(long j9) {
        z3.g gVarJ;
        t2 t2Var = (t2) z3.l.h(this.f29304b);
        if (t2Var.f29448c != j9) {
            t2 t2Var2 = this.f29304b;
            synchronized (z3.l.f47038c) {
                gVarJ = z3.l.j();
                ((t2) z3.l.o(t2Var2, this, gVarJ, t2Var)).f29448c = j9;
            }
            z3.l.n(gVarJ, this);
        }
    }

    @Override // m3.b1
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((t2) z3.l.h(this.f29304b)).f29448c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(h());
    }
}
