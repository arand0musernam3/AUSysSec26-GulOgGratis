package qb;

import ib.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f36865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f36866d;

    public /* synthetic */ u(String str, List list, w wVar, int i11) {
        this.f36863a = i11;
        this.f36864b = str;
        this.f36865c = list;
        this.f36866d = wVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i11 = this.f36863a;
        int i12 = 16;
        int i13 = 15;
        int i14 = 14;
        int i15 = 4;
        int i16 = 3;
        int i17 = 2;
        int i18 = 1;
        int i19 = 0;
        w wVar = this.f36866d;
        List list = this.f36865c;
        String str = this.f36864b;
        switch (i11) {
            case 0:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                ha.c cVarV0 = aVar.v0(str);
                try {
                    Iterator it = list.iterator();
                    int i21 = 1;
                    while (it.hasNext()) {
                        cVarV0.C(i21, (String) it.next());
                        i21++;
                    }
                    int i22 = 0;
                    q1.e eVar = new q1.e(0);
                    q1.e eVar2 = new q1.e(0);
                    while (cVarV0.q0()) {
                        String strW = cVarV0.W(i22);
                        if (!eVar.containsKey(strW)) {
                            eVar.put(strW, new ArrayList());
                        }
                        String strW2 = cVarV0.W(0);
                        if (!eVar2.containsKey(strW2)) {
                            eVar2.put(strW2, new ArrayList());
                        }
                        i22 = 0;
                    }
                    cVarV0.reset();
                    wVar.b(aVar, eVar);
                    wVar.a(aVar, eVar2);
                    ArrayList arrayList = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW3 = cVarV0.W(0);
                        g0 g0VarD = xz.b.D((int) cVarV0.getLong(i18));
                        byte[] blob = cVarV0.getBlob(2);
                        ib.h hVar = ib.h.f23726b;
                        ib.h hVarT = ex.i.t(blob);
                        int i23 = (int) cVarV0.getLong(3);
                        int i24 = (int) cVarV0.getLong(4);
                        long j9 = cVarV0.getLong(14);
                        long j11 = cVarV0.getLong(15);
                        long j12 = cVarV0.getLong(16);
                        ib.a aVarA = xz.b.A((int) cVarV0.getLong(17));
                        long j13 = cVarV0.getLong(18);
                        long j14 = cVarV0.getLong(19);
                        int i25 = (int) cVarV0.getLong(20);
                        long j15 = cVarV0.getLong(21);
                        int i26 = (int) cVarV0.getLong(22);
                        ib.e eVar3 = new ib.e(xz.b.M(cVarV0.getBlob(6)), xz.b.B((int) cVarV0.getLong(5)), ((int) cVarV0.getLong(7)) != 0, ((int) cVarV0.getLong(8)) != 0, ((int) cVarV0.getLong(9)) != 0, ((int) cVarV0.getLong(10)) != 0, cVarV0.getLong(11), cVarV0.getLong(12), xz.b.l(cVarV0.getBlob(13)));
                        Object objC = x0.c(cVarV0.W(0), eVar);
                        objC.getClass();
                        List list2 = (List) objC;
                        Object objC2 = x0.c(cVarV0.W(0), eVar2);
                        objC2.getClass();
                        arrayList.add(new n(strW3, g0VarD, hVarT, j9, j11, j12, eVar3, i23, aVarA, j13, j14, i25, i24, j15, i26, list2, (List) objC2));
                        i18 = 1;
                        break;
                    }
                    cVarV0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarV0.close();
                    throw th2;
                }
            default:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                ha.c cVarV02 = aVar2.v0(str);
                try {
                    Iterator it2 = list.iterator();
                    int i27 = 1;
                    while (it2.hasNext()) {
                        cVarV02.C(i27, (String) it2.next());
                        i27++;
                    }
                    q1.e eVar4 = new q1.e(0);
                    q1.e eVar5 = new q1.e(0);
                    while (cVarV02.q0()) {
                        String strW4 = cVarV02.W(0);
                        if (!eVar4.containsKey(strW4)) {
                            eVar4.put(strW4, new ArrayList());
                        }
                        String strW5 = cVarV02.W(0);
                        if (!eVar5.containsKey(strW5)) {
                            eVar5.put(strW5, new ArrayList());
                        }
                    }
                    cVarV02.reset();
                    wVar.b(aVar2, eVar4);
                    wVar.a(aVar2, eVar5);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarV02.q0()) {
                        String strW6 = cVarV02.W(i19);
                        g0 g0VarD2 = xz.b.D((int) cVarV02.getLong(1));
                        byte[] blob2 = cVarV02.getBlob(i17);
                        ib.h hVar2 = ib.h.f23726b;
                        ib.h hVarT2 = ex.i.t(blob2);
                        int i28 = (int) cVarV02.getLong(i16);
                        int i29 = (int) cVarV02.getLong(i15);
                        long j16 = cVarV02.getLong(i14);
                        long j17 = cVarV02.getLong(i13);
                        long j18 = cVarV02.getLong(i12);
                        ib.a aVarA2 = xz.b.A((int) cVarV02.getLong(17));
                        long j19 = cVarV02.getLong(18);
                        long j21 = cVarV02.getLong(19);
                        int i31 = (int) cVarV02.getLong(20);
                        long j22 = cVarV02.getLong(21);
                        int i32 = (int) cVarV02.getLong(22);
                        ib.e eVar6 = new ib.e(xz.b.M(cVarV02.getBlob(6)), xz.b.B((int) cVarV02.getLong(5)), ((int) cVarV02.getLong(7)) != 0, ((int) cVarV02.getLong(8)) != 0, ((int) cVarV02.getLong(9)) != 0, ((int) cVarV02.getLong(10)) != 0, cVarV02.getLong(11), cVarV02.getLong(12), xz.b.l(cVarV02.getBlob(13)));
                        Object objC3 = x0.c(cVarV02.W(0), eVar4);
                        objC3.getClass();
                        List list3 = (List) objC3;
                        Object objC4 = x0.c(cVarV02.W(0), eVar5);
                        objC4.getClass();
                        arrayList2.add(new n(strW6, g0VarD2, hVarT2, j16, j17, j18, eVar6, i28, aVarA2, j19, j21, i31, i29, j22, i32, list3, (List) objC4));
                        i12 = 16;
                        i13 = 15;
                        i14 = 14;
                        i15 = 4;
                        i16 = 3;
                        i17 = 2;
                        i19 = 0;
                        break;
                    }
                    cVarV02.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    cVarV02.close();
                    throw th3;
                }
        }
    }
}
