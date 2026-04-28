package o8;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32068b;

    public f(long j9, long j11) {
        if (j11 == 0) {
            this.f32067a = 0L;
            this.f32068b = 1L;
        } else {
            this.f32067a = j9;
            this.f32068b = j11;
        }
    }

    public final String toString() {
        return this.f32067a + ExpiryDateInput.SEPARATOR + this.f32068b;
    }
}
