package ja0;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24806a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24808c;

    public h(long j9, long j11) {
        this.f24807b = j9;
        this.f24808c = j11;
    }

    public String toString() {
        switch (this.f24806a) {
            case 1:
                return this.f24807b + ExpiryDateInput.SEPARATOR + this.f24808c;
            default:
                return super.toString();
        }
    }

    public h(int i11, long j9, long j11) {
        this.f24807b = j9;
        this.f24808c = j11;
    }
}
