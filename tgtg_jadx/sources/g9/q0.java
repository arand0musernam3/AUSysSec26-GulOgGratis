package g9;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f20197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f20200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f20203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f20204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f20205k;
    public static final d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f20206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f20207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f20208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f20209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f20210q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20211a;

    static {
        boolean z11 = false;
        f20196b = new d(z11, 2);
        int i11 = 4;
        f20197c = new d(z11, i11);
        boolean z12 = true;
        f20198d = new c(z12, i11);
        f20199e = new c(z12, 5);
        f20200f = new d(z11, 3);
        f20201g = new c(z12, 6);
        f20202h = new c(z12, 7);
        f20203i = new d(z11, 1);
        f20204j = new c(z12, 2);
        f20205k = new c(z12, 3);
        int i12 = 0;
        l = new d(z11, i12);
        f20206m = new c(z12, i12);
        f20207n = new c(z12, 1);
        f20208o = new d(z12, 5);
        f20209p = new c(z12, 8);
        f20210q = new c(z12, 9);
    }

    public q0(boolean z11) {
        this.f20211a = z11;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
