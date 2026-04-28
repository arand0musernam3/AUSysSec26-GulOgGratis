package com.google.android.gms.common.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s0.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements z.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11175c;

    public q() {
        this.f11173a = 1;
        this.f11174b = new Object();
        this.f11175c = new ArrayList();
    }

    @Override // z.d
    public void a() {
        synchronized (this.f11174b) {
            try {
                for (z.e eVar : this.f11175c) {
                    eVar.f46370c.g(eVar.f46368a, null);
                    eVar.f46369b.a();
                }
                this.f11175c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        this.f11175c.add(e0.f.n(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // z.d
    public void c(x0 x0Var) {
        synchronized (this.f11174b) {
            for (z.e eVar : this.f11175c) {
                eVar.getClass();
                if (Intrinsics.areEqual(eVar.f46369b, x0Var)) {
                    x0Var.a();
                }
            }
        }
    }

    @Override // z.d
    public void e(int i11, x0 x0Var, i0.b bVar) {
        x0Var.getClass();
        synchronized (this.f11174b) {
            this.f11175c.add(new z.e(i11, x0Var, bVar));
        }
    }

    public String toString() {
        switch (this.f11173a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f11174b.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = this.f11175c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append((String) arrayList.get(i11));
                    if (i11 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(Object obj) {
        this.f11173a = 0;
        i0.h(obj);
        this.f11174b = obj;
        this.f11175c = new ArrayList();
    }
}
