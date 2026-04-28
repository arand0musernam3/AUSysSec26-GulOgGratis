package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u6 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ u6 f11922b = new u6(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u6 f11923c = new u6(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11924a;

    public /* synthetic */ u6(int i11) {
        this.f11924a = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11924a) {
            case 0:
                mb mbVar = new mb("internal.platform", 4);
                mbVar.f11277b.put("getVersion", new mb("getVersion", 3));
                return mbVar;
            default:
                return null;
        }
    }
}
