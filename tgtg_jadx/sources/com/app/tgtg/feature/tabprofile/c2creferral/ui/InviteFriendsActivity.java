package com.app.tgtg.feature.tabprofile.c2creferral.ui;

import android.os.Bundle;
import androidx.lifecycle.n1;
import e.f;
import e70.c;
import f70.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m90.z0;
import mr.e;
import o30.f0;
import oq.n;
import pm.m;
import qs.a;
import rq.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class InviteFriendsActivity extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9301j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f9304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f9305i;

    public InviteFriendsActivity() {
        super(1);
        this.f9302f = new n1(Reflection.getOrCreateKotlinClass(d.class), new rq.a(this, 1), new rq.a(this, 0), new rq.a(this, 2));
        this.f9305i = new e(this, 5);
    }

    public final d C() {
        return (d) this.f9302f.getValue();
    }

    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9305i);
        c cVar = this.f9303g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new z0(this, 24), 2);
        f.a(this, new u3.d(new m(this, 5), true, 1405161717));
        n nVar = C().f38159a;
        nVar.f32946e.i(pq.f.f35609a);
    }
}
