package k8;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f26129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f26130b;

    public b(e eVar) {
        this.f26130b = eVar;
    }

    public final boolean a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f26129a);
        this.f26129a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
