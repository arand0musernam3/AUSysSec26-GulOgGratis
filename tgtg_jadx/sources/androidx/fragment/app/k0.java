package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements ea.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3247b;

    public /* synthetic */ k0(Object obj, int i11) {
        this.f3246a = i11;
        this.f3247b = obj;
    }

    @Override // ea.d
    public final Bundle a() {
        int i11 = this.f3246a;
        Object obj = this.f3247b;
        switch (i11) {
            case 0:
                o0 o0Var = (o0) obj;
                String str = o0.LIFECYCLE_TAG;
                o0Var.markFragmentsCreated();
                o0Var.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_STOP);
                return new Bundle();
            default:
                return ((FragmentManager) obj).a0();
        }
    }
}
