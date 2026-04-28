package e0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface k {
    static v80.i0 a(i0.c cVar, a aVar, b bVar, d dVar, List list, List list2, List list3, int i11) {
        a aVar2 = (i11 & 1) != 0 ? null : aVar;
        b bVar2 = (i11 & 2) != 0 ? null : bVar;
        d dVar2 = (i11 & 4) != 0 ? null : dVar;
        List list4 = (i11 & 8) != 0 ? null : list;
        List list5 = (i11 & 16) != 0 ? null : list2;
        List list6 = (i11 & 32) != 0 ? null : list3;
        if (!cVar.f22602a.a()) {
            return i0.h.b(cVar.f22604c, aVar2, bVar2, dVar2, null, list4, list5, list6, 8);
        }
        qc.y.j("Cannot call update3A on ", cVar, " after close.");
        return null;
    }
}
