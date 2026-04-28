package o6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f32018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f32019b;

    public static long a(g gVar, long j9) {
        t tVar = gVar.f32006d;
        ArrayList arrayList = gVar.f32013k;
        if (tVar instanceof k) {
            return j9;
        }
        int size = arrayList.size();
        long jMin = j9;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) arrayList.get(i11);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f32006d != tVar) {
                    jMin = Math.min(jMin, a(gVar2, ((long) gVar2.f32008f) + j9));
                }
            }
        }
        g gVar3 = tVar.f32037i;
        g gVar4 = tVar.f32036h;
        if (gVar != gVar3) {
            return jMin;
        }
        long j11 = j9 - tVar.j();
        return Math.min(Math.min(jMin, a(gVar4, j11)), j11 - ((long) gVar4.f32008f));
    }

    public static long b(g gVar, long j9) {
        t tVar = gVar.f32006d;
        ArrayList arrayList = gVar.f32013k;
        if (tVar instanceof k) {
            return j9;
        }
        int size = arrayList.size();
        long jMax = j9;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) arrayList.get(i11);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f32006d != tVar) {
                    jMax = Math.max(jMax, b(gVar2, ((long) gVar2.f32008f) + j9));
                }
            }
        }
        g gVar3 = tVar.f32036h;
        g gVar4 = tVar.f32037i;
        if (gVar != gVar3) {
            return jMax;
        }
        long j11 = tVar.j() + j9;
        return Math.max(Math.max(jMax, b(gVar4, j11)), j11 - ((long) gVar4.f32008f));
    }
}
