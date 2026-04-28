package y1;

import i4.v;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45348e;

    public c(long j9, long j11, long j12, long j13, long j14) {
        this.f45344a = j9;
        this.f45345b = j11;
        this.f45346c = j12;
        this.f45347d = j13;
        this.f45348e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v.c(this.f45344a, cVar.f45344a) && v.c(this.f45345b, cVar.f45345b) && v.c(this.f45346c, cVar.f45346c) && v.c(this.f45347d, cVar.f45347d) && v.c(this.f45348e, cVar.f45348e);
    }

    public final int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.f45348e) + e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f45344a) * 31, 31, this.f45345b), 31, this.f45346c), 31, this.f45347d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        k.x(this.f45344a, ", textColor=", sb2);
        k.x(this.f45345b, ", iconColor=", sb2);
        k.x(this.f45346c, ", disabledTextColor=", sb2);
        k.x(this.f45347d, ", disabledIconColor=", sb2);
        sb2.append((Object) v.i(this.f45348e));
        sb2.append(')');
        return sb2.toString();
    }
}
