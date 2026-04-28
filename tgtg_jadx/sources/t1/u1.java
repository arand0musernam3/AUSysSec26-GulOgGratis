package t1;

import kotlin.jvm.internal.Intrinsics;
import m2.f2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f39583c;

    public u1(int i11, int i12, u uVar, int i13) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? w.f39593a : uVar);
    }

    @Override // t1.i
    public final x1 a(v1 v1Var) {
        return new f2(this.f39581a, this.f39582b, this.f39583c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (u1Var.f39581a == this.f39581a && u1Var.f39582b == this.f39582b && Intrinsics.areEqual(u1Var.f39583c, this.f39583c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39583c.hashCode() + (this.f39581a * 31)) * 31) + this.f39582b;
    }

    @Override // t1.t, t1.i
    public final z1 a(v1 v1Var) {
        return new f2(this.f39581a, this.f39582b, this.f39583c);
    }

    public u1(int i11, int i12, u uVar) {
        this.f39581a = i11;
        this.f39582b = i12;
        this.f39583c = uVar;
    }
}
