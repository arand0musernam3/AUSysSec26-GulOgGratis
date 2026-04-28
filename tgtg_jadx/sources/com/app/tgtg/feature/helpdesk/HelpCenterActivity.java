package com.app.tgtg.feature.helpdesk;

import a70.a;
import ah.n;
import android.app.ComponentCaller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.activity.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.n1;
import androidx.navigation.fragment.NavHostFragment;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.order.Order;
import e70.c;
import ek.b;
import ek.d;
import ek.q;
import g9.b0;
import g9.f0;
import g9.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import l9.f;
import pd.g;
import pg.b1;
import pg.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class HelpCenterActivity extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9006j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f9007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f9009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f9010i;

    public HelpCenterActivity() {
        super(9);
        this.f9008g = new n1(Reflection.getOrCreateKotlinClass(q.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f9010i = new e0(this, 8);
    }

    public final void onActivityResult(int i11, int i12, Intent intent, ComponentCaller componentCaller) {
        componentCaller.getClass();
        super.onActivityResult(i11, i12, intent, componentCaller);
        if (i12 == 1001) {
            setResult(AppConstants.RESULT_CODE_SUPPORT_MSG_SENT);
        } else if (i12 == 1002) {
            setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
        }
        finish();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        hk.c cVarJ;
        super.onCreate(bundle);
        e1 e1Var = null;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.helpcenter_container, (ViewGroup) null, false);
        int i12 = R.id.nav_host_fragment_container;
        if (((FragmentContainerView) g.t(R.id.nav_host_fragment_container, viewInflate)) != null) {
            View viewT = g.t(R.id.toolbar, viewInflate);
            if (viewT != null) {
                this.f9007f = new e1((ConstraintLayout) viewInflate, b1.b(viewT), 0);
                getOnBackPressedDispatcher().a(this.f9010i);
                Intent intent = getIntent();
                intent.getClass();
                b bVar = (b) a.d(intent);
                int i13 = bVar == null ? -1 : ek.c.$EnumSwitchMapping$0[bVar.ordinal()];
                n1 n1Var = this.f9008g;
                if (i13 == 1) {
                    q qVar = (q) n1Var.getValue();
                    se.d dVar = qVar.f16068d;
                    hk.c cVarB = qVar.b();
                    qVar.e(dVar.K(cVarB != null ? cVarB.f22092d : null));
                } else if (i13 != 2) {
                    q qVar2 = (q) n1Var.getValue();
                    se.d dVar2 = qVar2.f16068d;
                    hk.c cVarB2 = qVar2.b();
                    qVar2.e(dVar2.L(cVarB2 != null ? cVarB2.f22092d : null));
                } else {
                    q qVar3 = (q) n1Var.getValue();
                    boolean z11 = qVar3.f16073i;
                    se.d dVar3 = qVar3.f16068d;
                    if (z11) {
                        hk.c cVarB3 = qVar3.b();
                        Order order = cVarB3 != null ? cVarB3.f22092d : null;
                        dVar3.getClass();
                        cVarJ = se.d.I(order);
                    } else {
                        hk.c cVarB4 = qVar3.b();
                        cVarJ = dVar3.J(cVarB4 != null ? cVarB4.f22092d : null);
                    }
                    qVar3.e(cVarJ);
                }
                Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_container);
                fragmentFindFragmentById.getClass();
                NavHostFragment navHostFragment = (NavHostFragment) fragmentFindFragmentById;
                b0 b0VarB = ((g0) navHostFragment.o().f20193i.getValue()).b(R.navigation.helpcenter);
                if (((q) n1Var.getValue()).b() != null) {
                    b0VarB.p(R.id.questionFragment);
                } else if (((q) n1Var.getValue()).a() != null) {
                    b0VarB.p(R.id.answerFragment);
                } else {
                    b0VarB.p(R.id.topicFragment);
                }
                f0 f0VarO = navHostFragment.o();
                f0VarO.getClass();
                f fVar = f0VarO.f20186b;
                fVar.getClass();
                fVar.v(b0VarB, null);
                e1 e1Var2 = this.f9007f;
                if (e1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e1Var2 = null;
                }
                mv.d.x((ImageButton) e1Var2.f34842c.f34796d, new ek.a(i11, this, navHostFragment));
                c cVar = this.f9009h;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                    cVar = null;
                }
                c.b(cVar, this, null, 6);
                e1 e1Var3 = this.f9007f;
                if (e1Var3 != null) {
                    e1Var = e1Var3;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                setContentView(e1Var.f34841b);
                o30.f0.S(this, true);
                return;
            }
            i12 = R.id.toolbar;
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9010i.remove();
        super.onDestroy();
    }
}
