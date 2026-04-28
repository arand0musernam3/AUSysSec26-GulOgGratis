package r8;

import java.util.List;
import kotlin.collections.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list) {
        super(list);
        list.getClass();
    }

    @Override // r8.e
    public final e a(g gVar) {
        v70.e eVarB = c0.b();
        List list = this.f37759a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            eVarB.add(((b) list.get(i11)).c(gVar));
        }
        return new d(c0.a(eVarB));
    }

    public final String toString() {
        return "Edge";
    }
}
