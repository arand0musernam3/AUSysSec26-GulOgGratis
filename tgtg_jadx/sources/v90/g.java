package v90;

import com.braze.h2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import q90.g0;
import q90.p0;
import q90.v;
import q90.w;
import q90.x;
import qc.y;
import u90.n;
import u90.q;
import u90.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f42186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e20.a f42189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f42190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42194i;

    public g(n nVar, ArrayList arrayList, int i11, e20.a aVar, g0 g0Var, int i12, int i13, int i14) {
        g0Var.getClass();
        this.f42186a = nVar;
        this.f42187b = arrayList;
        this.f42188c = i11;
        this.f42189d = aVar;
        this.f42190e = g0Var;
        this.f42191f = i12;
        this.f42192g = i13;
        this.f42193h = i14;
    }

    public static g a(g gVar, int i11, e20.a aVar, g0 g0Var, int i12) {
        if ((i12 & 1) != 0) {
            i11 = gVar.f42188c;
        }
        int i13 = i11;
        if ((i12 & 2) != 0) {
            aVar = gVar.f42189d;
        }
        e20.a aVar2 = aVar;
        if ((i12 & 4) != 0) {
            g0Var = gVar.f42190e;
        }
        g0 g0Var2 = g0Var;
        int i14 = gVar.f42191f;
        int i15 = gVar.f42192g;
        int i16 = gVar.f42193h;
        g0Var2.getClass();
        return new g(gVar.f42186a, gVar.f42187b, i13, aVar2, g0Var2, i14, i15, i16);
    }

    public final p0 b(g0 g0Var) {
        g0Var.getClass();
        ArrayList arrayList = this.f42187b;
        int size = arrayList.size();
        int i11 = this.f42188c;
        if (i11 >= size) {
            h2.b("Check failed.");
            return null;
        }
        this.f42194i++;
        e20.a aVar = this.f42189d;
        if (aVar != null) {
            u uVarB = ((u90.g) aVar.f15580d).b();
            v vVar = g0Var.f36505a;
            q qVar = (q) uVarB;
            qVar.getClass();
            vVar.getClass();
            v vVar2 = qVar.f40968i.f36408h;
            if (vVar.f36627e != vVar2.f36627e || !Intrinsics.areEqual(vVar.f36626d, vVar2.f36626d)) {
                y.j("network interceptor ", arrayList.get(i11 - 1), " must retain the same host and port");
                return null;
            }
            if (this.f42194i != 1) {
                y.j("network interceptor ", arrayList.get(i11 - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i12 = i11 + 1;
        g gVarA = a(this, i12, null, g0Var, 58);
        x xVar = (x) arrayList.get(i11);
        p0 p0VarIntercept = xVar.intercept(gVarA);
        if (p0VarIntercept == null) {
            throw new NullPointerException("interceptor " + xVar + " returned null");
        }
        if (aVar == null || i12 >= arrayList.size() || gVarA.f42194i == 1) {
            return p0VarIntercept;
        }
        y.j("network interceptor ", xVar, " must call proceed() exactly once");
        return null;
    }
}
