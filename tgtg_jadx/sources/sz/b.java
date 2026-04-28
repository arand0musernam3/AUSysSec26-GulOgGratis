package sz;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import pz.d;
import qz.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f39287a = new h("ClientTelemetry.API", new a10.b(10), new g());

    public final Task c(t tVar) {
        qz.t tVarBuilder = u.builder();
        tVarBuilder.f37390c = new d[]{h00.b.f20993a};
        tVarBuilder.f37389b = false;
        tVarBuilder.f37388a = new m1.a(tVar);
        return doBestEffortWrite(tVarBuilder.a());
    }
}
