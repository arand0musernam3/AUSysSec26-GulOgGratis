package com.google.android.gms.common.api.internal;

import android.os.Looper;
import c5.a1;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import qz.b0;
import qz.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@KeepName
public abstract class BasePendingResult<R extends p> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a1 f11070j = new a1(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f11075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Status f11076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f11077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11078h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11071a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f11072b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11073c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f11074d = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11079i = false;

    public BasePendingResult(o oVar) {
        new e(oVar != null ? ((b0) oVar).f37314b.getLooper() : Looper.getMainLooper(), 1);
        new WeakReference(oVar);
    }

    public final void a(a0 a0Var) {
        synchronized (this.f11071a) {
            try {
                if (d()) {
                    a0Var.a(this.f11076f);
                } else {
                    this.f11073c.add(a0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract p b(Status status);

    public final void c(Status status) {
        synchronized (this.f11071a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.f11078h = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        return this.f11072b.getCount() == 0;
    }

    public final void e(p pVar) {
        synchronized (this.f11071a) {
            try {
                if (this.f11078h) {
                    return;
                }
                d();
                i0.j("Results have already been set", !d());
                i0.j("Result has already been consumed", !this.f11077g);
                this.f11075e = pVar;
                this.f11076f = pVar.c();
                this.f11072b.countDown();
                ArrayList arrayList = this.f11073c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a0) arrayList.get(i11)).a(this.f11076f);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
