package com.app.tgtg.feature.login.email;

import ah.n;
import al.p;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.n1;
import b0.a0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.google.android.material.textfield.TextInputEditText;
import cv.i;
import e70.c;
import fl.b;
import ft.e;
import jb.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.d;
import o30.f0;
import pd.g;
import pg.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class EmailAccessActivity extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9043j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0 f9045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f9047i;

    public EmailAccessActivity() {
        super(11);
        this.f9046h = new n1(Reflection.getOrCreateKotlinClass(p.class), new b(this, 1), new b(this, 0), new b(this, 2));
        this.f9047i = new e0(this, 12);
    }

    public final void a0(boolean z11) {
        x0 x0Var = this.f9045g;
        if (z11) {
            x0Var.getClass();
            x0Var.f35263d.setVisibility(0);
            x0 x0Var2 = this.f9045g;
            x0Var2.getClass();
            ((TextInputEditText) x0Var2.f35268i).setBackground(a0.x(this, R.drawable.signup_input_error_background));
            return;
        }
        x0Var.getClass();
        x0Var.f35263d.setVisibility(8);
        x0 x0Var3 = this.f9045g;
        x0Var3.getClass();
        ((TextInputEditText) x0Var3.f35268i).setBackground(a0.x(this, R.drawable.signup_input_background));
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.email_access_view, (ViewGroup) null, false);
        int i12 = R.id.btnBack;
        ImageButton imageButton = (ImageButton) g.t(R.id.btnBack, viewInflate);
        if (imageButton != null) {
            i12 = R.id.btnSignup;
            Button button = (Button) g.t(R.id.btnSignup, viewInflate);
            if (button != null) {
                i12 = R.id.cbMailConsent;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) g.t(R.id.cbMailConsent, viewInflate);
                if (appCompatCheckBox != null) {
                    i12 = R.id.checkMailConsentLayout;
                    if (((LinearLayout) g.t(R.id.checkMailConsentLayout, viewInflate)) != null) {
                        i12 = R.id.content;
                        ScrollView scrollView = (ScrollView) g.t(R.id.content, viewInflate);
                        if (scrollView != null) {
                            i12 = R.id.emailError;
                            TextView textView = (TextView) g.t(R.id.emailError, viewInflate);
                            if (textView != null) {
                                i12 = R.id.emailInput;
                                TextInputEditText textInputEditText = (TextInputEditText) g.t(R.id.emailInput, viewInflate);
                                if (textInputEditText != null) {
                                    i12 = R.id.emailTitle;
                                    if (((TextView) g.t(R.id.emailTitle, viewInflate)) != null) {
                                        i12 = R.id.header;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) g.t(R.id.header, viewInflate);
                                        if (constraintLayout != null) {
                                            i12 = R.id.loading;
                                            TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) g.t(R.id.loading, viewInflate);
                                            if (tGTGLoadingView != null) {
                                                i12 = R.id.toolbarTitle;
                                                if (((TextView) g.t(R.id.toolbarTitle, viewInflate)) != null) {
                                                    i12 = R.id.tvMailConsent;
                                                    if (((TextView) g.t(R.id.tvMailConsent, viewInflate)) != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                        this.f9045g = new x0(constraintLayout2, imageButton, button, appCompatCheckBox, scrollView, textView, textInputEditText, constraintLayout, tGTGLoadingView);
                                                        setContentView(constraintLayout2);
                                                        f0.S(this, false);
                                                        getOnBackPressedDispatcher().a(this.f9047i);
                                                        s sVarD = s.d(this);
                                                        sVarD.getClass();
                                                        sVarD.a("UserPolling2");
                                                        x0 x0Var = this.f9045g;
                                                        x0Var.getClass();
                                                        final int i13 = 2;
                                                        ((AppCompatCheckBox) x0Var.f35266g).setOnCheckedChangeListener(new com.adyen.checkout.card.internal.ui.view.c(this, i13));
                                                        c cVar = this.f9044f;
                                                        if (cVar == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                            cVar = null;
                                                        }
                                                        final int i14 = 3;
                                                        c.b(cVar, this, new Function1(this) { // from class: fl.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ EmailAccessActivity f17775b;

                                                            {
                                                                this.f17775b = this;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                To view partially-correct add '--show-bad-code' argument
                                                            */
                                                            public final java.lang.Object invoke(java.lang.Object r7) {
                                                                /*
                                                                    Method dump skipped, instruction units count: 292
                                                                    To view this dump add '--comments-level debug' option
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: fl.a.invoke(java.lang.Object):java.lang.Object");
                                                            }
                                                        }, 2);
                                                        n1 n1Var = this.f9046h;
                                                        ((p) n1Var.getValue()).f1577p.e(this, new qt.b(new Function1(this) { // from class: fl.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ EmailAccessActivity f17775b;

                                                            {
                                                                this.f17775b = this;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                To view partially-correct add '--show-bad-code' argument
                                                            */
                                                            public final java.lang.Object invoke(java.lang.Object r7) {
                                                                /*
                                                                    Method dump skipped, instruction units count: 292
                                                                    To view this dump add '--comments-level debug' option
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: fl.a.invoke(java.lang.Object):java.lang.Object");
                                                            }
                                                        }, i11));
                                                        SharedPreferences sharedPreferences2 = e.f17922c;
                                                        if (sharedPreferences2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                                                        } else {
                                                            sharedPreferences = sharedPreferences2;
                                                        }
                                                        if (sharedPreferences.getBoolean("partnerLoginOngoing", false)) {
                                                            ft.c.a0(false);
                                                        }
                                                        x0 x0Var2 = this.f9045g;
                                                        x0Var2.getClass();
                                                        int i15 = 5;
                                                        ViewCompat.k0(x0Var2.f35261b, new e.b(this, i15));
                                                        x0 x0Var3 = this.f9045g;
                                                        x0Var3.getClass();
                                                        final int i16 = 1;
                                                        d.x((Button) x0Var3.f35265f, new Function1(this) { // from class: fl.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ EmailAccessActivity f17775b;

                                                            {
                                                                this.f17775b = this;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                To view partially-correct add '--show-bad-code' argument
                                                            */
                                                            public final java.lang.Object invoke(java.lang.Object r7) {
                                                                /*
                                                                    Method dump skipped, instruction units count: 292
                                                                    To view this dump add '--comments-level debug' option
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: fl.a.invoke(java.lang.Object):java.lang.Object");
                                                            }
                                                        });
                                                        x0 x0Var4 = this.f9045g;
                                                        x0Var4.getClass();
                                                        ((TextInputEditText) x0Var4.f35268i).setOnFocusChangeListener(new bg.s(this, i15));
                                                        x0 x0Var5 = this.f9045g;
                                                        x0Var5.getClass();
                                                        d.x((ImageButton) x0Var5.f35264e, new Function1(this) { // from class: fl.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ EmailAccessActivity f17775b;

                                                            {
                                                                this.f17775b = this;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                To view partially-correct add '--show-bad-code' argument
                                                            */
                                                            public final java.lang.Object invoke(java.lang.Object r7) {
                                                                /*
                                                                    Method dump skipped, instruction units count: 292
                                                                    To view this dump add '--comments-level debug' option
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: fl.a.invoke(java.lang.Object):java.lang.Object");
                                                            }
                                                        });
                                                        p.g((p) n1Var.getValue(), i.SCREEN_LANDING_EMAIL);
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
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9047i.remove();
        super.onDestroy();
    }
}
