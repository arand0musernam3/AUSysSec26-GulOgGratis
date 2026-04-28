package com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui;

import a3.p;
import ah.m;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import av.e;
import ax.s;
import bg.k0;
import bg.m0;
import bs.f;
import bs.i;
import bs.o;
import c50.w;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import java.util.List;
import k.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.d;
import o30.f0;
import p70.b;
import pd.g;
import pg.b1;
import pg.x0;
import r70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class HiddenStoresActivity extends h implements c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9412k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9414c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9415d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f9416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f9418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HiddenStoresActivity$setUpViews$1$2 f9419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9421j;

    public HiddenStoresActivity() {
        addOnContextAvailableListener(new m(this, 5));
        this.f9417f = new n1(Reflection.getOrCreateKotlinClass(o.class), new f(this, 1), new f(this, 0), new f(this, 2));
        this.f9421j = new e0(this, 4);
    }

    public final o A() {
        return (o) this.f9417f.getValue();
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final void C() {
        super.onDestroy();
        z().b();
    }

    public final void D() {
        x0 x0Var = this.f9416e;
        x0 x0Var2 = null;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x0Var = null;
        }
        x0Var.f35268i.setText(R.string.unlock_hidden_store_error);
        x0 x0Var3 = this.f9416e;
        if (x0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x0Var3 = null;
        }
        x0Var3.f35268i.setVisibility(0);
        x0 x0Var4 = this.f9416e;
        if (x0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x0Var2 = x0Var4;
        }
        ((TGTGLoadingView) x0Var2.f35269j).setVisibility(8);
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [bs.a] */
    /* JADX WARN: Type inference failed for: r7v7, types: [bs.a] */
    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        B(bundle);
        x0 x0Var = null;
        final int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.hidden_stores_view, (ViewGroup) null, false);
        int i12 = R.id.btnUnlockStore;
        Button button = (Button) g.t(R.id.btnUnlockStore, viewInflate);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i12 = R.id.itemList;
            RecyclerView recyclerView = (RecyclerView) g.t(R.id.itemList, viewInflate);
            if (recyclerView != null) {
                i12 = R.id.llContent;
                if (((LinearLayout) g.t(R.id.llContent, viewInflate)) != null) {
                    i12 = R.id.loadingView;
                    TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) g.t(R.id.loadingView, viewInflate);
                    if (tGTGLoadingView != null) {
                        i12 = R.id.lottieAnimation;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) g.t(R.id.lottieAnimation, viewInflate);
                        if (lottieAnimationView != null) {
                            i12 = R.id.textField;
                            EditText editText = (EditText) g.t(R.id.textField, viewInflate);
                            if (editText != null) {
                                i12 = R.id.toolbar;
                                View viewT = g.t(R.id.toolbar, viewInflate);
                                if (viewT != null) {
                                    b1 b1VarC = b1.c(viewT);
                                    i12 = R.id.tvDescription;
                                    TextView textView = (TextView) g.t(R.id.tvDescription, viewInflate);
                                    if (textView != null) {
                                        i12 = R.id.tvError;
                                        TextView textView2 = (TextView) g.t(R.id.tvError, viewInflate);
                                        if (textView2 != null) {
                                            i12 = R.id.tvHaveCode;
                                            if (((TextView) g.t(R.id.tvHaveCode, viewInflate)) != null) {
                                                this.f9416e = new x0(constraintLayout, button, recyclerView, tGTGLoadingView, lottieAnimationView, editText, b1VarC, textView, textView2);
                                                setContentView(constraintLayout);
                                                getOnBackPressedDispatcher().a(this.f9421j);
                                                String stringExtra = getIntent().getStringExtra("CODE");
                                                if (stringExtra == null) {
                                                    stringExtra = "";
                                                }
                                                x0 x0Var2 = this.f9416e;
                                                if (x0Var2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    x0Var2 = null;
                                                }
                                                Button button2 = (Button) x0Var2.f35265f;
                                                EditText editText2 = (EditText) x0Var2.f35266g;
                                                d.x(button2, new p(14, this, x0Var2));
                                                final int i13 = 2;
                                                ((ImageButton) ((b1) x0Var2.f35267h).f34797e).setOnClickListener(new pt.c(new Consumer(this) { // from class: bs.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ HiddenStoresActivity f6666b;

                                                    {
                                                        this.f6666b = this;
                                                    }

                                                    @Override // androidx.core.util.Consumer
                                                    public final void accept(Object obj) {
                                                        int i14 = i13;
                                                        HiddenStoresActivity hiddenStoresActivity = this.f6666b;
                                                        switch (i14) {
                                                            case 0:
                                                                BasicItem basicItem = (BasicItem) obj;
                                                                int i15 = HiddenStoresActivity.f9412k;
                                                                basicItem.getClass();
                                                                k0 k0Var = new k0(hiddenStoresActivity);
                                                                k0Var.e(R.string.hidden_stores_remove_popup);
                                                                k0Var.c(R.string.hidden_stores_remove_popup_yes);
                                                                k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                                k0Var.l = new b(0, hiddenStoresActivity, basicItem);
                                                                k0Var.b(R.string.hidden_stores_remove_popup_no);
                                                                k0Var.f();
                                                                break;
                                                            case 1:
                                                                BasicItem basicItem2 = (BasicItem) obj;
                                                                int i16 = HiddenStoresActivity.f9412k;
                                                                basicItem2.getClass();
                                                                av.c cVar = hiddenStoresActivity.A().f6699e;
                                                                Class clsS = mv.d.s(basicItem2);
                                                                Bundle bundle2 = new Bundle();
                                                                bundle2.putParcelable("ITEM", basicItem2);
                                                                bundle2.putParcelable("ITEM_ID", ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                                                                cVar.k(new av.a(clsS, bundle2, 60));
                                                                break;
                                                            default:
                                                                int i17 = HiddenStoresActivity.f9412k;
                                                                ((View) obj).getClass();
                                                                hiddenStoresActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                }));
                                                final int i14 = 1;
                                                editText2.setOnEditorActionListener(new m0(x0Var2, 1));
                                                if (!this.f9420i) {
                                                    this.f9420i = true;
                                                    editText2.addTextChangedListener(new fl.f(new bs.c(i11, x0Var2, this), 3));
                                                }
                                                final x0 x0Var3 = this.f9416e;
                                                if (x0Var3 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    x0Var3 = null;
                                                }
                                                p0 p0Var = new p0() { // from class: bs.d
                                                    @Override // androidx.lifecycle.p0
                                                    public final void a(Object obj) {
                                                        int i15 = i11;
                                                        i iVar = null;
                                                        HiddenStoresActivity hiddenStoresActivity = this;
                                                        x0 x0Var4 = x0Var3;
                                                        switch (i15) {
                                                            case 0:
                                                                int iIntValue = ((Integer) obj).intValue();
                                                                int i16 = HiddenStoresActivity.f9412k;
                                                                TGTGLoadingView tGTGLoadingView2 = (TGTGLoadingView) x0Var4.f35269j;
                                                                ImageButton imageButton = (ImageButton) ((b1) x0Var4.f35267h).f34796d;
                                                                tGTGLoadingView2.setVisibility(8);
                                                                if (iIntValue == 0) {
                                                                    imageButton.setImageResource(R.drawable.ic_pen_light_icon);
                                                                    imageButton.setContentDescription(hiddenStoresActivity.getString(R.string.hidden_store_voice_over_edit));
                                                                    imageButton.setVisibility(0);
                                                                } else if (iIntValue == 1) {
                                                                    imageButton.setImageResource(R.drawable.ic_done);
                                                                    imageButton.setContentDescription(hiddenStoresActivity.getString(R.string.hidden_store_voice_over_save));
                                                                    imageButton.setVisibility(0);
                                                                } else if (iIntValue == 2) {
                                                                    imageButton.setVisibility(4);
                                                                    ((RecyclerView) x0Var4.f35262c).setVisibility(8);
                                                                }
                                                                i iVar2 = hiddenStoresActivity.f9418g;
                                                                if (iVar2 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                } else {
                                                                    iVar = iVar2;
                                                                }
                                                                iVar.f6679a = iIntValue;
                                                                iVar.notifyDataSetChanged();
                                                                break;
                                                            default:
                                                                List list = (List) obj;
                                                                int i17 = HiddenStoresActivity.f9412k;
                                                                list.getClass();
                                                                if (!list.isEmpty()) {
                                                                    i iVar3 = hiddenStoresActivity.f9418g;
                                                                    if (iVar3 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                    } else {
                                                                        iVar = iVar3;
                                                                    }
                                                                    iVar.getClass();
                                                                    ArrayList arrayList = iVar.f6680b;
                                                                    arrayList.clear();
                                                                    arrayList.addAll(list);
                                                                    ((LottieAnimationView) x0Var4.f35264e).setVisibility(8);
                                                                    x0Var4.f35263d.setVisibility(8);
                                                                    RecyclerView recyclerView2 = (RecyclerView) x0Var4.f35262c;
                                                                    recyclerView2.setAlpha(1.0f);
                                                                    recyclerView2.setVisibility(0);
                                                                    ((o0) hiddenStoresActivity.A().f6697c.getValue()).k(0);
                                                                } else {
                                                                    ((LottieAnimationView) x0Var4.f35264e).setVisibility(0);
                                                                    x0Var4.f35263d.setVisibility(0);
                                                                    ((RecyclerView) x0Var4.f35262c).setVisibility(8);
                                                                    ((LottieAnimationView) x0Var4.f35264e).e();
                                                                    ((o0) hiddenStoresActivity.A().f6697c.getValue()).k(2);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                };
                                                p0 p0Var2 = new p0() { // from class: bs.d
                                                    @Override // androidx.lifecycle.p0
                                                    public final void a(Object obj) {
                                                        int i15 = i14;
                                                        i iVar = null;
                                                        HiddenStoresActivity hiddenStoresActivity = this;
                                                        x0 x0Var4 = x0Var3;
                                                        switch (i15) {
                                                            case 0:
                                                                int iIntValue = ((Integer) obj).intValue();
                                                                int i16 = HiddenStoresActivity.f9412k;
                                                                TGTGLoadingView tGTGLoadingView2 = (TGTGLoadingView) x0Var4.f35269j;
                                                                ImageButton imageButton = (ImageButton) ((b1) x0Var4.f35267h).f34796d;
                                                                tGTGLoadingView2.setVisibility(8);
                                                                if (iIntValue == 0) {
                                                                    imageButton.setImageResource(R.drawable.ic_pen_light_icon);
                                                                    imageButton.setContentDescription(hiddenStoresActivity.getString(R.string.hidden_store_voice_over_edit));
                                                                    imageButton.setVisibility(0);
                                                                } else if (iIntValue == 1) {
                                                                    imageButton.setImageResource(R.drawable.ic_done);
                                                                    imageButton.setContentDescription(hiddenStoresActivity.getString(R.string.hidden_store_voice_over_save));
                                                                    imageButton.setVisibility(0);
                                                                } else if (iIntValue == 2) {
                                                                    imageButton.setVisibility(4);
                                                                    ((RecyclerView) x0Var4.f35262c).setVisibility(8);
                                                                }
                                                                i iVar2 = hiddenStoresActivity.f9418g;
                                                                if (iVar2 == null) {
                                                                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                } else {
                                                                    iVar = iVar2;
                                                                }
                                                                iVar.f6679a = iIntValue;
                                                                iVar.notifyDataSetChanged();
                                                                break;
                                                            default:
                                                                List list = (List) obj;
                                                                int i17 = HiddenStoresActivity.f9412k;
                                                                list.getClass();
                                                                if (!list.isEmpty()) {
                                                                    i iVar3 = hiddenStoresActivity.f9418g;
                                                                    if (iVar3 == null) {
                                                                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                                                    } else {
                                                                        iVar = iVar3;
                                                                    }
                                                                    iVar.getClass();
                                                                    ArrayList arrayList = iVar.f6680b;
                                                                    arrayList.clear();
                                                                    arrayList.addAll(list);
                                                                    ((LottieAnimationView) x0Var4.f35264e).setVisibility(8);
                                                                    x0Var4.f35263d.setVisibility(8);
                                                                    RecyclerView recyclerView2 = (RecyclerView) x0Var4.f35262c;
                                                                    recyclerView2.setAlpha(1.0f);
                                                                    recyclerView2.setVisibility(0);
                                                                    ((o0) hiddenStoresActivity.A().f6697c.getValue()).k(0);
                                                                } else {
                                                                    ((LottieAnimationView) x0Var4.f35264e).setVisibility(0);
                                                                    x0Var4.f35263d.setVisibility(0);
                                                                    ((RecyclerView) x0Var4.f35262c).setVisibility(8);
                                                                    ((LottieAnimationView) x0Var4.f35264e).e();
                                                                    ((o0) hiddenStoresActivity.A().f6697c.getValue()).k(2);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                };
                                                al.i iVar = new al.i(this, i14);
                                                o oVarA = A();
                                                ((o0) oVarA.f6697c.getValue()).e(this, p0Var);
                                                ((o0) oVarA.f6698d.getValue()).e(this, p0Var2);
                                                oVarA.f6699e.e(this, iVar);
                                                ((e) A().f6700f.getValue()).e(this, new al.c(new a3.x0(this, 29), 4));
                                                x0 x0Var4 = this.f9416e;
                                                if (x0Var4 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                } else {
                                                    x0Var = x0Var4;
                                                }
                                                b1 b1Var = (b1) x0Var.f35267h;
                                                ImageButton imageButton = (ImageButton) b1Var.f34796d;
                                                RecyclerView recyclerView2 = (RecyclerView) x0Var.f35262c;
                                                EditText editText3 = (EditText) x0Var.f35266g;
                                                ((TextView) b1Var.f34795c).setText(R.string.hidden_stores_toolbar_title);
                                                imageButton.setVisibility(8);
                                                i iVar2 = new i(this);
                                                iVar2.f6681c = new Consumer(this) { // from class: bs.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ HiddenStoresActivity f6666b;

                                                    {
                                                        this.f6666b = this;
                                                    }

                                                    @Override // androidx.core.util.Consumer
                                                    public final void accept(Object obj) {
                                                        int i142 = i11;
                                                        HiddenStoresActivity hiddenStoresActivity = this.f6666b;
                                                        switch (i142) {
                                                            case 0:
                                                                BasicItem basicItem = (BasicItem) obj;
                                                                int i15 = HiddenStoresActivity.f9412k;
                                                                basicItem.getClass();
                                                                k0 k0Var = new k0(hiddenStoresActivity);
                                                                k0Var.e(R.string.hidden_stores_remove_popup);
                                                                k0Var.c(R.string.hidden_stores_remove_popup_yes);
                                                                k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                                k0Var.l = new b(0, hiddenStoresActivity, basicItem);
                                                                k0Var.b(R.string.hidden_stores_remove_popup_no);
                                                                k0Var.f();
                                                                break;
                                                            case 1:
                                                                BasicItem basicItem2 = (BasicItem) obj;
                                                                int i16 = HiddenStoresActivity.f9412k;
                                                                basicItem2.getClass();
                                                                av.c cVar = hiddenStoresActivity.A().f6699e;
                                                                Class clsS = mv.d.s(basicItem2);
                                                                Bundle bundle2 = new Bundle();
                                                                bundle2.putParcelable("ITEM", basicItem2);
                                                                bundle2.putParcelable("ITEM_ID", ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                                                                cVar.k(new av.a(clsS, bundle2, 60));
                                                                break;
                                                            default:
                                                                int i17 = HiddenStoresActivity.f9412k;
                                                                ((View) obj).getClass();
                                                                hiddenStoresActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                };
                                                iVar2.f6682d = new Consumer(this) { // from class: bs.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ HiddenStoresActivity f6666b;

                                                    {
                                                        this.f6666b = this;
                                                    }

                                                    @Override // androidx.core.util.Consumer
                                                    public final void accept(Object obj) {
                                                        int i142 = i14;
                                                        HiddenStoresActivity hiddenStoresActivity = this.f6666b;
                                                        switch (i142) {
                                                            case 0:
                                                                BasicItem basicItem = (BasicItem) obj;
                                                                int i15 = HiddenStoresActivity.f9412k;
                                                                basicItem.getClass();
                                                                k0 k0Var = new k0(hiddenStoresActivity);
                                                                k0Var.e(R.string.hidden_stores_remove_popup);
                                                                k0Var.c(R.string.hidden_stores_remove_popup_yes);
                                                                k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                                                                k0Var.l = new b(0, hiddenStoresActivity, basicItem);
                                                                k0Var.b(R.string.hidden_stores_remove_popup_no);
                                                                k0Var.f();
                                                                break;
                                                            case 1:
                                                                BasicItem basicItem2 = (BasicItem) obj;
                                                                int i16 = HiddenStoresActivity.f9412k;
                                                                basicItem2.getClass();
                                                                av.c cVar = hiddenStoresActivity.A().f6699e;
                                                                Class clsS = mv.d.s(basicItem2);
                                                                Bundle bundle2 = new Bundle();
                                                                bundle2.putParcelable("ITEM", basicItem2);
                                                                bundle2.putParcelable("ITEM_ID", ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                                                                cVar.k(new av.a(clsS, bundle2, 60));
                                                                break;
                                                            default:
                                                                int i17 = HiddenStoresActivity.f9412k;
                                                                ((View) obj).getClass();
                                                                hiddenStoresActivity.getOnBackPressedDispatcher().d();
                                                                break;
                                                        }
                                                    }
                                                };
                                                this.f9418g = iVar2;
                                                recyclerView2.setAdapter(iVar2);
                                                this.f9419h = new HiddenStoresActivity$setUpViews$1$2(this);
                                                recyclerView2.setAdapter(recyclerView2.getAdapter());
                                                recyclerView2.setLayoutManager(this.f9419h);
                                                recyclerView2.i(new bs.e(i11));
                                                recyclerView2.setItemAnimator(new r());
                                                imageButton.setVisibility(8);
                                                imageButton.setImageResource(R.drawable.ic_pen_light_icon);
                                                imageButton.setContentDescription(getString(R.string.hidden_store_voice_over_edit));
                                                imageButton.setOnClickListener(new s(this, 7));
                                                editText3.setText(stringExtra);
                                                editText3.setHint(R.string.hidden_stores_hint);
                                                editText3.setInputType(524289);
                                                editText3.setFocusable(true);
                                                editText3.setFocusableInTouchMode(true);
                                                f0.S(this, true);
                                                A().a();
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
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        C();
        this.f9421j.remove();
    }

    public final b z() {
        if (this.f9413b == null) {
            synchronized (this.f9414c) {
                try {
                    if (this.f9413b == null) {
                        this.f9413b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9413b;
    }
}
