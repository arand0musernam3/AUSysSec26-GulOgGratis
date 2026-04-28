package w;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref;
import v80.b2;
import y80.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends s0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y80.i f42706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a90.d f42707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f42708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b2 f42709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CameraManager f42710j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g1 g1Var, a90.d dVar, List list, Context context) {
        super(list);
        g1Var.getClass();
        list.getClass();
        context.getClass();
        this.f42706f = g1Var;
        this.f42707g = dVar;
        this.f42708h = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.f42710j = (CameraManager) systemService;
    }

    public final ListenableFuture b() {
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            v80.f0.B(this.f42707g, null, null, new rf.c(this, iVar, null, 18), 3);
            iVar.f15776a = "FetchData for PipeCameraPresence0";
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }

    public final void c() {
        if (!this.f42708h.compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        b2 b2Var = this.f42709i;
        x70.c cVar = null;
        if (b2Var != null) {
            b2Var.a(null);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.f42709i = y80.r.u(this.f42707g, new y80.w(new y80.w(new mn.j(this.f42706f, 6), new i0(this, booleanRef, null), 5), new ah.j(this, cVar, 7)));
    }
}
