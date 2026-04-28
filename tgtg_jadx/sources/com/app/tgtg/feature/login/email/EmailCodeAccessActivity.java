package com.app.tgtg.feature.login.email;

import ah.n;
import al.p;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.n1;
import bg.k0;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.services.user.AuthPolling;
import com.google.android.material.textfield.TextInputEditText;
import cv.i;
import e70.c;
import fl.g;
import ib.a0;
import ib.e;
import ib.h;
import ib.m;
import ib.x;
import ib.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import jb.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import mv.r0;
import pg.b;
import qb.o;
import qb.u;
import qb.w;
import rb.d;
import rb.f;
import sb.a;
import y9.k;
import y9.v;
import y9.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class EmailCodeAccessActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9048k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f9050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9053j;

    public EmailCodeAccessActivity() {
        super(12);
        this.f9051h = new n1(Reflection.getOrCreateKotlinClass(p.class), new g(this, 1), new g(this, 0), new g(this, 2));
        this.f9053j = new e0(this, 13);
    }

    public final p a0() {
        return (p) this.f9051h.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object obj = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.email_code_access_view, (ViewGroup) null, false);
        int i12 = R.id.animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) pd.g.t(R.id.animation, viewInflate);
        if (lottieAnimationView != null) {
            i12 = R.id.btnBack;
            ImageButton imageButton = (ImageButton) pd.g.t(R.id.btnBack, viewInflate);
            if (imageButton != null) {
                i12 = R.id.codeClear;
                ImageView imageView = (ImageView) pd.g.t(R.id.codeClear, viewInflate);
                if (imageView != null) {
                    i12 = R.id.codeDescription;
                    if (((TextView) pd.g.t(R.id.codeDescription, viewInflate)) != null) {
                        i12 = R.id.codeError;
                        TextView textView = (TextView) pd.g.t(R.id.codeError, viewInflate);
                        if (textView != null) {
                            i12 = R.id.codeInput;
                            TextInputEditText textInputEditText = (TextInputEditText) pd.g.t(R.id.codeInput, viewInflate);
                            if (textInputEditText != null) {
                                i12 = R.id.content;
                                ScrollView scrollView = (ScrollView) pd.g.t(R.id.content, viewInflate);
                                if (scrollView != null) {
                                    i12 = R.id.emailHeader;
                                    if (((TextView) pd.g.t(R.id.emailHeader, viewInflate)) != null) {
                                        i12 = R.id.emailSubHeader;
                                        TextView textView2 = (TextView) pd.g.t(R.id.emailSubHeader, viewInflate);
                                        if (textView2 != null) {
                                            i12 = R.id.emailTitle;
                                            if (((TextView) pd.g.t(R.id.emailTitle, viewInflate)) != null) {
                                                i12 = R.id.header;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.header, viewInflate);
                                                if (constraintLayout != null) {
                                                    i12 = R.id.loading;
                                                    TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) pd.g.t(R.id.loading, viewInflate);
                                                    if (tGTGLoadingView != null) {
                                                        i12 = R.id.noEmailDescription;
                                                        if (((TextView) pd.g.t(R.id.noEmailDescription, viewInflate)) != null) {
                                                            i12 = R.id.noEmailLink;
                                                            TextView textView3 = (TextView) pd.g.t(R.id.noEmailLink, viewInflate);
                                                            if (textView3 != null) {
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                this.f9050g = new b(constraintLayout2, lottieAnimationView, imageButton, imageView, textView, textInputEditText, scrollView, textView2, constraintLayout, tGTGLoadingView, textView3, 2);
                                                                setContentView(constraintLayout2);
                                                                getOnBackPressedDispatcher().a(this.f9053j);
                                                                c cVar = this.f9049f;
                                                                if (cVar == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                                    cVar = null;
                                                                }
                                                                final int i13 = 1;
                                                                final int i14 = 2;
                                                                c.b(cVar, this, new Function1(this) { // from class: fl.d

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ EmailCodeAccessActivity f17779b;

                                                                    {
                                                                        this.f17779b = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj2) {
                                                                        int i15 = i13;
                                                                        int i16 = 17;
                                                                        EmailCodeAccessActivity emailCodeAccessActivity = this.f17779b;
                                                                        switch (i15) {
                                                                            case 0:
                                                                                cl.g gVar = (cl.g) obj2;
                                                                                int i17 = EmailCodeAccessActivity.f9048k;
                                                                                gVar.getClass();
                                                                                int i18 = gVar.f8448a;
                                                                                if (i18 == 2) {
                                                                                    pg.b bVar = emailCodeAccessActivity.f9050g;
                                                                                    bVar.getClass();
                                                                                    ((TGTGLoadingView) bVar.f34790k).setVisibility(8);
                                                                                    int i19 = emailCodeAccessActivity.f9052i;
                                                                                    emailCodeAccessActivity.f9052i = i19 + 1;
                                                                                    if (i19 < 3) {
                                                                                        pg.b bVar2 = emailCodeAccessActivity.f9050g;
                                                                                        bVar2.getClass();
                                                                                        ((TextView) bVar2.f34785f).setVisibility(0);
                                                                                        pg.b bVar3 = emailCodeAccessActivity.f9050g;
                                                                                        bVar3.getClass();
                                                                                        ((ImageView) bVar3.f34784e).setVisibility(0);
                                                                                        pg.b bVar4 = emailCodeAccessActivity.f9050g;
                                                                                        bVar4.getClass();
                                                                                        ((TextInputEditText) bVar4.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field_error));
                                                                                    } else {
                                                                                        r0.p(emailCodeAccessActivity);
                                                                                        k0 k0Var = new k0(emailCodeAccessActivity);
                                                                                        k0Var.e(R.string.email_login_pin_error_popup_title);
                                                                                        k0Var.a(R.string.email_login_pin_error_popup_message);
                                                                                        k0Var.c(R.string.email_login_pin_error_popup_button);
                                                                                        k0Var.l = new cw.b(emailCodeAccessActivity, i16);
                                                                                        k0Var.f();
                                                                                        p.g(emailCodeAccessActivity.a0(), i.SCREEN_LOGIN_CODE_ATTEMPT_ERROR);
                                                                                    }
                                                                                } else if (i18 == 9) {
                                                                                    pg.b bVar5 = emailCodeAccessActivity.f9050g;
                                                                                    bVar5.getClass();
                                                                                    ((TGTGLoadingView) bVar5.f34790k).setVisibility(8);
                                                                                    Integer num = gVar.f8449b;
                                                                                    if (num != null) {
                                                                                        Toast.makeText(emailCodeAccessActivity, num.intValue(), 0).show();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                int i21 = EmailCodeAccessActivity.f9048k;
                                                                                ((f70.h) obj2).getClass();
                                                                                pg.b bVar6 = emailCodeAccessActivity.f9050g;
                                                                                bVar6.getClass();
                                                                                ((TGTGLoadingView) bVar6.f34790k).setVisibility(8);
                                                                                break;
                                                                            case 2:
                                                                                int i22 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                String str = emailCodeAccessActivity.a0().f1583v;
                                                                                if (str != null) {
                                                                                    bg.e0 e0Var = new bg.e0(emailCodeAccessActivity);
                                                                                    Point point = new Point();
                                                                                    emailCodeAccessActivity.getWindowManager().getDefaultDisplay().getSize(point);
                                                                                    int iA = point.x - d70.b.a(64);
                                                                                    int iA2 = d70.b.a(400);
                                                                                    if (iA > iA2) {
                                                                                        iA = iA2;
                                                                                    }
                                                                                    PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
                                                                                    popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
                                                                                    popupWindow.showAtLocation(emailCodeAccessActivity.findViewById(android.R.id.content), 17, 0, 0);
                                                                                    int i23 = 1;
                                                                                    popupWindow.setFocusable(true);
                                                                                    int iA3 = point.y - d70.b.a(64);
                                                                                    View.inflate(e0Var.getContext(), R.layout.email_login_help_popup, e0Var);
                                                                                    e0Var.f6143a = iA3;
                                                                                    TextView textView4 = (TextView) e0Var.findViewById(R.id.tvEmail);
                                                                                    if (textView4 != null) {
                                                                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                                                        String string = e0Var.getResources().getString(R.string.no_email_popup_explanation);
                                                                                        string.getClass();
                                                                                        textView4.setText(String.format(string, Arrays.copyOf(new Object[]{str}, 1)));
                                                                                    }
                                                                                    View viewFindViewById = e0Var.findViewById(R.id.btnChangeEmail);
                                                                                    viewFindViewById.getClass();
                                                                                    mv.d.x(viewFindViewById, new ek.a(5, popupWindow, emailCodeAccessActivity));
                                                                                    View viewFindViewById2 = e0Var.findViewById(R.id.btnClose);
                                                                                    viewFindViewById2.getClass();
                                                                                    mv.d.x(viewFindViewById2, new bg.i(popupWindow, i23));
                                                                                    na0.a.l0(popupWindow);
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                int i24 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                pg.b bVar7 = emailCodeAccessActivity.f9050g;
                                                                                bVar7.getClass();
                                                                                ((TextInputEditText) bVar7.f34786g).setText("");
                                                                                break;
                                                                            default:
                                                                                int i25 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                emailCodeAccessActivity.getOnBackPressedDispatcher().d();
                                                                                break;
                                                                        }
                                                                        return Unit.f26487a;
                                                                    }
                                                                }, 2);
                                                                p pVarA0 = a0();
                                                                pVarA0.f1583v = getIntent().getStringExtra("email");
                                                                pVarA0.f1584w = getIntent().getStringExtra("pollingId");
                                                                pVarA0.f1577p.e(this, new qt.b(new Function1(this) { // from class: fl.d

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ EmailCodeAccessActivity f17779b;

                                                                    {
                                                                        this.f17779b = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj2) {
                                                                        int i15 = i11;
                                                                        int i16 = 17;
                                                                        EmailCodeAccessActivity emailCodeAccessActivity = this.f17779b;
                                                                        switch (i15) {
                                                                            case 0:
                                                                                cl.g gVar = (cl.g) obj2;
                                                                                int i17 = EmailCodeAccessActivity.f9048k;
                                                                                gVar.getClass();
                                                                                int i18 = gVar.f8448a;
                                                                                if (i18 == 2) {
                                                                                    pg.b bVar = emailCodeAccessActivity.f9050g;
                                                                                    bVar.getClass();
                                                                                    ((TGTGLoadingView) bVar.f34790k).setVisibility(8);
                                                                                    int i19 = emailCodeAccessActivity.f9052i;
                                                                                    emailCodeAccessActivity.f9052i = i19 + 1;
                                                                                    if (i19 < 3) {
                                                                                        pg.b bVar2 = emailCodeAccessActivity.f9050g;
                                                                                        bVar2.getClass();
                                                                                        ((TextView) bVar2.f34785f).setVisibility(0);
                                                                                        pg.b bVar3 = emailCodeAccessActivity.f9050g;
                                                                                        bVar3.getClass();
                                                                                        ((ImageView) bVar3.f34784e).setVisibility(0);
                                                                                        pg.b bVar4 = emailCodeAccessActivity.f9050g;
                                                                                        bVar4.getClass();
                                                                                        ((TextInputEditText) bVar4.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field_error));
                                                                                    } else {
                                                                                        r0.p(emailCodeAccessActivity);
                                                                                        k0 k0Var = new k0(emailCodeAccessActivity);
                                                                                        k0Var.e(R.string.email_login_pin_error_popup_title);
                                                                                        k0Var.a(R.string.email_login_pin_error_popup_message);
                                                                                        k0Var.c(R.string.email_login_pin_error_popup_button);
                                                                                        k0Var.l = new cw.b(emailCodeAccessActivity, i16);
                                                                                        k0Var.f();
                                                                                        p.g(emailCodeAccessActivity.a0(), i.SCREEN_LOGIN_CODE_ATTEMPT_ERROR);
                                                                                    }
                                                                                } else if (i18 == 9) {
                                                                                    pg.b bVar5 = emailCodeAccessActivity.f9050g;
                                                                                    bVar5.getClass();
                                                                                    ((TGTGLoadingView) bVar5.f34790k).setVisibility(8);
                                                                                    Integer num = gVar.f8449b;
                                                                                    if (num != null) {
                                                                                        Toast.makeText(emailCodeAccessActivity, num.intValue(), 0).show();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                int i21 = EmailCodeAccessActivity.f9048k;
                                                                                ((f70.h) obj2).getClass();
                                                                                pg.b bVar6 = emailCodeAccessActivity.f9050g;
                                                                                bVar6.getClass();
                                                                                ((TGTGLoadingView) bVar6.f34790k).setVisibility(8);
                                                                                break;
                                                                            case 2:
                                                                                int i22 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                String str = emailCodeAccessActivity.a0().f1583v;
                                                                                if (str != null) {
                                                                                    bg.e0 e0Var = new bg.e0(emailCodeAccessActivity);
                                                                                    Point point = new Point();
                                                                                    emailCodeAccessActivity.getWindowManager().getDefaultDisplay().getSize(point);
                                                                                    int iA = point.x - d70.b.a(64);
                                                                                    int iA2 = d70.b.a(400);
                                                                                    if (iA > iA2) {
                                                                                        iA = iA2;
                                                                                    }
                                                                                    PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
                                                                                    popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
                                                                                    popupWindow.showAtLocation(emailCodeAccessActivity.findViewById(android.R.id.content), 17, 0, 0);
                                                                                    int i23 = 1;
                                                                                    popupWindow.setFocusable(true);
                                                                                    int iA3 = point.y - d70.b.a(64);
                                                                                    View.inflate(e0Var.getContext(), R.layout.email_login_help_popup, e0Var);
                                                                                    e0Var.f6143a = iA3;
                                                                                    TextView textView4 = (TextView) e0Var.findViewById(R.id.tvEmail);
                                                                                    if (textView4 != null) {
                                                                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                                                        String string = e0Var.getResources().getString(R.string.no_email_popup_explanation);
                                                                                        string.getClass();
                                                                                        textView4.setText(String.format(string, Arrays.copyOf(new Object[]{str}, 1)));
                                                                                    }
                                                                                    View viewFindViewById = e0Var.findViewById(R.id.btnChangeEmail);
                                                                                    viewFindViewById.getClass();
                                                                                    mv.d.x(viewFindViewById, new ek.a(5, popupWindow, emailCodeAccessActivity));
                                                                                    View viewFindViewById2 = e0Var.findViewById(R.id.btnClose);
                                                                                    viewFindViewById2.getClass();
                                                                                    mv.d.x(viewFindViewById2, new bg.i(popupWindow, i23));
                                                                                    na0.a.l0(popupWindow);
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                int i24 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                pg.b bVar7 = emailCodeAccessActivity.f9050g;
                                                                                bVar7.getClass();
                                                                                ((TextInputEditText) bVar7.f34786g).setText("");
                                                                                break;
                                                                            default:
                                                                                int i25 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj2).getClass();
                                                                                emailCodeAccessActivity.getOnBackPressedDispatcher().d();
                                                                                break;
                                                                        }
                                                                        return Unit.f26487a;
                                                                    }
                                                                }, i11));
                                                                String str = a0().f1583v;
                                                                if (str != null) {
                                                                    String str2 = a0().f1584w;
                                                                    if (str2 != null) {
                                                                        p pVarA02 = a0();
                                                                        z zVar = new z(AuthPolling.class, 0);
                                                                        x xVar = x.NOT_REQUIRED;
                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                        x xVar2 = x.CONNECTED;
                                                                        xVar2.getClass();
                                                                        ((o) zVar.f23742b).f36837j = new e(new f(null), xVar2, false, false, false, false, -1L, -1L, CollectionsKt.v0(linkedHashSet));
                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                        linkedHashMap.put("email", str);
                                                                        linkedHashMap.put("pollingId", str2);
                                                                        h hVar = new h(linkedHashMap);
                                                                        ex.i.L(hVar);
                                                                        ((o) zVar.f23742b).f36832e = hVar;
                                                                        a0 a0Var = (a0) zVar.a();
                                                                        s sVar = pVarA02.f1568f;
                                                                        sVar.c("UserPolling2", m.REPLACE, a0Var);
                                                                        UUID uuid = a0Var.f23744a;
                                                                        w wVarX = sVar.f24926c.x();
                                                                        List listSingletonList = Collections.singletonList(uuid.toString());
                                                                        wVarX.getClass();
                                                                        listSingletonList.getClass();
                                                                        StringBuilder sbO = b3.i.o("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
                                                                        pd.g.h(listSingletonList.size(), sbO);
                                                                        sbO.append(")");
                                                                        String string = sbO.toString();
                                                                        k kVarG = wVarX.f36870a.g();
                                                                        String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
                                                                        u uVar = new u(string, listSingletonList, wVarX, i13);
                                                                        kVarG.getClass();
                                                                        kVarG.f45683b.g(strArr);
                                                                        y9.h hVar2 = kVarG.f45688g;
                                                                        hVar2.getClass();
                                                                        y yVar = new y((v) hVar2.f45666a, hVar2, strArr, uVar);
                                                                        n20.f fVar = new n20.f(26);
                                                                        a aVar = sVar.f24927d;
                                                                        Object obj2 = new Object();
                                                                        n0 n0Var = new n0();
                                                                        d dVar = new d(aVar, obj2, fVar, n0Var);
                                                                        m0 m0Var = new m0(yVar, dVar);
                                                                        r.f fVar2 = n0Var.l;
                                                                        r.c cVarB = fVar2.b(yVar);
                                                                        if (cVarB != null) {
                                                                            obj = cVarB.f37419b;
                                                                        } else {
                                                                            r.c cVar2 = new r.c(yVar, m0Var);
                                                                            fVar2.f37428d++;
                                                                            r.c cVar3 = fVar2.f37426b;
                                                                            if (cVar3 == null) {
                                                                                fVar2.f37425a = cVar2;
                                                                                fVar2.f37426b = cVar2;
                                                                            } else {
                                                                                cVar3.f37420c = cVar2;
                                                                                cVar2.f37421d = cVar3;
                                                                                fVar2.f37426b = cVar2;
                                                                            }
                                                                        }
                                                                        m0 m0Var2 = (m0) obj;
                                                                        if (m0Var2 != null && m0Var2.f3492b != dVar) {
                                                                            i4.a.f("This source was already added with the different observer");
                                                                            return;
                                                                        }
                                                                        if (m0Var2 == null && n0Var.f3471c > 0) {
                                                                            yVar.f(m0Var);
                                                                        }
                                                                        n0Var.e(this, pVarA02.f1585x);
                                                                    }
                                                                    b bVar = this.f9050g;
                                                                    bVar.getClass();
                                                                    TextView textView4 = (TextView) bVar.f34788i;
                                                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                                    String string2 = getResources().getString(R.string.email_login_sub_header);
                                                                    string2.getClass();
                                                                    textView4.setText(String.format(string2, Arrays.copyOf(new Object[]{str}, 1)));
                                                                }
                                                                b bVar2 = this.f9050g;
                                                                bVar2.getClass();
                                                                ViewCompat.k0((ConstraintLayout) bVar2.f34781b, new e.b(this, 6));
                                                                b bVar3 = this.f9050g;
                                                                bVar3.getClass();
                                                                TextInputEditText textInputEditText2 = (TextInputEditText) bVar3.f34786g;
                                                                textInputEditText2.addTextChangedListener(new fl.f(this, 0));
                                                                final int i15 = 4;
                                                                mv.d.y(textInputEditText2, new ek.a(i15, this, textInputEditText2));
                                                                textInputEditText2.setOnEditorActionListener(new fl.e(this, textInputEditText2, i11));
                                                                b bVar4 = this.f9050g;
                                                                bVar4.getClass();
                                                                TextView textView5 = (TextView) bVar4.l;
                                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                                UnderlineSpan underlineSpan = new UnderlineSpan();
                                                                int length = spannableStringBuilder.length();
                                                                spannableStringBuilder.append((CharSequence) getString(R.string.email_login_no_email_link));
                                                                spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
                                                                textView5.setText(new SpannedString(spannableStringBuilder));
                                                                mv.d.x(textView5, new Function1(this) { // from class: fl.d

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ EmailCodeAccessActivity f17779b;

                                                                    {
                                                                        this.f17779b = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj22) {
                                                                        int i152 = i14;
                                                                        int i16 = 17;
                                                                        EmailCodeAccessActivity emailCodeAccessActivity = this.f17779b;
                                                                        switch (i152) {
                                                                            case 0:
                                                                                cl.g gVar = (cl.g) obj22;
                                                                                int i17 = EmailCodeAccessActivity.f9048k;
                                                                                gVar.getClass();
                                                                                int i18 = gVar.f8448a;
                                                                                if (i18 == 2) {
                                                                                    pg.b bVar5 = emailCodeAccessActivity.f9050g;
                                                                                    bVar5.getClass();
                                                                                    ((TGTGLoadingView) bVar5.f34790k).setVisibility(8);
                                                                                    int i19 = emailCodeAccessActivity.f9052i;
                                                                                    emailCodeAccessActivity.f9052i = i19 + 1;
                                                                                    if (i19 < 3) {
                                                                                        pg.b bVar22 = emailCodeAccessActivity.f9050g;
                                                                                        bVar22.getClass();
                                                                                        ((TextView) bVar22.f34785f).setVisibility(0);
                                                                                        pg.b bVar32 = emailCodeAccessActivity.f9050g;
                                                                                        bVar32.getClass();
                                                                                        ((ImageView) bVar32.f34784e).setVisibility(0);
                                                                                        pg.b bVar42 = emailCodeAccessActivity.f9050g;
                                                                                        bVar42.getClass();
                                                                                        ((TextInputEditText) bVar42.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field_error));
                                                                                    } else {
                                                                                        r0.p(emailCodeAccessActivity);
                                                                                        k0 k0Var = new k0(emailCodeAccessActivity);
                                                                                        k0Var.e(R.string.email_login_pin_error_popup_title);
                                                                                        k0Var.a(R.string.email_login_pin_error_popup_message);
                                                                                        k0Var.c(R.string.email_login_pin_error_popup_button);
                                                                                        k0Var.l = new cw.b(emailCodeAccessActivity, i16);
                                                                                        k0Var.f();
                                                                                        p.g(emailCodeAccessActivity.a0(), i.SCREEN_LOGIN_CODE_ATTEMPT_ERROR);
                                                                                    }
                                                                                } else if (i18 == 9) {
                                                                                    pg.b bVar52 = emailCodeAccessActivity.f9050g;
                                                                                    bVar52.getClass();
                                                                                    ((TGTGLoadingView) bVar52.f34790k).setVisibility(8);
                                                                                    Integer num = gVar.f8449b;
                                                                                    if (num != null) {
                                                                                        Toast.makeText(emailCodeAccessActivity, num.intValue(), 0).show();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                int i21 = EmailCodeAccessActivity.f9048k;
                                                                                ((f70.h) obj22).getClass();
                                                                                pg.b bVar6 = emailCodeAccessActivity.f9050g;
                                                                                bVar6.getClass();
                                                                                ((TGTGLoadingView) bVar6.f34790k).setVisibility(8);
                                                                                break;
                                                                            case 2:
                                                                                int i22 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                String str3 = emailCodeAccessActivity.a0().f1583v;
                                                                                if (str3 != null) {
                                                                                    bg.e0 e0Var = new bg.e0(emailCodeAccessActivity);
                                                                                    Point point = new Point();
                                                                                    emailCodeAccessActivity.getWindowManager().getDefaultDisplay().getSize(point);
                                                                                    int iA = point.x - d70.b.a(64);
                                                                                    int iA2 = d70.b.a(400);
                                                                                    if (iA > iA2) {
                                                                                        iA = iA2;
                                                                                    }
                                                                                    PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
                                                                                    popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
                                                                                    popupWindow.showAtLocation(emailCodeAccessActivity.findViewById(android.R.id.content), 17, 0, 0);
                                                                                    int i23 = 1;
                                                                                    popupWindow.setFocusable(true);
                                                                                    int iA3 = point.y - d70.b.a(64);
                                                                                    View.inflate(e0Var.getContext(), R.layout.email_login_help_popup, e0Var);
                                                                                    e0Var.f6143a = iA3;
                                                                                    TextView textView42 = (TextView) e0Var.findViewById(R.id.tvEmail);
                                                                                    if (textView42 != null) {
                                                                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                                        String string3 = e0Var.getResources().getString(R.string.no_email_popup_explanation);
                                                                                        string3.getClass();
                                                                                        textView42.setText(String.format(string3, Arrays.copyOf(new Object[]{str3}, 1)));
                                                                                    }
                                                                                    View viewFindViewById = e0Var.findViewById(R.id.btnChangeEmail);
                                                                                    viewFindViewById.getClass();
                                                                                    mv.d.x(viewFindViewById, new ek.a(5, popupWindow, emailCodeAccessActivity));
                                                                                    View viewFindViewById2 = e0Var.findViewById(R.id.btnClose);
                                                                                    viewFindViewById2.getClass();
                                                                                    mv.d.x(viewFindViewById2, new bg.i(popupWindow, i23));
                                                                                    na0.a.l0(popupWindow);
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                int i24 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                pg.b bVar7 = emailCodeAccessActivity.f9050g;
                                                                                bVar7.getClass();
                                                                                ((TextInputEditText) bVar7.f34786g).setText("");
                                                                                break;
                                                                            default:
                                                                                int i25 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                emailCodeAccessActivity.getOnBackPressedDispatcher().d();
                                                                                break;
                                                                        }
                                                                        return Unit.f26487a;
                                                                    }
                                                                });
                                                                b bVar5 = this.f9050g;
                                                                bVar5.getClass();
                                                                final int i16 = 3;
                                                                mv.d.x((ImageView) bVar5.f34784e, new Function1(this) { // from class: fl.d

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ EmailCodeAccessActivity f17779b;

                                                                    {
                                                                        this.f17779b = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj22) {
                                                                        int i152 = i16;
                                                                        int i162 = 17;
                                                                        EmailCodeAccessActivity emailCodeAccessActivity = this.f17779b;
                                                                        switch (i152) {
                                                                            case 0:
                                                                                cl.g gVar = (cl.g) obj22;
                                                                                int i17 = EmailCodeAccessActivity.f9048k;
                                                                                gVar.getClass();
                                                                                int i18 = gVar.f8448a;
                                                                                if (i18 == 2) {
                                                                                    pg.b bVar52 = emailCodeAccessActivity.f9050g;
                                                                                    bVar52.getClass();
                                                                                    ((TGTGLoadingView) bVar52.f34790k).setVisibility(8);
                                                                                    int i19 = emailCodeAccessActivity.f9052i;
                                                                                    emailCodeAccessActivity.f9052i = i19 + 1;
                                                                                    if (i19 < 3) {
                                                                                        pg.b bVar22 = emailCodeAccessActivity.f9050g;
                                                                                        bVar22.getClass();
                                                                                        ((TextView) bVar22.f34785f).setVisibility(0);
                                                                                        pg.b bVar32 = emailCodeAccessActivity.f9050g;
                                                                                        bVar32.getClass();
                                                                                        ((ImageView) bVar32.f34784e).setVisibility(0);
                                                                                        pg.b bVar42 = emailCodeAccessActivity.f9050g;
                                                                                        bVar42.getClass();
                                                                                        ((TextInputEditText) bVar42.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field_error));
                                                                                    } else {
                                                                                        r0.p(emailCodeAccessActivity);
                                                                                        k0 k0Var = new k0(emailCodeAccessActivity);
                                                                                        k0Var.e(R.string.email_login_pin_error_popup_title);
                                                                                        k0Var.a(R.string.email_login_pin_error_popup_message);
                                                                                        k0Var.c(R.string.email_login_pin_error_popup_button);
                                                                                        k0Var.l = new cw.b(emailCodeAccessActivity, i162);
                                                                                        k0Var.f();
                                                                                        p.g(emailCodeAccessActivity.a0(), i.SCREEN_LOGIN_CODE_ATTEMPT_ERROR);
                                                                                    }
                                                                                } else if (i18 == 9) {
                                                                                    pg.b bVar522 = emailCodeAccessActivity.f9050g;
                                                                                    bVar522.getClass();
                                                                                    ((TGTGLoadingView) bVar522.f34790k).setVisibility(8);
                                                                                    Integer num = gVar.f8449b;
                                                                                    if (num != null) {
                                                                                        Toast.makeText(emailCodeAccessActivity, num.intValue(), 0).show();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                int i21 = EmailCodeAccessActivity.f9048k;
                                                                                ((f70.h) obj22).getClass();
                                                                                pg.b bVar6 = emailCodeAccessActivity.f9050g;
                                                                                bVar6.getClass();
                                                                                ((TGTGLoadingView) bVar6.f34790k).setVisibility(8);
                                                                                break;
                                                                            case 2:
                                                                                int i22 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                String str3 = emailCodeAccessActivity.a0().f1583v;
                                                                                if (str3 != null) {
                                                                                    bg.e0 e0Var = new bg.e0(emailCodeAccessActivity);
                                                                                    Point point = new Point();
                                                                                    emailCodeAccessActivity.getWindowManager().getDefaultDisplay().getSize(point);
                                                                                    int iA = point.x - d70.b.a(64);
                                                                                    int iA2 = d70.b.a(400);
                                                                                    if (iA > iA2) {
                                                                                        iA = iA2;
                                                                                    }
                                                                                    PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
                                                                                    popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
                                                                                    popupWindow.showAtLocation(emailCodeAccessActivity.findViewById(android.R.id.content), 17, 0, 0);
                                                                                    int i23 = 1;
                                                                                    popupWindow.setFocusable(true);
                                                                                    int iA3 = point.y - d70.b.a(64);
                                                                                    View.inflate(e0Var.getContext(), R.layout.email_login_help_popup, e0Var);
                                                                                    e0Var.f6143a = iA3;
                                                                                    TextView textView42 = (TextView) e0Var.findViewById(R.id.tvEmail);
                                                                                    if (textView42 != null) {
                                                                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                                        String string3 = e0Var.getResources().getString(R.string.no_email_popup_explanation);
                                                                                        string3.getClass();
                                                                                        textView42.setText(String.format(string3, Arrays.copyOf(new Object[]{str3}, 1)));
                                                                                    }
                                                                                    View viewFindViewById = e0Var.findViewById(R.id.btnChangeEmail);
                                                                                    viewFindViewById.getClass();
                                                                                    mv.d.x(viewFindViewById, new ek.a(5, popupWindow, emailCodeAccessActivity));
                                                                                    View viewFindViewById2 = e0Var.findViewById(R.id.btnClose);
                                                                                    viewFindViewById2.getClass();
                                                                                    mv.d.x(viewFindViewById2, new bg.i(popupWindow, i23));
                                                                                    na0.a.l0(popupWindow);
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                int i24 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                pg.b bVar7 = emailCodeAccessActivity.f9050g;
                                                                                bVar7.getClass();
                                                                                ((TextInputEditText) bVar7.f34786g).setText("");
                                                                                break;
                                                                            default:
                                                                                int i25 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                emailCodeAccessActivity.getOnBackPressedDispatcher().d();
                                                                                break;
                                                                        }
                                                                        return Unit.f26487a;
                                                                    }
                                                                });
                                                                b bVar6 = this.f9050g;
                                                                bVar6.getClass();
                                                                mv.d.x((ImageButton) bVar6.f34783d, new Function1(this) { // from class: fl.d

                                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                    public final /* synthetic */ EmailCodeAccessActivity f17779b;

                                                                    {
                                                                        this.f17779b = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj22) {
                                                                        int i152 = i15;
                                                                        int i162 = 17;
                                                                        EmailCodeAccessActivity emailCodeAccessActivity = this.f17779b;
                                                                        switch (i152) {
                                                                            case 0:
                                                                                cl.g gVar = (cl.g) obj22;
                                                                                int i17 = EmailCodeAccessActivity.f9048k;
                                                                                gVar.getClass();
                                                                                int i18 = gVar.f8448a;
                                                                                if (i18 == 2) {
                                                                                    pg.b bVar52 = emailCodeAccessActivity.f9050g;
                                                                                    bVar52.getClass();
                                                                                    ((TGTGLoadingView) bVar52.f34790k).setVisibility(8);
                                                                                    int i19 = emailCodeAccessActivity.f9052i;
                                                                                    emailCodeAccessActivity.f9052i = i19 + 1;
                                                                                    if (i19 < 3) {
                                                                                        pg.b bVar22 = emailCodeAccessActivity.f9050g;
                                                                                        bVar22.getClass();
                                                                                        ((TextView) bVar22.f34785f).setVisibility(0);
                                                                                        pg.b bVar32 = emailCodeAccessActivity.f9050g;
                                                                                        bVar32.getClass();
                                                                                        ((ImageView) bVar32.f34784e).setVisibility(0);
                                                                                        pg.b bVar42 = emailCodeAccessActivity.f9050g;
                                                                                        bVar42.getClass();
                                                                                        ((TextInputEditText) bVar42.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field_error));
                                                                                    } else {
                                                                                        r0.p(emailCodeAccessActivity);
                                                                                        k0 k0Var = new k0(emailCodeAccessActivity);
                                                                                        k0Var.e(R.string.email_login_pin_error_popup_title);
                                                                                        k0Var.a(R.string.email_login_pin_error_popup_message);
                                                                                        k0Var.c(R.string.email_login_pin_error_popup_button);
                                                                                        k0Var.l = new cw.b(emailCodeAccessActivity, i162);
                                                                                        k0Var.f();
                                                                                        p.g(emailCodeAccessActivity.a0(), i.SCREEN_LOGIN_CODE_ATTEMPT_ERROR);
                                                                                    }
                                                                                } else if (i18 == 9) {
                                                                                    pg.b bVar522 = emailCodeAccessActivity.f9050g;
                                                                                    bVar522.getClass();
                                                                                    ((TGTGLoadingView) bVar522.f34790k).setVisibility(8);
                                                                                    Integer num = gVar.f8449b;
                                                                                    if (num != null) {
                                                                                        Toast.makeText(emailCodeAccessActivity, num.intValue(), 0).show();
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                int i21 = EmailCodeAccessActivity.f9048k;
                                                                                ((f70.h) obj22).getClass();
                                                                                pg.b bVar62 = emailCodeAccessActivity.f9050g;
                                                                                bVar62.getClass();
                                                                                ((TGTGLoadingView) bVar62.f34790k).setVisibility(8);
                                                                                break;
                                                                            case 2:
                                                                                int i22 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                String str3 = emailCodeAccessActivity.a0().f1583v;
                                                                                if (str3 != null) {
                                                                                    bg.e0 e0Var = new bg.e0(emailCodeAccessActivity);
                                                                                    Point point = new Point();
                                                                                    emailCodeAccessActivity.getWindowManager().getDefaultDisplay().getSize(point);
                                                                                    int iA = point.x - d70.b.a(64);
                                                                                    int iA2 = d70.b.a(400);
                                                                                    if (iA > iA2) {
                                                                                        iA = iA2;
                                                                                    }
                                                                                    PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
                                                                                    popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
                                                                                    popupWindow.showAtLocation(emailCodeAccessActivity.findViewById(android.R.id.content), 17, 0, 0);
                                                                                    int i23 = 1;
                                                                                    popupWindow.setFocusable(true);
                                                                                    int iA3 = point.y - d70.b.a(64);
                                                                                    View.inflate(e0Var.getContext(), R.layout.email_login_help_popup, e0Var);
                                                                                    e0Var.f6143a = iA3;
                                                                                    TextView textView42 = (TextView) e0Var.findViewById(R.id.tvEmail);
                                                                                    if (textView42 != null) {
                                                                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                                        String string3 = e0Var.getResources().getString(R.string.no_email_popup_explanation);
                                                                                        string3.getClass();
                                                                                        textView42.setText(String.format(string3, Arrays.copyOf(new Object[]{str3}, 1)));
                                                                                    }
                                                                                    View viewFindViewById = e0Var.findViewById(R.id.btnChangeEmail);
                                                                                    viewFindViewById.getClass();
                                                                                    mv.d.x(viewFindViewById, new ek.a(5, popupWindow, emailCodeAccessActivity));
                                                                                    View viewFindViewById2 = e0Var.findViewById(R.id.btnClose);
                                                                                    viewFindViewById2.getClass();
                                                                                    mv.d.x(viewFindViewById2, new bg.i(popupWindow, i23));
                                                                                    na0.a.l0(popupWindow);
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                int i24 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                pg.b bVar7 = emailCodeAccessActivity.f9050g;
                                                                                bVar7.getClass();
                                                                                ((TextInputEditText) bVar7.f34786g).setText("");
                                                                                break;
                                                                            default:
                                                                                int i25 = EmailCodeAccessActivity.f9048k;
                                                                                ((View) obj22).getClass();
                                                                                emailCodeAccessActivity.getOnBackPressedDispatcher().d();
                                                                                break;
                                                                        }
                                                                        return Unit.f26487a;
                                                                    }
                                                                });
                                                                he.o.b(this, "letter_blob.json").b(new bg.y(this, i16));
                                                                p pVarA03 = a0();
                                                                i iVar = i.SCREEN_LOGIN_POLLING;
                                                                dv.b bVarE = h0.g.E(new Pair(dv.a.SOURCE, new dv.c(getIntent().getBooleanExtra("signUp", false) ? "Sign_Up" : "Sign_In")));
                                                                iVar.getClass();
                                                                pVarA03.f1569g.c(iVar, bVarE);
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
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9053j.remove();
        p pVarA0 = a0();
        pVarA0.f1583v = null;
        pVarA0.f1584w = null;
    }
}
