package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qa implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qa f11790a = new qa();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = oa.f11698j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
