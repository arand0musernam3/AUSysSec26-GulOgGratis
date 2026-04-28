package com.app.tgtg.feature.tabprofile.legal;

import ah.n;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;
import androidx.lifecycle.n1;
import at.c0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.model.local.AppConstants;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import cr.e;
import ct.a;
import e70.c;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.y;
import mv.d;
import o30.f0;
import pd.g;
import pg.b;
import pg.b1;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LegalActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9324k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f9326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f9328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActivityResultLauncher f9329j;

    public LegalActivity() {
        super(5);
        this.f9327h = new n1(Reflection.getOrCreateKotlinClass(e.class), new cr.c(this, 1), new cr.c(this, 0), new cr.c(this, 2));
        this.f9328i = new e0(this, 5);
        this.f9329j = registerForActivityResult(new g1(4), new z(this, 24));
    }

    public final e a0() {
        return (e) this.f9327h.getValue();
    }

    public final void b0(String str, int i11, a aVar) {
        if (str.length() == 0) {
            Toast.makeText(this, getString(R.string.generic_err_undefined_error), 0).show();
            return;
        }
        e eVarA0 = a0();
        Integer numValueOf = Integer.valueOf(i11);
        aVar.getClass();
        c0.c(eVarA0.f13424c, str, aVar, numValueOf, true, 16);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_legal, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i11 = R.id.miAccessibilityStatement;
        MenuItemView menuItemView = (MenuItemView) g.t(R.id.miAccessibilityStatement, viewInflate);
        if (menuItemView != null) {
            i11 = R.id.miCateringTerms;
            MenuItemView menuItemView2 = (MenuItemView) g.t(R.id.miCateringTerms, viewInflate);
            if (menuItemView2 != null) {
                i11 = R.id.miDeliveryTerms;
                MenuItemView menuItemView3 = (MenuItemView) g.t(R.id.miDeliveryTerms, viewInflate);
                if (menuItemView3 != null) {
                    i11 = R.id.miDigitalServicesAct;
                    MenuItemView menuItemView4 = (MenuItemView) g.t(R.id.miDigitalServicesAct, viewInflate);
                    if (menuItemView4 != null) {
                        i11 = R.id.miExportData;
                        MenuItemView menuItemView5 = (MenuItemView) g.t(R.id.miExportData, viewInflate);
                        if (menuItemView5 != null) {
                            i11 = R.id.miPrivacyLink;
                            MenuItemView menuItemView6 = (MenuItemView) g.t(R.id.miPrivacyLink, viewInflate);
                            if (menuItemView6 != null) {
                                i11 = R.id.miTerms;
                                MenuItemView menuItemView7 = (MenuItemView) g.t(R.id.miTerms, viewInflate);
                                if (menuItemView7 != null) {
                                    i11 = R.id.miThirdParty;
                                    MenuItemView menuItemView8 = (MenuItemView) g.t(R.id.miThirdParty, viewInflate);
                                    if (menuItemView8 != null) {
                                        i11 = R.id.miTracking;
                                        MenuItemView menuItemView9 = (MenuItemView) g.t(R.id.miTracking, viewInflate);
                                        if (menuItemView9 != null) {
                                            i11 = R.id.toolbar;
                                            View viewT = g.t(R.id.toolbar, viewInflate);
                                            if (viewT != null) {
                                                this.f9326g = new b(linearLayout, menuItemView, menuItemView2, menuItemView3, menuItemView4, menuItemView5, menuItemView6, menuItemView7, menuItemView8, menuItemView9, b1.b(viewT), 0);
                                                setContentView(linearLayout);
                                                getOnBackPressedDispatcher().a(this.f9328i);
                                                b bVar = this.f9326g;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    bVar = null;
                                                }
                                                b1 b1Var = (b1) bVar.l;
                                                MenuItemView menuItemView10 = (MenuItemView) bVar.f34783d;
                                                ((TextView) b1Var.f34795c).setText(R.string.me_menu_tab_title_legal);
                                                MenuItemView menuItemView11 = (MenuItemView) bVar.f34788i;
                                                a0();
                                                menuItemView11.setVisibility(!ft.c.C() ? 0 : 8);
                                                MenuItemView menuItemView12 = (MenuItemView) bVar.f34784e;
                                                a0();
                                                menuItemView12.setVisibility((ft.c.C() || !a0().f13422a.n().getShowManufacturerItems()) ? 8 : 0);
                                                a0();
                                                final int i12 = 1;
                                                menuItemView10.setVisibility((ft.c.C() || !(y.k(a0().f13422a.m().getCountryIso(), "PL", true) || a0().f13422a.w())) ? 8 : 0);
                                                menuItemView10.setTitle(a0().f13422a.w() ? R.string.me_menu_tab_title_legal_next_day_delivery_conditions : R.string.me_menu_tab_title_legal_catering_conditions);
                                                ((MenuItemView) bVar.f34790k).setVisibility(0);
                                                b bVar2 = this.f9326g;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    bVar2 = null;
                                                }
                                                MenuItemView menuItemView13 = (MenuItemView) bVar2.f34788i;
                                                MenuItemView menuItemView14 = (MenuItemView) bVar2.f34785f;
                                                MenuItemView menuItemView15 = (MenuItemView) bVar2.f34782c;
                                                MenuItemView menuItemView16 = (MenuItemView) bVar2.f34790k;
                                                menuItemView13.setOnClickListener(new View.OnClickListener(this) { // from class: cr.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13417b;

                                                    {
                                                        this.f13417b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i13 = i;
                                                        LegalActivity legalActivity = this.f13417b;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = LegalActivity.f9324k;
                                                                String termsUrl = legalActivity.a0().f13422a.n().getTermsUrl();
                                                                legalActivity.b0(termsUrl != null ? termsUrl : "", R.string.webview_terms_and_condition_title, ct.a.TERMS_AND_CONDITIONS);
                                                                break;
                                                            case 1:
                                                                int i15 = LegalActivity.f9324k;
                                                                String manufacturerTermsUrl = legalActivity.a0().f13422a.n().getManufacturerTermsUrl();
                                                                legalActivity.b0(manufacturerTermsUrl != null ? manufacturerTermsUrl : "", R.string.me_menu_tab_title_legal_delivery_conditions, ct.a.TERMS_AND_CONDITIONS_MANUFACTURER);
                                                                break;
                                                            case 2:
                                                                int i16 = LegalActivity.f9324k;
                                                                String cateringTermsUrl = legalActivity.a0().f13422a.n().getCateringTermsUrl();
                                                                legalActivity.b0(cateringTermsUrl != null ? cateringTermsUrl : "", R.string.me_menu_tab_title_legal_catering_conditions, ct.a.TERMS_AND_CONDITIONS_CATERING);
                                                                break;
                                                            default:
                                                                int i17 = LegalActivity.f9324k;
                                                                legalActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                });
                                                ((MenuItemView) bVar2.f34784e).setOnClickListener(new View.OnClickListener(this) { // from class: cr.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13417b;

                                                    {
                                                        this.f13417b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i13 = i12;
                                                        LegalActivity legalActivity = this.f13417b;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = LegalActivity.f9324k;
                                                                String termsUrl = legalActivity.a0().f13422a.n().getTermsUrl();
                                                                legalActivity.b0(termsUrl != null ? termsUrl : "", R.string.webview_terms_and_condition_title, ct.a.TERMS_AND_CONDITIONS);
                                                                break;
                                                            case 1:
                                                                int i15 = LegalActivity.f9324k;
                                                                String manufacturerTermsUrl = legalActivity.a0().f13422a.n().getManufacturerTermsUrl();
                                                                legalActivity.b0(manufacturerTermsUrl != null ? manufacturerTermsUrl : "", R.string.me_menu_tab_title_legal_delivery_conditions, ct.a.TERMS_AND_CONDITIONS_MANUFACTURER);
                                                                break;
                                                            case 2:
                                                                int i16 = LegalActivity.f9324k;
                                                                String cateringTermsUrl = legalActivity.a0().f13422a.n().getCateringTermsUrl();
                                                                legalActivity.b0(cateringTermsUrl != null ? cateringTermsUrl : "", R.string.me_menu_tab_title_legal_catering_conditions, ct.a.TERMS_AND_CONDITIONS_CATERING);
                                                                break;
                                                            default:
                                                                int i17 = LegalActivity.f9324k;
                                                                legalActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i13 = 2;
                                                ((MenuItemView) bVar2.f34783d).setOnClickListener(new View.OnClickListener(this) { // from class: cr.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13417b;

                                                    {
                                                        this.f13417b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i132 = i13;
                                                        LegalActivity legalActivity = this.f13417b;
                                                        switch (i132) {
                                                            case 0:
                                                                int i14 = LegalActivity.f9324k;
                                                                String termsUrl = legalActivity.a0().f13422a.n().getTermsUrl();
                                                                legalActivity.b0(termsUrl != null ? termsUrl : "", R.string.webview_terms_and_condition_title, ct.a.TERMS_AND_CONDITIONS);
                                                                break;
                                                            case 1:
                                                                int i15 = LegalActivity.f9324k;
                                                                String manufacturerTermsUrl = legalActivity.a0().f13422a.n().getManufacturerTermsUrl();
                                                                legalActivity.b0(manufacturerTermsUrl != null ? manufacturerTermsUrl : "", R.string.me_menu_tab_title_legal_delivery_conditions, ct.a.TERMS_AND_CONDITIONS_MANUFACTURER);
                                                                break;
                                                            case 2:
                                                                int i16 = LegalActivity.f9324k;
                                                                String cateringTermsUrl = legalActivity.a0().f13422a.n().getCateringTermsUrl();
                                                                legalActivity.b0(cateringTermsUrl != null ? cateringTermsUrl : "", R.string.me_menu_tab_title_legal_catering_conditions, ct.a.TERMS_AND_CONDITIONS_CATERING);
                                                                break;
                                                            default:
                                                                int i17 = LegalActivity.f9324k;
                                                                legalActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                });
                                                d.x((MenuItemView) bVar2.f34786g, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i14 = i;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i16 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                d.x((MenuItemView) bVar2.f34787h, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i14 = i12;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i16 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                d.x((MenuItemView) bVar2.f34789j, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i14 = i13;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i16 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                if (y.k(a0().f13422a.m().getCountryCode(), "US", true)) {
                                                    menuItemView16.setTitle(R.string.me_menu_tab_title_legal_cookies_and_data_us_version);
                                                }
                                                final int i14 = 3;
                                                d.x(menuItemView16, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i142 = i14;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i142) {
                                                            case 0:
                                                                int i15 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i16 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                menuItemView15.setVisibility(d.r(a0().f13422a.n().getAccessibilityStatementUrl()) ? 0 : 8);
                                                final int i15 = 4;
                                                d.x(menuItemView15, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i142 = i15;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i142) {
                                                            case 0:
                                                                int i152 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i16 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                menuItemView14.setVisibility(d.r(a0().f13422a.n().getDsaDisclosureUrl()) ? 0 : 8);
                                                final int i16 = 5;
                                                d.x(menuItemView14, new Function1(this) { // from class: cr.b

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13419b;

                                                    {
                                                        this.f13419b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        int i142 = i16;
                                                        LegalActivity legalActivity = this.f13419b;
                                                        View view = (View) obj;
                                                        switch (i142) {
                                                            case 0:
                                                                int i152 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                fr.a aVar = fr.a.SEND_DATA;
                                                                Intent intent = new Intent(legalActivity, (Class<?>) PrivacyActionActivity.class);
                                                                intent.putExtra("ACTION", aVar.toString());
                                                                legalActivity.f9329j.a(intent, new se.b(ActivityOptions.makeCustomAnimation(legalActivity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left), 5));
                                                                break;
                                                            case 1:
                                                                int i162 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String privacyUrl = legalActivity.a0().f13422a.n().getPrivacyUrl();
                                                                legalActivity.b0(privacyUrl != null ? privacyUrl : "", R.string.webview_privacy_title, ct.a.PRIVACY);
                                                                break;
                                                            case 2:
                                                                int i17 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                OssLicensesMenuActivity.setActivityTitle(legalActivity.getResources().getString(R.string.me_menu_tab_title_legal_licenses));
                                                                legalActivity.startActivity(new Intent(legalActivity, (Class<?>) OssLicensesMenuActivity.class), mv.a.b(legalActivity));
                                                                break;
                                                            case 3:
                                                                int i18 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                f70.g gVar = legalActivity.a0().f13423b.f16347a;
                                                                Boolean bool = Boolean.FALSE;
                                                                gVar.a(new f70.b(TrackingConsentActivity.class, u.x(new Pair("IS_FROM_APP_START", bool), new Pair("IS_FROM_DEEPLINK", bool), new Pair("IS_LOGGED_IN", Boolean.TRUE)), false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_TRACKING_CONSENT), null, null, null, false, 988));
                                                                break;
                                                            case 4:
                                                                int i19 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String accessibilityStatementUrl = legalActivity.a0().f13422a.n().getAccessibilityStatementUrl();
                                                                legalActivity.b0(accessibilityStatementUrl != null ? accessibilityStatementUrl : "", R.string.webview_accessibility_statement, ct.a.ACCESSIBILITY_STATEMENT);
                                                                break;
                                                            default:
                                                                int i21 = LegalActivity.f9324k;
                                                                view.getClass();
                                                                String dsaDisclosureUrl = legalActivity.a0().f13422a.n().getDsaDisclosureUrl();
                                                                legalActivity.b0(dsaDisclosureUrl != null ? dsaDisclosureUrl : "", R.string.webview_digital_services_act, ct.a.DIGITAL_SERVICES_ACT);
                                                                break;
                                                        }
                                                        return Unit.f26487a;
                                                    }
                                                });
                                                ((ImageButton) ((b1) bVar2.l).f34796d).setOnClickListener(new View.OnClickListener(this) { // from class: cr.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ LegalActivity f13417b;

                                                    {
                                                        this.f13417b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i132 = i14;
                                                        LegalActivity legalActivity = this.f13417b;
                                                        switch (i132) {
                                                            case 0:
                                                                int i142 = LegalActivity.f9324k;
                                                                String termsUrl = legalActivity.a0().f13422a.n().getTermsUrl();
                                                                legalActivity.b0(termsUrl != null ? termsUrl : "", R.string.webview_terms_and_condition_title, ct.a.TERMS_AND_CONDITIONS);
                                                                break;
                                                            case 1:
                                                                int i152 = LegalActivity.f9324k;
                                                                String manufacturerTermsUrl = legalActivity.a0().f13422a.n().getManufacturerTermsUrl();
                                                                legalActivity.b0(manufacturerTermsUrl != null ? manufacturerTermsUrl : "", R.string.me_menu_tab_title_legal_delivery_conditions, ct.a.TERMS_AND_CONDITIONS_MANUFACTURER);
                                                                break;
                                                            case 2:
                                                                int i162 = LegalActivity.f9324k;
                                                                String cateringTermsUrl = legalActivity.a0().f13422a.n().getCateringTermsUrl();
                                                                legalActivity.b0(cateringTermsUrl != null ? cateringTermsUrl : "", R.string.me_menu_tab_title_legal_catering_conditions, ct.a.TERMS_AND_CONDITIONS_CATERING);
                                                                break;
                                                            default:
                                                                int i17 = LegalActivity.f9324k;
                                                                legalActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                });
                                                c cVar = this.f9325f;
                                                if (cVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                    cVar = null;
                                                }
                                                c.b(cVar, this, null, 6);
                                                f0.S(this, true);
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
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9328i.remove();
        super.onDestroy();
    }
}
