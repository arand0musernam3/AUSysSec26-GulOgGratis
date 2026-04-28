package en;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.app.tgtg.R;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import mv.a0;
import mv.e0;
import mv.z;
import y00.d0;
import yi.f0;
import yi.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends k.h implements zi.e, r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile p70.b f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f16141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16143f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i11) {
        this((short) 0);
        this.f16142e = i11;
        switch (i11) {
            case 1:
                this((short) 0);
                this.f16143f = false;
                addOnContextAvailableListener(new k.g((ItemViewActivity) this, 10));
                break;
            case 2:
                this((short) 0);
                this.f16143f = false;
                addOnContextAvailableListener(new k.g((CateringItemDetailsActivity) this, 18));
                break;
            case 3:
                this((short) 0);
                this.f16143f = false;
                addOnContextAvailableListener(new k.g((ParcelBasketActivity) this, 20));
                break;
            default:
                this.f16143f = false;
                addOnContextAvailableListener(new ah.m((ManufacturerItemDetailsActivity) this, 12));
                break;
        }
    }

    public final p70.b A() {
        if (this.f16139b == null) {
            synchronized (this.f16140c) {
                try {
                    if (this.f16139b == null) {
                        this.f16139b = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f16139b;
    }

    public final f0 B() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("PaymentFragment");
        if (fragmentFindFragmentByTag instanceof f0) {
            return (f0) fragmentFindFragmentByTag;
        }
        return null;
    }

    public final void C(Activity activity, boolean z11) {
        if (!z11) {
            finish();
            return;
        }
        a0 a0Var = new a0();
        z zVar = z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        a0Var.f30145h = R.anim.slide_in_from_left_to_right;
        a0Var.f30146i = R.anim.slide_out_from_left_to_right;
        a0Var.f30144g = true;
        a0Var.c(activity);
    }

    public final void D() {
        switch (this.f16142e) {
            case 0:
                if (!this.f16143f) {
                    this.f16143f = true;
                    ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) this;
                    ag.i iVar = ((ag.b) ((l) a())).f1288a;
                    manufacturerItemDetailsActivity.f9138g = (e0) iVar.f1327i0.get();
                    manufacturerItemDetailsActivity.f9139h = (e70.c) iVar.f1325h0.get();
                }
                break;
            case 1:
                if (!this.f16143f) {
                    this.f16143f = true;
                    ItemViewActivity itemViewActivity = (ItemViewActivity) this;
                    ag.i iVar2 = ((ag.b) ((qk.c) a())).f1288a;
                    itemViewActivity.f9012g = (e70.c) iVar2.f1325h0.get();
                    itemViewActivity.f9013h = (f70.g) iVar2.f1321f0.get();
                }
                break;
            case 2:
                if (!this.f16143f) {
                    this.f16143f = true;
                    ((CateringItemDetailsActivity) this).f8973g = (e70.c) ((ag.b) ((uh.f) a())).f1288a.f1325h0.get();
                }
                break;
            default:
                if (!this.f16143f) {
                    this.f16143f = true;
                    ParcelBasketActivity parcelBasketActivity = (ParcelBasketActivity) this;
                    ag.i iVar3 = ((ag.b) ((um.k) a())).f1288a;
                    parcelBasketActivity.f9112g = (e70.c) iVar3.f1325h0.get();
                    parcelBasketActivity.f9114i = (e0) iVar3.f1327i0.get();
                }
                break;
        }
    }

    @Override // r70.b
    public final Object a() {
        return A().a();
    }

    @Override // k.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Resources resources;
        Resources resources2;
        if (context == null || (resources2 = context.getResources()) == null || (configuration = resources2.getConfiguration()) == null) {
            configuration = new Configuration((context == null || (resources = context.getResources()) == null) ? null : resources.getConfiguration());
        }
        configuration.fontScale = 1.0f;
        applyOverrideConfiguration(configuration);
        super.attachBaseContext(context);
    }

    @Override // zi.e
    public final void e(boolean z11, BasicItem basicItem, aj.c cVar, String str) {
        d0.d(z11, basicItem, cVar, str, new sg.a(this, 2)).show(getSupportFragmentManager(), "CHECKOUT");
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zi.e
    public final void k(boolean z11, BasicItem basicItem, aj.c cVar, boolean z12, String str) {
        d0.b(z11, basicItem, cVar, str, z12, new sg.a(this, 1)).show(getSupportFragmentManager(), "CHECKOUT");
    }

    @Override // zi.e
    public final void n(boolean z11, BasicItem basicItem, aj.c cVar, String str) {
        sg.a aVar = new sg.a(this, 3);
        r rVar = new r();
        rVar.f46020k = aVar;
        rVar.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ITEM", basicItem);
        bundle.putString("RETURN_URL", str);
        bundle.putBoolean("NO_PROVIDER_INSTALLED", true);
        bundle.putBoolean("IS_MULTI_ITEM", z11);
        bundle.putParcelable("BASKET_CHECKOUT_DATA", cVar);
        rVar.setArguments(bundle);
        rVar.show(getSupportFragmentManager(), "CHECKOUT");
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A().d();
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A().b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
    }

    public final void z(ResumePaymentData resumePaymentData) {
        if (!getIntent().getBooleanExtra("RESUME_PAYMENT_FLOW", false) || resumePaymentData == null) {
            return;
        }
        PaymentMethods selectedPaymentMethods = resumePaymentData.getSelectedPaymentMethods();
        String returnUrl = resumePaymentData.getReturnUrl();
        String strM194getItemIdRWxzYZM = resumePaymentData.m194getItemIdRWxzYZM();
        boolean zIsMultiItem = resumePaymentData.isMultiItem();
        aj.c basketCheckoutData = resumePaymentData.getBasketCheckoutData();
        sg.a aVar = new sg.a(this, 0);
        selectedPaymentMethods.getClass();
        returnUrl.getClass();
        f0 f0Var = new f0();
        f0Var.f45990p = aVar;
        f0Var.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("selectedPaymentMethod", selectedPaymentMethods);
        bundle.putBoolean("resumePaymentFlow", true);
        bundle.putString("returnUrl", returnUrl);
        bundle.putParcelable("itemId", strM194getItemIdRWxzYZM != null ? ItemId.m197boximpl(strM194getItemIdRWxzYZM) : null);
        bundle.putString("shippingId", null);
        bundle.putBoolean("isMultiItem", zIsMultiItem);
        bundle.putParcelable("basketCheckoutData", basketCheckoutData);
        f0Var.setArguments(bundle);
        f0Var.show(getSupportFragmentManager(), "PaymentFragment");
    }

    public g(short s7) {
        this.f16140c = new Object();
        addOnContextAvailableListener(new k.g(this, 15));
    }
}
