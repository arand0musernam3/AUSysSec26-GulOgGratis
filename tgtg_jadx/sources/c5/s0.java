package c5;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements m3.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7373c;

    public /* synthetic */ s0(int i11, Object obj, Object obj2) {
        this.f7371a = i11;
        this.f7372b = obj;
        this.f7373c = obj2;
    }

    @Override // m3.k0
    public final void a() {
        switch (this.f7371a) {
            case 0:
                ((Context) this.f7372b).getApplicationContext().unregisterComponentCallbacks((t0) this.f7373c);
                break;
            case 1:
                ((Context) this.f7372b).getApplicationContext().unregisterComponentCallbacks((u0) this.f7373c);
                break;
            case 2:
                d2.z2 z2Var = (d2.z2) this.f7372b;
                View view = (View) this.f7373c;
                int i11 = z2Var.f14003u - 1;
                z2Var.f14003u = i11;
                if (i11 == 0) {
                    ViewCompat.k0(view, null);
                    ViewCompat.q0(view, null);
                    view.removeOnAttachStateChangeListener(z2Var.f14004v);
                }
                break;
            case 3:
                ((f.b) this.f7372b).b((e.g) this.f7373c);
                break;
            case 4:
                ((f.b) this.f7372b).b((e.j) this.f7373c);
                break;
            case 5:
                ((LifecycleOwner) this.f7372b).getLifecycle().d((gn.s) this.f7373c);
                break;
            case 6:
                ((h2.l1) this.f7372b).f21166c.j(this.f7373c);
                break;
            case 7:
                ((g9.l) this.f7372b).f20169h.f27523j.d((i9.k) this.f7373c);
                break;
            case 8:
                Iterator it = ((List) ((m3.c3) this.f7372b).getValue()).iterator();
                while (it.hasNext()) {
                    ((i9.i) this.f7373c).b().c((g9.l) it.next());
                }
                break;
            case 9:
                ((LifecycleOwner) this.f7372b).getLifecycle().d((androidx.lifecycle.s) this.f7373c);
                break;
            case 10:
                m3.b1 b1Var = (m3.b1) this.f7372b;
                b2.n nVar = (b2.n) b1Var.getValue();
                if (nVar != null) {
                    b2.m mVar = new b2.m(nVar);
                    b2.l lVar = (b2.l) this.f7373c;
                    if (lVar != null) {
                        lVar.c(mVar);
                    }
                    b1Var.setValue(null);
                }
                break;
            case 11:
                ((m2.e2) this.f7372b).f28845c.remove((Function1) this.f7373c);
                break;
            case 12:
                z3.y yVar = (z3.y) this.f7372b;
                if (!yVar.isEmpty()) {
                    m1.a aVar = (m1.a) this.f7373c;
                    List listR0 = CollectionsKt.r0(yVar);
                    aVar.getClass();
                    listR0.getClass();
                    ((y80.m1) ((f0.f2) aVar.f28697a).f16653f).i(new ok.p(new ok.p0(listR0)));
                }
                break;
            case 13:
                ((r9.a) this.f7372b).f();
                ((r9.d) this.f7373c).f37803e = null;
                break;
            case 14:
                ((Lifecycle) this.f7372b).d((rk.k) this.f7373c);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Lifecycle) this.f7372b).d((androidx.lifecycle.c0) this.f7373c);
                break;
            case 16:
                ((t1.g0) this.f7372b).f39434a.j((t1.d0) this.f7373c);
                break;
            case 17:
                ((t1.q1) this.f7372b).f39546j.remove((t1.q1) this.f7373c);
                break;
            case 18:
                t1.q1 q1Var = (t1.q1) this.f7372b;
                t1.m1 m1Var = (t1.m1) this.f7373c;
                q1Var.getClass();
                t1.l1 l1Var = (t1.l1) m1Var.f39494b.getValue();
                if (l1Var != null) {
                    q1Var.f39545i.remove(l1Var.f39484a);
                }
                break;
            case 19:
                ((t1.q1) this.f7372b).f39545i.remove((t1.p1) this.f7373c);
                break;
            case 20:
                ((Lifecycle) this.f7372b).d((rk.k) this.f7373c);
                break;
            case 21:
                ((androidx.lifecycle.k0) this.f7372b).j((al.i) this.f7373c);
                break;
            default:
                ((LifecycleOwner) this.f7372b).getLifecycle().d((androidx.activity.e) this.f7373c);
                break;
        }
    }
}
