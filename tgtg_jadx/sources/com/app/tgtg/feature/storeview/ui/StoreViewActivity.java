package com.app.tgtg.feature.storeview.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bg.w0;
import bq.i;
import bq.j;
import c50.w;
import c6.y;
import com.app.tgtg.R;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.google.android.gms.internal.measurement.cg;
import defpackage.k;
import dk.b;
import e70.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import mr.e;
import mv.a0;
import mv.d;
import mv.r0;
import o30.f0;
import pg.o0;
import qs.a;
import rt.f;
import zp.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreViewActivity extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f9248o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o0 f9251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f9252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f9253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w0 f9254k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public bq.c f9255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f9256n;

    public StoreViewActivity() {
        super(5);
        this.f9249f = new n1(Reflection.getOrCreateKotlinClass(g.class), new zp.c(this, 1), new zp.c(this, 0), new zp.c(this, 2));
        this.f9256n = new e(this, 15);
    }

    public final g C() {
        return (g) this.f9249f.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            if (this.f9254k == null) {
                this.f9254k = new w0(this);
            }
            w0 w0Var = this.f9254k;
            w0Var.getClass();
            o0 o0Var = this.f9251h;
            if (o0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o0Var = null;
            }
            w0Var.b((MotionLayout) o0Var.f35025k);
        }
    }

    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x70.c cVar = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.store_view_view, (ViewGroup) null, false);
        int i12 = R.id.branchName;
        TextView textView = (TextView) pd.g.t(R.id.branchName, viewInflate);
        if (textView != null) {
            i12 = R.id.distance;
            TextView textView2 = (TextView) pd.g.t(R.id.distance, viewInflate);
            if (textView2 != null) {
                i12 = R.id.ibBack;
                ImageButton imageButton = (ImageButton) pd.g.t(R.id.ibBack, viewInflate);
                if (imageButton != null) {
                    i12 = R.id.ibBackContainer;
                    LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.ibBackContainer, viewInflate);
                    if (linearLayout != null) {
                        i12 = R.id.infoLayout;
                        if (((LinearLayout) pd.g.t(R.id.infoLayout, viewInflate)) != null) {
                            i12 = R.id.ivStoreLogo;
                            ImageView imageView = (ImageView) pd.g.t(R.id.ivStoreLogo, viewInflate);
                            if (imageView != null) {
                                i12 = R.id.ivToolbarBack;
                                ImageButton imageButton2 = (ImageButton) pd.g.t(R.id.ivToolbarBack, viewInflate);
                                if (imageButton2 != null) {
                                    MotionLayout motionLayout = (MotionLayout) viewInflate;
                                    i12 = R.id.rvItemList;
                                    RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.rvItemList, viewInflate);
                                    if (recyclerView != null) {
                                        i12 = R.id.storeViewToolbar;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.storeViewToolbar, viewInflate);
                                        if (constraintLayout != null) {
                                            i12 = R.id.toolbarTitle;
                                            TextView textView3 = (TextView) pd.g.t(R.id.toolbarTitle, viewInflate);
                                            if (textView3 != null) {
                                                i12 = R.id.tvStoreName;
                                                TextView textView4 = (TextView) pd.g.t(R.id.tvStoreName, viewInflate);
                                                if (textView4 != null) {
                                                    i12 = R.id.view;
                                                    if (pd.g.t(R.id.view, viewInflate) != null) {
                                                        this.f9251h = new o0(motionLayout, textView, textView2, imageButton, linearLayout, imageView, imageButton2, motionLayout, recyclerView, constraintLayout, textView3, textView4);
                                                        setContentView(motionLayout);
                                                        f0.S(this, false);
                                                        o0 o0Var = this.f9251h;
                                                        if (o0Var == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            o0Var = null;
                                                        }
                                                        ViewCompat.k0((MotionLayout) o0Var.f35018d, new mp.a(this, 26));
                                                        getOnBackPressedDispatcher().a(this.f9256n);
                                                        o0 o0Var2 = this.f9251h;
                                                        if (o0Var2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            o0Var2 = null;
                                                        }
                                                        d.x((ImageButton) o0Var2.f35021g, new Function1(this) { // from class: zp.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ StoreViewActivity f48017b;

                                                            {
                                                                this.f48017b = this;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                ArrayList arrayList;
                                                                ArrayList<BasicItem> arrayList2;
                                                                String title;
                                                                String description;
                                                                int i13 = i11;
                                                                o0 o0Var3 = null;
                                                                StoreViewActivity storeViewActivity = this.f48017b;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        w0 w0Var = storeViewActivity.f9254k;
                                                                        if (w0Var != null) {
                                                                            w0Var.a();
                                                                        }
                                                                        storeViewActivity.l = false;
                                                                        storeViewActivity.getOnBackPressedDispatcher().d();
                                                                        break;
                                                                    case 1:
                                                                        int i15 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        o0 o0Var4 = storeViewActivity.f9251h;
                                                                        if (o0Var4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var3 = o0Var4;
                                                                        }
                                                                        ((ImageButton) o0Var3.f35021g).performClick();
                                                                        break;
                                                                    case 2:
                                                                        StoreInformation storeInformation = (StoreInformation) obj;
                                                                        int i16 = StoreViewActivity.f9248o;
                                                                        if (storeInformation != null) {
                                                                            w0 w0Var2 = storeViewActivity.f9254k;
                                                                            if (w0Var2 != null) {
                                                                                w0Var2.a();
                                                                            }
                                                                            storeViewActivity.l = false;
                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(storeViewActivity);
                                                                            linearLayoutManager.setOrientation(1);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            arrayList3.add(new bq.a(storeViewActivity));
                                                                            LocalHero localHero = storeInformation.getLocalHero();
                                                                            if (localHero != null && (title = localHero.getTitle()) != null && !StringsKt.H(title) && (description = localHero.getDescription()) != null && !StringsKt.H(description)) {
                                                                                arrayList3.add(new bq.f(storeViewActivity, null));
                                                                            }
                                                                            List<BasicItem> items = storeInformation.getItems();
                                                                            if (items != null) {
                                                                                ArrayList arrayList4 = new ArrayList();
                                                                                for (Object obj2 : items) {
                                                                                    if (obj2 instanceof FlashSalesItem) {
                                                                                        arrayList4.add(obj2);
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                for (Object obj3 : arrayList4) {
                                                                                    FlashSalesItem flashSalesItem = (FlashSalesItem) obj3;
                                                                                    if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                                                                                        arrayList.add(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if (cg.q(arrayList)) {
                                                                                arrayList3.add(new bq.d(storeViewActivity));
                                                                            }
                                                                            List<BasicItem> items2 = storeInformation.getItems();
                                                                            if (items2 != null) {
                                                                                arrayList2 = new ArrayList();
                                                                                for (Object obj4 : items2) {
                                                                                    if (!(((BasicItem) obj4) instanceof FlashSalesItem)) {
                                                                                        arrayList2.add(obj4);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList2 = null;
                                                                            }
                                                                            if (cg.q(arrayList2)) {
                                                                                arrayList2.getClass();
                                                                                for (BasicItem basicItem : arrayList2) {
                                                                                    basicItem.getClass();
                                                                                    basicItem.setStoreInfoOrNull(storeInformation);
                                                                                }
                                                                                arrayList3.add(new j(storeViewActivity, arrayList2, (String) storeViewActivity.C().f48026d.a("DISPLAY_TYPE"), (String) storeViewActivity.C().f48026d.a("FILLER_TYPE")));
                                                                            }
                                                                            bq.c cVar2 = storeViewActivity.f9255m;
                                                                            if (cVar2 != null) {
                                                                                arrayList3.add(cVar2);
                                                                            }
                                                                            arrayList3.add(new bq.b(storeViewActivity));
                                                                            storeViewActivity.f9253j = arrayList3;
                                                                            i iVar = new i(storeInformation, new y(2, storeViewActivity.C(), g.class, "openMap", "openMap(DD)V", 0, 9), new b(4, storeViewActivity.C(), g.class, "goToItemDetailsScreen", "goToItemDetailsScreen(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/core/navigation/NavigationOrigin;)V", 0));
                                                                            storeViewActivity.f9252i = iVar;
                                                                            ArrayList arrayList5 = storeViewActivity.f9253j;
                                                                            if (arrayList5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("modules");
                                                                                arrayList5 = null;
                                                                            }
                                                                            arrayList5.getClass();
                                                                            ArrayList arrayList6 = (ArrayList) iVar.f6606e;
                                                                            arrayList6.clear();
                                                                            arrayList6.addAll(arrayList5);
                                                                            o0 o0Var5 = storeViewActivity.f9251h;
                                                                            if (o0Var5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var5 = null;
                                                                            }
                                                                            o0Var5.f35016b.setLayoutManager(linearLayoutManager);
                                                                            o0 o0Var6 = storeViewActivity.f9251h;
                                                                            if (o0Var6 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var6 = null;
                                                                            }
                                                                            RecyclerView recyclerView2 = o0Var6.f35016b;
                                                                            i iVar2 = storeViewActivity.f9252i;
                                                                            if (iVar2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                                iVar2 = null;
                                                                            }
                                                                            recyclerView2.setAdapter(iVar2);
                                                                            String currentUrl = storeInformation.getLogoPicture().getCurrentUrl();
                                                                            o0 o0Var7 = storeViewActivity.f9251h;
                                                                            if (o0Var7 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var7 = null;
                                                                            }
                                                                            r0.y(currentUrl, (ImageView) o0Var7.f35023i, R.drawable.default_logo);
                                                                            o0 o0Var8 = storeViewActivity.f9251h;
                                                                            if (o0Var8 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var8 = null;
                                                                            }
                                                                            ((TextView) o0Var8.l).setText(storeInformation.getStoreNameAndBranch());
                                                                            o0 o0Var9 = storeViewActivity.f9251h;
                                                                            if (o0Var9 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var9 = null;
                                                                            }
                                                                            ((TextView) o0Var9.f35026m).setText(storeInformation.getStoreName());
                                                                            boolean zV = r0.v(storeInformation.getBranch());
                                                                            o0 o0Var10 = storeViewActivity.f9251h;
                                                                            if (zV) {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setVisibility(8);
                                                                            } else {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setText(storeInformation.getBranch());
                                                                                o0 o0Var11 = storeViewActivity.f9251h;
                                                                                if (o0Var11 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var11 = null;
                                                                                }
                                                                                ((TextView) o0Var11.f35019e).setVisibility(0);
                                                                            }
                                                                            o0 o0Var12 = storeViewActivity.f9251h;
                                                                            if (o0Var12 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var12 = null;
                                                                            }
                                                                            ((TextView) o0Var12.f35020f).setText(mv.d.h(storeInformation.getDistance()));
                                                                            o0 o0Var13 = storeViewActivity.f9251h;
                                                                            if (o0Var13 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            } else {
                                                                                o0Var3 = o0Var13;
                                                                            }
                                                                            ((TextView) o0Var3.f35019e).setText(storeInformation.getBranch());
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        Boolean bool = (Boolean) obj;
                                                                        int i17 = StoreViewActivity.f9248o;
                                                                        if (bool != null) {
                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                            if (!storeViewActivity.isFinishing() && !storeViewActivity.isDestroyed()) {
                                                                                if (!zBooleanValue) {
                                                                                    Toast.makeText(storeViewActivity, storeViewActivity.getString(R.string.generic_err_undefined_error), 0).show();
                                                                                }
                                                                                if (storeViewActivity.isTaskRoot()) {
                                                                                    new a0().c(storeViewActivity);
                                                                                } else {
                                                                                    storeViewActivity.finish();
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        o0 o0Var14 = storeViewActivity.f9251h;
                                                                        if (o0Var14 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var3 = o0Var14;
                                                                        }
                                                                        p30.b.E((TextView) o0Var3.f35020f, !bool2.booleanValue());
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        });
                                                        o0 o0Var3 = this.f9251h;
                                                        if (o0Var3 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                            o0Var3 = null;
                                                        }
                                                        final int i13 = 1;
                                                        d.x((ImageButton) o0Var3.f35024j, new Function1(this) { // from class: zp.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ StoreViewActivity f48017b;

                                                            {
                                                                this.f48017b = this;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                ArrayList arrayList;
                                                                ArrayList<BasicItem> arrayList2;
                                                                String title;
                                                                String description;
                                                                int i132 = i13;
                                                                o0 o0Var32 = null;
                                                                StoreViewActivity storeViewActivity = this.f48017b;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i14 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        w0 w0Var = storeViewActivity.f9254k;
                                                                        if (w0Var != null) {
                                                                            w0Var.a();
                                                                        }
                                                                        storeViewActivity.l = false;
                                                                        storeViewActivity.getOnBackPressedDispatcher().d();
                                                                        break;
                                                                    case 1:
                                                                        int i15 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        o0 o0Var4 = storeViewActivity.f9251h;
                                                                        if (o0Var4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var4;
                                                                        }
                                                                        ((ImageButton) o0Var32.f35021g).performClick();
                                                                        break;
                                                                    case 2:
                                                                        StoreInformation storeInformation = (StoreInformation) obj;
                                                                        int i16 = StoreViewActivity.f9248o;
                                                                        if (storeInformation != null) {
                                                                            w0 w0Var2 = storeViewActivity.f9254k;
                                                                            if (w0Var2 != null) {
                                                                                w0Var2.a();
                                                                            }
                                                                            storeViewActivity.l = false;
                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(storeViewActivity);
                                                                            linearLayoutManager.setOrientation(1);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            arrayList3.add(new bq.a(storeViewActivity));
                                                                            LocalHero localHero = storeInformation.getLocalHero();
                                                                            if (localHero != null && (title = localHero.getTitle()) != null && !StringsKt.H(title) && (description = localHero.getDescription()) != null && !StringsKt.H(description)) {
                                                                                arrayList3.add(new bq.f(storeViewActivity, null));
                                                                            }
                                                                            List<BasicItem> items = storeInformation.getItems();
                                                                            if (items != null) {
                                                                                ArrayList arrayList4 = new ArrayList();
                                                                                for (Object obj2 : items) {
                                                                                    if (obj2 instanceof FlashSalesItem) {
                                                                                        arrayList4.add(obj2);
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                for (Object obj3 : arrayList4) {
                                                                                    FlashSalesItem flashSalesItem = (FlashSalesItem) obj3;
                                                                                    if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                                                                                        arrayList.add(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if (cg.q(arrayList)) {
                                                                                arrayList3.add(new bq.d(storeViewActivity));
                                                                            }
                                                                            List<BasicItem> items2 = storeInformation.getItems();
                                                                            if (items2 != null) {
                                                                                arrayList2 = new ArrayList();
                                                                                for (Object obj4 : items2) {
                                                                                    if (!(((BasicItem) obj4) instanceof FlashSalesItem)) {
                                                                                        arrayList2.add(obj4);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList2 = null;
                                                                            }
                                                                            if (cg.q(arrayList2)) {
                                                                                arrayList2.getClass();
                                                                                for (BasicItem basicItem : arrayList2) {
                                                                                    basicItem.getClass();
                                                                                    basicItem.setStoreInfoOrNull(storeInformation);
                                                                                }
                                                                                arrayList3.add(new j(storeViewActivity, arrayList2, (String) storeViewActivity.C().f48026d.a("DISPLAY_TYPE"), (String) storeViewActivity.C().f48026d.a("FILLER_TYPE")));
                                                                            }
                                                                            bq.c cVar2 = storeViewActivity.f9255m;
                                                                            if (cVar2 != null) {
                                                                                arrayList3.add(cVar2);
                                                                            }
                                                                            arrayList3.add(new bq.b(storeViewActivity));
                                                                            storeViewActivity.f9253j = arrayList3;
                                                                            i iVar = new i(storeInformation, new y(2, storeViewActivity.C(), g.class, "openMap", "openMap(DD)V", 0, 9), new b(4, storeViewActivity.C(), g.class, "goToItemDetailsScreen", "goToItemDetailsScreen(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/core/navigation/NavigationOrigin;)V", 0));
                                                                            storeViewActivity.f9252i = iVar;
                                                                            ArrayList arrayList5 = storeViewActivity.f9253j;
                                                                            if (arrayList5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("modules");
                                                                                arrayList5 = null;
                                                                            }
                                                                            arrayList5.getClass();
                                                                            ArrayList arrayList6 = (ArrayList) iVar.f6606e;
                                                                            arrayList6.clear();
                                                                            arrayList6.addAll(arrayList5);
                                                                            o0 o0Var5 = storeViewActivity.f9251h;
                                                                            if (o0Var5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var5 = null;
                                                                            }
                                                                            o0Var5.f35016b.setLayoutManager(linearLayoutManager);
                                                                            o0 o0Var6 = storeViewActivity.f9251h;
                                                                            if (o0Var6 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var6 = null;
                                                                            }
                                                                            RecyclerView recyclerView2 = o0Var6.f35016b;
                                                                            i iVar2 = storeViewActivity.f9252i;
                                                                            if (iVar2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                                iVar2 = null;
                                                                            }
                                                                            recyclerView2.setAdapter(iVar2);
                                                                            String currentUrl = storeInformation.getLogoPicture().getCurrentUrl();
                                                                            o0 o0Var7 = storeViewActivity.f9251h;
                                                                            if (o0Var7 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var7 = null;
                                                                            }
                                                                            r0.y(currentUrl, (ImageView) o0Var7.f35023i, R.drawable.default_logo);
                                                                            o0 o0Var8 = storeViewActivity.f9251h;
                                                                            if (o0Var8 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var8 = null;
                                                                            }
                                                                            ((TextView) o0Var8.l).setText(storeInformation.getStoreNameAndBranch());
                                                                            o0 o0Var9 = storeViewActivity.f9251h;
                                                                            if (o0Var9 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var9 = null;
                                                                            }
                                                                            ((TextView) o0Var9.f35026m).setText(storeInformation.getStoreName());
                                                                            boolean zV = r0.v(storeInformation.getBranch());
                                                                            o0 o0Var10 = storeViewActivity.f9251h;
                                                                            if (zV) {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setVisibility(8);
                                                                            } else {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setText(storeInformation.getBranch());
                                                                                o0 o0Var11 = storeViewActivity.f9251h;
                                                                                if (o0Var11 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var11 = null;
                                                                                }
                                                                                ((TextView) o0Var11.f35019e).setVisibility(0);
                                                                            }
                                                                            o0 o0Var12 = storeViewActivity.f9251h;
                                                                            if (o0Var12 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var12 = null;
                                                                            }
                                                                            ((TextView) o0Var12.f35020f).setText(mv.d.h(storeInformation.getDistance()));
                                                                            o0 o0Var13 = storeViewActivity.f9251h;
                                                                            if (o0Var13 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            } else {
                                                                                o0Var32 = o0Var13;
                                                                            }
                                                                            ((TextView) o0Var32.f35019e).setText(storeInformation.getBranch());
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        Boolean bool = (Boolean) obj;
                                                                        int i17 = StoreViewActivity.f9248o;
                                                                        if (bool != null) {
                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                            if (!storeViewActivity.isFinishing() && !storeViewActivity.isDestroyed()) {
                                                                                if (!zBooleanValue) {
                                                                                    Toast.makeText(storeViewActivity, storeViewActivity.getString(R.string.generic_err_undefined_error), 0).show();
                                                                                }
                                                                                if (storeViewActivity.isTaskRoot()) {
                                                                                    new a0().c(storeViewActivity);
                                                                                } else {
                                                                                    storeViewActivity.finish();
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        o0 o0Var14 = storeViewActivity.f9251h;
                                                                        if (o0Var14 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var14;
                                                                        }
                                                                        p30.b.E((TextView) o0Var32.f35020f, !bool2.booleanValue());
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        });
                                                        this.f9255m = new bq.c(this, bundle);
                                                        g gVarC = C();
                                                        final int i14 = 2;
                                                        gVarC.f48029g.e(this, new b(new Function1(this) { // from class: zp.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ StoreViewActivity f48017b;

                                                            {
                                                                this.f48017b = this;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                ArrayList arrayList;
                                                                ArrayList<BasicItem> arrayList2;
                                                                String title;
                                                                String description;
                                                                int i132 = i14;
                                                                o0 o0Var32 = null;
                                                                StoreViewActivity storeViewActivity = this.f48017b;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i142 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        w0 w0Var = storeViewActivity.f9254k;
                                                                        if (w0Var != null) {
                                                                            w0Var.a();
                                                                        }
                                                                        storeViewActivity.l = false;
                                                                        storeViewActivity.getOnBackPressedDispatcher().d();
                                                                        break;
                                                                    case 1:
                                                                        int i15 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        o0 o0Var4 = storeViewActivity.f9251h;
                                                                        if (o0Var4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var4;
                                                                        }
                                                                        ((ImageButton) o0Var32.f35021g).performClick();
                                                                        break;
                                                                    case 2:
                                                                        StoreInformation storeInformation = (StoreInformation) obj;
                                                                        int i16 = StoreViewActivity.f9248o;
                                                                        if (storeInformation != null) {
                                                                            w0 w0Var2 = storeViewActivity.f9254k;
                                                                            if (w0Var2 != null) {
                                                                                w0Var2.a();
                                                                            }
                                                                            storeViewActivity.l = false;
                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(storeViewActivity);
                                                                            linearLayoutManager.setOrientation(1);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            arrayList3.add(new bq.a(storeViewActivity));
                                                                            LocalHero localHero = storeInformation.getLocalHero();
                                                                            if (localHero != null && (title = localHero.getTitle()) != null && !StringsKt.H(title) && (description = localHero.getDescription()) != null && !StringsKt.H(description)) {
                                                                                arrayList3.add(new bq.f(storeViewActivity, null));
                                                                            }
                                                                            List<BasicItem> items = storeInformation.getItems();
                                                                            if (items != null) {
                                                                                ArrayList arrayList4 = new ArrayList();
                                                                                for (Object obj2 : items) {
                                                                                    if (obj2 instanceof FlashSalesItem) {
                                                                                        arrayList4.add(obj2);
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                for (Object obj3 : arrayList4) {
                                                                                    FlashSalesItem flashSalesItem = (FlashSalesItem) obj3;
                                                                                    if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                                                                                        arrayList.add(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if (cg.q(arrayList)) {
                                                                                arrayList3.add(new bq.d(storeViewActivity));
                                                                            }
                                                                            List<BasicItem> items2 = storeInformation.getItems();
                                                                            if (items2 != null) {
                                                                                arrayList2 = new ArrayList();
                                                                                for (Object obj4 : items2) {
                                                                                    if (!(((BasicItem) obj4) instanceof FlashSalesItem)) {
                                                                                        arrayList2.add(obj4);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList2 = null;
                                                                            }
                                                                            if (cg.q(arrayList2)) {
                                                                                arrayList2.getClass();
                                                                                for (BasicItem basicItem : arrayList2) {
                                                                                    basicItem.getClass();
                                                                                    basicItem.setStoreInfoOrNull(storeInformation);
                                                                                }
                                                                                arrayList3.add(new j(storeViewActivity, arrayList2, (String) storeViewActivity.C().f48026d.a("DISPLAY_TYPE"), (String) storeViewActivity.C().f48026d.a("FILLER_TYPE")));
                                                                            }
                                                                            bq.c cVar2 = storeViewActivity.f9255m;
                                                                            if (cVar2 != null) {
                                                                                arrayList3.add(cVar2);
                                                                            }
                                                                            arrayList3.add(new bq.b(storeViewActivity));
                                                                            storeViewActivity.f9253j = arrayList3;
                                                                            i iVar = new i(storeInformation, new y(2, storeViewActivity.C(), g.class, "openMap", "openMap(DD)V", 0, 9), new b(4, storeViewActivity.C(), g.class, "goToItemDetailsScreen", "goToItemDetailsScreen(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/core/navigation/NavigationOrigin;)V", 0));
                                                                            storeViewActivity.f9252i = iVar;
                                                                            ArrayList arrayList5 = storeViewActivity.f9253j;
                                                                            if (arrayList5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("modules");
                                                                                arrayList5 = null;
                                                                            }
                                                                            arrayList5.getClass();
                                                                            ArrayList arrayList6 = (ArrayList) iVar.f6606e;
                                                                            arrayList6.clear();
                                                                            arrayList6.addAll(arrayList5);
                                                                            o0 o0Var5 = storeViewActivity.f9251h;
                                                                            if (o0Var5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var5 = null;
                                                                            }
                                                                            o0Var5.f35016b.setLayoutManager(linearLayoutManager);
                                                                            o0 o0Var6 = storeViewActivity.f9251h;
                                                                            if (o0Var6 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var6 = null;
                                                                            }
                                                                            RecyclerView recyclerView2 = o0Var6.f35016b;
                                                                            i iVar2 = storeViewActivity.f9252i;
                                                                            if (iVar2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                                iVar2 = null;
                                                                            }
                                                                            recyclerView2.setAdapter(iVar2);
                                                                            String currentUrl = storeInformation.getLogoPicture().getCurrentUrl();
                                                                            o0 o0Var7 = storeViewActivity.f9251h;
                                                                            if (o0Var7 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var7 = null;
                                                                            }
                                                                            r0.y(currentUrl, (ImageView) o0Var7.f35023i, R.drawable.default_logo);
                                                                            o0 o0Var8 = storeViewActivity.f9251h;
                                                                            if (o0Var8 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var8 = null;
                                                                            }
                                                                            ((TextView) o0Var8.l).setText(storeInformation.getStoreNameAndBranch());
                                                                            o0 o0Var9 = storeViewActivity.f9251h;
                                                                            if (o0Var9 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var9 = null;
                                                                            }
                                                                            ((TextView) o0Var9.f35026m).setText(storeInformation.getStoreName());
                                                                            boolean zV = r0.v(storeInformation.getBranch());
                                                                            o0 o0Var10 = storeViewActivity.f9251h;
                                                                            if (zV) {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setVisibility(8);
                                                                            } else {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setText(storeInformation.getBranch());
                                                                                o0 o0Var11 = storeViewActivity.f9251h;
                                                                                if (o0Var11 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var11 = null;
                                                                                }
                                                                                ((TextView) o0Var11.f35019e).setVisibility(0);
                                                                            }
                                                                            o0 o0Var12 = storeViewActivity.f9251h;
                                                                            if (o0Var12 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var12 = null;
                                                                            }
                                                                            ((TextView) o0Var12.f35020f).setText(mv.d.h(storeInformation.getDistance()));
                                                                            o0 o0Var13 = storeViewActivity.f9251h;
                                                                            if (o0Var13 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            } else {
                                                                                o0Var32 = o0Var13;
                                                                            }
                                                                            ((TextView) o0Var32.f35019e).setText(storeInformation.getBranch());
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        Boolean bool = (Boolean) obj;
                                                                        int i17 = StoreViewActivity.f9248o;
                                                                        if (bool != null) {
                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                            if (!storeViewActivity.isFinishing() && !storeViewActivity.isDestroyed()) {
                                                                                if (!zBooleanValue) {
                                                                                    Toast.makeText(storeViewActivity, storeViewActivity.getString(R.string.generic_err_undefined_error), 0).show();
                                                                                }
                                                                                if (storeViewActivity.isTaskRoot()) {
                                                                                    new a0().c(storeViewActivity);
                                                                                } else {
                                                                                    storeViewActivity.finish();
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        o0 o0Var14 = storeViewActivity.f9251h;
                                                                        if (o0Var14 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var14;
                                                                        }
                                                                        p30.b.E((TextView) o0Var32.f35020f, !bool2.booleanValue());
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        }, 12));
                                                        final int i15 = 3;
                                                        gVarC.f48031i.e(this, new b(new Function1(this) { // from class: zp.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ StoreViewActivity f48017b;

                                                            {
                                                                this.f48017b = this;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                ArrayList arrayList;
                                                                ArrayList<BasicItem> arrayList2;
                                                                String title;
                                                                String description;
                                                                int i132 = i15;
                                                                o0 o0Var32 = null;
                                                                StoreViewActivity storeViewActivity = this.f48017b;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i142 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        w0 w0Var = storeViewActivity.f9254k;
                                                                        if (w0Var != null) {
                                                                            w0Var.a();
                                                                        }
                                                                        storeViewActivity.l = false;
                                                                        storeViewActivity.getOnBackPressedDispatcher().d();
                                                                        break;
                                                                    case 1:
                                                                        int i152 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        o0 o0Var4 = storeViewActivity.f9251h;
                                                                        if (o0Var4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var4;
                                                                        }
                                                                        ((ImageButton) o0Var32.f35021g).performClick();
                                                                        break;
                                                                    case 2:
                                                                        StoreInformation storeInformation = (StoreInformation) obj;
                                                                        int i16 = StoreViewActivity.f9248o;
                                                                        if (storeInformation != null) {
                                                                            w0 w0Var2 = storeViewActivity.f9254k;
                                                                            if (w0Var2 != null) {
                                                                                w0Var2.a();
                                                                            }
                                                                            storeViewActivity.l = false;
                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(storeViewActivity);
                                                                            linearLayoutManager.setOrientation(1);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            arrayList3.add(new bq.a(storeViewActivity));
                                                                            LocalHero localHero = storeInformation.getLocalHero();
                                                                            if (localHero != null && (title = localHero.getTitle()) != null && !StringsKt.H(title) && (description = localHero.getDescription()) != null && !StringsKt.H(description)) {
                                                                                arrayList3.add(new bq.f(storeViewActivity, null));
                                                                            }
                                                                            List<BasicItem> items = storeInformation.getItems();
                                                                            if (items != null) {
                                                                                ArrayList arrayList4 = new ArrayList();
                                                                                for (Object obj2 : items) {
                                                                                    if (obj2 instanceof FlashSalesItem) {
                                                                                        arrayList4.add(obj2);
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                for (Object obj3 : arrayList4) {
                                                                                    FlashSalesItem flashSalesItem = (FlashSalesItem) obj3;
                                                                                    if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                                                                                        arrayList.add(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if (cg.q(arrayList)) {
                                                                                arrayList3.add(new bq.d(storeViewActivity));
                                                                            }
                                                                            List<BasicItem> items2 = storeInformation.getItems();
                                                                            if (items2 != null) {
                                                                                arrayList2 = new ArrayList();
                                                                                for (Object obj4 : items2) {
                                                                                    if (!(((BasicItem) obj4) instanceof FlashSalesItem)) {
                                                                                        arrayList2.add(obj4);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList2 = null;
                                                                            }
                                                                            if (cg.q(arrayList2)) {
                                                                                arrayList2.getClass();
                                                                                for (BasicItem basicItem : arrayList2) {
                                                                                    basicItem.getClass();
                                                                                    basicItem.setStoreInfoOrNull(storeInformation);
                                                                                }
                                                                                arrayList3.add(new j(storeViewActivity, arrayList2, (String) storeViewActivity.C().f48026d.a("DISPLAY_TYPE"), (String) storeViewActivity.C().f48026d.a("FILLER_TYPE")));
                                                                            }
                                                                            bq.c cVar2 = storeViewActivity.f9255m;
                                                                            if (cVar2 != null) {
                                                                                arrayList3.add(cVar2);
                                                                            }
                                                                            arrayList3.add(new bq.b(storeViewActivity));
                                                                            storeViewActivity.f9253j = arrayList3;
                                                                            i iVar = new i(storeInformation, new y(2, storeViewActivity.C(), g.class, "openMap", "openMap(DD)V", 0, 9), new b(4, storeViewActivity.C(), g.class, "goToItemDetailsScreen", "goToItemDetailsScreen(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/core/navigation/NavigationOrigin;)V", 0));
                                                                            storeViewActivity.f9252i = iVar;
                                                                            ArrayList arrayList5 = storeViewActivity.f9253j;
                                                                            if (arrayList5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("modules");
                                                                                arrayList5 = null;
                                                                            }
                                                                            arrayList5.getClass();
                                                                            ArrayList arrayList6 = (ArrayList) iVar.f6606e;
                                                                            arrayList6.clear();
                                                                            arrayList6.addAll(arrayList5);
                                                                            o0 o0Var5 = storeViewActivity.f9251h;
                                                                            if (o0Var5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var5 = null;
                                                                            }
                                                                            o0Var5.f35016b.setLayoutManager(linearLayoutManager);
                                                                            o0 o0Var6 = storeViewActivity.f9251h;
                                                                            if (o0Var6 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var6 = null;
                                                                            }
                                                                            RecyclerView recyclerView2 = o0Var6.f35016b;
                                                                            i iVar2 = storeViewActivity.f9252i;
                                                                            if (iVar2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                                iVar2 = null;
                                                                            }
                                                                            recyclerView2.setAdapter(iVar2);
                                                                            String currentUrl = storeInformation.getLogoPicture().getCurrentUrl();
                                                                            o0 o0Var7 = storeViewActivity.f9251h;
                                                                            if (o0Var7 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var7 = null;
                                                                            }
                                                                            r0.y(currentUrl, (ImageView) o0Var7.f35023i, R.drawable.default_logo);
                                                                            o0 o0Var8 = storeViewActivity.f9251h;
                                                                            if (o0Var8 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var8 = null;
                                                                            }
                                                                            ((TextView) o0Var8.l).setText(storeInformation.getStoreNameAndBranch());
                                                                            o0 o0Var9 = storeViewActivity.f9251h;
                                                                            if (o0Var9 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var9 = null;
                                                                            }
                                                                            ((TextView) o0Var9.f35026m).setText(storeInformation.getStoreName());
                                                                            boolean zV = r0.v(storeInformation.getBranch());
                                                                            o0 o0Var10 = storeViewActivity.f9251h;
                                                                            if (zV) {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setVisibility(8);
                                                                            } else {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setText(storeInformation.getBranch());
                                                                                o0 o0Var11 = storeViewActivity.f9251h;
                                                                                if (o0Var11 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var11 = null;
                                                                                }
                                                                                ((TextView) o0Var11.f35019e).setVisibility(0);
                                                                            }
                                                                            o0 o0Var12 = storeViewActivity.f9251h;
                                                                            if (o0Var12 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var12 = null;
                                                                            }
                                                                            ((TextView) o0Var12.f35020f).setText(mv.d.h(storeInformation.getDistance()));
                                                                            o0 o0Var13 = storeViewActivity.f9251h;
                                                                            if (o0Var13 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            } else {
                                                                                o0Var32 = o0Var13;
                                                                            }
                                                                            ((TextView) o0Var32.f35019e).setText(storeInformation.getBranch());
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        Boolean bool = (Boolean) obj;
                                                                        int i17 = StoreViewActivity.f9248o;
                                                                        if (bool != null) {
                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                            if (!storeViewActivity.isFinishing() && !storeViewActivity.isDestroyed()) {
                                                                                if (!zBooleanValue) {
                                                                                    Toast.makeText(storeViewActivity, storeViewActivity.getString(R.string.generic_err_undefined_error), 0).show();
                                                                                }
                                                                                if (storeViewActivity.isTaskRoot()) {
                                                                                    new a0().c(storeViewActivity);
                                                                                } else {
                                                                                    storeViewActivity.finish();
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        o0 o0Var14 = storeViewActivity.f9251h;
                                                                        if (o0Var14 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var14;
                                                                        }
                                                                        p30.b.E((TextView) o0Var32.f35020f, !bool2.booleanValue());
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        }, 12));
                                                        final int i16 = 4;
                                                        gVarC.f48033k.e(this, new b(new Function1(this) { // from class: zp.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ StoreViewActivity f48017b;

                                                            {
                                                                this.f48017b = this;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                ArrayList arrayList;
                                                                ArrayList<BasicItem> arrayList2;
                                                                String title;
                                                                String description;
                                                                int i132 = i16;
                                                                o0 o0Var32 = null;
                                                                StoreViewActivity storeViewActivity = this.f48017b;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i142 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        w0 w0Var = storeViewActivity.f9254k;
                                                                        if (w0Var != null) {
                                                                            w0Var.a();
                                                                        }
                                                                        storeViewActivity.l = false;
                                                                        storeViewActivity.getOnBackPressedDispatcher().d();
                                                                        break;
                                                                    case 1:
                                                                        int i152 = StoreViewActivity.f9248o;
                                                                        ((View) obj).getClass();
                                                                        o0 o0Var4 = storeViewActivity.f9251h;
                                                                        if (o0Var4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var4;
                                                                        }
                                                                        ((ImageButton) o0Var32.f35021g).performClick();
                                                                        break;
                                                                    case 2:
                                                                        StoreInformation storeInformation = (StoreInformation) obj;
                                                                        int i162 = StoreViewActivity.f9248o;
                                                                        if (storeInformation != null) {
                                                                            w0 w0Var2 = storeViewActivity.f9254k;
                                                                            if (w0Var2 != null) {
                                                                                w0Var2.a();
                                                                            }
                                                                            storeViewActivity.l = false;
                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(storeViewActivity);
                                                                            linearLayoutManager.setOrientation(1);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            arrayList3.add(new bq.a(storeViewActivity));
                                                                            LocalHero localHero = storeInformation.getLocalHero();
                                                                            if (localHero != null && (title = localHero.getTitle()) != null && !StringsKt.H(title) && (description = localHero.getDescription()) != null && !StringsKt.H(description)) {
                                                                                arrayList3.add(new bq.f(storeViewActivity, null));
                                                                            }
                                                                            List<BasicItem> items = storeInformation.getItems();
                                                                            if (items != null) {
                                                                                ArrayList arrayList4 = new ArrayList();
                                                                                for (Object obj2 : items) {
                                                                                    if (obj2 instanceof FlashSalesItem) {
                                                                                        arrayList4.add(obj2);
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                for (Object obj3 : arrayList4) {
                                                                                    FlashSalesItem flashSalesItem = (FlashSalesItem) obj3;
                                                                                    if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                                                                                        arrayList.add(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList = null;
                                                                            }
                                                                            if (cg.q(arrayList)) {
                                                                                arrayList3.add(new bq.d(storeViewActivity));
                                                                            }
                                                                            List<BasicItem> items2 = storeInformation.getItems();
                                                                            if (items2 != null) {
                                                                                arrayList2 = new ArrayList();
                                                                                for (Object obj4 : items2) {
                                                                                    if (!(((BasicItem) obj4) instanceof FlashSalesItem)) {
                                                                                        arrayList2.add(obj4);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList2 = null;
                                                                            }
                                                                            if (cg.q(arrayList2)) {
                                                                                arrayList2.getClass();
                                                                                for (BasicItem basicItem : arrayList2) {
                                                                                    basicItem.getClass();
                                                                                    basicItem.setStoreInfoOrNull(storeInformation);
                                                                                }
                                                                                arrayList3.add(new j(storeViewActivity, arrayList2, (String) storeViewActivity.C().f48026d.a("DISPLAY_TYPE"), (String) storeViewActivity.C().f48026d.a("FILLER_TYPE")));
                                                                            }
                                                                            bq.c cVar2 = storeViewActivity.f9255m;
                                                                            if (cVar2 != null) {
                                                                                arrayList3.add(cVar2);
                                                                            }
                                                                            arrayList3.add(new bq.b(storeViewActivity));
                                                                            storeViewActivity.f9253j = arrayList3;
                                                                            i iVar = new i(storeInformation, new y(2, storeViewActivity.C(), g.class, "openMap", "openMap(DD)V", 0, 9), new b(4, storeViewActivity.C(), g.class, "goToItemDetailsScreen", "goToItemDetailsScreen(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/core/navigation/NavigationOrigin;)V", 0));
                                                                            storeViewActivity.f9252i = iVar;
                                                                            ArrayList arrayList5 = storeViewActivity.f9253j;
                                                                            if (arrayList5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("modules");
                                                                                arrayList5 = null;
                                                                            }
                                                                            arrayList5.getClass();
                                                                            ArrayList arrayList6 = (ArrayList) iVar.f6606e;
                                                                            arrayList6.clear();
                                                                            arrayList6.addAll(arrayList5);
                                                                            o0 o0Var5 = storeViewActivity.f9251h;
                                                                            if (o0Var5 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var5 = null;
                                                                            }
                                                                            o0Var5.f35016b.setLayoutManager(linearLayoutManager);
                                                                            o0 o0Var6 = storeViewActivity.f9251h;
                                                                            if (o0Var6 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var6 = null;
                                                                            }
                                                                            RecyclerView recyclerView2 = o0Var6.f35016b;
                                                                            i iVar2 = storeViewActivity.f9252i;
                                                                            if (iVar2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                                iVar2 = null;
                                                                            }
                                                                            recyclerView2.setAdapter(iVar2);
                                                                            String currentUrl = storeInformation.getLogoPicture().getCurrentUrl();
                                                                            o0 o0Var7 = storeViewActivity.f9251h;
                                                                            if (o0Var7 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var7 = null;
                                                                            }
                                                                            r0.y(currentUrl, (ImageView) o0Var7.f35023i, R.drawable.default_logo);
                                                                            o0 o0Var8 = storeViewActivity.f9251h;
                                                                            if (o0Var8 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var8 = null;
                                                                            }
                                                                            ((TextView) o0Var8.l).setText(storeInformation.getStoreNameAndBranch());
                                                                            o0 o0Var9 = storeViewActivity.f9251h;
                                                                            if (o0Var9 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var9 = null;
                                                                            }
                                                                            ((TextView) o0Var9.f35026m).setText(storeInformation.getStoreName());
                                                                            boolean zV = r0.v(storeInformation.getBranch());
                                                                            o0 o0Var10 = storeViewActivity.f9251h;
                                                                            if (zV) {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setVisibility(8);
                                                                            } else {
                                                                                if (o0Var10 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var10 = null;
                                                                                }
                                                                                ((TextView) o0Var10.f35019e).setText(storeInformation.getBranch());
                                                                                o0 o0Var11 = storeViewActivity.f9251h;
                                                                                if (o0Var11 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                    o0Var11 = null;
                                                                                }
                                                                                ((TextView) o0Var11.f35019e).setVisibility(0);
                                                                            }
                                                                            o0 o0Var12 = storeViewActivity.f9251h;
                                                                            if (o0Var12 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                o0Var12 = null;
                                                                            }
                                                                            ((TextView) o0Var12.f35020f).setText(mv.d.h(storeInformation.getDistance()));
                                                                            o0 o0Var13 = storeViewActivity.f9251h;
                                                                            if (o0Var13 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                            } else {
                                                                                o0Var32 = o0Var13;
                                                                            }
                                                                            ((TextView) o0Var32.f35019e).setText(storeInformation.getBranch());
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        Boolean bool = (Boolean) obj;
                                                                        int i17 = StoreViewActivity.f9248o;
                                                                        if (bool != null) {
                                                                            boolean zBooleanValue = bool.booleanValue();
                                                                            if (!storeViewActivity.isFinishing() && !storeViewActivity.isDestroyed()) {
                                                                                if (!zBooleanValue) {
                                                                                    Toast.makeText(storeViewActivity, storeViewActivity.getString(R.string.generic_err_undefined_error), 0).show();
                                                                                }
                                                                                if (storeViewActivity.isTaskRoot()) {
                                                                                    new a0().c(storeViewActivity);
                                                                                } else {
                                                                                    storeViewActivity.finish();
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        o0 o0Var14 = storeViewActivity.f9251h;
                                                                        if (o0Var14 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                        } else {
                                                                            o0Var32 = o0Var14;
                                                                        }
                                                                        p30.b.E((TextView) o0Var32.f35020f, !bool2.booleanValue());
                                                                        break;
                                                                }
                                                                return Unit.f26487a;
                                                            }
                                                        }, 12));
                                                        c cVar2 = this.f9250g;
                                                        if (cVar2 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                            cVar2 = null;
                                                        }
                                                        c.b(cVar2, this, null, 6);
                                                        this.l = true;
                                                        g gVarC2 = C();
                                                        v80.f0.B(m1.d(gVarC2), null, null, new k(gVarC2, cVar, 7), 3);
                                                        C().f48024b.b(cv.i.SCREEN_STORE);
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
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // qs.a, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        bq.c cVar = this.f9255m;
        if (cVar != null) {
            f fVar = cVar.f6584e;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
                fVar = null;
            }
            fVar.c();
        }
        this.f9256n.remove();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w0 w0Var = this.f9254k;
        if (w0Var != null) {
            w0Var.a();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        bq.c cVar = this.f9255m;
        if (cVar != null) {
            f fVar = cVar.f6584e;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
                fVar = null;
            }
            fVar.d();
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onPause() {
        super.onPause();
        bq.c cVar = this.f9255m;
        if (cVar != null) {
            f fVar = cVar.f6584e;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
                fVar = null;
            }
            fVar.e();
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        bq.c cVar = this.f9255m;
        if (cVar != null) {
            f fVar = cVar.f6584e;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
                fVar = null;
            }
            fVar.f();
        }
        if (C().f48029g.d() != null) {
            C().f48024b.b(cv.i.SCREEN_STORE);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bq.c cVar = this.f9255m;
        if (cVar != null) {
            bundle.getClass();
            f fVar = cVar.f6584e;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
                fVar = null;
            }
            fVar.g(bundle);
        }
        super.onSaveInstanceState(bundle);
    }
}
