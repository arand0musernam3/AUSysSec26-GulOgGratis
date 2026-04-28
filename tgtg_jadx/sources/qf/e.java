package qf;

import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37042a = x0.e(new Pair(c.Before, new b()), new Pair(c.Enrichment, new b()), new Pair(c.Destination, new b()), new Pair(c.Utility, new b()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ye.b f37043b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final pf.a a(c cVar, pf.a aVar) {
        cVar.getClass();
        b bVar = (b) this.f37042a.get(cVar);
        if (aVar == null) {
            return aVar;
        }
        if (bVar == null) {
            return null;
        }
        for (d dVar : bVar.f37041a) {
            if (aVar != null) {
                if (dVar instanceof sf.b) {
                    try {
                        sf.b bVar2 = (sf.b) dVar;
                        e eVar = bVar2.f39017b;
                        if (bVar2.f39019d) {
                            pf.a aVarA = eVar.a(c.Enrichment, eVar.a(c.Before, aVar));
                            if (aVarA != null) {
                                if (aVarA instanceof pf.b) {
                                    bVar2.c((pf.b) aVarA);
                                } else if (aVarA instanceof pf.d) {
                                    bVar2.c((pf.d) aVarA);
                                } else {
                                    bVar2.c(aVarA);
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    aVar = dVar instanceof sf.b ? null : dVar.b(aVar);
                }
            }
        }
        return aVar;
    }

    public final ye.b b() {
        ye.b bVar = this.f37043b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }
}
