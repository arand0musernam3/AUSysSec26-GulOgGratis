package com.app.tgtg.feature.deeplink;

import ah.n;
import al.k;
import al.p;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.model.remote.UserId;
import com.braze.Braze;
import com.braze.BrazeUser;
import e.f;
import e70.c;
import ft.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m2.b2;
import m90.z0;
import o30.f0;
import qj.a;
import qj.a1;
import qj.b;
import qj.b1;
import qj.c1;
import qj.d;
import qj.d0;
import qj.d1;
import qj.g1;
import qj.i;
import qj.j0;
import qj.m;
import qj.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeepLinkActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8988i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f8989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f8990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f8991h;

    public DeepLinkActivity() {
        super(27);
        this.f8989f = new n1(Reflection.getOrCreateKotlinClass(p.class), new b(this, 1), new b(this, 0), new b(this, 2));
        this.f8990g = new n1(Reflection.getOrCreateKotlinClass(i.class), new b(this, 4), new b(this, 3), new b(this, 5));
    }

    public final i a0() {
        return (i) this.f8990g.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        c cVar = this.f8991h;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        cVar.a(this, Lifecycle.State.CREATED, new z0(this, 14));
        f.a(this, a.f37059a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [qj.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [qj.e] */
    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onStart() {
        y0 y0Var;
        String str;
        super.onStart();
        Intent intent = getIntent();
        intent.getClass();
        Uri data = intent.getData();
        m g1Var = (data == null || !data.isHierarchical()) ? (intent.hasExtra("LOCAL_NOTIFICATION") && intent.hasExtra("FROM_RATING_NOTIFICATION")) ? new g1(intent.getStringExtra("ORDER_ID"), intent.getStringExtra("INVITATION_ID")) : j0.f37110a : d.a(data);
        x70.c cVar = null;
        if ((g1Var instanceof y0) && (str = (y0Var = (y0) g1Var).f37159b) != null) {
            final i iVarA0 = a0();
            String strM287constructorimpl = UserId.m287constructorimpl(y0Var.f37158a);
            strM287constructorimpl.getClass();
            SharedPreferences sharedPreferences = e.f17922c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                sharedPreferences = null;
            }
            if (sharedPreferences.getBoolean("partnerLoginOngoing", false)) {
                ft.c.a0(false);
                final int i11 = 1;
                v80.f0.B(m1.d(iVarA0), null, null, new k(iVarA0, str, strM287constructorimpl, (qj.e) new Function0() { // from class: qj.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                iVarA0.f37100a.f39042a.a(new f70.b(MainCharityActivity.class, null, false, true, false, null, kotlin.collections.d0.h(268435456, 32768), null, null, false, 950));
                                break;
                            default:
                                cv.i iVar = cv.i.CORE_LOGGED_IN;
                                dv.b bVarE = h0.g.E(new Pair(dv.a.METHOD, new dv.c("Email")), new Pair(dv.a.USER_TYPE, new dv.c("Store")), new Pair(dv.a.VERIFICATION_METHOD, new dv.c("None")));
                                i iVar2 = iVarA0;
                                cv.b bVar = iVar2.f37105f;
                                bVar.c(iVar, bVarE);
                                if (!ft.c.x().getBoolean("hasStoreUserSetInBraze", false)) {
                                    ev.e eVar = bVar.f13429b;
                                    if (eVar.f16489b) {
                                        try {
                                            BrazeUser currentUser = Braze.INSTANCE.getInstance(eVar.f16488a).getCurrentUser();
                                            if (currentUser != null) {
                                                currentUser.setCustomUserAttribute(cv.i.BRAZE_STORE_USER.f(), true);
                                            }
                                        } catch (Throwable th2) {
                                            eVar.f16489b = false;
                                            sa0.a.f38953a.d(th2);
                                        }
                                    } else {
                                        sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
                                    }
                                    SharedPreferences.Editor editorEdit = ft.c.x().edit();
                                    editorEdit.putBoolean("hasStoreUserSetInBraze", true);
                                    editorEdit.apply();
                                }
                                iVar2.f37100a.f39042a.a(new sj.b(mv.z.MY_STORE, mv.y.MAIN_START));
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, new qj.f(iVarA0, 1), (x70.c) null), 3);
                return;
            }
            return;
        }
        if (!(g1Var instanceof d0)) {
            if ((g1Var instanceof b1) || (g1Var instanceof d1) || (g1Var instanceof c1) || (g1Var instanceof a1)) {
                a0().f37101b.f39042a.a(g1Var.a());
                return;
            } else {
                a0().f37100a.a(g1Var);
                return;
            }
        }
        d0 d0Var = (d0) g1Var;
        String str2 = d0Var.f37071a;
        String str3 = d0Var.f37072b;
        if (str3 != null) {
            if (((Boolean) v80.f0.E(g.f26549a, new h2.b1(a0(), cVar, 27))).booleanValue()) {
                final i iVarA02 = a0();
                String strM287constructorimpl2 = UserId.m287constructorimpl(str2);
                strM287constructorimpl2.getClass();
                String strF = ft.c.f();
                strF.getClass();
                final int i12 = 0;
                v80.f0.B(m1.d(iVarA02), null, null, new qj.g(iVarA02, str3, strM287constructorimpl2, strF, new Function0() { // from class: qj.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                iVarA02.f37100a.f39042a.a(new f70.b(MainCharityActivity.class, null, false, true, false, null, kotlin.collections.d0.h(268435456, 32768), null, null, false, 950));
                                break;
                            default:
                                cv.i iVar = cv.i.CORE_LOGGED_IN;
                                dv.b bVarE = h0.g.E(new Pair(dv.a.METHOD, new dv.c("Email")), new Pair(dv.a.USER_TYPE, new dv.c("Store")), new Pair(dv.a.VERIFICATION_METHOD, new dv.c("None")));
                                i iVar2 = iVarA02;
                                cv.b bVar = iVar2.f37105f;
                                bVar.c(iVar, bVarE);
                                if (!ft.c.x().getBoolean("hasStoreUserSetInBraze", false)) {
                                    ev.e eVar = bVar.f13429b;
                                    if (eVar.f16489b) {
                                        try {
                                            BrazeUser currentUser = Braze.INSTANCE.getInstance(eVar.f16488a).getCurrentUser();
                                            if (currentUser != null) {
                                                currentUser.setCustomUserAttribute(cv.i.BRAZE_STORE_USER.f(), true);
                                            }
                                        } catch (Throwable th2) {
                                            eVar.f16489b = false;
                                            sa0.a.f38953a.d(th2);
                                        }
                                    } else {
                                        sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
                                    }
                                    SharedPreferences.Editor editorEdit = ft.c.x().edit();
                                    editorEdit.putBoolean("hasStoreUserSetInBraze", true);
                                    editorEdit.apply();
                                }
                                iVar2.f37100a.f39042a.a(new sj.b(mv.z.MY_STORE, mv.y.MAIN_START));
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, new qj.f(iVarA02, 0), null), 3);
                return;
            }
        }
        if (str3 == null || ft.c.f() == null) {
            a0().f37100a.a(null);
            return;
        }
        p pVar = (p) this.f8989f.getValue();
        String strM287constructorimpl3 = UserId.m287constructorimpl(str2);
        b2 b2Var = new b2(this, 17);
        strM287constructorimpl3.getClass();
        String strF2 = ft.c.f();
        strF2.getClass();
        v80.f0.B(m1.d(pVar), null, null, new k(pVar, str3, strM287constructorimpl3, strF2, new a3.p(6, b2Var, pVar), (x70.c) null), 3);
    }
}
