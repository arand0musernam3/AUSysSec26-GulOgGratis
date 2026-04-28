package androidx.fragment.app;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends ActivityResultLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3136a;

    public a0(AtomicReference atomicReference, ActivityResultContract activityResultContract) {
        this.f3136a = atomicReference;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, se.b bVar) {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f3136a.get();
        if (activityResultLauncher != null) {
            activityResultLauncher.a(obj, bVar);
        } else {
            com.braze.h2.b("Operation cannot be started before fragment is in created state");
        }
    }
}
