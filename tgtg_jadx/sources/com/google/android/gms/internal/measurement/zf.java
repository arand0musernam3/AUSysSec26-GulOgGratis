package com.google.android.gms.internal.measurement;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f12093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf f12094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ea f12095c;

    public zf(Ref.ObjectRef objectRef, yf yfVar, ea eaVar) {
        this.f12093a = objectRef;
        this.f12094b = yfVar;
        this.f12095c = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12093a.element != 0) {
            org.bouncycastle.jce.provider.a.c();
            return;
        }
        ea eaVar = this.f12095c;
        yf yfVarB = hf.b(hf.c(), this.f12094b);
        try {
            eaVar.run();
        } finally {
        }
    }

    public final String toString() {
        ea eaVar = this.f12095c;
        StringBuilder sb2 = new StringBuilder(eaVar.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(eaVar);
        sb2.append("]");
        return sb2.toString();
    }
}
