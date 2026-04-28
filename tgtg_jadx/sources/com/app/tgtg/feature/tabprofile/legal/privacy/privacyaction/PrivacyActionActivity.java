package com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction;

import a3.x1;
import a9.a;
import ah.n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import b0.a0;
import bg.i0;
import bg.k0;
import bg.y;
import c50.w;
import c90.e;
import c90.f;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import e70.c;
import fr.g;
import fr.i;
import he.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.r0;
import pg.b1;
import pg.s1;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class PrivacyActionActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9330k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1 f9332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9335j;

    public PrivacyActionActivity() {
        super(13);
        this.f9333h = new n1(Reflection.getOrCreateKotlinClass(i.class), new g(this, 1), new g(this, 0), new g(this, 2));
        this.f9335j = new e0(this, 15);
    }

    public final void a0() {
        String email = b0().f17888b.m().getEmail();
        if (r0.v(email) && !r0.v(b0().f17896j)) {
            email = b0().f17896j;
        }
        String str = email;
        if (r0.v(str)) {
            Toast.makeText(this, R.string.generic_err_undefined_error, 0).show();
            return;
        }
        i iVarB0 = b0();
        str.getClass();
        a aVarD = m1.d(iVarB0);
        f fVar = p0.f42144a;
        f0.B(aVarD, e.f7834b, null, new x1(this, str, iVarB0, (x70.c) null, 24), 2);
    }

    public final i b0() {
        return (i) this.f9333h.getValue();
    }

    public final void c0(int i11, int i12, int i13, int i14, String str) {
        s1 s1Var = this.f9332g;
        if (s1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s1Var = null;
        }
        TextView textView = (TextView) s1Var.f35155i;
        Button button = (Button) s1Var.f35150d;
        Button button2 = (Button) s1Var.f35151e;
        textView.setText(i11);
        ((TextView) s1Var.f35154h).setText(i12);
        button2.setText(i13);
        button2.setBackground(a0.x(this, i14));
        button.setText(R.string.privacy_delete_account_negative_button);
        button.setVisibility(b0().a() ? 0 : 8);
        o.b(this, str).b(new y(s1Var, 4));
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final PrivacyActionActivity privacyActionActivity;
        super.onCreate(bundle);
        if (!getIntent().hasExtra("ACTION")) {
            finish();
        }
        s1 s1Var = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.privacy_action_view, (ViewGroup) null, false);
        int i12 = R.id.animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) pd.g.t(R.id.animation, viewInflate);
        if (lottieAnimationView != null) {
            i12 = R.id.btnCancel;
            Button button = (Button) pd.g.t(R.id.btnCancel, viewInflate);
            if (button != null) {
                i12 = R.id.btnOk;
                Button button2 = (Button) pd.g.t(R.id.btnOk, viewInflate);
                if (button2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i12 = R.id.toolbar;
                    View viewT = pd.g.t(R.id.toolbar, viewInflate);
                    if (viewT != null) {
                        b1 b1VarB = b1.b(viewT);
                        i12 = R.id.tvDescription;
                        TextView textView = (TextView) pd.g.t(R.id.tvDescription, viewInflate);
                        if (textView != null) {
                            i12 = R.id.tvTitle;
                            TextView textView2 = (TextView) pd.g.t(R.id.tvTitle, viewInflate);
                            if (textView2 != null) {
                                this.f9332g = new s1(constraintLayout, lottieAnimationView, button, button2, constraintLayout, b1VarB, textView, textView2, 1);
                                setContentView(constraintLayout);
                                m0.c.f0((o0) b0().f17892f.getValue(), this, new Function1(this) { // from class: fr.f

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17884b;

                                    {
                                        this.f17884b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i13 = i11;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17884b;
                                        switch (i13) {
                                            case 0:
                                                int i14 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.setResult(1338);
                                                privacyActionActivity2.finish();
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = PrivacyActionActivity.f9330k;
                                                th2.getClass();
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th2);
                                                break;
                                            case 2:
                                                int i16 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.b0().f17891e.f16347a.a(LoginActivity.f9032j);
                                                break;
                                            default:
                                                Throwable th3 = (Throwable) obj;
                                                int i17 = PrivacyActionActivity.f9330k;
                                                th3.getClass();
                                                privacyActionActivity2.f9334i = false;
                                                s1 s1Var2 = privacyActionActivity2.f9332g;
                                                if (s1Var2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    s1Var2 = null;
                                                }
                                                ((Button) s1Var2.f35150d).setEnabled(true);
                                                ((Button) s1Var2.f35151e).setEnabled(true);
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th3);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                });
                                final int i13 = 1;
                                m0.c.f0((o0) b0().f17893g.getValue(), this, new Function1(this) { // from class: fr.f

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17884b;

                                    {
                                        this.f17884b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i132 = i13;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17884b;
                                        switch (i132) {
                                            case 0:
                                                int i14 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.setResult(1338);
                                                privacyActionActivity2.finish();
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = PrivacyActionActivity.f9330k;
                                                th2.getClass();
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th2);
                                                break;
                                            case 2:
                                                int i16 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.b0().f17891e.f16347a.a(LoginActivity.f9032j);
                                                break;
                                            default:
                                                Throwable th3 = (Throwable) obj;
                                                int i17 = PrivacyActionActivity.f9330k;
                                                th3.getClass();
                                                privacyActionActivity2.f9334i = false;
                                                s1 s1Var2 = privacyActionActivity2.f9332g;
                                                if (s1Var2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    s1Var2 = null;
                                                }
                                                ((Button) s1Var2.f35150d).setEnabled(true);
                                                ((Button) s1Var2.f35151e).setEnabled(true);
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th3);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                });
                                final int i14 = 2;
                                m0.c.f0((o0) b0().f17894h.getValue(), this, new Function1(this) { // from class: fr.f

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17884b;

                                    {
                                        this.f17884b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i132 = i14;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17884b;
                                        switch (i132) {
                                            case 0:
                                                int i142 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.setResult(1338);
                                                privacyActionActivity2.finish();
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i15 = PrivacyActionActivity.f9330k;
                                                th2.getClass();
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th2);
                                                break;
                                            case 2:
                                                int i16 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.b0().f17891e.f16347a.a(LoginActivity.f9032j);
                                                break;
                                            default:
                                                Throwable th3 = (Throwable) obj;
                                                int i17 = PrivacyActionActivity.f9330k;
                                                th3.getClass();
                                                privacyActionActivity2.f9334i = false;
                                                s1 s1Var2 = privacyActionActivity2.f9332g;
                                                if (s1Var2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    s1Var2 = null;
                                                }
                                                ((Button) s1Var2.f35150d).setEnabled(true);
                                                ((Button) s1Var2.f35151e).setEnabled(true);
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th3);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                });
                                final int i15 = 3;
                                m0.c.f0((o0) b0().f17895i.getValue(), this, new Function1(this) { // from class: fr.f

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17884b;

                                    {
                                        this.f17884b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i132 = i15;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17884b;
                                        switch (i132) {
                                            case 0:
                                                int i142 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.setResult(1338);
                                                privacyActionActivity2.finish();
                                                break;
                                            case 1:
                                                Throwable th2 = (Throwable) obj;
                                                int i152 = PrivacyActionActivity.f9330k;
                                                th2.getClass();
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th2);
                                                break;
                                            case 2:
                                                int i16 = PrivacyActionActivity.f9330k;
                                                ((q90.r0) obj).getClass();
                                                privacyActionActivity2.b0().f17891e.f16347a.a(LoginActivity.f9032j);
                                                break;
                                            default:
                                                Throwable th3 = (Throwable) obj;
                                                int i17 = PrivacyActionActivity.f9330k;
                                                th3.getClass();
                                                privacyActionActivity2.f9334i = false;
                                                s1 s1Var2 = privacyActionActivity2.f9332g;
                                                if (s1Var2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    s1Var2 = null;
                                                }
                                                ((Button) s1Var2.f35150d).setEnabled(true);
                                                ((Button) s1Var2.f35151e).setEnabled(true);
                                                privacyActionActivity2.b0();
                                                r0.o(privacyActionActivity2, th3);
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                });
                                c cVar = this.f9331f;
                                if (cVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                    cVar = null;
                                }
                                c.b(cVar, this, null, 6);
                                getOnBackPressedDispatcher().a(this.f9335j);
                                if (b0().a()) {
                                    c0(R.string.privacy_delete_account_title, R.string.privacy_delete_account_description, R.string.privacy_delete_account_positive_button, R.drawable.button_primary_warning_bg_states, "sad_smiley_blob.json");
                                    privacyActionActivity = this;
                                } else {
                                    privacyActionActivity = this;
                                    privacyActionActivity.c0(R.string.privacy_request_data_title, R.string.privacy_request_data_description, R.string.privacy_request_data_positive_button, R.drawable.button_primary_main_bg_states, "lock_blob.json");
                                }
                                s1 s1Var2 = privacyActionActivity.f9332g;
                                if (s1Var2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    s1Var = s1Var2;
                                }
                                ((ImageButton) ((b1) s1Var.f35153g).f34796d).setOnClickListener(new View.OnClickListener(privacyActionActivity) { // from class: fr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17873b;

                                    {
                                        this.f17873b = privacyActionActivity;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i16 = i11;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17873b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                            case 1:
                                                int i18 = PrivacyActionActivity.f9330k;
                                                final PrivacyActionActivity privacyActionActivity3 = this.f17873b;
                                                final int i19 = 0;
                                                if (!privacyActionActivity3.b0().a()) {
                                                    String email = privacyActionActivity3.b0().f17888b.m().getEmail();
                                                    final int i21 = 1;
                                                    if (!r0.v(email)) {
                                                        k0 k0Var = new k0(privacyActionActivity3);
                                                        k0Var.e(R.string.privacy_request_data_popup_description);
                                                        email.getClass();
                                                        k0Var.f6172c = email;
                                                        k0Var.c(R.string.privacy_request_data_popup_positive_button);
                                                        k0Var.b(R.string.privacy_request_data_popup_negative_button);
                                                        k0Var.l = new Function0() { // from class: fr.c
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i22 = i21;
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                switch (i22) {
                                                                    case 0:
                                                                        privacyActionActivity4.f9334i = true;
                                                                        s1 s1Var3 = privacyActionActivity4.f9332g;
                                                                        x70.c cVar2 = null;
                                                                        if (s1Var3 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            s1Var3 = null;
                                                                        }
                                                                        ((Button) s1Var3.f35150d).setEnabled(false);
                                                                        ((Button) s1Var3.f35151e).setEnabled(false);
                                                                        i iVarB0 = privacyActionActivity4.b0();
                                                                        a9.a aVarD = m1.d(iVarB0);
                                                                        c90.f fVar = p0.f42144a;
                                                                        f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                        break;
                                                                    default:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        privacyActionActivity4.a0();
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        };
                                                        k0Var.f();
                                                    } else {
                                                        final e40.a aVar = new e40.a(14);
                                                        Object systemService = privacyActionActivity3.getSystemService("layout_inflater");
                                                        systemService.getClass();
                                                        s1 s1Var3 = null;
                                                        View viewInflate2 = ((LayoutInflater) systemService).inflate(R.layout.email_confirm_popup, (ViewGroup) null);
                                                        final PopupWindow popupWindow = new PopupWindow(viewInflate2, -1, -2);
                                                        Button button3 = (Button) viewInflate2.findViewById(R.id.btnPositive);
                                                        Button button4 = (Button) viewInflate2.findViewById(R.id.btnNegative);
                                                        final EditText editText = (EditText) viewInflate2.findViewById(R.id.etEmail);
                                                        final TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tvError);
                                                        viewInflate2.findViewById(R.id.clPopupExterior).setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i19;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        button3.setOnClickListener(new pt.c(new Consumer() { // from class: fr.e
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = PrivacyActionActivity.f9330k;
                                                                ((View) obj).getClass();
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                privacyActionActivity4.b0().f17896j = editText.getText().toString();
                                                                Integer num = (Integer) aVar.mo962apply(privacyActionActivity4.b0().f17896j);
                                                                int iIntValue = num.intValue();
                                                                TextView textView4 = textView3;
                                                                if (iIntValue != -1) {
                                                                    textView4.setText(num.intValue());
                                                                    textView4.setVisibility(0);
                                                                } else {
                                                                    textView4.setVisibility(4);
                                                                    privacyActionActivity4.a0();
                                                                    popupWindow.dismiss();
                                                                }
                                                            }
                                                        }));
                                                        button4.setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i21;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        popupWindow.setFocusable(true);
                                                        popupWindow.setSoftInputMode(16);
                                                        s1 s1Var4 = privacyActionActivity3.f9332g;
                                                        if (s1Var4 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        } else {
                                                            s1Var3 = s1Var4;
                                                        }
                                                        popupWindow.showAtLocation((ConstraintLayout) s1Var3.f35152f, 17, 0, 0);
                                                        Object systemService2 = privacyActionActivity3.getSystemService("input_method");
                                                        systemService2.getClass();
                                                        ((InputMethodManager) systemService2).toggleSoftInput(1, 0);
                                                        popupWindow.setOnDismissListener(new i0(privacyActionActivity3, i21));
                                                        na0.a.l0(popupWindow);
                                                    }
                                                } else {
                                                    k0 k0Var2 = new k0(privacyActionActivity3);
                                                    k0Var2.e(R.string.privacy_delete_account_popup_title);
                                                    k0Var2.a(R.string.privacy_delete_account_popup_description);
                                                    k0Var2.c(R.string.privacy_delete_account_popup_positive_button);
                                                    k0Var2.b(R.string.privacy_delete_account_popup_negative_button);
                                                    k0Var2.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                    k0Var2.l = new Function0() { // from class: fr.c
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i22 = i19;
                                                            PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                            switch (i22) {
                                                                case 0:
                                                                    privacyActionActivity4.f9334i = true;
                                                                    s1 s1Var32 = privacyActionActivity4.f9332g;
                                                                    x70.c cVar2 = null;
                                                                    if (s1Var32 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        s1Var32 = null;
                                                                    }
                                                                    ((Button) s1Var32.f35150d).setEnabled(false);
                                                                    ((Button) s1Var32.f35151e).setEnabled(false);
                                                                    i iVarB0 = privacyActionActivity4.b0();
                                                                    a9.a aVarD = m1.d(iVarB0);
                                                                    c90.f fVar = p0.f42144a;
                                                                    f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                    break;
                                                                default:
                                                                    int i23 = PrivacyActionActivity.f9330k;
                                                                    privacyActionActivity4.a0();
                                                                    break;
                                                            }
                                                            return Unit.f26487a;
                                                        }
                                                    };
                                                    k0Var2.f();
                                                }
                                                break;
                                            default:
                                                int i22 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                ((Button) s1Var.f35151e).setOnClickListener(new View.OnClickListener(privacyActionActivity) { // from class: fr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17873b;

                                    {
                                        this.f17873b = privacyActionActivity;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i16 = i13;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17873b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                            case 1:
                                                int i18 = PrivacyActionActivity.f9330k;
                                                final PrivacyActionActivity privacyActionActivity3 = this.f17873b;
                                                final int i19 = 0;
                                                if (!privacyActionActivity3.b0().a()) {
                                                    String email = privacyActionActivity3.b0().f17888b.m().getEmail();
                                                    final int i21 = 1;
                                                    if (!r0.v(email)) {
                                                        k0 k0Var = new k0(privacyActionActivity3);
                                                        k0Var.e(R.string.privacy_request_data_popup_description);
                                                        email.getClass();
                                                        k0Var.f6172c = email;
                                                        k0Var.c(R.string.privacy_request_data_popup_positive_button);
                                                        k0Var.b(R.string.privacy_request_data_popup_negative_button);
                                                        k0Var.l = new Function0() { // from class: fr.c
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i22 = i21;
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                switch (i22) {
                                                                    case 0:
                                                                        privacyActionActivity4.f9334i = true;
                                                                        s1 s1Var32 = privacyActionActivity4.f9332g;
                                                                        x70.c cVar2 = null;
                                                                        if (s1Var32 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            s1Var32 = null;
                                                                        }
                                                                        ((Button) s1Var32.f35150d).setEnabled(false);
                                                                        ((Button) s1Var32.f35151e).setEnabled(false);
                                                                        i iVarB0 = privacyActionActivity4.b0();
                                                                        a9.a aVarD = m1.d(iVarB0);
                                                                        c90.f fVar = p0.f42144a;
                                                                        f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                        break;
                                                                    default:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        privacyActionActivity4.a0();
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        };
                                                        k0Var.f();
                                                    } else {
                                                        final e40.a aVar = new e40.a(14);
                                                        Object systemService = privacyActionActivity3.getSystemService("layout_inflater");
                                                        systemService.getClass();
                                                        s1 s1Var3 = null;
                                                        View viewInflate2 = ((LayoutInflater) systemService).inflate(R.layout.email_confirm_popup, (ViewGroup) null);
                                                        final PopupWindow popupWindow = new PopupWindow(viewInflate2, -1, -2);
                                                        Button button3 = (Button) viewInflate2.findViewById(R.id.btnPositive);
                                                        Button button4 = (Button) viewInflate2.findViewById(R.id.btnNegative);
                                                        final EditText editText = (EditText) viewInflate2.findViewById(R.id.etEmail);
                                                        final TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tvError);
                                                        viewInflate2.findViewById(R.id.clPopupExterior).setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i19;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        button3.setOnClickListener(new pt.c(new Consumer() { // from class: fr.e
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = PrivacyActionActivity.f9330k;
                                                                ((View) obj).getClass();
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                privacyActionActivity4.b0().f17896j = editText.getText().toString();
                                                                Integer num = (Integer) aVar.mo962apply(privacyActionActivity4.b0().f17896j);
                                                                int iIntValue = num.intValue();
                                                                TextView textView4 = textView3;
                                                                if (iIntValue != -1) {
                                                                    textView4.setText(num.intValue());
                                                                    textView4.setVisibility(0);
                                                                } else {
                                                                    textView4.setVisibility(4);
                                                                    privacyActionActivity4.a0();
                                                                    popupWindow.dismiss();
                                                                }
                                                            }
                                                        }));
                                                        button4.setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i21;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        popupWindow.setFocusable(true);
                                                        popupWindow.setSoftInputMode(16);
                                                        s1 s1Var4 = privacyActionActivity3.f9332g;
                                                        if (s1Var4 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        } else {
                                                            s1Var3 = s1Var4;
                                                        }
                                                        popupWindow.showAtLocation((ConstraintLayout) s1Var3.f35152f, 17, 0, 0);
                                                        Object systemService2 = privacyActionActivity3.getSystemService("input_method");
                                                        systemService2.getClass();
                                                        ((InputMethodManager) systemService2).toggleSoftInput(1, 0);
                                                        popupWindow.setOnDismissListener(new i0(privacyActionActivity3, i21));
                                                        na0.a.l0(popupWindow);
                                                    }
                                                } else {
                                                    k0 k0Var2 = new k0(privacyActionActivity3);
                                                    k0Var2.e(R.string.privacy_delete_account_popup_title);
                                                    k0Var2.a(R.string.privacy_delete_account_popup_description);
                                                    k0Var2.c(R.string.privacy_delete_account_popup_positive_button);
                                                    k0Var2.b(R.string.privacy_delete_account_popup_negative_button);
                                                    k0Var2.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                    k0Var2.l = new Function0() { // from class: fr.c
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i22 = i19;
                                                            PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                            switch (i22) {
                                                                case 0:
                                                                    privacyActionActivity4.f9334i = true;
                                                                    s1 s1Var32 = privacyActionActivity4.f9332g;
                                                                    x70.c cVar2 = null;
                                                                    if (s1Var32 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        s1Var32 = null;
                                                                    }
                                                                    ((Button) s1Var32.f35150d).setEnabled(false);
                                                                    ((Button) s1Var32.f35151e).setEnabled(false);
                                                                    i iVarB0 = privacyActionActivity4.b0();
                                                                    a9.a aVarD = m1.d(iVarB0);
                                                                    c90.f fVar = p0.f42144a;
                                                                    f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                    break;
                                                                default:
                                                                    int i23 = PrivacyActionActivity.f9330k;
                                                                    privacyActionActivity4.a0();
                                                                    break;
                                                            }
                                                            return Unit.f26487a;
                                                        }
                                                    };
                                                    k0Var2.f();
                                                }
                                                break;
                                            default:
                                                int i22 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                ((Button) s1Var.f35150d).setOnClickListener(new View.OnClickListener(privacyActionActivity) { // from class: fr.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ PrivacyActionActivity f17873b;

                                    {
                                        this.f17873b = privacyActionActivity;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i16 = i14;
                                        PrivacyActionActivity privacyActionActivity2 = this.f17873b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                            case 1:
                                                int i18 = PrivacyActionActivity.f9330k;
                                                final PrivacyActionActivity privacyActionActivity3 = this.f17873b;
                                                final int i19 = 0;
                                                if (!privacyActionActivity3.b0().a()) {
                                                    String email = privacyActionActivity3.b0().f17888b.m().getEmail();
                                                    final int i21 = 1;
                                                    if (!r0.v(email)) {
                                                        k0 k0Var = new k0(privacyActionActivity3);
                                                        k0Var.e(R.string.privacy_request_data_popup_description);
                                                        email.getClass();
                                                        k0Var.f6172c = email;
                                                        k0Var.c(R.string.privacy_request_data_popup_positive_button);
                                                        k0Var.b(R.string.privacy_request_data_popup_negative_button);
                                                        k0Var.l = new Function0() { // from class: fr.c
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i22 = i21;
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                switch (i22) {
                                                                    case 0:
                                                                        privacyActionActivity4.f9334i = true;
                                                                        s1 s1Var32 = privacyActionActivity4.f9332g;
                                                                        x70.c cVar2 = null;
                                                                        if (s1Var32 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            s1Var32 = null;
                                                                        }
                                                                        ((Button) s1Var32.f35150d).setEnabled(false);
                                                                        ((Button) s1Var32.f35151e).setEnabled(false);
                                                                        i iVarB0 = privacyActionActivity4.b0();
                                                                        a9.a aVarD = m1.d(iVarB0);
                                                                        c90.f fVar = p0.f42144a;
                                                                        f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                        break;
                                                                    default:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        privacyActionActivity4.a0();
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        };
                                                        k0Var.f();
                                                    } else {
                                                        final e40.a aVar = new e40.a(14);
                                                        Object systemService = privacyActionActivity3.getSystemService("layout_inflater");
                                                        systemService.getClass();
                                                        s1 s1Var3 = null;
                                                        View viewInflate2 = ((LayoutInflater) systemService).inflate(R.layout.email_confirm_popup, (ViewGroup) null);
                                                        final PopupWindow popupWindow = new PopupWindow(viewInflate2, -1, -2);
                                                        Button button3 = (Button) viewInflate2.findViewById(R.id.btnPositive);
                                                        Button button4 = (Button) viewInflate2.findViewById(R.id.btnNegative);
                                                        final EditText editText = (EditText) viewInflate2.findViewById(R.id.etEmail);
                                                        final TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tvError);
                                                        viewInflate2.findViewById(R.id.clPopupExterior).setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i19;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        button3.setOnClickListener(new pt.c(new Consumer() { // from class: fr.e
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = PrivacyActionActivity.f9330k;
                                                                ((View) obj).getClass();
                                                                PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                                privacyActionActivity4.b0().f17896j = editText.getText().toString();
                                                                Integer num = (Integer) aVar.mo962apply(privacyActionActivity4.b0().f17896j);
                                                                int iIntValue = num.intValue();
                                                                TextView textView4 = textView3;
                                                                if (iIntValue != -1) {
                                                                    textView4.setText(num.intValue());
                                                                    textView4.setVisibility(0);
                                                                } else {
                                                                    textView4.setVisibility(4);
                                                                    privacyActionActivity4.a0();
                                                                    popupWindow.dismiss();
                                                                }
                                                            }
                                                        }));
                                                        button4.setOnClickListener(new pt.c(new Consumer() { // from class: fr.d
                                                            @Override // androidx.core.util.Consumer
                                                            public final void accept(Object obj) {
                                                                int i22 = i21;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                View view2 = (View) obj;
                                                                switch (i22) {
                                                                    case 0:
                                                                        int i23 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                    default:
                                                                        int i24 = PrivacyActionActivity.f9330k;
                                                                        view2.getClass();
                                                                        popupWindow2.dismiss();
                                                                        break;
                                                                }
                                                            }
                                                        }));
                                                        popupWindow.setFocusable(true);
                                                        popupWindow.setSoftInputMode(16);
                                                        s1 s1Var4 = privacyActionActivity3.f9332g;
                                                        if (s1Var4 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                        } else {
                                                            s1Var3 = s1Var4;
                                                        }
                                                        popupWindow.showAtLocation((ConstraintLayout) s1Var3.f35152f, 17, 0, 0);
                                                        Object systemService2 = privacyActionActivity3.getSystemService("input_method");
                                                        systemService2.getClass();
                                                        ((InputMethodManager) systemService2).toggleSoftInput(1, 0);
                                                        popupWindow.setOnDismissListener(new i0(privacyActionActivity3, i21));
                                                        na0.a.l0(popupWindow);
                                                    }
                                                } else {
                                                    k0 k0Var2 = new k0(privacyActionActivity3);
                                                    k0Var2.e(R.string.privacy_delete_account_popup_title);
                                                    k0Var2.a(R.string.privacy_delete_account_popup_description);
                                                    k0Var2.c(R.string.privacy_delete_account_popup_positive_button);
                                                    k0Var2.b(R.string.privacy_delete_account_popup_negative_button);
                                                    k0Var2.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                    k0Var2.l = new Function0() { // from class: fr.c
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            int i22 = i19;
                                                            PrivacyActionActivity privacyActionActivity4 = privacyActionActivity3;
                                                            switch (i22) {
                                                                case 0:
                                                                    privacyActionActivity4.f9334i = true;
                                                                    s1 s1Var32 = privacyActionActivity4.f9332g;
                                                                    x70.c cVar2 = null;
                                                                    if (s1Var32 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        s1Var32 = null;
                                                                    }
                                                                    ((Button) s1Var32.f35150d).setEnabled(false);
                                                                    ((Button) s1Var32.f35151e).setEnabled(false);
                                                                    i iVarB0 = privacyActionActivity4.b0();
                                                                    a9.a aVarD = m1.d(iVarB0);
                                                                    c90.f fVar = p0.f42144a;
                                                                    f0.B(aVarD, c90.e.f7834b, null, new d8.c(privacyActionActivity4, iVarB0, cVar2, 26), 2);
                                                                    break;
                                                                default:
                                                                    int i23 = PrivacyActionActivity.f9330k;
                                                                    privacyActionActivity4.a0();
                                                                    break;
                                                            }
                                                            return Unit.f26487a;
                                                        }
                                                    };
                                                    k0Var2.f();
                                                }
                                                break;
                                            default:
                                                int i22 = PrivacyActionActivity.f9330k;
                                                privacyActionActivity2.finish();
                                                break;
                                        }
                                    }
                                });
                                o30.f0.S(privacyActionActivity, true);
                                return;
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
        this.f9335j.remove();
        super.onDestroy();
    }
}
