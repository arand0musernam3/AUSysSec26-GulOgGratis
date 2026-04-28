package h1;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f20998a;

    public c(Context context) {
        this.f20998a = (CameraManager) context.getSystemService(CameraManager.class);
    }
}
