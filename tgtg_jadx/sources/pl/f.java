package pl;

import a3.x;
import al.i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import b0.z;
import bg.p;
import c5.q;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.terms.TermsConsentView;
import com.app.tgtg.model.remote.Country;
import com.facebook.login.widget.LoginButton;
import com.google.android.material.bottomsheet.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.r0;
import p70.k;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl/f;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTermsBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermsBottomSheet.kt\ncom/app/tgtg/feature/login/terms/TermsBottomSheet\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,196:1\n172#2,9:197\n*S KotlinDebug\n*F\n+ 1 TermsBottomSheet.kt\ncom/app/tgtg/feature/login/terms/TermsBottomSheet\n*L\n36#1:197,9\n*E\n"})
public final class f extends m implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f35479a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f35481c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pg.a f35484f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f35486h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35480b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f35482d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35483e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f35485g = new n1(Reflection.getOrCreateKotlinClass(al.p.class), new e(this, 0), new e(this, 2), new e(this, 1));

    @Override // r70.b
    public final Object a() {
        if (this.f35481c == null) {
            synchronized (this.f35482d) {
                try {
                    if (this.f35481c == null) {
                        this.f35481c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f35481c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f35480b) {
            return null;
        }
        r();
        return this.f35479a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f35479a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r();
        if (this.f35483e) {
            return;
        }
        this.f35483e = true;
        ((g) a()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.terms_bottom_sheet, viewGroup, false);
        int i11 = R.id.btnContinue;
        Button button = (Button) pd.g.t(R.id.btnContinue, viewInflate);
        if (button != null) {
            i11 = R.id.btnFacebookLogin;
            LoginButton loginButton = (LoginButton) pd.g.t(R.id.btnFacebookLogin, viewInflate);
            if (loginButton != null) {
                i11 = R.id.countryTitle;
                if (((TextView) pd.g.t(R.id.countryTitle, viewInflate)) != null) {
                    i11 = R.id.etCountryText;
                    TextView textView = (TextView) pd.g.t(R.id.etCountryText, viewInflate);
                    if (textView != null) {
                        i11 = R.id.loading;
                        TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) pd.g.t(R.id.loading, viewInflate);
                        if (tGTGLoadingView != null) {
                            i11 = R.id.termsView;
                            TermsConsentView termsConsentView = (TermsConsentView) pd.g.t(R.id.termsView, viewInflate);
                            if (termsConsentView != null) {
                                i11 = R.id.title;
                                if (((TextView) pd.g.t(R.id.title, viewInflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f35484f = new pg.a(constraintLayout, (TextView) button, (TextView) loginButton, textView, (View) tGTGLoadingView, (View) termsConsentView, 6);
                                    constraintLayout.getClass();
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        pg.a aVar = this.f35484f;
        aVar.getClass();
        ((TGTGLoadingView) aVar.f34763e).setVisibility(0);
        al.p pVarQ = q();
        ((o0) pVarQ.f1579r.getValue()).e(this, new i(this, 3));
        final int i11 = 0;
        pVarQ.f1578q.e(this, new qt.b(new Function1(this) { // from class: pl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f35476b;

            {
                this.f35476b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i12 = i11;
                int iIntValue = R.string.generic_err_undefined_error;
                f fVar = this.f35476b;
                switch (i12) {
                    case 0:
                        Throwable th2 = (Throwable) obj;
                        th2.getClass();
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        r0.o(contextRequireContext, th2);
                        fVar.dismiss();
                        break;
                    case 1:
                        cl.g gVar = (cl.g) obj;
                        gVar.getClass();
                        int i13 = gVar.f8448a;
                        Integer num = gVar.f8449b;
                        switch (i13) {
                            case 1:
                            case 3:
                            case 5:
                                break;
                            case 2:
                            case 6:
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                                fVar.t(iIntValue);
                                fVar.dismiss();
                                break;
                            case 4:
                                pg.a aVar2 = fVar.f35484f;
                                aVar2.getClass();
                                ((TGTGLoadingView) aVar2.f34763e).setVisibility(8);
                                pg.a aVar3 = fVar.f35484f;
                                aVar3.getClass();
                                ((Button) aVar3.f34761c).setEnabled(true);
                                break;
                            case 7:
                                fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                                fVar.dismiss();
                                break;
                            default:
                                fVar.t(num != null ? num.intValue() : R.string.generic_error_servers_are_busy);
                                fVar.dismiss();
                                break;
                        }
                        break;
                    case 2:
                        View view2 = (View) obj;
                        view2.getClass();
                        p pVar = fVar.f35486h;
                        if (pVar != null) {
                            pVar.showAtLocation(view2, 17, 0, 0);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        pg.a aVar4 = fVar.f35484f;
                        aVar4.getClass();
                        ((Button) aVar4.f34761c).setEnabled(zBooleanValue);
                        break;
                    default:
                        ((View) obj).getClass();
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        if (r0.u(contextRequireContext2)) {
                            pg.a aVar5 = fVar.f35484f;
                            aVar5.getClass();
                            ((Button) aVar5.f34761c).setEnabled(false);
                            pg.a aVar6 = fVar.f35484f;
                            aVar6.getClass();
                            ((TGTGLoadingView) aVar6.f34763e).setVisibility(0);
                            try {
                                al.p pVarQ2 = fVar.q();
                                if (Intrinsics.areEqual(pVarQ2.c(), cl.e.f8445b)) {
                                    Context contextRequireContext3 = fVar.requireContext();
                                    contextRequireContext3.getClass();
                                    pg.a aVar7 = fVar.f35484f;
                                    aVar7.getClass();
                                    LoginButton loginButton = (LoginButton) aVar7.f34762d;
                                    dn.k kVar = new dn.k(contextRequireContext3, loginButton);
                                    pVarQ2.f1586y = kVar;
                                    kVar.f15019c = new se.d(pVarQ2, 3);
                                    loginButton.performClick();
                                } else {
                                    androidx.fragment.app.o0 o0VarRequireActivity = fVar.requireActivity();
                                    o0VarRequireActivity.getClass();
                                    f0.B(m1.d(pVarQ2), null, null, new x(pVarQ2, o0VarRequireActivity, null, 5), 3);
                                }
                            } catch (Exception e5) {
                                sa0.a.f38953a.d(e5);
                                fVar.t(R.string.generic_err_undefined_error);
                                fVar.dismiss();
                            }
                        } else {
                            fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, i11));
        final int i12 = 1;
        pVarQ.f1577p.e(this, new qt.b(new Function1(this) { // from class: pl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f35476b;

            {
                this.f35476b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i12;
                int iIntValue = R.string.generic_err_undefined_error;
                f fVar = this.f35476b;
                switch (i122) {
                    case 0:
                        Throwable th2 = (Throwable) obj;
                        th2.getClass();
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        r0.o(contextRequireContext, th2);
                        fVar.dismiss();
                        break;
                    case 1:
                        cl.g gVar = (cl.g) obj;
                        gVar.getClass();
                        int i13 = gVar.f8448a;
                        Integer num = gVar.f8449b;
                        switch (i13) {
                            case 1:
                            case 3:
                            case 5:
                                break;
                            case 2:
                            case 6:
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                                fVar.t(iIntValue);
                                fVar.dismiss();
                                break;
                            case 4:
                                pg.a aVar2 = fVar.f35484f;
                                aVar2.getClass();
                                ((TGTGLoadingView) aVar2.f34763e).setVisibility(8);
                                pg.a aVar3 = fVar.f35484f;
                                aVar3.getClass();
                                ((Button) aVar3.f34761c).setEnabled(true);
                                break;
                            case 7:
                                fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                                fVar.dismiss();
                                break;
                            default:
                                fVar.t(num != null ? num.intValue() : R.string.generic_error_servers_are_busy);
                                fVar.dismiss();
                                break;
                        }
                        break;
                    case 2:
                        View view2 = (View) obj;
                        view2.getClass();
                        p pVar = fVar.f35486h;
                        if (pVar != null) {
                            pVar.showAtLocation(view2, 17, 0, 0);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        pg.a aVar4 = fVar.f35484f;
                        aVar4.getClass();
                        ((Button) aVar4.f34761c).setEnabled(zBooleanValue);
                        break;
                    default:
                        ((View) obj).getClass();
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        if (r0.u(contextRequireContext2)) {
                            pg.a aVar5 = fVar.f35484f;
                            aVar5.getClass();
                            ((Button) aVar5.f34761c).setEnabled(false);
                            pg.a aVar6 = fVar.f35484f;
                            aVar6.getClass();
                            ((TGTGLoadingView) aVar6.f34763e).setVisibility(0);
                            try {
                                al.p pVarQ2 = fVar.q();
                                if (Intrinsics.areEqual(pVarQ2.c(), cl.e.f8445b)) {
                                    Context contextRequireContext3 = fVar.requireContext();
                                    contextRequireContext3.getClass();
                                    pg.a aVar7 = fVar.f35484f;
                                    aVar7.getClass();
                                    LoginButton loginButton = (LoginButton) aVar7.f34762d;
                                    dn.k kVar = new dn.k(contextRequireContext3, loginButton);
                                    pVarQ2.f1586y = kVar;
                                    kVar.f15019c = new se.d(pVarQ2, 3);
                                    loginButton.performClick();
                                } else {
                                    androidx.fragment.app.o0 o0VarRequireActivity = fVar.requireActivity();
                                    o0VarRequireActivity.getClass();
                                    f0.B(m1.d(pVarQ2), null, null, new x(pVarQ2, o0VarRequireActivity, null, 5), 3);
                                }
                            } catch (Exception e5) {
                                sa0.a.f38953a.d(e5);
                                fVar.t(R.string.generic_err_undefined_error);
                                fVar.dismiss();
                            }
                        } else {
                            fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, 0));
        f0.B(m1.d(pVarQ), null, null, new al.m(pVarQ, null, 2), 3);
        pg.a aVar2 = this.f35484f;
        aVar2.getClass();
        final int i13 = 2;
        mv.d.x((TextView) aVar2.f34765g, new Function1(this) { // from class: pl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f35476b;

            {
                this.f35476b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i13;
                int iIntValue = R.string.generic_err_undefined_error;
                f fVar = this.f35476b;
                switch (i122) {
                    case 0:
                        Throwable th2 = (Throwable) obj;
                        th2.getClass();
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        r0.o(contextRequireContext, th2);
                        fVar.dismiss();
                        break;
                    case 1:
                        cl.g gVar = (cl.g) obj;
                        gVar.getClass();
                        int i132 = gVar.f8448a;
                        Integer num = gVar.f8449b;
                        switch (i132) {
                            case 1:
                            case 3:
                            case 5:
                                break;
                            case 2:
                            case 6:
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                                fVar.t(iIntValue);
                                fVar.dismiss();
                                break;
                            case 4:
                                pg.a aVar22 = fVar.f35484f;
                                aVar22.getClass();
                                ((TGTGLoadingView) aVar22.f34763e).setVisibility(8);
                                pg.a aVar3 = fVar.f35484f;
                                aVar3.getClass();
                                ((Button) aVar3.f34761c).setEnabled(true);
                                break;
                            case 7:
                                fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                                fVar.dismiss();
                                break;
                            default:
                                fVar.t(num != null ? num.intValue() : R.string.generic_error_servers_are_busy);
                                fVar.dismiss();
                                break;
                        }
                        break;
                    case 2:
                        View view2 = (View) obj;
                        view2.getClass();
                        p pVar = fVar.f35486h;
                        if (pVar != null) {
                            pVar.showAtLocation(view2, 17, 0, 0);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        pg.a aVar4 = fVar.f35484f;
                        aVar4.getClass();
                        ((Button) aVar4.f34761c).setEnabled(zBooleanValue);
                        break;
                    default:
                        ((View) obj).getClass();
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        if (r0.u(contextRequireContext2)) {
                            pg.a aVar5 = fVar.f35484f;
                            aVar5.getClass();
                            ((Button) aVar5.f34761c).setEnabled(false);
                            pg.a aVar6 = fVar.f35484f;
                            aVar6.getClass();
                            ((TGTGLoadingView) aVar6.f34763e).setVisibility(0);
                            try {
                                al.p pVarQ2 = fVar.q();
                                if (Intrinsics.areEqual(pVarQ2.c(), cl.e.f8445b)) {
                                    Context contextRequireContext3 = fVar.requireContext();
                                    contextRequireContext3.getClass();
                                    pg.a aVar7 = fVar.f35484f;
                                    aVar7.getClass();
                                    LoginButton loginButton = (LoginButton) aVar7.f34762d;
                                    dn.k kVar = new dn.k(contextRequireContext3, loginButton);
                                    pVarQ2.f1586y = kVar;
                                    kVar.f15019c = new se.d(pVarQ2, 3);
                                    loginButton.performClick();
                                } else {
                                    androidx.fragment.app.o0 o0VarRequireActivity = fVar.requireActivity();
                                    o0VarRequireActivity.getClass();
                                    f0.B(m1.d(pVarQ2), null, null, new x(pVarQ2, o0VarRequireActivity, null, 5), 3);
                                }
                            } catch (Exception e5) {
                                sa0.a.f38953a.d(e5);
                                fVar.t(R.string.generic_err_undefined_error);
                                fVar.dismiss();
                            }
                        } else {
                            fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                        }
                        break;
                }
                return Unit.f26487a;
            }
        });
        pg.a aVar3 = this.f35484f;
        aVar3.getClass();
        TermsConsentView termsConsentView = (TermsConsentView) aVar3.f34764f;
        termsConsentView.k(true);
        termsConsentView.l();
        final int i14 = 3;
        termsConsentView.setOnChecked(new Function1(this) { // from class: pl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f35476b;

            {
                this.f35476b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i14;
                int iIntValue = R.string.generic_err_undefined_error;
                f fVar = this.f35476b;
                switch (i122) {
                    case 0:
                        Throwable th2 = (Throwable) obj;
                        th2.getClass();
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        r0.o(contextRequireContext, th2);
                        fVar.dismiss();
                        break;
                    case 1:
                        cl.g gVar = (cl.g) obj;
                        gVar.getClass();
                        int i132 = gVar.f8448a;
                        Integer num = gVar.f8449b;
                        switch (i132) {
                            case 1:
                            case 3:
                            case 5:
                                break;
                            case 2:
                            case 6:
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                                fVar.t(iIntValue);
                                fVar.dismiss();
                                break;
                            case 4:
                                pg.a aVar22 = fVar.f35484f;
                                aVar22.getClass();
                                ((TGTGLoadingView) aVar22.f34763e).setVisibility(8);
                                pg.a aVar32 = fVar.f35484f;
                                aVar32.getClass();
                                ((Button) aVar32.f34761c).setEnabled(true);
                                break;
                            case 7:
                                fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                                fVar.dismiss();
                                break;
                            default:
                                fVar.t(num != null ? num.intValue() : R.string.generic_error_servers_are_busy);
                                fVar.dismiss();
                                break;
                        }
                        break;
                    case 2:
                        View view2 = (View) obj;
                        view2.getClass();
                        p pVar = fVar.f35486h;
                        if (pVar != null) {
                            pVar.showAtLocation(view2, 17, 0, 0);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        pg.a aVar4 = fVar.f35484f;
                        aVar4.getClass();
                        ((Button) aVar4.f34761c).setEnabled(zBooleanValue);
                        break;
                    default:
                        ((View) obj).getClass();
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        if (r0.u(contextRequireContext2)) {
                            pg.a aVar5 = fVar.f35484f;
                            aVar5.getClass();
                            ((Button) aVar5.f34761c).setEnabled(false);
                            pg.a aVar6 = fVar.f35484f;
                            aVar6.getClass();
                            ((TGTGLoadingView) aVar6.f34763e).setVisibility(0);
                            try {
                                al.p pVarQ2 = fVar.q();
                                if (Intrinsics.areEqual(pVarQ2.c(), cl.e.f8445b)) {
                                    Context contextRequireContext3 = fVar.requireContext();
                                    contextRequireContext3.getClass();
                                    pg.a aVar7 = fVar.f35484f;
                                    aVar7.getClass();
                                    LoginButton loginButton = (LoginButton) aVar7.f34762d;
                                    dn.k kVar = new dn.k(contextRequireContext3, loginButton);
                                    pVarQ2.f1586y = kVar;
                                    kVar.f15019c = new se.d(pVarQ2, 3);
                                    loginButton.performClick();
                                } else {
                                    androidx.fragment.app.o0 o0VarRequireActivity = fVar.requireActivity();
                                    o0VarRequireActivity.getClass();
                                    f0.B(m1.d(pVarQ2), null, null, new x(pVarQ2, o0VarRequireActivity, null, 5), 3);
                                }
                            } catch (Exception e5) {
                                sa0.a.f38953a.d(e5);
                                fVar.t(R.string.generic_err_undefined_error);
                                fVar.dismiss();
                            }
                        } else {
                            fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                        }
                        break;
                }
                return Unit.f26487a;
            }
        });
        pg.a aVar4 = this.f35484f;
        aVar4.getClass();
        final int i15 = 4;
        mv.d.x((Button) aVar4.f34761c, new Function1(this) { // from class: pl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f35476b;

            {
                this.f35476b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i15;
                int iIntValue = R.string.generic_err_undefined_error;
                f fVar = this.f35476b;
                switch (i122) {
                    case 0:
                        Throwable th2 = (Throwable) obj;
                        th2.getClass();
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        r0.o(contextRequireContext, th2);
                        fVar.dismiss();
                        break;
                    case 1:
                        cl.g gVar = (cl.g) obj;
                        gVar.getClass();
                        int i132 = gVar.f8448a;
                        Integer num = gVar.f8449b;
                        switch (i132) {
                            case 1:
                            case 3:
                            case 5:
                                break;
                            case 2:
                            case 6:
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                                fVar.t(iIntValue);
                                fVar.dismiss();
                                break;
                            case 4:
                                pg.a aVar22 = fVar.f35484f;
                                aVar22.getClass();
                                ((TGTGLoadingView) aVar22.f34763e).setVisibility(8);
                                pg.a aVar32 = fVar.f35484f;
                                aVar32.getClass();
                                ((Button) aVar32.f34761c).setEnabled(true);
                                break;
                            case 7:
                                fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                                fVar.dismiss();
                                break;
                            default:
                                fVar.t(num != null ? num.intValue() : R.string.generic_error_servers_are_busy);
                                fVar.dismiss();
                                break;
                        }
                        break;
                    case 2:
                        View view2 = (View) obj;
                        view2.getClass();
                        p pVar = fVar.f35486h;
                        if (pVar != null) {
                            pVar.showAtLocation(view2, 17, 0, 0);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        pg.a aVar42 = fVar.f35484f;
                        aVar42.getClass();
                        ((Button) aVar42.f34761c).setEnabled(zBooleanValue);
                        break;
                    default:
                        ((View) obj).getClass();
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        if (r0.u(contextRequireContext2)) {
                            pg.a aVar5 = fVar.f35484f;
                            aVar5.getClass();
                            ((Button) aVar5.f34761c).setEnabled(false);
                            pg.a aVar6 = fVar.f35484f;
                            aVar6.getClass();
                            ((TGTGLoadingView) aVar6.f34763e).setVisibility(0);
                            try {
                                al.p pVarQ2 = fVar.q();
                                if (Intrinsics.areEqual(pVarQ2.c(), cl.e.f8445b)) {
                                    Context contextRequireContext3 = fVar.requireContext();
                                    contextRequireContext3.getClass();
                                    pg.a aVar7 = fVar.f35484f;
                                    aVar7.getClass();
                                    LoginButton loginButton = (LoginButton) aVar7.f34762d;
                                    dn.k kVar = new dn.k(contextRequireContext3, loginButton);
                                    pVarQ2.f1586y = kVar;
                                    kVar.f15019c = new se.d(pVarQ2, 3);
                                    loginButton.performClick();
                                } else {
                                    androidx.fragment.app.o0 o0VarRequireActivity = fVar.requireActivity();
                                    o0VarRequireActivity.getClass();
                                    f0.B(m1.d(pVarQ2), null, null, new x(pVarQ2, o0VarRequireActivity, null, 5), 3);
                                }
                            } catch (Exception e5) {
                                sa0.a.f38953a.d(e5);
                                fVar.t(R.string.generic_err_undefined_error);
                                fVar.dismiss();
                            }
                        } else {
                            fVar.t(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                        }
                        break;
                }
                return Unit.f26487a;
            }
        });
        al.p.g(q(), cv.i.SCREEN_THIRDPARTY_TERMS);
    }

    public final al.p q() {
        return (al.p) this.f35485g.getValue();
    }

    public final void r() {
        if (this.f35479a == null) {
            this.f35479a = new k(super.getContext(), this);
            this.f35480b = z.v(super.getContext());
        }
    }

    public final void s(Country country) {
        String string;
        q().f1582u = country;
        pg.a aVar = this.f35484f;
        aVar.getClass();
        TermsConsentView termsConsentView = (TermsConsentView) aVar.f34764f;
        termsConsentView.setCountryText(country);
        termsConsentView.setOpenLink(new q(3, q(), al.p.class, "openInWebView", "openInWebView(Ljava/lang/String;Lcom/app/tgtg/feature/webview/model/WebViewDestination;Ljava/lang/Integer;)V", 0, 3));
        TextView textView = (TextView) aVar.f34765g;
        if (country == null || (string = country.getDisplayName()) == null) {
            string = getString(R.string.terms_no_country_selected);
            string.getClass();
        }
        textView.setText(string);
    }

    public final void t(int i11) {
        Toast.makeText(requireContext(), getResources().getText(i11), 0).show();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        r();
        if (this.f35483e) {
            return;
        }
        this.f35483e = true;
        ((g) a()).getClass();
    }
}
