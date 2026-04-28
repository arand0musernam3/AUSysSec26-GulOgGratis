package r8;

import java.util.List;
import kotlin.collections.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, long j9, long j11, boolean z11) {
        super(list);
        list.getClass();
        this.f37756b = j9;
        this.f37757c = j11;
        this.f37758d = z11;
    }

    @Override // r8.e
    public final e a(g gVar) {
        v70.e eVarB = c0.b();
        List list = this.f37759a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            eVarB.add(((b) list.get(i11)).c(gVar));
        }
        return new c(c0.a(eVarB), pd.g.K(this.f37756b, gVar), pd.g.K(this.f37757c, gVar), this.f37758d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) q1.h.b(this.f37756b)) + ", center=" + ((Object) q1.h.b(this.f37757c)) + ", convex=" + this.f37758d;
    }
}
