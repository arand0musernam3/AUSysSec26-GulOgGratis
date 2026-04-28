package i9;

import g9.i0;
import g9.s0;
import g9.t0;
import g9.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Li9/p;", "Lg9/t0;", "Li9/o;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1863#2,2:90\n1872#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
public final class p extends t0 {
    @Override // g9.t0
    public final z a() {
        u3.d dVar = e.f23506a;
        return new o(this);
    }

    @Override // g9.t0
    public final void d(List list, i0 i0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((g9.l) it.next());
        }
    }

    @Override // g9.t0
    public final void i(g9.l lVar, boolean z11) {
        b().f(lVar, z11);
        int iR = CollectionsKt.R((Iterable) b().f20181f.f45488a.getValue(), lVar);
        int i11 = 0;
        for (Object obj : (Iterable) b().f20181f.f45488a.getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            g9.l lVar2 = (g9.l) obj;
            if (i11 > iR) {
                b().c(lVar2);
            }
            i11 = i12;
        }
    }
}
