package s2;

import a3.e3;
import b4.t;
import b5.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m90.z0;
import q1.o0;
import z4.c0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final t a(t tVar, Function2 function2) {
        return tVar.then(new b(function2));
    }

    public static final p2.c b(b5.l lVar) {
        p2.f fVar;
        o2.a aVar = new o2.a();
        o.o(lVar, d.f38761a, new z0(28, new z0(aVar, 27), new al.d(1, aVar, o2.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 24)));
        o0 o0Var = new o0();
        o0 o0Var2 = aVar.f31809a;
        Object[] objArr = o0Var2.f35721a;
        int i11 = o0Var2.f35722b;
        int i12 = 0;
        boolean z11 = true;
        p2.b bVar = null;
        while (true) {
            fVar = p2.f.f34139b;
            if (i12 >= i11) {
                break;
            }
            p2.b bVar2 = (p2.b) objArr[i12];
            if (!z11 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z11 = false;
                    break;
                    break;
                }
                if (bVar2 != fVar) {
                    o0 o0Var3 = aVar.f31810b;
                    Object[] objArr2 = o0Var3.f35721a;
                    int i13 = o0Var3.f35722b;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (!((Boolean) ((Function1) objArr2[i14]).invoke(bVar2)).booleanValue()) {
                            z11 = false;
                            break;
                        }
                    }
                }
                o0Var.g(bVar2);
                z11 = false;
                bVar = bVar2;
            }
            i12++;
        }
        if (((p2.b) (o0Var.d() ? null : o0Var.f35721a[o0Var.f35722b - 1])) == fVar) {
            o0Var.l(o0Var.f35722b - 1);
        }
        o3.b bVar3 = o0Var.f35803c;
        if (bVar3 == null) {
            bVar3 = new o3.b(o0Var, 1);
            o0Var.f35803c = bVar3;
        }
        return new p2.c(bVar3);
    }

    public static final t c(Function2 function2) {
        return new e(function2);
    }

    public static final t d(t tVar, l lVar, Function1 function1, e3 e3Var, Function1 function12) {
        return tVar.then(new i(lVar, function1, e3Var, function12));
    }

    public static final h4.c e(h4.c cVar, z zVar, z zVar2) {
        if (!zVar.n() || !zVar2.n()) {
            return h4.c.f21379e;
        }
        return na0.a.S(zVar2.g(c0.i(zVar), cVar.f()), cVar.e());
    }
}
