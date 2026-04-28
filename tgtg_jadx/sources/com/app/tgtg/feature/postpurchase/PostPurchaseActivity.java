package com.app.tgtg.feature.postpurchase;

import ah.n;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.navigation.fragment.NavHostFragment;
import com.app.tgtg.R;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.order.OrderType;
import e70.c;
import f70.g;
import f70.i;
import ft.e;
import g9.f0;
import g9.g0;
import h2.b1;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.a0;
import mv.r0;
import mv.y;
import mv.z;
import nk.j;
import p30.b;
import qo.a;
import qo.d;
import qo.f;
import qo.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class PostPurchaseActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9193i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f9195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9196h;

    public PostPurchaseActivity() {
        super(28);
        this.f9196h = new n1(Reflection.getOrCreateKotlinClass(h.class), new d(this, 1), new d(this, 0), new d(this, 2));
    }

    public static final void a0(PostPurchaseActivity postPurchaseActivity, f fVar) {
        int i11;
        int i12 = a.$EnumSwitchMapping$0[fVar.ordinal()];
        if (i12 == 1) {
            if (!r0.v(postPurchaseActivity.b0().f37213f.getEmail())) {
                h.c(postPurchaseActivity.b0());
                return;
            }
            f0 f0Var = postPurchaseActivity.f9195g;
            if (f0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                f0Var = null;
            }
            f0Var.c(R.id.toAddEmailFragment, null);
            return;
        }
        if (i12 == 2) {
            SharedPreferences sharedPreferences = e.f17922c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                sharedPreferences = null;
            }
            if (!sharedPreferences.getBoolean("shouldShowReminderPrompt", true) || (((i11 = Build.VERSION.SDK_INT) < 33 || NotificationManagerCompat.from(postPurchaseActivity).areNotificationsEnabled() || ft.c.E()) && (i11 < 33 || mv.d.o(postPurchaseActivity) || ft.c.D()))) {
                h.c(postPurchaseActivity.b0());
                return;
            }
            f0 f0Var2 = postPurchaseActivity.f9195g;
            if (f0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                f0Var2 = null;
            }
            f0Var2.c(R.id.toAddReminderFragment, null);
            return;
        }
        if (i12 == 3) {
            if (!r0.v(postPurchaseActivity.b0().f37213f.getPhoneNumber()) || NotificationManagerCompat.from(postPurchaseActivity).areNotificationsEnabled()) {
                h.c(postPurchaseActivity.b0());
                return;
            }
            f0 f0Var3 = postPurchaseActivity.f9195g;
            if (f0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                f0Var3 = null;
            }
            f0Var3.c(R.id.toAddPhoneNumberFragment, null);
            return;
        }
        if (i12 != 4) {
            e40.a.f();
            return;
        }
        if (postPurchaseActivity.b0().f37214g) {
            String str = postPurchaseActivity.b0().f37215h;
            if (str != null) {
                so.a aVar = postPurchaseActivity.b0().f37212e;
                aVar.getClass();
                g gVar = aVar.f39079a;
                mk.c cVar = new mk.c(str, ItemViewActivity.class);
                cVar.f29980c = "delivery";
                i iVar = i.CELEBRATION_SCREEN;
                iVar.getClass();
                cVar.f29986i = iVar;
                cVar.f29983f = true;
                gVar.a(cVar.a());
                return;
            }
            return;
        }
        if (d0.h(ItemType.MANUFACTURER, ItemType.CATERING).contains(postPurchaseActivity.b0().a())) {
            a0 a0Var = new a0();
            y yVar = y.MNU_PURCHASE_COMPLETE;
            yVar.getClass();
            a0Var.f30140c = yVar;
            z zVar = z.DISCOVER;
            zVar.getClass();
            a0Var.f30138a = zVar;
            a0Var.c(postPurchaseActivity);
            return;
        }
        if (postPurchaseActivity.b0().b() != null) {
            b.w(postPurchaseActivity, new io.a(postPurchaseActivity.b0().b(), null, OrderType.MAGICBAG, false, i.POST_PURCHASE, 74), null);
            postPurchaseActivity.finish();
            return;
        }
        a0 a0Var2 = new a0();
        y yVar2 = y.PURCHASE_COMPLETE;
        yVar2.getClass();
        a0Var2.f30140c = yVar2;
        z zVar2 = z.DISCOVER;
        zVar2.getClass();
        a0Var2.f30138a = zVar2;
        a0Var2.c(postPurchaseActivity);
    }

    public final h b0() {
        return (h) this.f9196h.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_post_purchase);
        o30.f0.S(this, true);
        c cVar = this.f9194f;
        x70.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        fragmentFindFragmentById.getClass();
        f0 f0VarO = ((NavHostFragment) fragmentFindFragmentById).o();
        this.f9195g = f0VarO;
        if (f0VarO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            f0VarO = null;
        }
        v80.f0.B(m1.c(this), null, null, new j(this, ((g0) f0VarO.f20193i.getValue()).b(R.navigation.post_purchase_navigation), cVar2, 14), 3);
        v80.f0.B(m1.c(this), null, null, new b1(this, cVar2, 28), 3);
    }
}
