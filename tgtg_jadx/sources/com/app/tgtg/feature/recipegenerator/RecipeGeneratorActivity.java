package com.app.tgtg.feature.recipegenerator;

import a3.u2;
import ah.n;
import android.os.Bundle;
import androidx.activity.e0;
import androidx.lifecycle.n1;
import c50.p;
import e.f;
import e70.c;
import ep.a;
import ep.d0;
import g9.f0;
import hp.r;
import hp.t;
import hp.v;
import k8.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class RecipeGeneratorActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9238k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f9241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f0 f9242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9243j;

    public RecipeGeneratorActivity() {
        super(10);
        this.f9240g = new n1(Reflection.getOrCreateKotlinClass(d0.class), new a(this, 1), new a(this, 0), new a(this, 2));
        this.f9243j = new e0(this, 10);
    }

    public final d0 a0() {
        return (d0) this.f9240g.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        o30.f0.S(this, false);
        getOnBackPressedDispatcher().a(this.f9243j);
        c cVar = this.f9239f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        if (((String) a0().f16247g.a("SHARED_RECIPE_TOKEN")) != null) {
            str = t.INSTANCE.f22335a;
        } else {
            Boolean bool = (Boolean) a0().f16247g.a("OPEN_SAVED_RECIPES");
            str = bool != null ? bool.booleanValue() : false ? v.INSTANCE.f22335a : r.INSTANCE.f22335a;
        }
        p pVar = new p(this, 16);
        d dVar = new d(this);
        dVar.f26134b = new p(pVar, 17);
        this.f9241h = dVar;
        f.a(this, new u3.d(new u2(14, this, str), true, -1221296867));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a0().p(this);
    }
}
