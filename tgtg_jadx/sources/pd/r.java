package pd;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f34714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f34715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34716f;

    public r(int i11, long j9, long j11, p pVar, s sVar, Object obj) {
        this.f34711a = i11;
        this.f34712b = j9;
        this.f34713c = j11;
        this.f34714d = pVar;
        this.f34715e = sVar;
        this.f34716f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f34711a == rVar.f34711a && this.f34712b == rVar.f34712b && this.f34713c == rVar.f34713c && Intrinsics.areEqual(this.f34714d, rVar.f34714d) && Intrinsics.areEqual(this.f34715e, rVar.f34715e) && Intrinsics.areEqual(this.f34716f, rVar.f34716f);
    }

    public final int hashCode() {
        int iF = a0.f(this.f34714d.f34706a, e0.f.b(e0.f.b(this.f34711a * 31, 31, this.f34712b), 31, this.f34713c), 31);
        s sVar = this.f34715e;
        int iHashCode = (iF + (sVar == null ? 0 : sVar.f34717a.hashCode())) * 31;
        Object obj = this.f34716f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkResponse(code=");
        sb2.append(this.f34711a);
        sb2.append(", requestMillis=");
        sb2.append(this.f34712b);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", responseMillis=", this.f34713c, ", headers=");
        sb2.append(this.f34714d);
        sb2.append(", body=");
        sb2.append(this.f34715e);
        sb2.append(", delegate=");
        sb2.append(this.f34716f);
        sb2.append(")");
        return sb2.toString();
    }
}
