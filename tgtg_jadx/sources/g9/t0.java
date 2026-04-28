package g9;

import android.os.Bundle;
import c5.l3;
import com.braze.h2;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f20218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20219b;

    public abstract z a();

    public final o b() {
        o oVar = this.f20218a;
        if (oVar != null) {
            return oVar;
        }
        h2.b("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, i0 i0Var) {
        list.getClass();
        o80.e eVar = new o80.e(o80.r.i(o80.r.m(new l3(list, 3), new ek.a(16, this, i0Var)), new nv.a(5)));
        while (eVar.hasNext()) {
            b().h((l) eVar.next());
        }
    }

    public void e(o oVar) {
        this.f20218a = oVar;
        this.f20219b = true;
    }

    public void f(l lVar) {
        z zVar = lVar.f20163b;
        if (zVar == null) {
            zVar = null;
        }
        if (zVar == null) {
            return;
        }
        c(zVar, null, y9.w.B(new r0(2)));
        b().d(lVar);
    }

    public Bundle h() {
        return null;
    }

    public void i(l lVar, boolean z11) {
        List list = (List) b().f20180e.f45488a.getValue();
        if (!list.contains(lVar)) {
            e40.a.i("popBackStack was called with ", lVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        l lVar2 = null;
        while (j()) {
            lVar2 = (l) listIterator.previous();
            if (Intrinsics.areEqual(lVar2, lVar)) {
                break;
            }
        }
        if (lVar2 != null) {
            b().e(lVar2, z11);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public z c(z zVar, Bundle bundle, i0 i0Var) {
        return zVar;
    }
}
