package q90;

import androidx.lifecycle.n1;
import com.braze.h2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f36505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f36507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f36508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y9.w f36509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f36510f;

    public g0(n1 n1Var) {
        n1Var.getClass();
        v vVar = (v) n1Var.f3499a;
        if (vVar == null) {
            h2.b("url == null");
            throw null;
        }
        this.f36505a = vVar;
        this.f36506b = (String) n1Var.f3500b;
        this.f36507c = ((ax.g0) n1Var.f3501c).g();
        this.f36508d = (n0) n1Var.f3502d;
        this.f36509e = (y9.w) n1Var.f3503e;
    }

    public final g a() {
        g gVar = this.f36510f;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = g.f36491n;
        g gVarB = p30.b.B(this.f36507c);
        this.f36510f = gVarB;
        return gVarB;
    }

    public final n1 b() {
        n1 n1Var = new n1();
        n1Var.f3499a = this.f36505a;
        n1Var.f3500b = this.f36506b;
        n1Var.f3502d = this.f36508d;
        n1Var.f3503e = this.f36509e;
        n1Var.f3501c = this.f36507c.e();
        return n1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f36506b);
        sb2.append(", url=");
        sb2.append(this.f36505a);
        t tVar = this.f36507c;
        if (tVar.size() != 0) {
            sb2.append(", headers=[");
            int i11 = 0;
            for (Object obj : tVar) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    kotlin.collections.d0.n();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.f26485a;
                String str2 = (String) pair.f26486b;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (r90.e.m(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i11 = i12;
            }
            sb2.append(']');
        }
        r90.a aVar = r90.a.f37804c;
        y9.w wVar = this.f36509e;
        if (!Intrinsics.areEqual(wVar, aVar)) {
            sb2.append(", tags=");
            sb2.append(wVar);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
