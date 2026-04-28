package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f579b;

    public t3(long j9, long j11) {
        this.f578a = j9;
        this.f579b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return i4.v.c(this.f578a, t3Var.f578a) && i4.v.c(this.f579b, t3Var.f579b);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f579b) + (Long.hashCode(this.f578a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        r8.k.x(this.f578a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) i4.v.i(this.f579b));
        sb2.append(')');
        return sb2.toString();
    }
}
