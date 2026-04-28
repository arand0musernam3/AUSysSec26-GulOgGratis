package com.app.tgtg.feature.main;

import a3.y;
import ah.n;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.viewpager2.widget.ViewPager2;
import ao.w1;
import ao.z1;
import ax.s;
import b30.a;
import bg.k0;
import bg.n0;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
import com.app.tgtg.R;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.main.ui.BottomNavigation;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefOrderChangeState;
import com.app.tgtg.model.remote.brief.BriefRefundOrCancelInfo;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.firebase.messaging.a0;
import cv.i;
import e70.c;
import ft.o;
import h0.g;
import h7.h2;
import hm.f;
import hm.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import l20.h;
import mv.m0;
import mv.p0;
import mv.z;
import pg.c2;
import pg.u1;
import pt.b;
import pt.d;
import u70.l;
import u70.t;
import v80.f0;
import yn.j;
import yn.k;
import yn.m;
import yn.p;
import yn.q;
import yn.u;
import yn.w;
import z20.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity extends n implements b, d, a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f9078v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f9080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f9081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f9082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae.c f9083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f9084k;
    public bo.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActivityResultLauncher f9087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActivityResultLauncher f9088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u1 f9089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f9090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f30.a f9091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f9092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e0 f9093u;

    public MainActivity() {
        super(16);
        this.f9081h = l.b(new f(this, 4));
        this.f9082i = new n1(Reflection.getOrCreateKotlinClass(v.class), new hm.o(this, 1), new hm.o(this, 0), new hm.o(this, 2));
        xw.a aVar = new xw.a(24);
        ae.c cVar = new ae.c();
        cVar.f1243b = this;
        cVar.f1244c = aVar;
        cVar.f1245d = new ArrayList();
        this.f9083j = cVar;
        this.f9084k = l.b(new f(this, 5));
        this.f9090r = l.b(new f(this, 6));
        this.f9093u = new e0(this, 21);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(com.app.tgtg.feature.main.MainActivity r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof hm.l
            if (r0 == 0) goto L13
            r0 = r5
            hm.l r0 = (hm.l) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            hm.l r0 = new hm.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22123j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r5)
            ft.c.d0()
            r0.l = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r5 = v80.f0.o(r2, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r5 = "newsletter"
            r4.i0(r5)
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.main.MainActivity.a0(com.app.tgtg.feature.main.MainActivity, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(com.app.tgtg.feature.main.MainActivity r6, z70.c r7) {
        /*
            boolean r0 = r7 instanceof hm.m
            if (r0 == 0) goto L13
            r0 = r7
            hm.m r0 = (hm.m) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            hm.m r0 = new hm.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f22125j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            ba0.g.M(r7)
            goto L9d
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r7)
            android.content.SharedPreferences r7 = ft.c.x()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r2 = ft.c.y()
            r4 = 0
            if (r2 != 0) goto L42
            r2 = r4
        L42:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "_reOptInPushSeen"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r7.putBoolean(r2, r3)
            r7.apply()
            int r7 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r7 < r2) goto L92
            hm.v r5 = r6.g0()
            ao.g3 r5 = r5.f22149b
            com.app.tgtg.model.remote.UserData r5 = r5.m()
            boolean r5 = r5.wantsPushNotifications()
            if (r5 == 0) goto L92
            androidx.core.app.NotificationManagerCompat r5 = androidx.core.app.NotificationManagerCompat.from(r6)
            boolean r5 = r5.areNotificationsEnabled()
            if (r5 != 0) goto L92
            if (r7 < r2) goto La2
            java.lang.String r7 = "android.permission.POST_NOTIFICATIONS"
            int r0 = androidx.core.app.e.a(r6, r7)
            if (r0 != 0) goto L84
            goto La2
        L84:
            androidx.activity.result.ActivityResultLauncher r6 = r6.f9087o
            if (r6 != 0) goto L8e
            java.lang.String r6 = "requestPermissionLauncher"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r6 = r4
        L8e:
            r6.a(r7, r4)
            goto La2
        L92:
            r0.l = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r7 = v80.f0.o(r2, r0)
            if (r7 != r1) goto L9d
            return r1
        L9d:
            java.lang.String r7 = "push"
            r6.i0(r7)
        La2:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.main.MainActivity.b0(com.app.tgtg.feature.main.MainActivity, z70.c):java.lang.Object");
    }

    public final void c0(yn.o oVar) {
        String str;
        String string;
        Object objM;
        a0 a0Var = this.f9092t;
        if (a0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainPopupHelper");
            a0Var = null;
        }
        u1 u1Var = (u1) a0Var.f12781d;
        v vVar = (v) a0Var.f12780c;
        MainActivity mainActivity = (MainActivity) a0Var.f12782e;
        int i11 = 4;
        int i12 = 1;
        int i13 = 2;
        int i14 = 0;
        if (oVar instanceof j) {
            j jVar = (j) oVar;
            final xn.c cVar = new xn.c(a0Var, jVar, i14);
            xn.c cVar2 = new xn.c(a0Var, jVar, i12);
            xn.b bVar = new xn.b(a0Var, i13);
            p pVar = jVar.f46292b;
            BriefOrder briefOrder = jVar.f46291a;
            if (briefOrder.getTimeInterval() == null) {
                return;
            }
            if (p0.A(briefOrder.getTimeInterval().getIntervalStart())) {
                String string2 = mainActivity.getString(R.string.generic_collection_time_label_today);
                string2.getClass();
                objM = string2.toLowerCase(Locale.ROOT);
                objM.getClass();
            } else if (p0.C(briefOrder.getTimeInterval().getIntervalStart())) {
                String string3 = mainActivity.getString(R.string.generic_collection_time_label_tomorrow);
                string3.getClass();
                objM = string3.toLowerCase(Locale.ROOT);
                objM.getClass();
            } else {
                objM = p0.m(mainActivity, briefOrder.getTimeInterval(), null, false, false);
            }
            String strU = p0.u(mainActivity, briefOrder.getTimeInterval());
            PickupInterval timeInterval = briefOrder.getTimeInterval();
            timeInterval.getClass();
            String strG = p0.g(mainActivity, p0.F(timeInterval.getIntervalStart()));
            String strG2 = p0.g(mainActivity, p0.F(timeInterval.getIntervalEnd()));
            BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
            String itemName = briefItemInfo != null ? briefItemInfo.getItemName() : null;
            if (briefOrder.getInvitationId() != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string4 = mainActivity.getString(R.string.main_delegate_collection_time_changed_collecting_user_popup_description);
                string4.getClass();
                String str2 = String.format(string4, Arrays.copyOf(new Object[]{pVar, objM, strG, strG2}, 4));
                k0 k0Var = new k0(mainActivity);
                k0Var.e(R.string.collection_changed_popup_title_time_single);
                k0Var.f6172c = str2;
                k0Var.c(R.string.collection_changed_primary_action_yes);
                final int i15 = 1;
                k0Var.f6182n = new Function0() { // from class: yn.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                cVar.invoke();
                                break;
                            case 1:
                                cVar.invoke();
                                break;
                            default:
                                cVar.invoke();
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                k0Var.b(R.string.main_delegate_collection_time_changed_popup_secondary_cta);
                k0Var.l = bVar;
                k0Var.f6179j = true;
                k0Var.f6180k = true;
                jVar.f46294d = k0Var.f();
                return;
            }
            if (briefOrder.getChangeState() != BriefOrderChangeState.DELEGATED_TIME_RETURNED) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string5 = mainActivity.getString(R.string.collection_changed_popup_body_time);
                string5.getClass();
                String str3 = String.format(string5, Arrays.copyOf(new Object[]{itemName, strU, objM}, 3));
                k0 k0Var2 = new k0(mainActivity);
                k0Var2.e(R.string.collection_changed_popup_title_time_single);
                k0Var2.f6172c = str3;
                k0Var2.c(R.string.collection_changed_primary_action_yes);
                final int i16 = 0;
                k0Var2.f6182n = new Function0() { // from class: yn.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                cVar.invoke();
                                break;
                            case 1:
                                cVar.invoke();
                                break;
                            default:
                                cVar.invoke();
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                k0Var2.b(R.string.collection_changed_secondary_action_cancel);
                k0Var2.l = bVar;
                k0Var2.f6179j = true;
                k0Var2.f6180k = true;
                jVar.f46294d = k0Var2.f();
                return;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string6 = mainActivity.getString(R.string.main_delegate_collection_time_changed_owner_popup_description);
            string6.getClass();
            String str4 = String.format(string6, Arrays.copyOf(new Object[]{pVar, objM, strG, strG2}, 4));
            k0 k0Var3 = new k0(mainActivity);
            k0Var3.e(R.string.collection_changed_popup_title_time_single);
            k0Var3.f6172c = str4;
            k0Var3.c(R.string.main_delegate_collection_time_changed_owner_popup_can_collect_cta);
            final int i17 = 2;
            k0Var3.f6182n = new Function0() { // from class: yn.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            cVar.invoke();
                            break;
                        case 1:
                            cVar.invoke();
                            break;
                        default:
                            cVar.invoke();
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            k0Var3.b(R.string.collection_changed_secondary_action_cancel);
            k0Var3.l = bVar;
            k0Var3.c(R.string.main_delegate_collection_time_changed_owner_popup_can_collect_cta);
            Resources resources = mainActivity.getResources();
            k0Var3.f6175f = resources != null ? resources.getString(R.string.main_delegate_collection_time_changed_owner_popup_invite_cta) : null;
            k0Var3.f6181m = new y.a(cVar2, 9);
            k0Var3.f6179j = true;
            k0Var3.f6180k = true;
            jVar.f46294d = k0Var3.f();
            return;
        }
        if (oVar instanceof k) {
            us.j jVar2 = new us.j(22, new xn.b(a0Var, 0), a0Var);
            xn.b bVar2 = new xn.b(a0Var, i11);
            k0 k0Var4 = new k0(mainActivity);
            k0Var4.e(R.string.collection_changed_popup_title_time_multi);
            k0Var4.a(R.string.collection_changed_popup_body_multi_time);
            k0Var4.c(R.string.collection_changed_primary_action_go_to_reservations);
            k0Var4.l = new y.a(jVar2, 10);
            k0Var4.b(R.string.collection_changed_secondary_action_not_now);
            k0Var4.f6182n = bVar2;
            k0Var4.f6180k = true;
            k0Var4.f6179j = true;
            ((k) oVar).f46297c = k0Var4.f();
            return;
        }
        if (oVar instanceof yn.v) {
            final yn.v vVar2 = (yn.v) oVar;
            us.j jVar3 = new us.j(19, vVar2, a0Var);
            BriefOrder briefOrder2 = vVar2.f46311a;
            if (briefOrder2.getOrderState() != null) {
                vVar2.f46319i = mainActivity;
                vVar2.f46320j = jVar3;
                if (briefOrder2.getChangeState() == BriefOrderChangeState.DELEGATED_CANCELLED) {
                    if (briefOrder2.getInvitationId() != null) {
                        MainActivity mainActivity2 = vVar2.f46319i;
                        if (mainActivity2 != null) {
                            String string7 = mainActivity2.getString(R.string.main_delegate_collection_cancelled_popup_title);
                            string7.getClass();
                            String string8 = mainActivity2.getString(R.string.main_delegate_collection_cancelled_collecting_user_popup_description);
                            string8.getClass();
                            yn.v.g(vVar2, string7, string8, R.string.collection_changed_primary_action_browse_bags, null, null, false, 56);
                        }
                    } else {
                        BriefRefundOrCancelInfo briefRefundOrCancelInfo = briefOrder2.getBriefRefundOrCancelInfo();
                        CancellingEntity cancellingUserType = briefRefundOrCancelInfo != null ? briefRefundOrCancelInfo.getCancellingUserType() : null;
                        if ((cancellingUserType != null ? u.$EnumSwitchMapping$0[cancellingUserType.ordinal()] : -1) == 1) {
                            vVar2.f(true);
                        } else {
                            vVar2.e(true);
                        }
                    }
                } else if (briefOrder2.getChangeState() == BriefOrderChangeState.DELEGATE_ACCEPTED && briefOrder2.getInvitationId() == null) {
                    MainActivity mainActivity3 = vVar2.f46319i;
                    if (mainActivity3 != null) {
                        String string9 = mainActivity3.getString(R.string.main_delegate_collection_accepted_title);
                        string9.getClass();
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        String string10 = mainActivity3.getString(R.string.main_delegate_collection_accepted_description);
                        string10.getClass();
                        BriefStoreInfo briefStoreInfo = briefOrder2.getBriefStoreInfo();
                        String str5 = String.format(string10, Arrays.copyOf(new Object[]{briefStoreInfo != null ? briefStoreInfo.getStoreDisplayName() : null}, 1));
                        final int i18 = 0;
                        yn.v.g(vVar2, string9, str5, R.string.collection_changed_primary_action_see_details, new Function0() { // from class: yn.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        us.j jVar4 = vVar2.f46320j;
                                        if (jVar4 != null) {
                                            jVar4.invoke();
                                        }
                                        break;
                                    case 1:
                                        us.j jVar5 = vVar2.f46320j;
                                        if (jVar5 != null) {
                                            jVar5.invoke();
                                        }
                                        break;
                                    default:
                                        us.j jVar6 = vVar2.f46320j;
                                        if (jVar6 != null) {
                                            jVar6.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        }, Integer.valueOf(R.drawable.delegate_accepted), false, 32);
                    }
                    vVar2.f46312b.invoke(i.BRAZE_ACTION_DELEGATION_OWNER_ACCEPTED, null);
                } else if (briefOrder2.getChangeState() == BriefOrderChangeState.DELEGATED_FULFILLED && briefOrder2.getInvitationId() == null) {
                    MainActivity mainActivity4 = vVar2.f46319i;
                    if (mainActivity4 != null) {
                        String string11 = mainActivity4.getString(R.string.main_delegate_collection_fulfilled_title);
                        string11.getClass();
                        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                        String string12 = mainActivity4.getString(R.string.main_delegate_collection_fulfilled_description);
                        string12.getClass();
                        BriefStoreInfo briefStoreInfo2 = briefOrder2.getBriefStoreInfo();
                        final int i19 = 1;
                        yn.v.g(vVar2, string11, String.format(string12, Arrays.copyOf(new Object[]{briefStoreInfo2 != null ? briefStoreInfo2.getStoreDisplayName() : null}, 1)), R.string.collection_changed_primary_action_see_details, new Function0() { // from class: yn.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        us.j jVar4 = vVar2.f46320j;
                                        if (jVar4 != null) {
                                            jVar4.invoke();
                                        }
                                        break;
                                    case 1:
                                        us.j jVar5 = vVar2.f46320j;
                                        if (jVar5 != null) {
                                            jVar5.invoke();
                                        }
                                        break;
                                    default:
                                        us.j jVar6 = vVar2.f46320j;
                                        if (jVar6 != null) {
                                            jVar6.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        }, Integer.valueOf(R.drawable.delegated_fulfilled), false, 32);
                    }
                    vVar2.f46313c.invoke();
                } else if (briefOrder2.getOrderState() == OrderState.REFUNDED) {
                    MainActivity mainActivity5 = vVar2.f46319i;
                    if (mainActivity5 != null) {
                        if (briefOrder2.getOrderType() == OrderType.MANUFACTURER) {
                            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                            String string13 = mainActivity5.getString(R.string.collection_changed_popup_title_refunded_manu);
                            string13.getClass();
                            BriefItemInfo briefItemInfo2 = briefOrder2.getBriefItemInfo();
                            str = String.format(string13, Arrays.copyOf(new Object[]{briefItemInfo2 != null ? briefItemInfo2.getItemName() : null}, 1));
                        } else {
                            StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                            String string14 = mainActivity5.getString(R.string.collection_changed_popup_title_refunded);
                            string14.getClass();
                            BriefStoreInfo briefStoreInfo3 = briefOrder2.getBriefStoreInfo();
                            str = String.format(string14, Arrays.copyOf(new Object[]{briefStoreInfo3 != null ? briefStoreInfo3.getStoreDisplayName() : null}, 1));
                        }
                        String str6 = str;
                        BriefRefundOrCancelInfo briefRefundOrCancelInfo2 = briefOrder2.getBriefRefundOrCancelInfo();
                        PaymentState briefPaymentState = briefRefundOrCancelInfo2 != null ? briefRefundOrCancelInfo2.getBriefPaymentState() : null;
                        int i21 = briefPaymentState != null ? u.$EnumSwitchMapping$1[briefPaymentState.ordinal()] : -1;
                        if (i21 == 1) {
                            String string15 = mainActivity5.getString(R.string.collection_changed_popup_msg_refunded_reservation_lifted);
                            string15.getClass();
                            string = String.format(string15, Arrays.copyOf(new Object[]{String.valueOf(briefOrder2.getBriefRefundOrCancelInfo().getExpectedBankProcessingDays())}, 1));
                        } else if (i21 == 2) {
                            String string16 = mainActivity5.getString(R.string.collection_changed_popup_msg_refunded_money_refunded);
                            string16.getClass();
                            string = String.format(string16, Arrays.copyOf(new Object[]{String.valueOf(briefOrder2.getBriefRefundOrCancelInfo().getExpectedBankProcessingDays())}, 1));
                        } else if (i21 == 3) {
                            string = mainActivity5.getString(R.string.collection_changed_popup_msg_refunded_voucher_reinstated);
                            string.getClass();
                        }
                        final int i22 = 2;
                        yn.v.g(vVar2, str6, string, R.string.collection_changed_primary_action_see_details, new Function0() { // from class: yn.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i22) {
                                    case 0:
                                        us.j jVar4 = vVar2.f46320j;
                                        if (jVar4 != null) {
                                            jVar4.invoke();
                                        }
                                        break;
                                    case 1:
                                        us.j jVar5 = vVar2.f46320j;
                                        if (jVar5 != null) {
                                            jVar5.invoke();
                                        }
                                        break;
                                    default:
                                        us.j jVar6 = vVar2.f46320j;
                                        if (jVar6 != null) {
                                            jVar6.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        }, null, false, 48);
                    }
                } else if (briefOrder2.getOrderState() == OrderState.CANCELLED) {
                    BriefRefundOrCancelInfo briefRefundOrCancelInfo3 = briefOrder2.getBriefRefundOrCancelInfo();
                    if ((briefRefundOrCancelInfo3 != null ? briefRefundOrCancelInfo3.getCancellingUserType() : null) != null) {
                        int i23 = u.$EnumSwitchMapping$0[briefOrder2.getBriefRefundOrCancelInfo().getCancellingUserType().ordinal()];
                        if (i23 == 1) {
                            vVar2.f(false);
                        } else if (i23 == 2) {
                            vVar2.e(false);
                        }
                    }
                }
            }
            int i24 = xn.d.$EnumSwitchMapping$1[briefOrder2.getChangeState().ordinal()];
            if (i24 == 1) {
                vVar.d(i.SCREEN_INVITATION_ACCEPTED, g.E(new Pair(dv.a.ORDER_ID, new dv.c(briefOrder2.m321getOrderIdreIZeYA()))));
                return;
            } else if (i24 == 2) {
                vVar.d(i.SCREEN_BAG_COLLECTED_BY_FRIEND, g.E(new Pair(dv.a.ORDER_ID, new dv.c(briefOrder2.m321getOrderIdreIZeYA()))));
                return;
            } else {
                if (i24 != 3) {
                    return;
                }
                vVar.d(i.SCREEN_COLLECTION_RETURNED, g.E(new Pair(dv.a.ORDER_ID, new dv.c(briefOrder2.m321getOrderIdreIZeYA()))));
                return;
            }
        }
        if (oVar instanceof w) {
            us.j jVar4 = new us.j(21, new xn.b(a0Var, 1), a0Var);
            xn.b bVar3 = new xn.b(a0Var, 3);
            k0 k0Var5 = new k0(mainActivity);
            k0Var5.e(R.string.collection_changed_popup_title_state_multi);
            k0Var5.a(R.string.collection_changed_popup_body_multi_state);
            k0Var5.c(R.string.collection_changed_primary_action_go_to_reservations);
            k0Var5.l = new y.a(jVar4, 11);
            k0Var5.b(R.string.collection_changed_secondary_action_not_now);
            k0Var5.f6182n = bVar3;
            k0Var5.f6180k = true;
            k0Var5.f6179j = true;
            ((w) oVar).f46323c = k0Var5.f();
            return;
        }
        if (oVar instanceof yn.n) {
            if (Intrinsics.areEqual(bo.d.f6548b.name(), AllowedCardNetworks.DISCOVER)) {
                boolean z11 = mainActivity.f9086n;
                u1Var.getClass();
                pg.k kVar = u1Var.f35189x;
                Guideline guideline = (Guideline) kVar.f34932f;
                ConstraintLayout constraintLayout = (ConstraintLayout) kVar.f34928b;
                guideline.setGuidelinePercent(z11 ? 0.695f : 0.625f);
                ((TextView) kVar.f34931e).setText(R.string.favorites_for_sale_tooltip);
                constraintLayout.setOnTouchListener(new h(4));
                constraintLayout.setAlpha(0.0f);
                constraintLayout.setTranslationY(-20.0f);
                constraintLayout.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = constraintLayout.animate();
                viewPropertyAnimatorAnimate.setDuration(400L);
                viewPropertyAnimatorAnimate.alpha(1.0f);
                viewPropertyAnimatorAnimate.translationY(0.0f);
                viewPropertyAnimatorAnimate.setStartDelay(0L);
                viewPropertyAnimatorAnimate.withEndAction(new m(constraintLayout, 0));
                viewPropertyAnimatorAnimate.start();
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit = ft.c.x().edit();
                String strY = ft.c.y();
                if (strY == null) {
                    strY = null;
                }
                editorEdit.putLong(strY + "_favoritesForSaleOverlayShown", jCurrentTimeMillis);
                editorEdit.apply();
                return;
            }
            return;
        }
        if (!(oVar instanceof q)) {
            if (oVar instanceof yn.l) {
                yn.l lVar = (yn.l) oVar;
                us.j jVar5 = new us.j(20, lVar, a0Var);
                boolean z12 = lVar.f46298a;
                int i25 = z12 ? R.string.verify_email_title : R.string.verify_email_title_error;
                int i26 = z12 ? R.string.verify_email_description : R.string.verify_email_description_error;
                int i27 = z12 ? R.string.verify_email_btn_positive : android.R.string.ok;
                k0 k0Var6 = new k0(mainActivity);
                k0Var6.e(i25);
                k0Var6.a(i26);
                k0Var6.c(i27);
                k0Var6.l = jVar5;
                lVar.f46301d = k0Var6.f();
                return;
            }
            if (oVar instanceof yn.h) {
                yn.h hVar = (yn.h) oVar;
                us.j jVar6 = new us.j(23, hVar, a0Var);
                hVar.f46285b.invoke(i.BRAZE_ACTION_DELEGATION_OWNER_RETURNED);
                k0 k0Var7 = new k0(mainActivity);
                k0Var7.e(R.string.main_delegate_collection_sent_back_popup_title);
                StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                String string17 = mainActivity.getString(R.string.main_delegate_collection_sent_back_popup_description);
                string17.getClass();
                BriefOrder briefOrder3 = hVar.f46284a;
                BriefStoreInfo briefStoreInfo4 = briefOrder3.getBriefStoreInfo();
                k0Var7.f6172c = String.format(string17, Arrays.copyOf(new Object[]{briefStoreInfo4 != null ? briefStoreInfo4.getStoreDisplayName() : null}, 1));
                k0Var7.c(R.string.main_delegate_collection_sent_back_popup_cta);
                k0Var7.l = new y.a(jVar6, 8);
                k0Var7.f6180k = true;
                k0Var7.f6179j = true;
                hVar.f46288e = k0Var7.f();
                vVar.d(i.SCREEN_COLLECTION_RETURNED, g.E(new Pair(dv.a.ORDER_ID, new dv.c(briefOrder3.m321getOrderIdreIZeYA()))));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(bo.d.f6548b.name(), AllowedCardNetworks.DISCOVER)) {
            vVar.d(i.SCREEN_NEW_PARCEL_POPUP, null);
            Integer newManufacturerItemsForUserQty = vVar.f22149b.n().getNewManufacturerItemsForUserQty();
            int iIntValue = newManufacturerItemsForUserQty != null ? newManufacturerItemsForUserQty.intValue() : 1;
            u1Var.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit2 = ft.c.x().edit();
            String strY2 = ft.c.y();
            editorEdit2.putLong((strY2 != null ? strY2 : null) + "_mnuNewItemsShownMillis", jCurrentTimeMillis2);
            editorEdit2.apply();
            pg.k kVar2 = u1Var.f35189x;
            View view = u1Var.f986f;
            View view2 = kVar2.f34929c;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) kVar2.f34928b;
            TextView textView = (TextView) kVar2.f34931e;
            Drawable background = view2.getBackground();
            background.getClass();
            ((LayerDrawable) background).mutate().setTint(view.getContext().getColor(R.color.primary_20));
            ((Guideline) kVar2.f34932f).setGuidelinePercent(0.5f);
            textView.setText(view.getContext().getResources().getQuantityString(R.plurals.mnu_main_tooltip_parcels_arrived, iIntValue, Integer.valueOf(iIntValue)));
            textView.setLayoutParams(new ConstraintLayout.a(d70.b.a(180), -2));
            Drawable background2 = ((ConstraintLayout) kVar2.f34930d).getBackground();
            background2.getClass();
            background2.mutate().setTint(view.getContext().getColor(R.color.primary_20));
            textView.setTextColor(view.getContext().getColor(R.color.neutral_10));
            constraintLayout2.setOnTouchListener(new h(5));
            constraintLayout2.setAlpha(0.0f);
            constraintLayout2.setTranslationY(-20.0f);
            constraintLayout2.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = constraintLayout2.animate();
            viewPropertyAnimatorAnimate2.setDuration(600L);
            viewPropertyAnimatorAnimate2.alpha(1.0f);
            viewPropertyAnimatorAnimate2.translationY(0.0f);
            viewPropertyAnimatorAnimate2.setStartDelay(0L);
            viewPropertyAnimatorAnimate2.withEndAction(new m(constraintLayout2, 2));
            viewPropertyAnimatorAnimate2.start();
        }
    }

    public final void d0() throws Throwable {
        v vVarG0 = g0();
        ln.i iVar = vVarG0.f22158k;
        iVar.getClass();
        x70.c cVar = null;
        if (((Boolean) f0.E(kotlin.coroutines.g.f26549a, new ln.f(iVar, cVar, 0))).booleanValue() || !cg.q(vVarG0.f22152e.l)) {
            return;
        }
        f0.E(kotlin.coroutines.g.f26549a, new ln.f(iVar, cVar, 1));
        g0().f22163q.f25316a.a(new f70.b(BringBackMagicActivity.class, null, false, false, false, null, null, Integer.valueOf(R.anim.slide_in_from_bottom_to_top), Integer.valueOf(R.anim.stay), false, 638));
    }

    public final int e0() {
        if (f0().getVisibility() == 0) {
            return (int) getResources().getDimension(R.dimen.bottom_nav_view_height);
        }
        return 0;
    }

    public final BottomNavigation f0() {
        u1 u1Var = this.f9089q;
        u1Var.getClass();
        BottomNavigation bottomNavigation = u1Var.f35185t;
        bottomNavigation.getClass();
        return bottomNavigation;
    }

    public final v g0() {
        return (v) this.f9082i.getValue();
    }

    public final e h0() {
        Object value = this.f9081h.getValue();
        value.getClass();
        return (e) value;
    }

    public final void i0(String str) {
        jm.b bVar = g0().f22163q;
        bVar.getClass();
        bVar.f25316a.a(new f70.b(OptInActivity.class, jb.u.x(new Pair("OPT_IN_TYPE", str), new Pair("OPT_IN_CONTEXT", ll.e.REOPTIN)), false, false, false, null, null, Integer.valueOf(R.anim.slide_in_from_bottom_to_top), Integer.valueOf(R.anim.stay), false, 636));
    }

    public final void j0() {
        List listF = getSupportFragmentManager().f3109c.f();
        listF.getClass();
        if (listF.isEmpty()) {
            return;
        }
        bo.d dVar = this.l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar = null;
        }
        if (!(dVar.a() instanceof ym.u) || this.f9086n) {
            return;
        }
        k0(z.DISCOVER, f70.i.MANUFACTURE_DISABLE);
    }

    public final void k0(z zVar, f70.i iVar) {
        int i11;
        km.a fVar;
        zVar.getClass();
        iVar.getClass();
        if (Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION) && g0().f22151d.b()) {
            ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        }
        if (f0().getVisibility() == 0) {
            f0().d(zVar);
        }
        bo.d dVar = this.l;
        bo.d dVar2 = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar = null;
        }
        HashMap map = (HashMap) g0().f22161o.a("FRAGMENT_DEEPLINK_PARAMETERS");
        dVar.getClass();
        int[] iArr = bo.c.$EnumSwitchMapping$0;
        switch (iArr[zVar.ordinal()]) {
            case 1:
            case 2:
            case 8:
                int i12 = iArr[zVar.ordinal()];
                if (i12 == 1) {
                    i11 = 0;
                } else if (i12 != 2) {
                    SharedPreferences sharedPreferencesX = ft.c.x();
                    String strY = ft.c.y();
                    if (strY == null) {
                        strY = null;
                    }
                    i11 = sharedPreferencesX.getInt(strY + "_browseStartPage", 0);
                } else {
                    i11 = 1;
                }
                lm.i iVar2 = new lm.i();
                Bundle bundle = new Bundle();
                bundle.putInt("START_PAGE", i11);
                iVar2.setArguments(bundle);
                fVar = iVar2;
                break;
            case 3:
                fVar = (km.a) dVar.f6549a.findFragmentByTag("MY_STORE");
                if (fVar == null) {
                    fVar = new eo.f();
                }
                break;
            case 4:
                fVar = new fn.t();
                break;
            case 5:
                fVar = new xj.d();
                break;
            case 6:
                fVar = new hn.b();
                break;
            case 7:
                m0 m0Var = sa0.a.f38953a;
                m0Var.h("Fragment");
                m0Var.f("FragmentProfile newInstance", new Object[0]);
                fVar = new mn.c();
                break;
            case 9:
                fVar = new ym.u();
                break;
            default:
                e40.a.f();
                return;
        }
        Bundle arguments = fVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("ORIGIN", iVar);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof Serializable) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    arguments.putSerializable(str, (Serializable) value);
                } else if (entry.getValue() instanceof Parcelable) {
                    String str2 = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    value2.getClass();
                    arguments.putParcelable(str2, (Parcelable) value2);
                }
            }
        }
        fVar.setArguments(arguments);
        u1 u1Var = this.f9089q;
        u1Var.getClass();
        ComposeView composeView = u1Var.f35184s;
        composeView.getClass();
        composeView.setVisibility(fVar instanceof mn.c ? 8 : 0);
        bo.d dVar3 = this.l;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
        } else {
            dVar2 = dVar3;
        }
        dVar2.getClass();
        if (bo.d.f6548b == z.MANUFACTURER && ((fVar.o() == z.DISCOVER || fVar.o() == z.BROWSE || fVar.o() == z.FAVORITES || fVar.o() == z.PROFILE) && (dVar2.a() instanceof ym.u))) {
            km.a aVarA = dVar2.a();
            aVarA.getClass();
            ((ym.u) aVarA).y(true);
        }
        FragmentManager fragmentManager = dVar2.f6549a;
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        z zVar2 = bo.d.f6548b;
        z zVar3 = z.MY_STORE;
        if (zVar2 != zVar3 || fVar.o() == zVar3) {
            aVar.f(R.id.content_frame, fVar, fVar.o().name());
        } else {
            aVar.e(R.id.content_frame, fVar, fVar.o().name(), 1);
        }
        bo.d.f6548b = fVar.o();
        aVar.i(true, true);
    }

    public final void l0(boolean z11) {
        if (f0().getVisibility() == 0) {
            f0().c(z11);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z11) {
            SharedPreferences sharedPreferencesX = ft.c.x();
            String strY = ft.c.y();
            bo.d dVar = null;
            if (strY == null) {
                strY = null;
            }
            if (jCurrentTimeMillis - sharedPreferencesX.getLong(strY + "_favoritesForSaleOverlayShown", 0L) > 604800000) {
                bo.d dVar2 = this.l;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                } else {
                    dVar = dVar2;
                }
                if (dVar.a() instanceof fn.t) {
                    this.f9083j.j(new yn.n(), g0().c());
                }
            }
        }
    }

    public final void m0(boolean z11) throws Throwable {
        v vVarG0 = g0();
        ln.i iVar = vVarG0.f22158k;
        iVar.getClass();
        x70.c cVar = null;
        if (((Boolean) f0.E(kotlin.coroutines.g.f26549a, new ln.f(iVar, cVar, 2))).booleanValue() || vVarG0.f22149b.n().getRewardSurveyInfo() == null) {
            return;
        }
        f0.E(kotlin.coroutines.g.f26549a, new ln.f(iVar, cVar, 3));
        g0().f22163q.f25316a.a(new f70.b(RewardsSurveyActivity.class, jb.u.x(new Pair("IS_REDEEMED", Boolean.valueOf(z11))), false, false, false, null, null, Integer.valueOf(R.anim.slide_in_from_bottom_to_top), Integer.valueOf(R.anim.stay), false, 636));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(boolean r7) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.main.MainActivity.n0(boolean):void");
    }

    public final void o0() {
        v vVarG0 = g0();
        Map mapB = w0.b(new Pair(dv.a.DELIVERY_AVAILABLE, Boolean.valueOf(this.f9086n)));
        mapB.getClass();
        cv.b bVar = vVarG0.f22155h;
        bVar.getClass();
        bVar.f13428a.c(mapB);
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i11, Intent intent) {
        super.onActivityReenter(i11, intent);
        if (i11 == -1 && intent != null && intent.hasExtra("REFRESH")) {
            this.f9085m = true;
            bo.d dVar = this.l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                dVar = null;
            }
            km.a aVarA = dVar.a();
            if (!(aVarA instanceof lm.i)) {
                if (aVarA instanceof fn.t) {
                    f9078v = true;
                    ((fn.t) aVarA).w(intent);
                    return;
                }
                return;
            }
            lm.i iVar = (lm.i) aVarA;
            if (intent.getBooleanExtra("REFRESH", false)) {
                f9078v = true;
                iVar.w(false);
            }
        }
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        f30.a aVar;
        x6.d dVarE;
        super.onActivityResult(i11, i12, intent);
        int i13 = 0;
        if (!this.f9085m && i12 == -1 && intent != null && intent.hasExtra("REFRESH")) {
            bo.d dVar = this.l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                dVar = null;
            }
            km.a aVarA = dVar.a();
            if (aVarA instanceof lm.i) {
                lm.i iVar = (lm.i) aVarA;
                if (intent.getBooleanExtra("REFRESH", false)) {
                    f9078v = true;
                    iVar.w(false);
                }
                v vVarG0 = g0();
                w1 w1Var = w1.BROWSE;
                w1Var.getClass();
                z1 z1Var = vVarG0.f22159m;
                z1Var.getClass();
                z1Var.f4512e = w1Var;
            } else if (aVarA instanceof fn.t) {
                f9078v = true;
                v vVarG02 = g0();
                w1 w1Var2 = w1.DISCOVER;
                w1Var2.getClass();
                z1 z1Var2 = vVarG02.f22159m;
                z1Var2.getClass();
                z1Var2.f4512e = w1Var2;
                ((fn.t) aVarA).w(intent);
            } else if (aVarA instanceof ym.u) {
                ym.u uVar = (ym.u) aVarA;
                if (intent.getBooleanExtra("REFRESH", false)) {
                    f9078v = true;
                    uVar.z("");
                }
            }
        }
        this.f9085m = false;
        bo.d dVar2 = this.l;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar2 = null;
        }
        v vVarG03 = g0();
        Object value = this.f9090r.getValue();
        value.getClass();
        f30.d dVar3 = (f30.d) value;
        dVar2.getClass();
        if (i11 == 128) {
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("ORDER_RATING", 0)) : null;
            if (numValueOf == null || numValueOf.intValue() != 5 || (aVar = this.f9091s) == null) {
                return;
            }
            dVar3.a(this, aVar);
            return;
        }
        if (i11 == 132) {
            km.a aVarA2 = dVar2.a();
            if (aVarA2 instanceof fn.t) {
                ((fn.t) aVarA2).x();
                return;
            }
            return;
        }
        if (i11 == 333) {
            if (i12 != 1001) {
                if (i12 != 1002) {
                    return;
                }
                getOnBackPressedDispatcher().d();
                return;
            }
            getOnBackPressedDispatcher().d();
            ax.h hVar = new ax.h(this);
            String string = getString(R.string.contact_us_message_sent);
            string.getClass();
            hVar.f4910a = string;
            WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(getWindow().getDecorView());
            if (windowInsetsCompatY != null && (dVarE = windowInsetsCompatY.e(h2.h())) != null) {
                i13 = dVarE.f43876d;
            }
            hVar.f4912c = i13;
            hVar.f4913d = 600L;
            hVar.c();
            return;
        }
        if (i11 == 654) {
            if (i12 != -1 || intent == null) {
                return;
            }
            km.a aVarA3 = dVar2.a();
            if (aVarA3 instanceof lm.i) {
                lm.i iVar2 = (lm.i) aVarA3;
                iVar2.w(false);
                iVar2.t().f47948a.getClass();
                iVar2.f27925o = ft.b.a();
                return;
            }
            return;
        }
        if (i11 == 710) {
            if (i12 == -1) {
                q0(true, f70.i.MYSTORE_SIGNUP);
                vVarG03.f22157j.c();
                return;
            }
            return;
        }
        if (i11 != 222) {
            if (i11 != 223) {
                return;
            }
            km.a aVarA4 = dVar2.a();
            if (aVarA4 instanceof lm.i) {
                ((lm.i) aVarA4).w(false);
                return;
            } else {
                if (aVarA4 instanceof fn.t) {
                    ((fn.t) aVarA4).x();
                    return;
                }
                return;
            }
        }
        if (i12 == -1) {
            km.a aVarA5 = dVar2.a();
            if (aVarA5 instanceof lm.i) {
                ((lm.i) aVarA5).w(false);
                return;
            }
            if (aVarA5 instanceof fn.t) {
                ((fn.t) aVarA5).x();
                return;
            }
            if (aVarA5 instanceof ym.u) {
                ym.u uVar2 = (ym.u) aVarA5;
                c2 c2Var = uVar2.f46233g;
                c2Var.getClass();
                c2Var.A.setVisibility(8);
                c2Var.C.setVisibility(0);
                c2Var.M.setVisibility(0);
                dn.m mVar = uVar2.f46249x;
                if (mVar != null && mVar.f15027e) {
                    ConstraintLayout constraintLayout = c2Var.I;
                    constraintLayout.getClass();
                    constraintLayout.setVisibility(0);
                }
                uVar2.z("");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0211  */
    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.main.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        u1 u1Var = this.f9089q;
        u1Var.getClass();
        this.f9083j.d(u1Var);
        this.f9093u.remove();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onPause() {
        super.onPause();
        u1 u1Var = this.f9089q;
        u1Var.getClass();
        this.f9083j.h(u1Var);
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i11, strArr, iArr);
        bo.d dVar = this.l;
        mm.a aVar = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar = null;
        }
        km.a aVarA = dVar.a();
        if (!(aVarA instanceof lm.i)) {
            if (aVarA instanceof fn.t) {
                ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
                ((fn.t) aVarA).x();
                return;
            }
            return;
        }
        ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        if (iArr.length != 0 && iArr[0] == 0) {
            lm.i iVar = (lm.i) aVarA;
            pg.b bVar = iVar.f27926p;
            bVar.getClass();
            int currentItem = ((ViewPager2) bVar.f34783d).getCurrentItem();
            mm.a aVar2 = iVar.f27923m;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                aVar2 = null;
            }
            if (aVar2.i(currentItem) instanceof nm.e) {
                mm.a aVar3 = iVar.f27923m;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                } else {
                    aVar = aVar3;
                }
                Fragment fragmentI = aVar.i(currentItem);
                fragmentI.getClass();
                pg.k kVar = ((nm.e) fragmentI).f31106q;
                kVar.getClass();
                ((GenericErrorView) kVar.f34929c).setVisibility(8);
            }
        }
        ((lm.i) aVarA).w(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        o oVar = null;
        f0.B(m1.c(this), null, null, new y((Object) this, (x70.c) (0 == true ? 1 : 0), 13), 3);
        v vVarG0 = g0();
        m0.c.f0(vVarG0.f22167u, this, new hm.g(this, 3));
        m0.c.f0(vVarG0.f22168v, this, new hm.g(this, 4));
        v vVarG02 = g0();
        f0.B(m1.d(vVarG02), null, null, new hm.q(vVarG02, 0 == true ? 1 : 0, 1), 3);
        if (f0().getVisibility() == 0) {
            f0().e(ft.c.C());
        }
        o oVar2 = this.f9080g;
        if (oVar2 != null) {
            oVar = oVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("tokenManager");
        }
        oVar.f17954d = new f(this, 0);
        h0().a().g(new e.b(new hm.g(this, 5), 12));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bo.d dVar = this.l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar = null;
        }
        dVar.getClass();
        bundle.putString("CURRENT_FRAGMENT_TAG", bo.d.f6548b.name());
    }

    public final void p0(BottomNavigation bottomNavigation, int i11) {
        x6.d dVarE;
        bottomNavigation.getClass();
        String string = getString(R.string.in_app_update_download_complete_action);
        string.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(bottomNavigation);
        int i12 = (windowInsetsCompatY == null || (dVarE = windowInsetsCompatY.e(h2.h())) == null) ? 0 : dVarE.f43876d;
        int[] iArr = q20.h.C;
        q20.h hVarG = q20.h.g(bottomNavigation, bottomNavigation.getResources().getText(R.string.in_app_update_download_complete_snackbar), -2);
        q20.f fVar = hVarG.f35938i;
        s sVar = new s(this, 17);
        Button actionView = ((SnackbarContentLayout) fVar.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(upperCase)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            hVarG.B = false;
        } else {
            hVarG.B = true;
            actionView.setVisibility(0);
            actionView.setText(upperCase);
            actionView.setOnClickListener(new n0(16, hVarG, sVar));
        }
        ((SnackbarContentLayout) fVar.getChildAt(0)).getActionView().setTextColor(getColor(R.color.neutral_10));
        fVar.getClass();
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(24, 24, 24, i11 + 24 + i12);
        fVar.setLayoutParams(marginLayoutParams);
        fVar.setBackground(getDrawable(R.drawable.snackbar_bg));
        hVarG.h();
    }

    public final void q0(boolean z11, f70.i iVar) {
        iVar.getClass();
        n0(z11);
        bo.d dVar = this.l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
            dVar = null;
        }
        dVar.getClass();
        k0(ft.c.C() ? z.MY_STORE : z.DISCOVER, iVar);
    }
}
