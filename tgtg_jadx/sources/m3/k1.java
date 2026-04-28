package m3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends z3.e0 implements Parcelable, z3.p {

    @NotNull
    public static final Parcelable.Creator<k1> CREATOR = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f29312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2 f29313c;

    public k1(Object obj, v2 v2Var) {
        this.f29312b = v2Var;
        z3.g gVarJ = z3.l.j();
        u2 u2Var = new u2(gVarJ.g(), obj);
        if (!(gVarJ instanceof z3.b)) {
            u2Var.f47000b = new u2(1, obj);
        }
        this.f29313c = u2Var;
    }

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f29313c;
    }

    @Override // z3.p
    public final v2 c() {
        return this.f29312b;
    }

    @Override // m3.b1
    public final Object component1() {
        return getValue();
    }

    @Override // m3.b1
    public final Function1 component2() {
        return new jd.a(this, 28);
    }

    @Override // z3.d0
    public final z3.f0 d(z3.f0 f0Var, z3.f0 f0Var2, z3.f0 f0Var3) {
        if (this.f29312b.a(((u2) f0Var2).f29456c, ((u2) f0Var3).f29456c)) {
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
        this.f29313c = (u2) f0Var;
    }

    @Override // m3.c3
    public final Object getValue() {
        return ((u2) z3.l.t(this.f29313c, this)).f29456c;
    }

    @Override // m3.b1
    public final void setValue(Object obj) {
        z3.g gVarJ;
        u2 u2Var = (u2) z3.l.h(this.f29313c);
        if (this.f29312b.a(u2Var.f29456c, obj)) {
            return;
        }
        u2 u2Var2 = this.f29313c;
        synchronized (z3.l.f47038c) {
            gVarJ = z3.l.j();
            ((u2) z3.l.o(u2Var2, this, gVarJ, u2Var)).f29456c = obj;
        }
        z3.l.n(gVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((u2) z3.l.h(this.f29313c)).f29456c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12;
        parcel.writeValue(getValue());
        f fVar = f.f29272d;
        v2 v2Var = this.f29312b;
        if (Intrinsics.areEqual(v2Var, fVar)) {
            i12 = 0;
        } else if (Intrinsics.areEqual(v2Var, f.f29275g)) {
            i12 = 1;
        } else {
            if (!Intrinsics.areEqual(v2Var, f.f29273e)) {
                com.braze.h2.b("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i12 = 2;
        }
        parcel.writeInt(i12);
    }
}
