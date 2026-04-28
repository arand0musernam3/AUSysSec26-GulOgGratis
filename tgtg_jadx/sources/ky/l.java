package ky;

import android.app.ActivityManager;
import android.os.StatFs;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.d f26713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(k8.d dVar, int i11) {
        super(0);
        this.f26712a = i11;
        this.f26713b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26712a) {
            case 0:
                StatFs statFs = (StatFs) this.f26713b.f26135c;
                statFs.getClass();
                return Long.valueOf(statFs.getTotalBytes());
            default:
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = (ActivityManager) this.f26713b.f26134b;
                activityManager.getClass();
                activityManager.getMemoryInfo(memoryInfo);
                return Long.valueOf(memoryInfo.totalMem);
        }
    }
}
