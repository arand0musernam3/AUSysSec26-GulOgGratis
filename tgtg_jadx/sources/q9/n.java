package q9;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f36396a;

    public n(o oVar) {
        this.f36396a = oVar;
    }

    public final void onBackCancelled() {
        o oVar = this.f36396a;
        c cVar = oVar.f36378a;
        if (cVar == null) {
            h2.b("This input is not added to any dispatcher.");
            return;
        }
        if (!oVar.f36379b) {
            cVar.d(oVar, null);
        }
        i iVar = cVar.f36366b;
        iVar.getClass();
        if (Intrinsics.areEqual(oVar, iVar.f36387h) && -1 == iVar.f36386g) {
            e eVarC = iVar.f36385f;
            if (eVarC == null) {
                eVarC = iVar.c(-1);
            }
            iVar.f36385f = null;
            iVar.f36386g = 0;
            iVar.f36387h = null;
            j jVar = j.f36393a;
            if (eVarC != null) {
                eVarC.f36372d = jVar;
                eVarC.a();
            }
            a2 a2Var = iVar.f36380a;
            a2Var.getClass();
            a2Var.k(null, jVar);
        }
        oVar.f36379b = false;
    }

    public final void onBackInvoked() {
        this.f36396a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = i7.b.a(backEvent);
        o oVar = this.f36396a;
        c cVar = oVar.f36378a;
        if (cVar == null) {
            h2.b("This input is not added to any dispatcher.");
            return;
        }
        if (oVar.f36379b) {
            i iVar = cVar.f36366b;
            iVar.getClass();
            if (Intrinsics.areEqual(oVar, iVar.f36387h) && -1 == iVar.f36386g) {
                e eVarC = iVar.f36385f;
                if (eVarC == null) {
                    eVarC = iVar.c(-1);
                }
                if (eVarC != null) {
                    eVarC.f36372d = new k(bVarA, -1);
                    eVarC.c(bVarA);
                }
                a2 a2Var = iVar.f36380a;
                k kVar = new k(bVarA, -1);
                a2Var.getClass();
                a2Var.k(null, kVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b bVarA = i7.b.a(backEvent);
        o oVar = this.f36396a;
        c cVar = oVar.f36378a;
        if (cVar == null) {
            h2.b("This input is not added to any dispatcher.");
        } else {
            if (oVar.f36379b) {
                return;
            }
            cVar.d(oVar, bVarA);
            oVar.f36379b = true;
        }
    }
}
