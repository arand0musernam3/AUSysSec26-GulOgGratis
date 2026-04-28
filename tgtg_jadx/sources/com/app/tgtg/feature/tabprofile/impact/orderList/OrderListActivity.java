package com.app.tgtg.feature.tabprofile.impact.orderList;

import a3.x0;
import ah.n;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import br.a;
import br.b;
import br.d;
import br.e;
import br.k;
import br.o;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderState;
import cv.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lv.s;
import m0.l;
import pd.g;
import pg.c;
import pg.u;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OrderListActivity extends n implements a {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f9320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OrderListActivity$initListeners$1$3 f9321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActivityResultLauncher f9322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f9323k;

    public OrderListActivity() {
        super(3);
        this.f9319g = new n1(Reflection.getOrCreateKotlinClass(o.class), new e(this, 1), new e(this, 0), new e(this, 2));
        this.f9322j = registerForActivityResult(new g1(4), new b(this));
        this.f9323k = new e0(this, 3);
    }

    public static void a0(OrderListActivity orderListActivity, h.a aVar) {
        Object serializableExtra;
        aVar.getClass();
        int i11 = aVar.f20935a;
        Intent intent = aVar.f20936b;
        if (i11 != 123) {
            if (i11 == 128) {
                if (intent == null || !intent.hasExtra("ORDER_ID")) {
                    return;
                }
                OrderId orderId = (OrderId) intent.getParcelableExtra("orderId");
                String strM217unboximpl = orderId != null ? orderId.m217unboximpl() : null;
                int intExtra = intent.getIntExtra("ORDER_RATING", 0);
                if (strM217unboximpl != null) {
                    OrderId.m209boximpl(strM217unboximpl).m217unboximpl();
                    k kVar = orderListActivity.f9320h;
                    if (kVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        kVar = null;
                    }
                    k.b(kVar, strM217unboximpl, Integer.valueOf(intExtra), null, 4);
                    return;
                }
                return;
            }
            if (i11 != 130 && i11 != 131) {
                return;
            }
        }
        if (intent == null || !intent.hasExtra("orderId")) {
            return;
        }
        OrderId orderId2 = (OrderId) intent.getParcelableExtra("orderId");
        String strM217unboximpl2 = orderId2 != null ? orderId2.m217unboximpl() : null;
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("orderState", OrderState.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("orderState");
            if (!(serializableExtra2 instanceof OrderState)) {
                serializableExtra2 = null;
            }
            serializableExtra = (OrderState) serializableExtra2;
        }
        OrderState orderState = (OrderState) serializableExtra;
        k kVar2 = orderListActivity.f9320h;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            kVar2 = null;
        }
        strM217unboximpl2.getClass();
        k.b(kVar2, strM217unboximpl2, null, orderState, 2);
    }

    public final o b0() {
        return (o) this.f9319g.getValue();
    }

    public final void c0() {
        c cVar = this.f9318f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        ((TGTGLoadingView) cVar.f34804e).setVisibility(8);
    }

    public final void d0() {
        b0().f6661g = true;
        if (b0().f6664j != null) {
            k kVar = this.f9320h;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                kVar = null;
            }
            if (!kVar.f6642h) {
                new Handler(Looper.getMainLooper()).post(new l(kVar, 6));
            }
            kVar.f6642h = true;
        }
        try {
            o oVarB0 = b0();
            if (oVarB0.f6664j == null) {
                oVarB0.f6659e.i(Boolean.TRUE);
            }
            f0.B(m1.d(oVarB0), null, null, new br.n(oVarB0, null), 3).J(new x0(oVarB0, 28));
        } catch (Throwable unused) {
            e0();
        }
    }

    public final void e0() {
        c cVar = this.f9318f;
        k kVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        ((SwipeRefreshLayout) cVar.f34806g).setRefreshing(false);
        k kVar2 = this.f9320h;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            kVar = kVar2;
        }
        kVar.a();
    }

    public final void f0() {
        c cVar = this.f9318f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        ((RecyclerView) cVar.f34805f).j0(0);
        k kVar = this.f9320h;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            kVar = null;
        }
        ArrayList arrayList = kVar.f6635a;
        int size = arrayList != null ? arrayList.size() : 0;
        if (arrayList != null) {
            arrayList.clear();
        }
        kVar.notifyItemRangeRemoved(0, size);
        o oVarB0 = b0();
        oVarB0.f6663i = null;
        oVarB0.f6664j = null;
        oVarB0.f6662h = false;
        oVarB0.f6661g = false;
    }

    public final void g0(GenericErrors genericErrors) {
        c0();
        c cVar = this.f9318f;
        c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        ((RecyclerView) cVar.f34805f).setVisibility(8);
        c cVar3 = this.f9318f;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar3 = null;
        }
        ((GenericErrorView) cVar3.f34803d).setVisibility(0);
        c cVar4 = this.f9318f;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cVar2 = cVar4;
        }
        ((GenericErrorView) cVar2.f34803d).k(genericErrors);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a70.a.t(this, s.B);
        k kVar = null;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_order_list, (ViewGroup) null, false);
        int i12 = R.id.bottomNav;
        View viewT = g.t(R.id.bottomNav, viewInflate);
        if (viewT != null) {
            int i13 = R.id.bottomNavLayout;
            if (((LinearLayout) g.t(R.id.bottomNavLayout, viewT)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewT;
                i13 = R.id.ivIcon;
                ImageView imageView = (ImageView) g.t(R.id.ivIcon, viewT);
                if (imageView != null) {
                    i13 = R.id.tvTotal;
                    TextView textView = (TextView) g.t(R.id.tvTotal, viewT);
                    if (textView != null) {
                        i13 = R.id.tvTotalNumber;
                        TextView textView2 = (TextView) g.t(R.id.tvTotalNumber, viewT);
                        if (textView2 != null) {
                            u uVar = new u(constraintLayout, imageView, textView, textView2, 1);
                            i12 = R.id.errorView;
                            GenericErrorView genericErrorView = (GenericErrorView) g.t(R.id.errorView, viewInflate);
                            if (genericErrorView != null) {
                                i12 = R.id.loadingProgressBar;
                                TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) g.t(R.id.loadingProgressBar, viewInflate);
                                if (tGTGLoadingView != null) {
                                    i12 = R.id.rvOrders;
                                    RecyclerView recyclerView = (RecyclerView) g.t(R.id.rvOrders, viewInflate);
                                    if (recyclerView != null) {
                                        i12 = R.id.swipeRefreshLayout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) g.t(R.id.swipeRefreshLayout, viewInflate);
                                        if (swipeRefreshLayout != null) {
                                            i12 = R.id.toolbar;
                                            View viewT2 = g.t(R.id.toolbar, viewInflate);
                                            if (viewT2 != null) {
                                                int i14 = R.id.ivToolbarBack;
                                                ImageButton imageButton = (ImageButton) g.t(R.id.ivToolbarBack, viewT2);
                                                if (imageButton != null) {
                                                    i14 = R.id.ivToolbarSpacer;
                                                    if (((ImageView) g.t(R.id.ivToolbarSpacer, viewT2)) != null) {
                                                        LinearLayout linearLayout = (LinearLayout) viewT2;
                                                        TextView textView3 = (TextView) g.t(R.id.tvToolbarTitle, viewT2);
                                                        if (textView3 != null) {
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                            this.f9318f = new c(constraintLayout2, uVar, genericErrorView, tGTGLoadingView, recyclerView, swipeRefreshLayout, new mc.a(linearLayout, imageButton, textView3, 7), 0);
                                                            setContentView(constraintLayout2);
                                                            getOnBackPressedDispatcher().a(this.f9323k);
                                                            o oVarB0 = b0();
                                                            m0.c.f0(oVarB0.f6658d, this, new br.c(this, i11));
                                                            int i15 = 1;
                                                            oVarB0.f6659e.e(this, new al.c(new br.c(this, i15), 3));
                                                            m0.c.f0(oVarB0.f6660f, this, new br.c(this, 2));
                                                            c cVar = this.f9318f;
                                                            if (cVar == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                cVar = null;
                                                            }
                                                            mc.a aVar = (mc.a) cVar.f34807h;
                                                            RecyclerView recyclerView2 = (RecyclerView) cVar.f34805f;
                                                            ((ImageButton) aVar.f29923c).setOnClickListener(new ax.s(this, 6));
                                                            ((SwipeRefreshLayout) cVar.f34806g).setOnRefreshListener(new b(this));
                                                            OrderListActivity$initListeners$1$3 orderListActivity$initListeners$1$3 = new OrderListActivity$initListeners$1$3(this);
                                                            this.f9321i = orderListActivity$initListeners$1$3;
                                                            recyclerView2.setLayoutManager(orderListActivity$initListeners$1$3);
                                                            recyclerView2.k(new b0(this, i15));
                                                            c cVar2 = this.f9318f;
                                                            if (cVar2 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                cVar2 = null;
                                                            }
                                                            mc.a aVar2 = (mc.a) cVar2.f34807h;
                                                            RecyclerView recyclerView3 = (RecyclerView) cVar2.f34805f;
                                                            u uVar2 = (u) cVar2.f34802c;
                                                            ((TextView) aVar2.f29924d).setText(getString(R.string.order_list_toolbar_title));
                                                            boolean showManufacturerItems = b0().f6656b.n().getShowManufacturerItems();
                                                            TextView textView4 = uVar2.f35180d;
                                                            if (showManufacturerItems) {
                                                                textView4.setText(getString(R.string.mnu_order_list_order_count));
                                                            } else {
                                                                textView4.setText(getString(R.string.order_list_total));
                                                            }
                                                            uVar2.f35179c.setImageResource(R.drawable.gfx_suprise_bag_icon_small);
                                                            uVar2.f35181e.setText(String.valueOf(ft.c.o().getMagicBagCount()));
                                                            this.f9320h = new k(this, new ArrayList(), new d(this, i11));
                                                            recyclerView3.setHasFixedSize(true);
                                                            k kVar2 = this.f9320h;
                                                            if (kVar2 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                            } else {
                                                                kVar = kVar2;
                                                            }
                                                            recyclerView3.setAdapter(kVar);
                                                            f0();
                                                            d0();
                                                            b0().f6657c.b(i.SCREEN_ORDER_LIST);
                                                            o30.f0.S(this, true);
                                                            return;
                                                        }
                                                        i14 = R.id.tvToolbarTitle;
                                                    }
                                                }
                                                w.l("Missing required view with ID: ".concat(viewT2.getResources().getResourceName(i14)));
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
            w.l("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i13)));
            return;
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c0();
        this.f9323k.remove();
    }
}
