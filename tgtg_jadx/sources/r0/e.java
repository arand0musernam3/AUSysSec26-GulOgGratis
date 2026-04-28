package r0;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageCaptureException f37449b;

    public e(int i11, ImageCaptureException imageCaptureException) {
        this.f37448a = i11;
        this.f37449b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37448a == eVar.f37448a && this.f37449b.equals(eVar.f37449b);
    }

    public final int hashCode() {
        return ((this.f37448a ^ 1000003) * 1000003) ^ this.f37449b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f37448a + ", imageCaptureException=" + this.f37449b + "}";
    }
}
