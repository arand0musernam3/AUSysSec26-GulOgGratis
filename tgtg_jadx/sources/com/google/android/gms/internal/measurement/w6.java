package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a7 f12001d;

    public w6(a7 a7Var, boolean z11) {
        Objects.requireNonNull(a7Var);
        this.f12001d = a7Var;
        this.f11998a = System.currentTimeMillis();
        this.f11999b = SystemClock.elapsedRealtime();
        this.f12000c = z11;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        a7 a7Var = this.f12001d;
        if (a7Var.f11249e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e5) {
            a7Var.b(e5, false, this.f12000c);
            b();
        }
    }

    public void b() {
    }
}
