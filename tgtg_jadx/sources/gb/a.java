package gb;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f20338a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20339b = b.class.getSimpleName();

    public static b a() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 30 ? d.f20347b : i11 >= 29 ? c.f20343e : i11 >= 28 ? c.f20342d : c.f20341c;
    }
}
