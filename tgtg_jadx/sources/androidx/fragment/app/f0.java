package androidx.fragment.app;

import androidx.activity.result.ActivityResultRegistry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3186b;

    public /* synthetic */ f0(Object obj, int i11) {
        this.f3185a = i11;
        this.f3186b = obj;
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public final Object mo962apply(Object obj) {
        switch (this.f3185a) {
            case 0:
                Fragment fragment = (Fragment) this.f3186b;
                Object obj2 = fragment.mHost;
                return obj2 instanceof h.f ? ((h.f) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            default:
                return (ActivityResultRegistry) this.f3186b;
        }
    }
}
