package com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent;

import a3.f3;
import ah.n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b4.q;
import bg.n0;
import c5.r3;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import cv.b;
import e70.c;
import er.a;
import g3.q9;
import gr.g;
import gr.j;
import gr.k;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.y;
import lv.t;
import m3.m;
import m3.s;
import pg.q3;
import u3.d;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class TrackingConsentActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9336k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q3 f9337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f9339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f9340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9341j;

    public TrackingConsentActivity() {
        super(15);
        this.f9338g = new n1(Reflection.getOrCreateKotlinClass(k.class), new g(this, 1), new g(this, 0), new g(this, 2));
        this.f9341j = new e0(this, 19);
    }

    public final k a0() {
        return (k) this.f9338g.getValue();
    }

    public final void b0(pj.b bVar) {
        a aVar = a0().f20822e;
        aVar.getClass();
        aVar.f16347a.a(new f70.b(TrackingConsentDetailActivity.class, u.x(new Pair("Details", bVar)), false, false, false, null, null, null, null, false, 1020));
    }

    public final void c0() {
        if (!a0().b()) {
            getOnBackPressedDispatcher().d();
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = q3.f35081z;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        x70.c cVar = null;
        final int i12 = 0;
        q3 q3Var = (q3) a8.k.Z(layoutInflater, R.layout.tracking_consent_view, null, false, null);
        q3Var.getClass();
        this.f9337f = q3Var;
        setContentView(q3Var.f986f);
        q3 q3Var2 = this.f9337f;
        if (q3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3Var2 = null;
        }
        ComposeView composeView = q3Var2.f35085v;
        r3 r3Var = r3.f7360a;
        composeView.setViewCompositionStrategy(r3Var);
        final int i13 = 2;
        final int i14 = 1;
        composeView.setContent(new d(new Function2(this) { // from class: gr.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentActivity f20809b;

            {
                this.f20809b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Function0 function0;
                int i15 = i13;
                m3.f fVar = m.f29332a;
                final TrackingConsentActivity trackingConsentActivity = this.f20809b;
                final int i16 = 2;
                final int i17 = 1;
                Object[] objArr = 0;
                switch (i15) {
                    case 0:
                        m3.n nVar = (m3.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i18 = TrackingConsentActivity.f9336k;
                        s sVar = (s) nVar;
                        if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                            float f11 = t.f28253g;
                            b4.t tVarD = d2.c.D(q.f5711a, f11, f11, f11, 0.0f, 8);
                            String string = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_accept_all);
                            string.getClass();
                            boolean zH = sVar.h(trackingConsentActivity);
                            Object objM = sVar.M();
                            if (zH || objM == fVar) {
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                objM = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i19 = objArr2;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i19) {
                                            case 0:
                                                int i21 = TrackingConsentActivity.f9336k;
                                                k kVarA0 = trackingConsentActivity2.a0();
                                                ft.s sVar2 = kVarA0.f20821d;
                                                sVar2.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar2, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar2, true, null, 4));
                                                kVarA0.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar3 = trackingConsentActivity2.a0().f20821d;
                                                sVar3.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar3, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar.k0(objM);
                            }
                            v0.n.l(tVarD, string, null, null, null, true, false, null, null, (Function0) objM, sVar, 196608, 476);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        m3.n nVar2 = (m3.n) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i19 = TrackingConsentActivity.f9336k;
                        s sVar2 = (s) nVar2;
                        if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            q qVar = q.f5711a;
                            float f12 = t.f28253g;
                            b4.t tVarC = d2.c.C(qVar, f12, f12, f12, f12);
                            String string2 = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_allow_selection);
                            string2.getClass();
                            boolean zH2 = sVar2.h(trackingConsentActivity);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar) {
                                objM2 = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i192 = i17;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i192) {
                                            case 0:
                                                int i21 = TrackingConsentActivity.f9336k;
                                                k kVarA0 = trackingConsentActivity2.a0();
                                                ft.s sVar22 = kVarA0.f20821d;
                                                sVar22.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                kVarA0.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar3 = trackingConsentActivity2.a0().f20821d;
                                                sVar3.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar3, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar2.k0(objM2);
                            }
                            v0.n.l(tVarC, string2, null, null, null, true, false, null, null, (Function0) objM2, sVar2, 196608, 476);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        m3.n nVar3 = (m3.n) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        int i21 = TrackingConsentActivity.f9336k;
                        s sVar3 = (s) nVar3;
                        if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            Object[] objArr3 = (trackingConsentActivity.a0().b() && Intrinsics.areEqual((Boolean) trackingConsentActivity.a0().f20818a.a("IS_LOGGED_IN"), Boolean.TRUE)) ? false : true;
                            k kVarA0 = trackingConsentActivity.a0();
                            String string3 = trackingConsentActivity.getString(y.k(kVarA0.f20819b.m().getCountryCode(), "US", true) ? kVarA0.b() ? R.string.privacy_tracking_consent_title_us_version : R.string.me_menu_tab_title_legal_cookies_and_data_us_version : kVarA0.b() ? R.string.privacy_tracking_consent_title : R.string.me_menu_tab_title_legal_cookies_and_data);
                            string3.getClass();
                            if (objArr3 == true) {
                                sVar3.a0(549881315);
                                boolean zH3 = sVar3.h(trackingConsentActivity);
                                Object objM3 = sVar3.M();
                                if (zH3 || objM3 == fVar) {
                                    objM3 = new Function0() { // from class: gr.f
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() throws Throwable {
                                            int i192 = i16;
                                            TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i212 = TrackingConsentActivity.f9336k;
                                                    k kVarA02 = trackingConsentActivity2.a0();
                                                    ft.s sVar22 = kVarA02.f20821d;
                                                    sVar22.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                    f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                    kVarA02.f20825h.k(Boolean.TRUE);
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar = trackingConsentActivity2.f9340i;
                                                    if (bVar == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar = null;
                                                    }
                                                    cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar = dv.a.OPT_IN;
                                                    dv.d dVar = dv.d.EVERYTHING;
                                                    bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                case 1:
                                                    int i22 = TrackingConsentActivity.f9336k;
                                                    ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                    sVar32.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                    if (bVar2 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar2 = null;
                                                    }
                                                    cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar2 = dv.a.OPT_IN;
                                                    dv.d dVar2 = dv.d.NECESSARY;
                                                    bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                default:
                                                    int i23 = TrackingConsentActivity.f9336k;
                                                    trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                    break;
                                            }
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar3.k0(objM3);
                                }
                                function0 = (Function0) objM3;
                                sVar3.q(false);
                            } else {
                                sVar3.a0(549976330);
                                sVar3.q(false);
                                function0 = null;
                            }
                            cg.j.s(string3, null, 0L, 0L, function0, null, null, null, sVar3, 0, 238);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -411010108));
        q3 q3Var3 = this.f9337f;
        if (q3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3Var3 = null;
        }
        ComposeView composeView2 = q3Var3.f35082s;
        composeView2.setViewCompositionStrategy(r3Var);
        composeView2.setContent(new d(new Function2(this) { // from class: gr.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentActivity f20809b;

            {
                this.f20809b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Function0 function0;
                int i15 = i12;
                m3.f fVar = m.f29332a;
                final TrackingConsentActivity trackingConsentActivity = this.f20809b;
                final int i16 = 2;
                final int i17 = 1;
                Object[] objArr = 0;
                switch (i15) {
                    case 0:
                        m3.n nVar = (m3.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i18 = TrackingConsentActivity.f9336k;
                        s sVar = (s) nVar;
                        if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                            float f11 = t.f28253g;
                            b4.t tVarD = d2.c.D(q.f5711a, f11, f11, f11, 0.0f, 8);
                            String string = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_accept_all);
                            string.getClass();
                            boolean zH = sVar.h(trackingConsentActivity);
                            Object objM = sVar.M();
                            if (zH || objM == fVar) {
                                final int objArr2 = objArr == true ? 1 : 0;
                                objM = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i192 = objArr2;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i192) {
                                            case 0:
                                                int i212 = TrackingConsentActivity.f9336k;
                                                k kVarA02 = trackingConsentActivity2.a0();
                                                ft.s sVar22 = kVarA02.f20821d;
                                                sVar22.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                kVarA02.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                sVar32.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar.k0(objM);
                            }
                            v0.n.l(tVarD, string, null, null, null, true, false, null, null, (Function0) objM, sVar, 196608, 476);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        m3.n nVar2 = (m3.n) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i19 = TrackingConsentActivity.f9336k;
                        s sVar2 = (s) nVar2;
                        if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            q qVar = q.f5711a;
                            float f12 = t.f28253g;
                            b4.t tVarC = d2.c.C(qVar, f12, f12, f12, f12);
                            String string2 = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_allow_selection);
                            string2.getClass();
                            boolean zH2 = sVar2.h(trackingConsentActivity);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar) {
                                objM2 = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i192 = i17;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i192) {
                                            case 0:
                                                int i212 = TrackingConsentActivity.f9336k;
                                                k kVarA02 = trackingConsentActivity2.a0();
                                                ft.s sVar22 = kVarA02.f20821d;
                                                sVar22.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                kVarA02.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                sVar32.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar2.k0(objM2);
                            }
                            v0.n.l(tVarC, string2, null, null, null, true, false, null, null, (Function0) objM2, sVar2, 196608, 476);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        m3.n nVar3 = (m3.n) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        int i21 = TrackingConsentActivity.f9336k;
                        s sVar3 = (s) nVar3;
                        if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            Object[] objArr3 = (trackingConsentActivity.a0().b() && Intrinsics.areEqual((Boolean) trackingConsentActivity.a0().f20818a.a("IS_LOGGED_IN"), Boolean.TRUE)) ? false : true;
                            k kVarA0 = trackingConsentActivity.a0();
                            String string3 = trackingConsentActivity.getString(y.k(kVarA0.f20819b.m().getCountryCode(), "US", true) ? kVarA0.b() ? R.string.privacy_tracking_consent_title_us_version : R.string.me_menu_tab_title_legal_cookies_and_data_us_version : kVarA0.b() ? R.string.privacy_tracking_consent_title : R.string.me_menu_tab_title_legal_cookies_and_data);
                            string3.getClass();
                            if (objArr3 == true) {
                                sVar3.a0(549881315);
                                boolean zH3 = sVar3.h(trackingConsentActivity);
                                Object objM3 = sVar3.M();
                                if (zH3 || objM3 == fVar) {
                                    objM3 = new Function0() { // from class: gr.f
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() throws Throwable {
                                            int i192 = i16;
                                            TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i212 = TrackingConsentActivity.f9336k;
                                                    k kVarA02 = trackingConsentActivity2.a0();
                                                    ft.s sVar22 = kVarA02.f20821d;
                                                    sVar22.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                    f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                    kVarA02.f20825h.k(Boolean.TRUE);
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar = trackingConsentActivity2.f9340i;
                                                    if (bVar == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar = null;
                                                    }
                                                    cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar = dv.a.OPT_IN;
                                                    dv.d dVar = dv.d.EVERYTHING;
                                                    bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                case 1:
                                                    int i22 = TrackingConsentActivity.f9336k;
                                                    ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                    sVar32.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                    if (bVar2 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar2 = null;
                                                    }
                                                    cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar2 = dv.a.OPT_IN;
                                                    dv.d dVar2 = dv.d.NECESSARY;
                                                    bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                default:
                                                    int i23 = TrackingConsentActivity.f9336k;
                                                    trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                    break;
                                            }
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar3.k0(objM3);
                                }
                                function0 = (Function0) objM3;
                                sVar3.q(false);
                            } else {
                                sVar3.a0(549976330);
                                sVar3.q(false);
                                function0 = null;
                            }
                            cg.j.s(string3, null, 0L, 0L, function0, null, null, null, sVar3, 0, 238);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, 146433079));
        q3 q3Var4 = this.f9337f;
        if (q3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3Var4 = null;
        }
        ComposeView composeView3 = q3Var4.f35083t;
        composeView3.setViewCompositionStrategy(r3Var);
        composeView3.setContent(new d(new Function2(this) { // from class: gr.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentActivity f20809b;

            {
                this.f20809b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Function0 function0;
                int i15 = i14;
                m3.f fVar = m.f29332a;
                final TrackingConsentActivity trackingConsentActivity = this.f20809b;
                final int i16 = 2;
                final int i17 = 1;
                Object[] objArr = 0;
                switch (i15) {
                    case 0:
                        m3.n nVar = (m3.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i18 = TrackingConsentActivity.f9336k;
                        s sVar = (s) nVar;
                        if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                            float f11 = t.f28253g;
                            b4.t tVarD = d2.c.D(q.f5711a, f11, f11, f11, 0.0f, 8);
                            String string = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_accept_all);
                            string.getClass();
                            boolean zH = sVar.h(trackingConsentActivity);
                            Object objM = sVar.M();
                            if (zH || objM == fVar) {
                                final int objArr2 = objArr == true ? 1 : 0;
                                objM = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i192 = objArr2;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i192) {
                                            case 0:
                                                int i212 = TrackingConsentActivity.f9336k;
                                                k kVarA02 = trackingConsentActivity2.a0();
                                                ft.s sVar22 = kVarA02.f20821d;
                                                sVar22.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                kVarA02.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                sVar32.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar.k0(objM);
                            }
                            v0.n.l(tVarD, string, null, null, null, true, false, null, null, (Function0) objM, sVar, 196608, 476);
                        } else {
                            sVar.U();
                        }
                        break;
                    case 1:
                        m3.n nVar2 = (m3.n) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i19 = TrackingConsentActivity.f9336k;
                        s sVar2 = (s) nVar2;
                        if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            q qVar = q.f5711a;
                            float f12 = t.f28253g;
                            b4.t tVarC = d2.c.C(qVar, f12, f12, f12, f12);
                            String string2 = trackingConsentActivity.getString(R.string.privacy_tracking_consent_btn_allow_selection);
                            string2.getClass();
                            boolean zH2 = sVar2.h(trackingConsentActivity);
                            Object objM2 = sVar2.M();
                            if (zH2 || objM2 == fVar) {
                                objM2 = new Function0() { // from class: gr.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        int i192 = i17;
                                        TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                        switch (i192) {
                                            case 0:
                                                int i212 = TrackingConsentActivity.f9336k;
                                                k kVarA02 = trackingConsentActivity2.a0();
                                                ft.s sVar22 = kVarA02.f20821d;
                                                sVar22.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                kVarA02.f20825h.k(Boolean.TRUE);
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar = trackingConsentActivity2.f9340i;
                                                if (bVar == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar = null;
                                                }
                                                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar = dv.a.OPT_IN;
                                                dv.d dVar = dv.d.EVERYTHING;
                                                bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            case 1:
                                                int i22 = TrackingConsentActivity.f9336k;
                                                ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                sVar32.getClass();
                                                f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                if (trackingConsentActivity2.a0().b()) {
                                                    trackingConsentActivity2.a0().a();
                                                }
                                                trackingConsentActivity2.a0().d();
                                                cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                if (bVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                    bVar2 = null;
                                                }
                                                cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                dv.a aVar2 = dv.a.OPT_IN;
                                                dv.d dVar2 = dv.d.NECESSARY;
                                                bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                trackingConsentActivity2.c0();
                                                break;
                                            default:
                                                int i23 = TrackingConsentActivity.f9336k;
                                                trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar2.k0(objM2);
                            }
                            v0.n.l(tVarC, string2, null, null, null, true, false, null, null, (Function0) objM2, sVar2, 196608, 476);
                        } else {
                            sVar2.U();
                        }
                        break;
                    default:
                        m3.n nVar3 = (m3.n) obj;
                        int iIntValue3 = ((Integer) obj2).intValue();
                        int i21 = TrackingConsentActivity.f9336k;
                        s sVar3 = (s) nVar3;
                        if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                            Object[] objArr3 = (trackingConsentActivity.a0().b() && Intrinsics.areEqual((Boolean) trackingConsentActivity.a0().f20818a.a("IS_LOGGED_IN"), Boolean.TRUE)) ? false : true;
                            k kVarA0 = trackingConsentActivity.a0();
                            String string3 = trackingConsentActivity.getString(y.k(kVarA0.f20819b.m().getCountryCode(), "US", true) ? kVarA0.b() ? R.string.privacy_tracking_consent_title_us_version : R.string.me_menu_tab_title_legal_cookies_and_data_us_version : kVarA0.b() ? R.string.privacy_tracking_consent_title : R.string.me_menu_tab_title_legal_cookies_and_data);
                            string3.getClass();
                            if (objArr3 == true) {
                                sVar3.a0(549881315);
                                boolean zH3 = sVar3.h(trackingConsentActivity);
                                Object objM3 = sVar3.M();
                                if (zH3 || objM3 == fVar) {
                                    objM3 = new Function0() { // from class: gr.f
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() throws Throwable {
                                            int i192 = i16;
                                            TrackingConsentActivity trackingConsentActivity2 = trackingConsentActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i212 = TrackingConsentActivity.f9336k;
                                                    k kVarA02 = trackingConsentActivity2.a0();
                                                    ft.s sVar22 = kVarA02.f20821d;
                                                    sVar22.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar22, null, 2));
                                                    f0.E(kotlin.coroutines.g.f26549a, new f3(sVar22, true, null, 4));
                                                    kVarA02.f20825h.k(Boolean.TRUE);
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar = trackingConsentActivity2.f9340i;
                                                    if (bVar == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar = null;
                                                    }
                                                    cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar = dv.a.OPT_IN;
                                                    dv.d dVar = dv.d.EVERYTHING;
                                                    bVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                case 1:
                                                    int i22 = TrackingConsentActivity.f9336k;
                                                    ft.s sVar32 = trackingConsentActivity2.a0().f20821d;
                                                    sVar32.getClass();
                                                    f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar32, null, 2));
                                                    if (trackingConsentActivity2.a0().b()) {
                                                        trackingConsentActivity2.a0().a();
                                                    }
                                                    trackingConsentActivity2.a0().d();
                                                    cv.b bVar2 = trackingConsentActivity2.f9340i;
                                                    if (bVar2 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                                                        bVar2 = null;
                                                    }
                                                    cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                                                    dv.a aVar2 = dv.a.OPT_IN;
                                                    dv.d dVar2 = dv.d.NECESSARY;
                                                    bVar2.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                                                    trackingConsentActivity2.c0();
                                                    break;
                                                default:
                                                    int i23 = TrackingConsentActivity.f9336k;
                                                    trackingConsentActivity2.getOnBackPressedDispatcher().d();
                                                    break;
                                            }
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar3.k0(objM3);
                                }
                                function0 = (Function0) objM3;
                                sVar3.q(false);
                            } else {
                                sVar3.a0(549976330);
                                sVar3.q(false);
                                function0 = null;
                            }
                            cg.j.s(string3, null, 0L, 0L, function0, null, null, null, sVar3, 0, 238);
                        } else {
                            sVar3.U();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -1216761106));
        a0().f20825h.e(this, new al.c(new q9(this, 7), 6));
        q3 q3Var5 = this.f9337f;
        if (q3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3Var5 = null;
        }
        TextView textView = q3Var5.f35087x;
        textView.getClass();
        String privacyUrl = a0().f20819b.n().getPrivacyUrl();
        if (privacyUrl == null) {
            privacyUrl = getString(R.string.default_privacy_policy_link);
            privacyUrl.getClass();
        }
        mv.d.z(textView, m0.c.r0(this, R.string.trackingoptin_read_more_full_privacy_policy, R.string.trackingoptin_privacy_policy_link_part, privacyUrl), null, 6);
        getOnBackPressedDispatcher().a(this.f9341j);
        q3 q3Var6 = this.f9337f;
        if (q3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3Var6 = null;
        }
        q3Var6.f35084u.setOnClickListener(new n0(13, this, q3Var6));
        q3Var6.f35088y.setOnClickListener(new View.OnClickListener(this) { // from class: gr.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentActivity f20811b;

            {
                this.f20811b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i12;
                TrackingConsentActivity trackingConsentActivity = this.f20811b;
                switch (i15) {
                    case 0:
                        int i16 = TrackingConsentActivity.f9336k;
                        trackingConsentActivity.b0(new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q())));
                        break;
                    default:
                        int i17 = TrackingConsentActivity.f9336k;
                        trackingConsentActivity.b0(new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q())));
                        break;
                }
            }
        });
        q3Var6.f35086w.setOnClickListener(new View.OnClickListener(this) { // from class: gr.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentActivity f20811b;

            {
                this.f20811b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                TrackingConsentActivity trackingConsentActivity = this.f20811b;
                switch (i15) {
                    case 0:
                        int i16 = TrackingConsentActivity.f9336k;
                        trackingConsentActivity.b0(new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q())));
                        break;
                    default:
                        int i17 = TrackingConsentActivity.f9336k;
                        trackingConsentActivity.b0(new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q())));
                        break;
                }
            }
        });
        c cVar2 = this.f9339h;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar2 = null;
        }
        c.b(cVar2, this, null, 6);
        o30.f0.S(this, true);
        if (a0().b()) {
            k kVarA0 = a0();
            f0.B(m1.d(kVarA0), null, null, new j(kVarA0, cVar, i14), 3);
        }
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9341j.remove();
    }
}
