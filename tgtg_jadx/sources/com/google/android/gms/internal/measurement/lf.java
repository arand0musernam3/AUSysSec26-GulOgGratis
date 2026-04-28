package com.google.android.gms.internal.measurement;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lf implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11606a;

    public /* synthetic */ lf(int i11) {
        this.f11606a = i11;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f11606a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                zzvr zzvrVar = mf.f11637g;
                throw null;
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
