package te;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40057a = a60.n.b("k", "x", "y");

    public static n1.c a(ue.e eVar, he.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.H() == ue.c.BEGIN_ARRAY) {
            eVar.a();
            while (eVar.t()) {
                ue.e eVar2 = eVar;
                he.k kVar2 = kVar;
                arrayList.add(new ke.l(kVar2, p.b(eVar2, kVar2, ve.k.c(), f.f40075e, eVar.H() == ue.c.BEGIN_OBJECT, false)));
                eVar = eVar2;
                kVar = kVar2;
            }
            eVar.g();
            q.b(arrayList);
        } else {
            arrayList.add(new we.a(o.b(eVar, ve.k.c())));
        }
        return new n1.c(arrayList);
    }

    public static pe.e b(ue.e eVar, he.k kVar) {
        eVar.e();
        n1.c cVarA = null;
        pe.b bVarH0 = null;
        boolean z11 = false;
        pe.b bVarH02 = null;
        while (eVar.H() != ue.c.END_OBJECT) {
            int iJ = eVar.J(f40057a);
            if (iJ == 0) {
                cVarA = a(eVar, kVar);
            } else if (iJ != 1) {
                if (iJ != 2) {
                    eVar.L();
                    eVar.O();
                } else if (eVar.H() == ue.c.STRING) {
                    eVar.O();
                    z11 = true;
                } else {
                    bVarH0 = m0.c.h0(eVar, kVar, true);
                }
            } else if (eVar.H() == ue.c.STRING) {
                eVar.O();
                z11 = true;
            } else {
                bVarH02 = m0.c.h0(eVar, kVar, true);
            }
        }
        eVar.p();
        if (z11) {
            kVar.a("Lottie doesn't support expressions.");
        }
        return cVarA != null ? cVarA : new pe.c(bVarH02, bVarH0);
    }
}
