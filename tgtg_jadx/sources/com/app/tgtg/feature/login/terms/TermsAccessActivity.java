package com.app.tgtg.feature.login.terms;

import ah.n;
import al.m;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import bg.p;
import c5.q;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.model.remote.Country;
import cv.i;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mp.a;
import mv.d;
import o30.f0;
import pd.g;
import pg.s1;
import pl.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class TermsAccessActivity extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9064j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1 f9066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f9068i;

    public TermsAccessActivity() {
        super(26);
        this.f9067h = new n1(Reflection.getOrCreateKotlinClass(al.p.class), new b(this, 1), new b(this, 0), new b(this, 2));
    }

    public final al.p a0() {
        return (al.p) this.f9067h.getValue();
    }

    public final void b0(Country country) {
        String string;
        a0().f1582u = country;
        s1 s1Var = this.f9066g;
        s1Var.getClass();
        TermsConsentView termsConsentView = (TermsConsentView) s1Var.f35155i;
        termsConsentView.setCountryText(country);
        termsConsentView.setOpenLink(new q(3, a0(), al.p.class, "openInWebView", "openInWebView(Ljava/lang/String;Lcom/app/tgtg/feature/webview/model/WebViewDestination;Ljava/lang/Integer;)V", 0, 2));
        TextView textView = (TextView) s1Var.f35152f;
        if (country == null || (string = country.getDisplayName()) == null) {
            string = getString(R.string.terms_no_country_selected);
            string.getClass();
        }
        textView.setText(string);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x70.c cVar = null;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.terms_access_view, (ViewGroup) null, false);
        int i12 = R.id.btnBack;
        ImageButton imageButton = (ImageButton) g.t(R.id.btnBack, viewInflate);
        if (imageButton != null) {
            i12 = R.id.btnSignup;
            Button button = (Button) g.t(R.id.btnSignup, viewInflate);
            if (button != null) {
                i12 = R.id.content;
                ScrollView scrollView = (ScrollView) g.t(R.id.content, viewInflate);
                if (scrollView != null) {
                    i12 = R.id.countryTitle;
                    if (((TextView) g.t(R.id.countryTitle, viewInflate)) != null) {
                        i12 = R.id.etCountryText;
                        TextView textView = (TextView) g.t(R.id.etCountryText, viewInflate);
                        if (textView != null) {
                            i12 = R.id.header;
                            ConstraintLayout constraintLayout = (ConstraintLayout) g.t(R.id.header, viewInflate);
                            if (constraintLayout != null) {
                                i12 = R.id.loading;
                                TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) g.t(R.id.loading, viewInflate);
                                if (tGTGLoadingView != null) {
                                    i12 = R.id.termsView;
                                    TermsConsentView termsConsentView = (TermsConsentView) g.t(R.id.termsView, viewInflate);
                                    if (termsConsentView != null) {
                                        i12 = R.id.toolbarTitle;
                                        if (((TextView) g.t(R.id.toolbarTitle, viewInflate)) != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                            this.f9066g = new s1(constraintLayout2, imageButton, button, scrollView, textView, constraintLayout, tGTGLoadingView, termsConsentView, 2);
                                            setContentView(constraintLayout2);
                                            f0.S(this, false);
                                            s1 s1Var = this.f9066g;
                                            s1Var.getClass();
                                            int i13 = 5;
                                            ViewCompat.k0((ConstraintLayout) s1Var.f35148b, new a(this, i13));
                                            s1 s1Var2 = this.f9066g;
                                            s1Var2.getClass();
                                            TermsConsentView termsConsentView2 = (TermsConsentView) s1Var2.f35155i;
                                            d.x((TextView) s1Var2.f35152f, new pl.a(this, i11));
                                            d.x((Button) s1Var2.f35150d, new pl.a(this, 1));
                                            int i14 = 2;
                                            d.x((ImageButton) s1Var2.f35149c, new pl.a(this, i14));
                                            termsConsentView2.k(false);
                                            termsConsentView2.l();
                                            termsConsentView2.setOnChecked(new pl.a(this, 3));
                                            c cVar2 = this.f9065f;
                                            if (cVar2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                cVar2 = null;
                                            }
                                            c.b(cVar2, this, null, 6);
                                            al.p pVarA0 = a0();
                                            pVarA0.f1583v = getIntent().getStringExtra("email");
                                            ((o0) pVarA0.f1579r.getValue()).e(this, new al.c(new pl.a(this, 4), 11));
                                            pVarA0.f1577p.e(this, new qt.b(new pl.a(this, i13), i11));
                                            v80.f0.B(m1.d(pVarA0), null, null, new m(pVarA0, cVar, i14), 3);
                                            al.p.g(pVarA0, i.SCREEN_USER_SIGNUP);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }
}
