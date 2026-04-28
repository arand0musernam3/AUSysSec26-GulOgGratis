package se;

import a2.i;
import a2.n;
import a40.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.drawerlayout.widget.DrawerLayout;
import ao.g3;
import ax.a0;
import ax.s0;
import bx.m;
import c20.h;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.order.Order;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import cy.i0;
import d10.f;
import d10.g;
import d40.t1;
import e20.b0;
import e20.j0;
import h7.w;
import he.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import o.j;
import org.json.JSONObject;
import p.z0;
import qz.q;
import t1.s;
import u70.l;
import u70.p;
import u70.t;
import v70.e;
import w2.l1;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a2.b, f, h, w3.c, i0, q, w, bt.a, AccessibilityViewCommand, z0, j, ia.d, b9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39013b;

    public d(int i11) {
        this.f39012a = i11;
        switch (i11) {
            case 5:
                SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                this.f39013b = sharedPreferences;
                break;
            case 8:
                j0 j0Var = new j0();
                this.f39013b = j0Var;
                if (!j0Var.f15674b) {
                    if (j0Var.f15675c) {
                        x3.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j0Var.a();
                    j0Var.f15675c = true;
                    break;
                }
                break;
            case 21:
                this.f39013b = l.b(jf.c.f25132a);
                break;
            case 24:
                this.f39013b = new ArrayDeque(16);
                break;
            default:
                this.f39013b = new AtomicReference(null);
                break;
        }
    }

    public static hk.d A() {
        return new hk.d(Integer.valueOf(R.string.helpcenter_question_collecting_for_a_friend), null, null, d0.h(Integer.valueOf(R.string.helpcenter_question_collecting_for_a_friend_title_1), Integer.valueOf(R.string.helpcenter_question_collecting_for_a_friend_title_2)), d0.h(Integer.valueOf(R.string.helpcenter_question_collecting_for_a_friend_answer_1), Integer.valueOf(R.string.helpcenter_question_collecting_for_a_friend_answer_2)), false, null, null, null, 8142);
    }

    public static hk.d B() {
        return new hk.d(Integer.valueOf(R.string.contact_us_topic_delivery_problem_v2), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_delivery_generic)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_DELIVERY_ISSUE, null, "delivery_general_help", 5684);
    }

    public static hk.d C() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_know_order_was_complete), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_know_order_was_complete)), Integer.valueOf(R.string.helpdesk_btn_go_to_my_order), null, null, true, hk.b.ORDER_LIST, hk.b.CONTACT_US_BAD_XP, "check_if_order_exists", 5300);
    }

    public static hk.d D() {
        ArrayList arrayListD = d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_store_closed_at_pickup));
        hk.b bVar = hk.b.CONTACT_US_BAD_XP_STORE_CLOSED;
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_store_closed_at_pickup), arrayListD, Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, bVar, bVar, "store_was_closed_in_window", 5172);
    }

    public static hk.d E() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_was_to_late), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_was_to_late)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_MISSED_COLLECTION, null, "arrived_after_collection_window", 5684);
    }

    public static hk.d F() {
        return new hk.d(Integer.valueOf(R.string.contact_us_topic_next_day_delivery_delivery_problem), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_next_day_delivery_generic)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_NEXT_DAY_DELIVERY_ISSUE, null, "catering_general_help", 5684);
    }

    public static hk.d G() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_no_food_left), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_no_food_left)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_NO_FOOD, null, "no_food_left", 5684);
    }

    public static hk.d H() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_safety), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_safety)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_ALLERGIC, hk.b.CONTACT_US_BAD_XP, "allergic_to_content_of_magic_bag", 5172);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hk.c I(Order order) {
        hk.b bVar = null;
        hk.d dVar = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_what_is_donation), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_what_is_donation)), null, null, null, false, null, bVar, null, 6140);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        hk.d dVar2 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_what_challenges), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_what_challenges)), objArr2, objArr3, null, false, bVar, objArr, null, 6140);
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        hk.d dVar3 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_how_to_know_when_available), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_how_to_know_when_available)), objArr5, objArr7, null, false, objArr4, objArr6, null, 6140);
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        hk.d dVar4 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_how_to_reserve), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_how_to_reserve)), objArr9, objArr11, null, false, objArr8, objArr10, null, 6140);
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        hk.d dVar5 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_why_not_showing), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_why_not_showing)), objArr13, objArr15, null, false, objArr12, objArr14, null, 6140);
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        hk.d dVar6 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_can_reserve_via_web), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_can_reserve_via_web)), objArr17, objArr19, null, false, objArr16, objArr18, null, 6140);
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        hk.d dVar7 = new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_who_to_contact), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_who_to_contact)), objArr21, objArr23, null, false, objArr20, objArr22, null, 6140);
        List list = null;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        hk.c cVar = new hk.c(R.string.helpdesk_charity_questions_title, hk.a.FAQ, d0.d(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_how_to_collect), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_how_to_collect)), objArr25, objArr27, list, false, objArr24, objArr26, null, 6140), new hk.d(Integer.valueOf(R.string.helpdesk_charity_question_forgot_password), d0.d(Integer.valueOf(R.string.helpdesk_charity_answer_forgot_password)), objArr29, list, null, false, objArr28, 0 == true ? 1 : 0, null, 6140)), null);
        if (order != null) {
            cVar.f22092d = order;
        }
        return cVar;
    }

    public static hk.d u() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_title_dynamic_price), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_dynamic_price)), null, null, null, false, null, null, "dynamic_pricing", 6140);
    }

    public static hk.d w() {
        return new hk.d(Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect), null, null, d0.h(Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_title_1), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_title_2), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_title_3), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_title_4)), d0.h(Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_answer_1), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_answer_2), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_answer_3), Integer.valueOf(R.string.helpcenter_question_asking_a_friend_to_collect_answer_4)), false, null, null, null, 8142);
    }

    public static hk.d x() {
        ArrayList arrayListD = d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_bad_experience));
        hk.b bVar = hk.b.CONTACT_US_BAD_XP;
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_bad_experience), arrayListD, Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, bVar, bVar, "bad_order_experience", 5172);
    }

    public static hk.d y() {
        return new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_cancel_order), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_cancel_order)), Integer.valueOf(R.string.helpdesk_btn_go_to_my_order), null, null, true, hk.b.ORDER_LIST, hk.b.CONTACT_US_BAD_XP, "how_to_cancel", 5300);
    }

    public static hk.d z() {
        return new hk.d(Integer.valueOf(R.string.contact_us_topic_catering_delivery_problem), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_catering_generic)), Integer.valueOf(R.string.helpdesk_btn_contact_us), null, null, true, hk.b.CONTACT_US_CATERING_ISSUE, null, "catering_general_help", 5684);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hk.c J(Order order) {
        hk.b bVar = null;
        hk.d dVar = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_how_it_works), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_how_it_works)), null, null, null, false, null, bVar, "how_does_tgtg_work", 6140);
        hk.b bVar2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        hk.d dVar2 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_how_store_know), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_how_store_know)), objArr, objArr2, null, false, bVar, bVar2, "how_do_stores_know_whats_left", 6140);
        hk.b bVar3 = null;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        hk.d dVar3 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_why_cant_i_know_content), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_why_cant_i_know_what_is_in)), objArr3, objArr4, null, false, bVar2, bVar3, "why_cant_you_tell_whats_in_the_bag", 6140);
        hk.b bVar4 = null;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        hk.d dVar4 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_allergies), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_allergies)), objArr5, objArr6, null, false, bVar3, bVar4, "diet_preferences_and_allergies", 6140);
        hk.b bVar5 = null;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        hk.d dVar5 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_no_stores_near_me), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_no_stores_near_me)), objArr7, objArr8, null, false, bVar4, bVar5, "no_stores_nearby", 5116);
        hk.b bVar6 = null;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        hk.d dVar6 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_do_i_need_phone_with_me), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_do_i_need_phone_with_me)), objArr9, objArr10, null, false, bVar5, bVar6, "do_i_need_to_bring_my_phone", 6140);
        hk.b bVar7 = null;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        hk.d dVar7 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_how_do_i_add_payment_card), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_how_do_i_add_payment_card)), objArr11, objArr12, null, false, bVar6, bVar7, "how_to_add_payment_card", 6140);
        List list = null;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        hk.d dVar8 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_notify_me_when_store_add_bag), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_notify_me_when_store_add_bag)), objArr13, objArr14, list, false, bVar7, null, "can_i_get_stock_notifications", 6140);
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        hk.d dVar9 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_can_i_pay_with_cash), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_can_i_pay_with_cash)), objArr15, list, null, false, objArr16, null, "can_i_pay_with_cash", 6140);
        ArrayList arrayListD = d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_how_to_delete_my_account));
        hk.b bVar8 = hk.b.PRIVACY_SETTINGS;
        List list2 = null;
        hk.b bVar9 = null;
        Object[] objArr17 = 0 == true ? 1 : 0;
        hk.d dVar10 = new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_how_to_delete_my_account), arrayListD, Integer.valueOf(R.string.helpdesk_btn_go_to_privacy), list2, objArr17, true, bVar8, bVar9, "how_to_delete_account", 5812);
        Object[] objArr18 = 0 == true ? 1 : 0;
        ArrayList arrayListD2 = d0.d(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_i_have_contacted_you), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_i_have_contacted_you)), null, list2, objArr18, false, null, bVar9, "waiting_for_reply", 6140), new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_how_widget_works), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_1), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_1), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_2), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_2), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_3), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_3), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_4), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_4), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_5), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_5), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_6), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_6), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_question_7), Integer.valueOf(R.string.helpdesk_topic_how_it_works_how_widget_works_answer_7)), null, null, null, false, null, null, null, 8188));
        if (((g3) this.f39013b).n().getCanShowBestBeforeExplainer()) {
            arrayListD2.add(4, new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_food_was_not_fresh), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_food_was_not_fresh)), null, null, null, false, null, null, "expiry_dates", 6136));
        }
        arrayListD2.add(u());
        arrayListD2.add(new hk.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_question_other_pick_up_order), d0.d(Integer.valueOf(R.string.helpdesk_topic_how_it_works_answer_other_pick_up_order)), null, null, null, false, null, null, "can_somebody_else_collect", 6140));
        hk.c cVar = new hk.c(R.string.helpdesk_topic_how_does_it_work, hk.a.FAQ, arrayListD2, null);
        if (order != null) {
            cVar.f22092d = order;
        }
        return cVar;
    }

    public hk.c K(Order order) {
        e eVar;
        Integer numValueOf = Integer.valueOf(R.string.helpdesk_btn_go_to_my_order);
        g3 g3Var = (g3) this.f39013b;
        boolean zK = y.k(g3Var.m().getCountryIso(), "PL", true);
        boolean zW = g3Var.w();
        e eVarB = c0.b();
        eVarB.add(D());
        eVarB.add(y());
        if (zK) {
            List list = null;
            List list2 = null;
            boolean z11 = true;
            eVar = eVarB;
            eVar.add(new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_cancel_catering_order), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_cancel_catering_order)), numValueOf, list, list2, z11, hk.b.ORDER_LIST, hk.b.CONTACT_US_CATERING_ISSUE, "how_to_cancel_catering", 5300));
        } else {
            eVar = eVarB;
        }
        if (zW) {
            List list3 = null;
            List list4 = null;
            boolean z12 = true;
            eVar.add(new hk.d(Integer.valueOf(R.string.helpdesk_topic_order_question_cancel_next_day_delivery_order), d0.d(Integer.valueOf(R.string.helpdesk_topic_order_answer_cancel_next_day_delivery_order)), numValueOf, list3, list4, z12, hk.b.ORDER_LIST, hk.b.CONTACT_US_NEXT_DAY_DELIVERY_ISSUE, "how_to_cancel_catering", 5300));
        }
        eVar.add(E());
        eVar.add(C());
        eVar.add(x());
        if (order == null || order.isEdible()) {
            eVar.add(H());
        }
        eVar.add(G());
        if (g3Var.n().getShowManufacturerItems()) {
            eVar.add(B());
        }
        if (zK) {
            eVar.add(z());
        }
        if (zW) {
            eVar.add(F());
        }
        eVar.add(w());
        eVar.add(A());
        return new hk.c(R.string.helpdesk_topic_my_order, hk.a.ORDER, new ArrayList(c0.a(eVar)), order);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hk.c L(Order order) {
        ArrayList arrayListD = d0.d(Integer.valueOf(R.string.helpdesk_topic_sign_up_answer_work_at_tgtg));
        boolean z11 = ((g3) this.f39013b).n().getCareersUrl() != null;
        List list = null;
        hk.b bVar = null;
        hk.c cVar = new hk.c(R.string.profile_settings_careers_caption, hk.a.JOIN_TGTG, d0.d(new hk.d(Integer.valueOf(R.string.helpdesk_topic_sign_up_question_work_at_tgtg), arrayListD, Integer.valueOf(R.string.helpdesk_btn_go_to_career_site), null, list, z11, hk.b.WEBVIEW_CAREER_SITE, bVar, "want_to_work_at_tgtg", 5812), new hk.d(Integer.valueOf(R.string.helpdesk_topic_sign_up_question_how_to_help), d0.d(Integer.valueOf(R.string.helpdesk_topic_sign_up_answer_how_to_help)), 0 == true ? 1 : 0, list, null, false, bVar, null, "how_can_i_help", 5052)), null);
        if (order != null) {
            cVar.f22092d = order;
        }
        return cVar;
    }

    public void M(Bundle bundle, String str) {
        a0 a0Var = a0.f4849a;
        if (s0.c()) {
            ((m) this.f39013b).g(bundle, str);
        }
    }

    public i40.b N(JSONObject jSONObject) {
        i40.d fVar;
        int i11 = jSONObject.getInt("settings_version");
        if (i11 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i11 + ". Using default settings values.", null);
            fVar = new r40.d();
        } else {
            fVar = new n20.f(20);
        }
        return fVar.h((r40.d) this.f39013b, jSONObject);
    }

    public void O() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f39013b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + Q());
    }

    public void P(long j9) throws IOException {
        long jQ = Q();
        if (jQ != j9) {
            if (jQ != -1) {
                if (jQ != -2) {
                    return;
                } else {
                    jQ = -2;
                }
            }
            StringBuilder sbG = l1.g("expected non-string scope or scope ", j9, " but found ");
            sbG.append(jQ);
            throw new IOException(sbG.toString());
        }
    }

    public long Q() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f39013b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // a2.b
    public Object a(q2 q2Var, Float f11, Float f12, Function1 function1, i iVar) {
        Object objA = n.a(q2Var, f11.floatValue(), t1.c.b(0.0f, f12.floatValue(), 28), (s) this.f39013b, function1, iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : (a2.a) objA;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        int i11 = this.f39012a;
        Object obj3 = this.f39013b;
        switch (i11) {
            case 11:
                d00.d dVar = (d00.d) obj;
                d00.e eVar = new d00.e(1, (g) obj2);
                d00.c cVar = (d00.c) dVar.getService();
                dVar.getContext();
                com.google.android.gms.common.api.i iVarA = l00.b.a();
                d00.a aVar = (d00.a) cVar;
                aVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = l00.a.f26750a;
                parcelObtain.writeStrongBinder(eVar);
                l00.a.b(parcelObtain, (GetCredentialRequest) obj3);
                l00.a.b(parcelObtain, iVarA);
                aVar.a(1, parcelObtain);
                break;
            case 13:
                r00.i iVar = (r00.i) obj;
                e10.m mVar = (e10.m) obj3;
                Bundle bundleB = iVar.b();
                bundleB.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                r00.h hVar = new r00.h(2, (g) obj2);
                try {
                    r00.g gVar = (r00.g) iVar.getService();
                    gVar.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken(gVar.f11628i);
                    r00.a.c(parcelObtain2, mVar);
                    r00.a.c(parcelObtain2, bundleB);
                    r00.a.d(parcelObtain2, hVar);
                    gVar.M(19, parcelObtain2);
                    break;
                } catch (RemoteException e5) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e5);
                    Bundle bundle = Bundle.EMPTY;
                    int i13 = e10.a.f15466b;
                    Status status = Status.f11056g;
                    boolean zD = status.d();
                    g gVar2 = hVar.f37521i;
                    if (zD) {
                        gVar2.b(null);
                        return;
                    } else {
                        gVar2.a(com.google.android.gms.common.internal.i0.l(status));
                        return;
                    }
                }
                break;
            case 16:
                f00.a aVar2 = new f00.a(1, (g) obj2);
                f00.j jVar = (f00.j) ((f00.d) obj).getService();
                Parcel parcelA = jVar.a();
                int i14 = f00.g.f17037a;
                parcelA.writeStrongBinder(aVar2);
                f00.g.c(parcelA, (jz.g) obj3);
                jVar.b(3, parcelA);
                break;
            default:
                m00.w wVar = (m00.w) ((m00.h) obj).getService();
                m00.d dVar2 = new m00.d(0, (g) obj2);
                Parcel parcelL = wVar.L();
                m00.b.b(parcelL, (s00.b) obj3);
                parcelL.writeStrongBinder(dVar2);
                parcelL.writeString(null);
                wVar.M(63, parcelL);
                break;
        }
    }

    @Override // c20.h
    public int b() {
        return ((ExtendedFloatingActionButton) this.f39013b).getCollapsedSize();
    }

    @Override // c20.h
    public int c() {
        return ((ExtendedFloatingActionButton) this.f39013b).getCollapsedPadding();
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f39013b;
        if (!DrawerLayout.i(view) || drawerLayout.f(view) == 2) {
            return false;
        }
        drawerLayout.b(view, true);
        return true;
    }

    @Override // cy.i0
    public Activity f() {
        return (Activity) this.f39013b;
    }

    @Override // c20.h
    public ViewGroup.LayoutParams g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f39013b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // c20.h
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.f39013b).getCollapsedSize();
    }

    @Override // d10.f
    public Task h(Object obj) {
        i40.b bVar = (i40.b) obj;
        o oVar = ((a40.m) this.f39013b).f742e;
        if (bVar != null) {
            return Tasks.e(Arrays.asList(o.a(oVar), oVar.f758m.n(null, oVar.f751e.f5742a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.d(null);
    }

    @Override // bt.a
    public void i(Uri uri) {
        uri.getClass();
        at.c0 c0Var = ((eo.f) this.f39013b).f16203h;
        if (c0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRouter");
            c0Var = null;
        }
        c0Var.a(uri);
    }

    @Override // o.j
    public boolean j(o.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // c20.h
    public int k() {
        return ((ExtendedFloatingActionButton) this.f39013b).getCollapsedPadding();
    }

    @Override // ia.d
    public String l() {
        return ((ka.e) this.f39013b).f26254b;
    }

    @Override // bt.a
    public void m(Uri uri) {
        uri.getClass();
        at.c0 c0Var = ((eo.f) this.f39013b).f16203h;
        if (c0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRouter");
            c0Var = null;
        }
        c0Var.getClass();
        c0Var.f4769a.a(new f70.n(uri));
    }

    @Override // ia.d
    public void n(ia.c cVar) {
        ka.e eVar = (ka.e) this.f39013b;
        int length = eVar.f26247d.length;
        for (int i11 = 1; i11 < length; i11++) {
            int i12 = eVar.f26247d[i11];
            if (i12 == 1) {
                cVar.j(i11, eVar.f26248e[i11]);
            } else if (i12 == 2) {
                cVar.f(i11, eVar.f26249f[i11]);
            } else if (i12 == 3) {
                String str = eVar.f26250g[i11];
                str.getClass();
                cVar.s(i11, str);
            } else if (i12 == 4) {
                byte[] bArr = eVar.f26251h[i11];
                bArr.getClass();
                cVar.k(i11, bArr);
            } else if (i12 == 5) {
                cVar.m(i11);
            }
        }
    }

    public String o(String str) {
        Object objH = t1.H(1000L, new ky.q(this, str, 0));
        if (objH instanceof p) {
            objH = "";
        }
        return (String) objH;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        b0 b0Var = (b0) this.f39013b;
        if (b0Var.f15585b == null) {
            b0Var.f15585b = new Rect();
        }
        b0Var.f15585b.set(windowInsetsCompat.j(), windowInsetsCompat.l(), windowInsetsCompat.k(), windowInsetsCompat.i());
        b0Var.e(windowInsetsCompat);
        b0Var.setWillNotDraw(!windowInsetsCompat.n() || b0Var.f15584a == null);
        b0Var.postInvalidateOnAnimation();
        return windowInsetsCompat.c();
    }

    @Override // b9.a
    public c9.e onCreateLoader(int i11, Bundle bundle) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f39013b;
        Set set = com.google.android.gms.common.api.o.f11087a;
        synchronized (set) {
        }
        return new lz.d(signInHubActivity, set);
    }

    @Override // b9.a
    public /* bridge */ /* synthetic */ void onLoadFinished(c9.e eVar, Object obj) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f39013b;
        signInHubActivity.setResult(signInHubActivity.f11041e, signInHubActivity.f11042f);
        signInHubActivity.finish();
    }

    @Override // o.j
    public void q(o.l lVar) {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this.f39013b;
        boolean zP = bVar.f1805a.f2157a.p();
        Window.Callback callback = bVar.f1806b;
        if (zP) {
            callback.onPanelClosed(108, lVar);
        } else if (callback.onPreparePanel(0, null, lVar)) {
            callback.onMenuOpened(108, lVar);
        }
    }

    public String r(String str) {
        Object objH = t1.H(1000L, new ky.q(this, str, 1));
        if (objH instanceof p) {
            objH = "";
        }
        return (String) objH;
    }

    public String s(String str) {
        Object objH = t1.H(1000L, new ky.q(this, str, 2));
        if (objH instanceof p) {
            objH = "";
        }
        return (String) objH;
    }

    @Override // cy.i0
    public void startActivityForResult(Intent intent, int i11) {
        ((Activity) this.f39013b).startActivityForResult(intent, i11);
    }

    public e0 t(Context context, String str, InputStream inputStream, String str2, String str3) {
        e0 e0VarH;
        a aVar;
        b bVar = (b) this.f39013b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            ve.c.a();
            a aVar2 = a.ZIP;
            e0VarH = str3 != null ? he.o.h(context, new ZipInputStream(new FileInputStream(bVar.w(str, inputStream, aVar2))), str) : he.o.h(context, new ZipInputStream(inputStream), null);
            aVar = aVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            ve.c.a();
            aVar = a.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(bVar.w(str, inputStream, aVar)));
                HashMap map = he.o.f21952a;
                e0VarH = he.o.f(ia0.b.g(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = he.o.f21952a;
                e0VarH = he.o.f(ia0.b.g(gZIPInputStream2), null);
            }
        } else {
            ve.c.a();
            aVar = a.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(bVar.w(str, inputStream, aVar).getAbsolutePath());
                HashMap map3 = he.o.f21952a;
                e0VarH = he.o.f(ia0.b.g(fileInputStream), str);
            } else {
                HashMap map4 = he.o.f21952a;
                e0VarH = he.o.f(ia0.b.g(inputStream), null);
            }
        }
        if (str3 != null && e0VarH.f21902a != null) {
            File file = new File(bVar.u(), b.g(str, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            ve.c.a();
            if (!zRenameTo) {
                ve.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return e0VarH;
    }

    public kf.b v(ye.b bVar) {
        bVar.getClass();
        return (kf.b) ((t) this.f39013b).getValue();
    }

    @Override // bt.a
    public void e() {
    }

    @Override // bt.a
    public void onPageFinished() {
    }

    @Override // b9.a
    public void onLoaderReset(c9.e eVar) {
    }

    @Override // bt.a
    public void p(RuntimeException runtimeException) {
    }

    public /* synthetic */ d(f00.c cVar, jz.g gVar) {
        this.f39012a = 16;
        this.f39013b = gVar;
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f39012a = i11;
        this.f39013b = obj;
    }

    public d(g3 g3Var) {
        this.f39012a = 18;
        g3Var.getClass();
        this.f39013b = g3Var;
    }

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f39012a = i11;
        this.f39013b = obj;
    }

    public d(Context context) {
        this.f39012a = 6;
        this.f39013b = new m(context, (String) null);
    }

    public d(Context context, String str) {
        this.f39012a = 6;
        this.f39013b = new m(context, str);
    }
}
