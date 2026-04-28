package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braze.h2;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11124a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f11125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f11126c;

    public static void a(String str, boolean z11) {
        if (z11) {
            return;
        }
        i4.a.f(str);
    }

    public static void b(boolean z11) {
        if (z11) {
            return;
        }
        i4.a.h();
    }

    public static void c(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            j4.s.A(sb2, "Must be called on ", name2, " thread, but got ", name);
            a40.d0.s(sb2, ".");
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            i4.a.f("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            i4.a.f(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        h2.b(str);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        c50.w.l("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str);
    }

    public static void j(String str, boolean z11) {
        if (z11) {
            return;
        }
        h2.b(str);
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static ApiException l(Status status) {
        return status.f11061c != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
