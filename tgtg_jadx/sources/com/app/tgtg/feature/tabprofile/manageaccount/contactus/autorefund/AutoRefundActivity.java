package com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import bg.w0;
import c50.w;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.LargeIconButton;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import com.app.tgtg.model.remote.support.RefundType;
import k.g;
import k.h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mc.a;
import mr.e;
import mv.r0;
import p70.b;
import r70.c;
import sr.q;
import tm.d;
import u70.l;
import u70.t;
import v80.f0;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AutoRefundActivity extends h implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9403j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9405c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9406d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f9407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0 f9409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f9410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f9411i;

    public AutoRefundActivity() {
        addOnContextAvailableListener(new g(this, 17));
        this.f9408f = new n1(Reflection.getOrCreateKotlinClass(tr.g.class), new tr.c(this, 1), new tr.c(this, 0), new tr.c(this, 2));
        this.f9410h = l.b(new rv.a(this, 10));
        this.f9411i = new e(this, 8);
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final void B() {
        super.onDestroy();
        z().b();
    }

    public final void C(RefundType refundType) {
        tr.g gVar = (tr.g) this.f9408f.getValue();
        refundType.getClass();
        ((av.e) gVar.f40433e.getValue()).k(Boolean.TRUE);
        f0.B(m1.d(gVar), null, null, new d(gVar, refundType, null, 2), 3);
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        A(bundle);
        a aVar = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.auto_refund_view, (ViewGroup) null, false);
        int i12 = R.id.btnNegative;
        LargeIconButton largeIconButton = (LargeIconButton) pd.g.t(R.id.btnNegative, viewInflate);
        if (largeIconButton != null) {
            i12 = R.id.btnPositive;
            LargeIconButton largeIconButton2 = (LargeIconButton) pd.g.t(R.id.btnPositive, viewInflate);
            if (largeIconButton2 != null) {
                i12 = R.id.image;
                if (((LottieAnimationView) pd.g.t(R.id.image, viewInflate)) != null) {
                    i12 = R.id.tvDescription;
                    if (((TextView) pd.g.t(R.id.tvDescription, viewInflate)) != null) {
                        i12 = R.id.tvOr;
                        if (((TextView) pd.g.t(R.id.tvOr, viewInflate)) != null) {
                            i12 = R.id.tvTitle;
                            if (((TextView) pd.g.t(R.id.tvTitle, viewInflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                final int i13 = 1;
                                this.f9407e = new a(constraintLayout, largeIconButton, largeIconButton2, 1);
                                setContentView(constraintLayout);
                                getOnBackPressedDispatcher().a(this.f9411i);
                                a aVar2 = this.f9407e;
                                if (aVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    aVar2 = null;
                                }
                                ((LargeIconButton) aVar2.f29924d).setOnClickListener(new View.OnClickListener(this) { // from class: tr.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ AutoRefundActivity f40423b;

                                    {
                                        this.f40423b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i14 = i11;
                                        AutoRefundActivity autoRefundActivity = this.f40423b;
                                        switch (i14) {
                                            case 0:
                                                int i15 = AutoRefundActivity.f9403j;
                                                autoRefundActivity.C(RefundType.ORIGINAL_PAYMENT);
                                                break;
                                            default:
                                                int i16 = AutoRefundActivity.f9403j;
                                                autoRefundActivity.C(RefundType.REFUSE_REFUND);
                                                break;
                                        }
                                    }
                                });
                                a aVar3 = this.f9407e;
                                if (aVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    aVar = aVar3;
                                }
                                ((LargeIconButton) aVar.f29923c).setOnClickListener(new View.OnClickListener(this) { // from class: tr.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ AutoRefundActivity f40423b;

                                    {
                                        this.f40423b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i14 = i13;
                                        AutoRefundActivity autoRefundActivity = this.f40423b;
                                        switch (i14) {
                                            case 0:
                                                int i15 = AutoRefundActivity.f9403j;
                                                autoRefundActivity.C(RefundType.ORIGINAL_PAYMENT);
                                                break;
                                            default:
                                                int i16 = AutoRefundActivity.f9403j;
                                                autoRefundActivity.C(RefundType.REFUSE_REFUND);
                                                break;
                                        }
                                    }
                                });
                                n1 n1Var = this.f9408f;
                                ((av.e) ((tr.g) n1Var.getValue()).f40433e.getValue()).e(this, new dk.b(new Function1(this) { // from class: tr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ AutoRefundActivity f40425b;

                                    {
                                        this.f40425b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i14 = i11;
                                        AutoRefundActivity autoRefundActivity = this.f40425b;
                                        switch (i14) {
                                            case 0:
                                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                w0 w0Var = autoRefundActivity.f9409g;
                                                if (zBooleanValue) {
                                                    if (w0Var == null) {
                                                        autoRefundActivity.f9409g = new w0(autoRefundActivity);
                                                    }
                                                    w0 w0Var2 = autoRefundActivity.f9409g;
                                                    w0Var2.getClass();
                                                    mc.a aVar4 = autoRefundActivity.f9407e;
                                                    if (aVar4 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        aVar4 = null;
                                                    }
                                                    w0Var2.b((ConstraintLayout) aVar4.f29922b);
                                                } else if (w0Var != null) {
                                                    w0Var.a();
                                                }
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = AutoRefundActivity.f9403j;
                                                th2.getClass();
                                                r0.o(autoRefundActivity, th2);
                                                break;
                                            default:
                                                Pair pair = (Pair) obj;
                                                int i16 = AutoRefundActivity.f9403j;
                                                pair.getClass();
                                                sr.f fVar = (sr.f) pair.f26485a;
                                                Integer num = (Integer) pair.f26486b;
                                                t tVar = autoRefundActivity.f9410h;
                                                q qVar = (q) tVar.getValue();
                                                m0.l lVar = new m0.l(autoRefundActivity, 22);
                                                qVar.getClass();
                                                qVar.f39113b = lVar;
                                                ((q) tVar.getValue()).f39114c = num;
                                                ((q) tVar.getValue()).a(fVar);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                }, 6));
                                ((av.e) ((tr.g) n1Var.getValue()).f40434f.getValue()).e(this, new dk.b(new Function1(this) { // from class: tr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ AutoRefundActivity f40425b;

                                    {
                                        this.f40425b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i14 = i13;
                                        AutoRefundActivity autoRefundActivity = this.f40425b;
                                        switch (i14) {
                                            case 0:
                                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                w0 w0Var = autoRefundActivity.f9409g;
                                                if (zBooleanValue) {
                                                    if (w0Var == null) {
                                                        autoRefundActivity.f9409g = new w0(autoRefundActivity);
                                                    }
                                                    w0 w0Var2 = autoRefundActivity.f9409g;
                                                    w0Var2.getClass();
                                                    mc.a aVar4 = autoRefundActivity.f9407e;
                                                    if (aVar4 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        aVar4 = null;
                                                    }
                                                    w0Var2.b((ConstraintLayout) aVar4.f29922b);
                                                } else if (w0Var != null) {
                                                    w0Var.a();
                                                }
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = AutoRefundActivity.f9403j;
                                                th2.getClass();
                                                r0.o(autoRefundActivity, th2);
                                                break;
                                            default:
                                                Pair pair = (Pair) obj;
                                                int i16 = AutoRefundActivity.f9403j;
                                                pair.getClass();
                                                sr.f fVar = (sr.f) pair.f26485a;
                                                Integer num = (Integer) pair.f26486b;
                                                t tVar = autoRefundActivity.f9410h;
                                                q qVar = (q) tVar.getValue();
                                                m0.l lVar = new m0.l(autoRefundActivity, 22);
                                                qVar.getClass();
                                                qVar.f39113b = lVar;
                                                ((q) tVar.getValue()).f39114c = num;
                                                ((q) tVar.getValue()).a(fVar);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                }, 6));
                                final int i14 = 2;
                                ((tr.g) n1Var.getValue()).a().e(this, new dk.b(new Function1(this) { // from class: tr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ AutoRefundActivity f40425b;

                                    {
                                        this.f40425b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i142 = i14;
                                        AutoRefundActivity autoRefundActivity = this.f40425b;
                                        switch (i142) {
                                            case 0:
                                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                w0 w0Var = autoRefundActivity.f9409g;
                                                if (zBooleanValue) {
                                                    if (w0Var == null) {
                                                        autoRefundActivity.f9409g = new w0(autoRefundActivity);
                                                    }
                                                    w0 w0Var2 = autoRefundActivity.f9409g;
                                                    w0Var2.getClass();
                                                    mc.a aVar4 = autoRefundActivity.f9407e;
                                                    if (aVar4 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        aVar4 = null;
                                                    }
                                                    w0Var2.b((ConstraintLayout) aVar4.f29922b);
                                                } else if (w0Var != null) {
                                                    w0Var.a();
                                                }
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = AutoRefundActivity.f9403j;
                                                th2.getClass();
                                                r0.o(autoRefundActivity, th2);
                                                break;
                                            default:
                                                Pair pair = (Pair) obj;
                                                int i16 = AutoRefundActivity.f9403j;
                                                pair.getClass();
                                                sr.f fVar = (sr.f) pair.f26485a;
                                                Integer num = (Integer) pair.f26486b;
                                                t tVar = autoRefundActivity.f9410h;
                                                q qVar = (q) tVar.getValue();
                                                m0.l lVar = new m0.l(autoRefundActivity, 22);
                                                qVar.getClass();
                                                qVar.f39113b = lVar;
                                                ((q) tVar.getValue()).f39114c = num;
                                                ((q) tVar.getValue()).a(fVar);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                }, 6));
                                o30.f0.S(this, true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        B();
        this.f9411i.remove();
    }

    public final b z() {
        if (this.f9404b == null) {
            synchronized (this.f9405c) {
                try {
                    if (this.f9404b == null) {
                        this.f9404b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9404b;
    }
}
