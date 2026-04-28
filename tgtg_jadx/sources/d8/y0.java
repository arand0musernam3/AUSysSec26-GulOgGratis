package d8;

import androidx.datastore.core.NativeSharedCounter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y0 f14746a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NativeSharedCounter f14747b;

    static {
        System.loadLibrary("datastore_shared_counter");
        f14747b = new NativeSharedCounter();
    }
}
