package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2215a;

    public ImageCaptureException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f2215a = i11;
    }
}
