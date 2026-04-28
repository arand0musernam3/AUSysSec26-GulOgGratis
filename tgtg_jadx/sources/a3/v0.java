package a3;

import android.view.ActionMode;
import android.view.View;
import com.app.tgtg.R;
import g3.ea;
import kotlinx.coroutines.DispatchException;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements m3.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f597b;

    public /* synthetic */ v0(Object obj, int i11) {
        this.f596a = i11;
        this.f597b = obj;
    }

    @Override // m3.k0
    public final void a() throws DispatchException {
        v80.b2 b2Var;
        int i11 = this.f596a;
        Object obj = this.f597b;
        switch (i11) {
            case 0:
                j2 j2Var = (j2) obj;
                j2Var.i();
                j2Var.f410i.setValue(Boolean.FALSE);
                break;
            case 1:
                ((c5.b2) obj).f7123b.invoke();
                break;
            case 2:
                d6.d0 d0Var = (d6.d0) obj;
                d0Var.dismiss();
                d0Var.f14450d.d();
                break;
            case 3:
                d6.g0 g0Var = (d6.g0) obj;
                g0Var.d();
                g0Var.setTag(R.id.view_tree_lifecycle_owner, null);
                g0Var.f14470o.removeViewImmediate(g0Var);
                break;
            case 4:
                h.e eVar = ((e.a) obj).f15273a;
                if (eVar == null) {
                    com.braze.h2.b("Launcher has not been initialized");
                } else {
                    eVar.b();
                }
                break;
            case 5:
                g3.b2 b2Var2 = (g3.b2) obj;
                View view = b2Var2.f18356b;
                if (b2Var2.f18355a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(b2Var2);
                    b2Var2.f18355a = false;
                }
                view.removeOnAttachStateChangeListener(b2Var2);
                break;
            case 6:
                g3.f3 f3Var = (g3.f3) obj;
                f3Var.dismiss();
                f3Var.f18595e.d();
                break;
            case 7:
                ((h2.i0) obj).f21135d = null;
                break;
            case 8:
                h2.z0 z0Var = (h2.z0) obj;
                c40.q qVar = z0Var.f21253c;
                if (qVar != null) {
                    qVar.f7092b = false;
                }
                z0Var.f21253c = null;
                break;
            case 9:
                ((h2.u0) obj).f21236f = true;
                break;
            case 10:
                v80.l lVar = ((ea) obj).f18569c;
                if (lVar != null) {
                    lVar.j(null);
                }
                break;
            case 11:
                ((l0.f) obj).f26746b.m(null);
                break;
            case 12:
                x2.w wVar = (x2.w) obj;
                s2.j jVar = wVar.f43785e.f38778a;
                if (jVar != null && (b2Var = jVar.f38775u) != null) {
                    b2Var.a(null);
                    jVar.f38775u = null;
                }
                wVar.f43790j = null;
                break;
            case 13:
                ((l3) obj).o();
                break;
            case 14:
                ((View) obj).setKeepScreenOn(false);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                r2.f fVar = (r2.f) obj;
                z3.x xVar = fVar.f37554e;
                gn.q qVar2 = xVar.f47083h;
                if (qVar2 != null) {
                    qVar2.a();
                }
                xVar.a();
                ActionMode actionMode = fVar.f37557h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                fVar.f37557h = null;
                break;
            case 16:
                ((ry.a) obj).f38270d = null;
                break;
            case 17:
                t2.b bVar = (t2.b) ((t2.c) obj).f39664c.getValue();
                if (bVar != null) {
                    bVar.close();
                }
                break;
            default:
                v80.l lVar2 = ((v1.u) obj).f41848c;
                if (lVar2 != null) {
                    lVar2.j(null);
                }
                break;
        }
    }
}
