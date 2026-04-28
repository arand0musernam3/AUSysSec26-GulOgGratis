package m3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends z3.e0 implements Parcelable, z3.p, c3, b1 {

    @NotNull
    public static final Parcelable.Creator<h1> CREATOR = new f1(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s2 f29291b;

    public h1(int i11) {
        z3.g gVarJ = z3.l.j();
        s2 s2Var = new s2(gVarJ.g(), i11);
        if (!(gVarJ instanceof z3.b)) {
            s2Var.f47000b = new s2(1, i11);
        }
        this.f29291b = s2Var;
    }

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f29291b;
    }

    @Override // z3.p
    public final v2 c() {
        return f.f29275g;
    }

    @Override // m3.b1
    public final Object component1() {
        return Integer.valueOf(h());
    }

    @Override // m3.b1
    public final Function1 component2() {
        return new co.t(this, 7);
    }

    @Override // z3.d0
    public final z3.f0 d(z3.f0 f0Var, z3.f0 f0Var2, z3.f0 f0Var3) {
        if (((s2) f0Var2).f29442c == ((s2) f0Var3).f29442c) {
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
        this.f29291b = (s2) f0Var;
    }

    @Override // m3.c3
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((s2) z3.l.t(this.f29291b, this)).f29442c;
    }

    public final void i(int i11) {
        z3.g gVarJ;
        s2 s2Var = (s2) z3.l.h(this.f29291b);
        if (s2Var.f29442c != i11) {
            s2 s2Var2 = this.f29291b;
            synchronized (z3.l.f47038c) {
                gVarJ = z3.l.j();
                ((s2) z3.l.o(s2Var2, this, gVarJ, s2Var)).f29442c = i11;
            }
            z3.l.n(gVarJ, this);
        }
    }

    @Override // m3.b1
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((s2) z3.l.h(this.f29291b)).f29442c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(h());
    }
}
