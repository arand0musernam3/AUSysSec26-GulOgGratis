package xc;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import ed.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44220d;

    public a(Context context) {
        this.f44217a = context;
        Bitmap.Config[] configArr = k.f15927a;
        double d3 = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d3 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f44218b = d3;
        this.f44219c = true;
        this.f44220d = true;
    }

    public final e a() {
        h aVar;
        int i11;
        int largeMemoryClass;
        i hVar = this.f44220d ? new od.h(1) : new l50.a(26);
        if (this.f44219c) {
            double d3 = this.f44218b;
            if (d3 > 0.0d) {
                Context context = this.f44217a;
                Bitmap.Config[] configArr = k.f15927a;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    largeMemoryClass = 256;
                }
                double d11 = d3 * ((double) largeMemoryClass);
                double d12 = 1024;
                i11 = (int) (d11 * d12 * d12);
            } else {
                i11 = 0;
            }
            aVar = i11 > 0 ? new ub.a(i11, hVar) : new m1.a(hVar);
        } else {
            aVar = new m1.a(hVar);
        }
        return new e(aVar, hVar);
    }
}
