package com.app.tgtg.feature.login.optin;

import ah.n;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p0;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.optin.OptInActivity;
import cv.i;
import e.b;
import e.f;
import e70.c;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import ll.e;
import ll.g;
import lv.s;
import nl.a;
import o30.f0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OptInActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9058k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivityResultLauncher f9059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9063j;

    public OptInActivity() {
        super(22);
        this.f9061h = new n1(Reflection.getOrCreateKotlinClass(g.class), new ll.c(this, 1), new ll.c(this, 0), new ll.c(this, 2));
        this.f9063j = new e0(this, 28);
    }

    public final g a0() {
        return (g) this.f9061h.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        i iVar;
        final int i11 = 0;
        f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9063j);
        c cVar = this.f9060g;
        a aVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        this.f9059f = registerForActivityResult(new g1(3), new b(this, 26));
        g gVarA0 = a0();
        String stringExtra = getIntent().getStringExtra("OPT_IN_TYPE");
        if (stringExtra == null) {
            stringExtra = "newsletter";
        }
        gVarA0.f27898g = stringExtra;
        g gVarA02 = a0();
        Intent intent = getIntent();
        intent.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            serializableExtra = intent.getSerializableExtra("OPT_IN_CONTEXT", e.class);
        } else {
            Object serializableExtra3 = intent.getSerializableExtra("OPT_IN_CONTEXT");
            if (!(serializableExtra3 instanceof e)) {
                serializableExtra3 = null;
            }
            serializableExtra = (e) serializableExtra3;
        }
        gVarA02.f27899h = (e) serializableExtra;
        Intent intent2 = getIntent();
        intent2.getClass();
        if (i12 >= 33) {
            serializableExtra2 = intent2.getSerializableExtra("OPT_IN_CONTEXT", e.class);
        } else {
            Object serializableExtra4 = intent2.getSerializableExtra("OPT_IN_CONTEXT");
            if (!(serializableExtra4 instanceof e)) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (e) serializableExtra4;
        }
        final int i13 = 1;
        this.f9062i = serializableExtra2 == e.REOPTIN;
        p0 p0Var = new p0(this) { // from class: ll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptInActivity f27887b;

            {
                this.f27887b = this;
            }

            @Override // androidx.lifecycle.p0
            public final void a(Object obj) {
                int i14 = i11;
                OptInActivity optInActivity = this.f27887b;
                switch (i14) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i15 = OptInActivity.f9058k;
                        if (!zBooleanValue) {
                            optInActivity.finish();
                            optInActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
                        } else if (Build.VERSION.SDK_INT >= 33 && !ft.c.E()) {
                            ActivityResultLauncher activityResultLauncher = optInActivity.f9059f;
                            if (activityResultLauncher == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                activityResultLauncher = null;
                            }
                            activityResultLauncher.a("android.permission.POST_NOTIFICATIONS", null);
                        } else {
                            k0 k0Var = new k0(optInActivity);
                            k0Var.e(R.string.order_card_push_alert_title);
                            k0Var.a(R.string.order_card_push_alert_description);
                            k0Var.c(R.string.order_card_push_alert_positive_btn);
                            k0Var.l = new b(optInActivity, 0);
                            k0Var.b(R.string.order_card_push_alert_negative_btn);
                            k0Var.f();
                        }
                        break;
                    default:
                        av.a aVar2 = (av.a) obj;
                        int i16 = OptInActivity.f9058k;
                        aVar2.getClass();
                        if (aVar2 instanceof av.a) {
                            if (!optInActivity.f9062i) {
                                optInActivity.finish();
                                optInActivity.startActivity(aVar2.a(optInActivity), mv.a.b(optInActivity));
                            } else {
                                optInActivity.finish();
                                optInActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
                            }
                        }
                        break;
                }
            }
        };
        p0 p0Var2 = new p0(this) { // from class: ll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptInActivity f27887b;

            {
                this.f27887b = this;
            }

            @Override // androidx.lifecycle.p0
            public final void a(Object obj) {
                int i14 = i13;
                OptInActivity optInActivity = this.f27887b;
                switch (i14) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i15 = OptInActivity.f9058k;
                        if (!zBooleanValue) {
                            optInActivity.finish();
                            optInActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
                        } else if (Build.VERSION.SDK_INT >= 33 && !ft.c.E()) {
                            ActivityResultLauncher activityResultLauncher = optInActivity.f9059f;
                            if (activityResultLauncher == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                activityResultLauncher = null;
                            }
                            activityResultLauncher.a("android.permission.POST_NOTIFICATIONS", null);
                        } else {
                            k0 k0Var = new k0(optInActivity);
                            k0Var.e(R.string.order_card_push_alert_title);
                            k0Var.a(R.string.order_card_push_alert_description);
                            k0Var.c(R.string.order_card_push_alert_positive_btn);
                            k0Var.l = new b(optInActivity, 0);
                            k0Var.b(R.string.order_card_push_alert_negative_btn);
                            k0Var.f();
                        }
                        break;
                    default:
                        av.a aVar2 = (av.a) obj;
                        int i16 = OptInActivity.f9058k;
                        aVar2.getClass();
                        if (aVar2 instanceof av.a) {
                            if (!optInActivity.f9062i) {
                                optInActivity.finish();
                                optInActivity.startActivity(aVar2.a(optInActivity), mv.a.b(optInActivity));
                            } else {
                                optInActivity.finish();
                                optInActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
                            }
                        }
                        break;
                }
            }
        };
        m0.c.f0(a0().f27903m, this, new jd.a(this, 17));
        a0().f27896e.e(this, p0Var2);
        a0().f27897f.e(this, p0Var);
        a70.a.t(this, s.f28245z);
        List listH = d0.h(new a(getString(R.string.new_single_opt_in_title_newsletter), "bugle_blob.json", getString(R.string.new_single_opt_in_body), getString(R.string.new_single_opt_in_body_privacy_policy), getString(R.string.newsletter_notification_opt_in)), new a(getString(R.string.new_single_opt_in_title_push), "notifications.json", getString(R.string.new_single_opt_in_body), getString(R.string.new_single_opt_in_body_privacy_policy), getString(R.string.push_notification_opt_in)));
        String str = a0().f27898g;
        if (Intrinsics.areEqual(str, "newsletter")) {
            aVar = (a) CollectionsKt.Q(0, listH);
            if (aVar == null) {
                aVar = (a) listH.get(0);
            }
        } else if (Intrinsics.areEqual(str, "push") && (aVar = (a) CollectionsKt.Q(1, listH)) == null) {
            aVar = (a) listH.get(0);
        }
        if (aVar == null) {
            finish();
            return;
        }
        g gVarA03 = a0();
        String str2 = gVarA03.f27898g;
        if (!Intrinsics.areEqual(str2, "push")) {
            if (Intrinsics.areEqual(str2, "newsletter")) {
                iVar = i.SCREEN_EMAIL_OPTIN;
            }
            f.a(this, new d(new kq.c(2, aVar, this), true, 834447703));
        }
        iVar = i.SCREEN_PUSH_OPTIN;
        dv.b bVarE = h0.g.E(new Pair(dv.a.SOURCE, new dv.c(gVarA03.a())));
        iVar.getClass();
        gVarA03.f27893b.c(iVar, bVarE);
        f.a(this, new d(new kq.c(2, aVar, this), true, 834447703));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9063j.remove();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (a0().f27900i) {
            a0().f27900i = false;
            a0().b();
        }
    }
}
