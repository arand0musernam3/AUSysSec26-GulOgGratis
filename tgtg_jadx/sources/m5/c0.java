package m5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29519a;

    public /* synthetic */ c0(int i11) {
        this.f29519a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j jVar;
        Object objA;
        switch (this.f29519a) {
            case 0:
                y3.a aVar = (y3.a) obj;
                x5.q qVar = (x5.q) obj2;
                z5.o oVar = new z5.o(qVar.f43863a);
                g0 g0Var = i0.f29562v;
                return kotlin.collections.d0.d(i0.a(oVar, g0Var, aVar), i0.a(new z5.o(qVar.f43864b), g0Var, aVar));
            case 1:
                return Integer.valueOf(((q5.r) obj2).f36049a);
            case 2:
                n nVar = (n) obj2;
                return kotlin.collections.d0.d(nVar.f29597a, i0.a(nVar.f29598b, i0.f29550i, (y3.a) obj));
            case 3:
                return Float.valueOf(((x5.a) obj2).f43835a);
            case 4:
                y3.a aVar2 = (y3.a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(i0.a((f) list.get(i11), i0.f29543b, aVar2));
                }
                return arrayList;
            case 5:
                t0 t0Var = (t0) obj2;
                return kotlin.collections.d0.d(Integer.valueOf((int) (t0Var.f29650a >> 32)), Integer.valueOf((int) (4294967295L & t0Var.f29650a)));
            case 6:
                y3.a aVar3 = (y3.a) obj;
                i4.u0 u0Var = (i4.u0) obj2;
                return kotlin.collections.d0.d(i0.a(new i4.v(u0Var.f23306a), i0.f29556p, aVar3), i0.a(new h4.b(u0Var.f23307b), i0.f29564x, aVar3), Float.valueOf(u0Var.f23308c));
            case 7:
                return Integer.valueOf(((x5.k) obj2).f43852a);
            case 8:
                return Integer.valueOf(((x5.m) obj2).f43857a);
            case 9:
                return Integer.valueOf(((x5.d) obj2).f43839a);
            case 10:
                return Integer.valueOf(((q5.n) obj2).f36034a);
            case 11:
                return Integer.valueOf(((q5.o) obj2).f36035a);
            case 12:
                z5.o oVar2 = (z5.o) obj2;
                return oVar2 != null ? z5.o.a(oVar2.f47290a, z5.o.f47289c) : false ? Boolean.FALSE : kotlin.collections.d0.d(Float.valueOf(z5.o.c(oVar2.f47290a)), i0.a(new z5.p(z5.o.b(oVar2.f47290a)), i0.f29563w, (y3.a) obj));
            case 13:
                m mVar = (m) obj2;
                return kotlin.collections.d0.d(mVar.f29590a, i0.a(mVar.f29591b, i0.f29550i, (y3.a) obj));
            case 14:
                long j9 = ((z5.p) obj2).f47291a;
                if (z5.p.a(j9, 8589934592L)) {
                    return 0;
                }
                if (z5.p.a(j9, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                h4.b bVar = (h4.b) obj2;
                return bVar != null ? h4.b.b(bVar.f21378a, 9205357640488583168L) : false ? Boolean.FALSE : kotlin.collections.d0.d(Float.valueOf(Float.intBitsToFloat((int) (bVar.f21378a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & bVar.f21378a))));
            case 16:
                y3.a aVar4 = (y3.a) obj;
                f fVar = (f) obj2;
                Object obj3 = fVar.f29529a;
                if (obj3 instanceof w) {
                    jVar = j.Paragraph;
                } else if (obj3 instanceof l0) {
                    jVar = j.Span;
                } else if (obj3 instanceof x0) {
                    jVar = j.VerbatimTts;
                } else if (obj3 instanceof w0) {
                    jVar = j.Url;
                } else if (obj3 instanceof n) {
                    jVar = j.Link;
                } else if (obj3 instanceof m) {
                    jVar = j.Clickable;
                } else {
                    if (!(obj3 instanceof n0)) {
                        c50.w.d();
                        return null;
                    }
                    jVar = j.String;
                }
                switch (h0.$EnumSwitchMapping$0[jVar.ordinal()]) {
                    case 1:
                        obj3.getClass();
                        objA = i0.a((w) obj3, i0.f29548g, aVar4);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = i0.a((l0) obj3, i0.f29549h, aVar4);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = i0.a((x0) obj3, i0.f29544c, aVar4);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = i0.a((w0) obj3, i0.f29545d, aVar4);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = i0.a((n) obj3, i0.f29546e, aVar4);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = i0.a((m) obj3, i0.f29547f, aVar4);
                        break;
                    case 7:
                        obj3.getClass();
                        objA = ((n0) obj3).f29600a;
                        break;
                    default:
                        e40.a.f();
                        return null;
                }
                return kotlin.collections.d0.d(jVar, objA, Integer.valueOf(fVar.f29530b), Integer.valueOf(fVar.f29531c), fVar.f29532d);
            case 17:
                y3.a aVar5 = (y3.a) obj;
                List list2 = ((t5.c) obj2).f39796a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(i0.a((t5.b) list2.get(i12), i0.f29566z, aVar5));
                }
                return arrayList2;
            case 18:
                return ((t5.b) obj2).f39794a.toLanguageTag();
            case 19:
                y3.a aVar6 = (y3.a) obj;
                x5.i iVar = (x5.i) obj2;
                return kotlin.collections.d0.d(i0.a(new x5.f(iVar.f43849a), i0.B, aVar6), i0.a(new x5.h(iVar.f43850b), i0.C, aVar6), i0.a(new x5.g(iVar.f43851c), i0.D, aVar6));
            case 20:
                return Float.valueOf(((x5.f) obj2).f43845a);
            case 21:
                return Integer.valueOf(((x5.h) obj2).f43847a);
            case 22:
                return Integer.valueOf(((x5.g) obj2).f43846a);
            case 23:
                return ((x0) obj2).f29670a;
            case 24:
                y3.a aVar7 = (y3.a) obj;
                w wVar = (w) obj2;
                Object objA2 = i0.a(new x5.k(wVar.f29658a), i0.f29557q, aVar7);
                Object objA3 = i0.a(new x5.m(wVar.f29659b), i0.f29558r, aVar7);
                Object objA4 = i0.a(new z5.o(wVar.f29660c), i0.f29562v, aVar7);
                x5.q qVar2 = wVar.f29661d;
                x5.q qVar3 = x5.q.f43862c;
                Object objA5 = i0.a(qVar2, i0.l, aVar7);
                Object objA6 = i0.a(wVar.f29662e, k0.f29569a, aVar7);
                x5.i iVar2 = wVar.f29663f;
                x5.i iVar3 = x5.i.f43848d;
                return kotlin.collections.d0.d(objA2, objA3, objA4, objA5, objA6, i0.a(iVar2, i0.A, aVar7), i0.a(new x5.e(wVar.f29664g), k0.f29571c, aVar7), i0.a(new x5.d(wVar.f29665h), i0.f29559s, aVar7), i0.a(wVar.f29666i, k0.f29572d, aVar7));
            case 25:
                return ((w0) obj2).f29667a;
            case 26:
                y3.a aVar8 = (y3.a) obj;
                l0 l0Var = (l0) obj2;
                i4.v vVar = new i4.v(l0Var.f29575a.b());
                g0 g0Var2 = i0.f29556p;
                Object objA7 = i0.a(vVar, g0Var2, aVar8);
                z5.o oVar3 = new z5.o(l0Var.f29576b);
                g0 g0Var3 = i0.f29562v;
                Object objA8 = i0.a(oVar3, g0Var3, aVar8);
                q5.r rVar = l0Var.f29577c;
                q5.r rVar2 = q5.r.f36037b;
                Object objA9 = i0.a(rVar, i0.f29553m, aVar8);
                Object objA10 = i0.a(l0Var.f29578d, i0.f29560t, aVar8);
                Object objA11 = i0.a(l0Var.f29579e, i0.f29561u, aVar8);
                String str = l0Var.f29581g;
                Object objA12 = i0.a(new z5.o(l0Var.f29582h), g0Var3, aVar8);
                Object objA13 = i0.a(l0Var.f29583i, i0.f29554n, aVar8);
                Object objA14 = i0.a(l0Var.f29584j, i0.f29552k, aVar8);
                t5.c cVar = l0Var.f29585k;
                t5.c cVar2 = t5.c.f39795c;
                Object objA15 = i0.a(cVar, i0.f29565y, aVar8);
                Object objA16 = i0.a(new i4.v(l0Var.l), g0Var2, aVar8);
                Object objA17 = i0.a(l0Var.f29586m, i0.f29551j, aVar8);
                i4.u0 u0Var2 = l0Var.f29587n;
                i4.u0 u0Var3 = i4.u0.f23305d;
                return kotlin.collections.d0.d(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, i0.a(u0Var2, i0.f29555o, aVar8));
            case 27:
                y3.a aVar9 = (y3.a) obj;
                r0 r0Var = (r0) obj2;
                l0 l0Var2 = r0Var.f29631a;
                ub.a aVar10 = i0.f29549h;
                return kotlin.collections.d0.d(i0.a(l0Var2, aVar10, aVar9), i0.a(r0Var.f29632b, aVar10, aVar9), i0.a(r0Var.f29633c, aVar10, aVar9), i0.a(r0Var.f29634d, aVar10, aVar9));
            case 28:
                z zVar = (z) obj2;
                Boolean boolValueOf = Boolean.valueOf(zVar.f29674a);
                ub.a aVar11 = i0.f29542a;
                return kotlin.collections.d0.d(boolValueOf, i0.a(new l(zVar.f29675b), k0.f29570b, (y3.a) obj));
            default:
                return Integer.valueOf(((l) obj2).f29574a);
        }
    }
}
