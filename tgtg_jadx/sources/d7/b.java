package d7;

import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f14555a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14559e;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f14556b = i11 >= 30 ? a.f14554a.a(30) : 0;
        f14557c = i11 >= 30 ? a.f14554a.a(31) : 0;
        f14558d = i11 >= 30 ? a.f14554a.a(33) : 0;
        f14559e = i11 >= 30 ? a.f14554a.a(1000000) : 0;
    }

    private b() {
    }
}
