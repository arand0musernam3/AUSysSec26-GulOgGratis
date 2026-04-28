package m3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends z3.e0 implements Parcelable, z3.p, c3, b1 {

    @NotNull
    public static final Parcelable.Creator<g1> CREATOR = new f1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r2 f29281b;

    public g1(float f11) {
        z3.g gVarJ = z3.l.j();
        r2 r2Var = new r2(f11, gVarJ.g());
        if (!(gVarJ instanceof z3.b)) {
            r2Var.f47000b = new r2(f11, 1);
        }
        this.f29281b = r2Var;
    }

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f29281b;
    }

    @Override // z3.p
    public final v2 c() {
        return f.f29275g;
    }

    @Override // m3.b1
    public final Object component1() {
        return Float.valueOf(h());
    }

    @Override // m3.b1
    public final Function1 component2() {
        return new fi.a(this, 1);
    }

    @Override // z3.d0
    public final z3.f0 d(z3.f0 f0Var, z3.f0 f0Var2, z3.f0 f0Var3) {
        if (((r2) f0Var2).f29416c == ((r2) f0Var3).f29416c) {
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
        this.f29281b = (r2) f0Var;
    }

    @Override // m3.c3
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((r2) z3.l.t(this.f29281b, this)).f29416c;
    }

    public final void i(float f11) {
        z3.g gVarJ;
        r2 r2Var = (r2) z3.l.h(this.f29281b);
        if (r2Var.f29416c == f11) {
            return;
        }
        r2 r2Var2 = this.f29281b;
        synchronized (z3.l.f47038c) {
            gVarJ = z3.l.j();
            ((r2) z3.l.o(r2Var2, this, gVarJ, r2Var)).f29416c = f11;
        }
        z3.l.n(gVarJ, this);
    }

    @Override // m3.b1
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((r2) z3.l.h(this.f29281b)).f29416c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(h());
    }
}
