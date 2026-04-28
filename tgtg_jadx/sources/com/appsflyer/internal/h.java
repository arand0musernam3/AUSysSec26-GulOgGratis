package com.appsflyer.internal;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9544a;

    public /* synthetic */ h(int i11) {
        this.f9544a = i11;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.f9544a) {
            case 0:
                AFc1cSDK.getMediationNetwork(runnable, threadPoolExecutor);
                break;
            default:
                wd.a.I("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
                break;
        }
    }
}
