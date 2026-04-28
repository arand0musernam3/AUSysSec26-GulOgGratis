package com.app.tgtg;

import ag.m;
import android.app.Application;
import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.f0;
import androidx.lifecycle.t0;
import ao.h;
import ao.m0;
import com.google.firebase.messaging.a0;
import ep.l;
import fd.t;
import fd.v;
import fd.z;
import java.util.ArrayList;
import k30.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lz.i;
import m2.b2;
import p70.g;
import pd.j;
import r70.c;
import t8.a;
import vd.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends Application implements v, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8872a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8873b = new g(new i((Object) this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f8874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ag.a f8875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jt.a f8876e;

    @Override // r70.b
    public final Object a() {
        return this.f8873b.a();
    }

    @Override // fd.v
    public final t b(Context context) {
        context.getClass();
        a0 a0Var = new a0(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new fd.c(new e(), 0));
        arrayList4.add(new l(6, new j(new b2(new aa.e(this, 3), 28)), Reflection.getOrCreateKotlinClass(z.class)));
        a0Var.f12781d = new fd.e(android.support.v4.media.session.a.L(arrayList), android.support.v4.media.session.a.L(arrayList2), android.support.v4.media.session.a.L(arrayList3), android.support.v4.media.session.a.L(arrayList4), android.support.v4.media.session.a.L(arrayList5));
        return a0Var.x();
    }

    public final void c() {
        if (!this.f8872a) {
            this.f8872a = true;
            ag.i iVar = (ag.i) ((m) this.f8873b.a());
            s70.c cVar = iVar.Y;
            s70.c cVar2 = iVar.Z;
            s70.c cVar3 = iVar.f1314c0;
            s70.c cVar4 = iVar.f1317d0;
            s70.c cVar5 = iVar.f1319e0;
            ex.i.l("com.app.tgtg.services.user.AuthPolling", cVar);
            ex.i.l("com.app.tgtg.tasks.EventWorker", cVar2);
            ex.i.l("com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper", cVar3);
            ex.i.l("com.app.tgtg.tasks.RedeemWorker", cVar4);
            ex.i.l("com.app.tgtg.favWidget.WidgetUpdateWorker", cVar5);
            this.f8874c = new a(c0.b(5, new Object[]{"com.app.tgtg.services.user.AuthPolling", cVar, "com.app.tgtg.tasks.EventWorker", cVar2, "com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper", cVar3, "com.app.tgtg.tasks.RedeemWorker", cVar4, "com.app.tgtg.favWidget.WidgetUpdateWorker", cVar5}, null));
            this.f8875d = new ag.a((h) iVar.X.get(), (m0) iVar.R.get());
            this.f8876e = (jt.a) iVar.f1333m.get();
        }
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onCreate() {
        mv.m0 m0Var = sa0.a.f38953a;
        mv.m0 m0Var2 = new mv.m0(0);
        m0Var.getClass();
        if (m0Var2 == m0Var) {
            i4.a.f("Cannot plant Timber into itself.");
            return;
        }
        ArrayList arrayList = sa0.a.f38954b;
        synchronized (arrayList) {
            arrayList.add(m0Var2);
            Object[] array = arrayList.toArray(new mv.m0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sa0.a.f38955c = (mv.m0[]) array;
        }
        c();
        AppCompatDelegate.C(true);
        f0 f0Var = t0.f3512i.f3518f;
        ag.a aVar = this.f8875d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appLifecycleListener");
            aVar = null;
        }
        f0Var.a(aVar);
    }
}
