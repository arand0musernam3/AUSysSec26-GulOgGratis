package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.a f3191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f3193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityResultCallback f3194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f3195e;

    public g0(Fragment fragment, s.a aVar, AtomicReference atomicReference, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        this.f3195e = fragment;
        this.f3191a = aVar;
        this.f3192b = atomicReference;
        this.f3193c = activityResultContract;
        this.f3194d = activityResultCallback;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        Fragment fragment = this.f3195e;
        this.f3192b.set(((ActivityResultRegistry) this.f3191a.mo962apply(null)).d(fragment.generateActivityResultKey(), fragment, this.f3193c, this.f3194d));
    }
}
