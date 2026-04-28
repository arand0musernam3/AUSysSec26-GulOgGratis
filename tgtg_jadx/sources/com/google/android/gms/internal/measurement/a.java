package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11236b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f11235a = i11;
        this.f11236b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f11235a) {
            case 0:
                return new z9(((t5) this.f11236b).f11867c);
            case 1:
                return new z9(((t5) this.f11236b).f11868d);
            default:
                i5 i5Var = (i5) this.f11236b;
                synchronized (((oe) i5Var.f11488c).f11729g) {
                    i5Var.f11487b = null;
                    break;
                }
                return null;
        }
    }
}
