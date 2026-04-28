package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38434b;

    public q0(boolean z11, boolean z12) {
        this.f38433a = z11;
        this.f38434b = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f38433a == q0Var.f38433a && this.f38434b == q0Var.f38434b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38434b) + (Boolean.hashCode(this.f38433a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValidationCriteria(checkBack=");
        sb2.append(this.f38433a);
        sb2.append(", checkFront=");
        return r8.k.q(sb2, this.f38434b, ')');
    }
}
