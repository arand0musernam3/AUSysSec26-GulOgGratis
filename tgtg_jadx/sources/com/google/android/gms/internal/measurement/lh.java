package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class lh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jh f11608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kh f11609f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jh f11612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kh f11613d;

    static {
        int i11 = 0;
        f11608e = new jh(i11);
        f11609f = new kh(i11);
    }

    public lh(lh lhVar) {
        HashMap map = new HashMap();
        this.f11610a = map;
        HashMap map2 = new HashMap();
        this.f11611b = map2;
        map.putAll(lhVar.f11610a);
        map2.putAll(lhVar.f11611b);
        this.f11612c = lhVar.f11612c;
        this.f11613d = lhVar.f11613d;
    }

    public void a(tg tgVar, Object obj, gh ghVar) {
        jh jhVar = (jh) this.f11610a.get(tgVar);
        if (jhVar != null) {
            jhVar.a(tgVar, obj, ghVar);
        } else {
            this.f11612c.a(tgVar, obj, ghVar);
        }
    }

    public void b(tg tgVar, Iterator it, gh ghVar) {
        kh khVar = (kh) this.f11611b.get(tgVar);
        if (khVar != null) {
            khVar.a(tgVar, it, ghVar);
            return;
        }
        kh khVar2 = this.f11613d;
        if (khVar2 != null && !this.f11610a.containsKey(tgVar)) {
            khVar2.a(tgVar, it, ghVar);
        } else {
            while (it.hasNext()) {
                a(tgVar, it.next(), ghVar);
            }
        }
    }

    public /* synthetic */ lh() {
        this.f11610a = new HashMap();
        this.f11611b = new HashMap();
        this.f11613d = null;
        this.f11612c = gg.f11436a;
    }
}
