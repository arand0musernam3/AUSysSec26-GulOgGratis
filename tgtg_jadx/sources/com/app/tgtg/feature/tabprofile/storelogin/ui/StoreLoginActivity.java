package com.app.tgtg.feature.tabprofile.storelogin.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import androidx.navigation.fragment.NavHostFragment;
import c50.w;
import com.app.tgtg.R;
import f70.i;
import g9.b0;
import g9.f0;
import g9.g0;
import jb.u;
import k.g;
import k.h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mr.e;
import p70.b;
import pg.b1;
import pg.e1;
import r70.c;
import zs.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreLoginActivity extends h implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9451c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9452d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f9453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f9454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f9455g;

    public StoreLoginActivity() {
        addOnContextAvailableListener(new g(this, 26));
        this.f9453e = new n1(Reflection.getOrCreateKotlinClass(f.class), new zs.e(this, 1), new zs.e(this, 0), new zs.e(this, 2));
        this.f9455g = new e(this, 17);
    }

    public final e1 A() {
        e1 e1Var = this.f9454f;
        if (e1Var != null) {
            return e1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final void C() {
        super.onDestroy();
        z().b();
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        B(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.store_login_view, (ViewGroup) null, false);
        View viewT = pd.g.t(R.id.toolbar, viewInflate);
        if (viewT == null) {
            w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.toolbar)));
            return;
        }
        this.f9454f = new e1((ConstraintLayout) viewInflate, b1.b(viewT), 1);
        getOnBackPressedDispatcher().a(this.f9455g);
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.store_signup_fragment);
        fragmentFindFragmentById.getClass();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentFindFragmentById;
        b0 b0VarB = ((g0) navHostFragment.o().f20193i.getValue()).b(R.navigation.join_tgtg_navigation);
        ((TextView) A().f34842c.f34795c).setText(getResources().getString(R.string.me_menu_tab_title_store_login));
        boolean booleanExtra = getIntent().getBooleanExtra("GO_TO_STORE_SIGNUP_WEB", false);
        n1 n1Var = this.f9453e;
        if (booleanExtra) {
            b0VarB.p(R.id.storeSignupFragmentWeb);
        } else if (!getIntent().getBooleanExtra("GO_TO_RECOMMEND_STORE", false)) {
            b0VarB.p(R.id.storeLoginIntroFragment);
        } else if (((f) n1Var.getValue()).f48076b.n().getUserStoreRecommendationUrl() != null) {
            ((LinearLayout) A().f34842c.f34797e).setVisibility(8);
            b0VarB.p(R.id.recommendStoreFragmentWeb);
        } else {
            b0VarB.p(R.id.recommendStoreFragment);
        }
        f0 f0VarO = navHostFragment.o();
        i iVar = (i) ((f) n1Var.getValue()).f48075a.a("ORIGIN");
        if (iVar == null) {
            iVar = i.UNKNOWN;
        }
        Bundle bundleX = u.x(new Pair("ORIGIN", iVar));
        f0VarO.getClass();
        f0VarO.f20186b.v(b0VarB, bundleX);
        setContentView(A().f34841b);
        o30.f0.S(this, true);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9455g.remove();
        C();
    }

    public final b z() {
        if (this.f9450b == null) {
            synchronized (this.f9451c) {
                try {
                    if (this.f9450b == null) {
                        this.f9450b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9450b;
    }
}
