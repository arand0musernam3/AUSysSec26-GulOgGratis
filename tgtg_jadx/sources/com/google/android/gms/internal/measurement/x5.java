package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x5 extends n5 implements c6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f12031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12032h;

    public x5() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f12031g = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = j4.s.k(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x5.C(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void A(Bundle bundle) {
        AtomicReference atomicReference = this.f12031g;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f12032h = true;
                } finally {
                    this.f12031g.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
        o5.d(parcel);
        A(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle b(long j9) {
        Bundle bundle;
        AtomicReference atomicReference = this.f12031g;
        synchronized (atomicReference) {
            if (!this.f12032h) {
                try {
                    atomicReference.wait(j9);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f12031g.get();
        }
        return bundle;
    }
}
