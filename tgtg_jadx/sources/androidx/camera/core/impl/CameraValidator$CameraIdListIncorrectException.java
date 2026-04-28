package androidx.camera.core.impl;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraValidator$CameraIdListIncorrectException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2217a;

    public CameraValidator$CameraIdListIncorrectException(int i11, RuntimeException runtimeException) {
        super("Expected camera missing from device.", runtimeException);
        this.f2217a = i11;
    }
}
