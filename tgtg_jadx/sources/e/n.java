package e;

import androidx.activity.result.ActivityResultLauncher;
import com.braze.h2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ActivityResultLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15298a;

    public n(a aVar, b1 b1Var) {
        this.f15298a = aVar;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, se.b bVar) {
        h.e eVar = this.f15298a.f15273a;
        if (eVar != null) {
            eVar.a(obj, bVar);
        } else {
            h2.b("Launcher has not been initialized");
        }
    }
}
