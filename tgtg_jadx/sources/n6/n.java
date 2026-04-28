package n6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f30656a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:189:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06e9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(n6.h r39, g6.c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.n.a(n6.h, g6.c, java.util.ArrayList, int):void");
    }

    public static void b(h hVar, g6.c cVar, g gVar) {
        gVar.f30603p = -1;
        d dVar = gVar.O;
        d dVar2 = gVar.N;
        d dVar3 = gVar.L;
        d dVar4 = gVar.M;
        d dVar5 = gVar.K;
        gVar.f30605q = -1;
        f fVar = hVar.V[0];
        f fVar2 = f.WRAP_CONTENT;
        if (fVar != fVar2 && gVar.V[0] == f.MATCH_PARENT) {
            int i11 = dVar5.f30570g;
            int iS = hVar.s() - dVar4.f30570g;
            dVar5.f30572i = cVar.k(dVar5);
            dVar4.f30572i = cVar.k(dVar4);
            cVar.d(dVar5.f30572i, i11);
            cVar.d(dVar4.f30572i, iS);
            gVar.f30603p = 2;
            gVar.f30577b0 = i11;
            int i12 = iS - i11;
            gVar.X = i12;
            int i13 = gVar.f30583e0;
            if (i12 < i13) {
                gVar.X = i13;
            }
        }
        if (hVar.V[1] == fVar2 || gVar.V[1] != f.MATCH_PARENT) {
            return;
        }
        int i14 = dVar3.f30570g;
        int iM = hVar.m() - dVar2.f30570g;
        dVar3.f30572i = cVar.k(dVar3);
        dVar2.f30572i = cVar.k(dVar2);
        cVar.d(dVar3.f30572i, i14);
        cVar.d(dVar2.f30572i, iM);
        if (gVar.f30581d0 > 0 || gVar.f30593j0 == 8) {
            g6.h hVarK = cVar.k(dVar);
            dVar.f30572i = hVarK;
            cVar.d(hVarK, gVar.f30581d0 + i14);
        }
        gVar.f30605q = 2;
        gVar.f30579c0 = i14;
        int i15 = iM - i14;
        gVar.Y = i15;
        int i16 = gVar.f30585f0;
        if (i15 < i16) {
            gVar.Y = i16;
        }
    }

    public static final boolean c(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
