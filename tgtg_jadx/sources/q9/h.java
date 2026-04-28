package q9;

import androidx.activity.OnBackPressedDispatcher;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;
import w.z;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f36378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36379b;

    public final void a() {
        c cVar = this.f36378a;
        if (cVar == null) {
            h2.b("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f36379b) {
            cVar.d(this, null);
        }
        i iVar = cVar.f36366b;
        z zVar = cVar.f36365a;
        iVar.getClass();
        if (Intrinsics.areEqual(this, iVar.f36387h) && -1 == iVar.f36386g) {
            e eVarC = iVar.f36385f;
            if (eVarC == null) {
                eVarC = iVar.c(-1);
            }
            iVar.f36385f = null;
            iVar.f36386g = 0;
            iVar.f36387h = null;
            j jVar = j.f36393a;
            if (eVarC == null) {
                Runnable runnable = ((OnBackPressedDispatcher) zVar.f42799b).f1700a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                eVarC.f36372d = jVar;
                eVarC.b();
            }
            a2 a2Var = iVar.f36380a;
            a2Var.getClass();
            a2Var.k(null, jVar);
        }
        this.f36379b = false;
    }

    public void b(boolean z11) {
    }
}
