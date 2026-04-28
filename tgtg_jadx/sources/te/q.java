package te;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40103a = a60.n.b("k");

    public static ArrayList a(ue.d dVar, he.k kVar, float f11, f0 f0Var, boolean z11) {
        ue.d dVar2;
        he.k kVar2;
        float f12;
        f0 f0Var2;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (dVar.H() == ue.c.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        dVar.e();
        while (dVar.t()) {
            if (dVar.J(f40103a) != 0) {
                dVar.O();
            } else if (dVar.H() == ue.c.BEGIN_ARRAY) {
                dVar.a();
                if (dVar.H() == ue.c.NUMBER) {
                    ue.d dVar3 = dVar;
                    he.k kVar3 = kVar;
                    float f13 = f11;
                    f0 f0Var3 = f0Var;
                    boolean z13 = z11;
                    we.a aVarB = p.b(dVar3, kVar3, f13, f0Var3, false, z13);
                    dVar2 = dVar3;
                    kVar2 = kVar3;
                    f12 = f13;
                    f0Var2 = f0Var3;
                    z12 = z13;
                    arrayList.add(aVarB);
                } else {
                    dVar2 = dVar;
                    kVar2 = kVar;
                    f12 = f11;
                    f0Var2 = f0Var;
                    z12 = z11;
                    while (dVar2.t()) {
                        arrayList.add(p.b(dVar2, kVar2, f12, f0Var2, true, z12));
                    }
                }
                dVar2.g();
                dVar = dVar2;
                kVar = kVar2;
                f11 = f12;
                f0Var = f0Var2;
                z11 = z12;
            } else {
                ue.d dVar4 = dVar;
                arrayList.add(p.b(dVar4, kVar, f11, f0Var, false, z11));
                dVar = dVar4;
            }
        }
        dVar.p();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i11;
        Object obj;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            we.a aVar = (we.a) arrayList.get(i12);
            i12++;
            we.a aVar2 = (we.a) arrayList.get(i12);
            aVar.f43394h = Float.valueOf(aVar2.f43393g);
            if (aVar.f43389c == null && (obj = aVar2.f43388b) != null) {
                aVar.f43389c = obj;
                if (aVar instanceof ke.l) {
                    ((ke.l) aVar).d();
                }
            }
        }
        we.a aVar3 = (we.a) arrayList.get(i11);
        if ((aVar3.f43388b == null || aVar3.f43389c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
