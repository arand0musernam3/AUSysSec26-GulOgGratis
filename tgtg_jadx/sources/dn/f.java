package dn;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import b0.q;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketRequest;
import com.app.tgtg.model.remote.payment.Price;
import com.google.firebase.messaging.r;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import pg.c2;
import v80.f0;
import v80.p0;
import ym.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f14994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f14995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f14996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BasketManager f14997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Price f14998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f14999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f15000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f15001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Price f15002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Price f15004k;
    public Boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Price f15005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15006n;

    public f(c2 c2Var, w wVar) {
        c2Var.getClass();
        wVar.getClass();
        this.f14994a = c2Var;
        this.f14995b = wVar;
    }

    public final void a(boolean z11) {
        float f11 = z11 ? 1.2f : 1.0f;
        float f12 = z11 ? 1.0f : 1.2f;
        c2 c2Var = this.f14994a;
        c2Var.f34818v.clearAnimation();
        ScaleAnimation scaleAnimation = new ScaleAnimation(f11, f12, f11, f12, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setAnimationListener(new c70.a(new cp.i(16), new q(z11, this)));
        if (z11) {
            c2Var.f34817u.startAnimation(scaleAnimation);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new r(8, this, scaleAnimation), 200L);
        }
    }

    public final void b(final boolean z11) {
        if (this.f15005m != null || z11) {
            final int iG = g(z11);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, d70.b.a(36), 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new c70.a(new a(this, 2), new Function1() { // from class: dn.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((Animation) obj).getClass();
                    int i11 = iG;
                    f fVar = this;
                    if (i11 == 0) {
                        fVar.d(z11);
                    } else {
                        new Handler(Looper.getMainLooper()).postDelayed(new c(fVar, 2), i11);
                    }
                    return Unit.f26487a;
                }
            }));
            new Handler(Looper.getMainLooper()).post(new b(this, translateAnimation, 2));
        }
    }

    public final void c(boolean z11, boolean z12) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, d70.b.a(36));
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new c70.a(new cp.i(15), new a3.c(1, this, z12, z11)));
        new Handler(Looper.getMainLooper()).postDelayed(new b(this, translateAnimation, 1), 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r12) {
        /*
            r11 = this;
            com.app.tgtg.model.remote.payment.Price r0 = r11.f14998e
            r1 = 0
            if (r0 == 0) goto Lb
            double r3 = r0.getValue()
            goto Lc
        Lb:
            r3 = r1
        Lc:
            com.app.tgtg.model.remote.payment.Price r0 = r11.f15002i
            if (r0 == 0) goto L15
            double r5 = r0.getValue()
            goto L16
        L15:
            r5 = r1
        L16:
            if (r12 == 0) goto L23
            com.app.tgtg.model.remote.payment.Price r0 = r11.f15004k
            if (r0 == 0) goto L21
            double r7 = r0.getValue()
            goto L2b
        L21:
            r7 = r1
            goto L2b
        L23:
            com.app.tgtg.model.remote.payment.Price r0 = r11.f15005m
            if (r0 == 0) goto L21
            double r7 = r0.getValue()
        L2b:
            kotlin.Pair r0 = new kotlin.Pair
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 100
            if (r1 != 0) goto L35
            r3 = r2
            goto L3d
        L35:
            double r3 = r3 / r7
            double r9 = (double) r2
            double r3 = r3 * r9
            int r3 = (int) r3
            int r3 = java.lang.Math.min(r3, r2)
        L3d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r1 != 0) goto L44
            goto L4c
        L44:
            double r5 = r5 / r7
            double r7 = (double) r2
            double r5 = r5 * r7
            int r1 = (int) r5
            int r2 = java.lang.Math.min(r1, r2)
        L4c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r3, r1)
            pg.c2 r2 = r11.f14994a
            android.widget.ProgressBar r4 = r2.D
            android.widget.ProgressBar r2 = r2.D
            r4.clearAnimation()
            r4 = 0
            r2.setVisibility(r4)
            int r3 = r3.intValue()
            int r1 = r1.intValue()
            int[] r1 = new int[]{r3, r1}
            java.lang.String r3 = "progress"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r3, r1)
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
            dn.e r2 = new dn.e
            r2.<init>(r12, r11, r0)
            r1.addListener(r2)
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r12.<init>(r0)
            d1.e r0 = new d1.e
            r2 = 3
            r0.<init>(r1, r2)
            r12.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.f.d(boolean):void");
    }

    public final void e() {
        boolean z11 = (this.f15003j && Intrinsics.areEqual(this.f14999f, Boolean.TRUE) && this.f15005m != null) ? false : true;
        if (!this.f15006n) {
            b(z11);
        } else {
            g(z11);
            d(z11);
        }
    }

    public final void f(int i11, String str) {
        BasketManager basketManager;
        String countryId;
        BasketManager basketManagerRestoreBasketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(str, i11);
        this.f14997d = basketManagerRestoreBasketManager;
        x70.c cVar = null;
        if (this.f15000g == null) {
            this.f15000g = basketManagerRestoreBasketManager != null ? Integer.valueOf(basketManagerRestoreBasketManager.getTotalBasketItems()) : null;
        }
        BasketManager basketManager2 = this.f14997d;
        if ((basketManager2 != null && basketManager2.getTotalBasketItems() == 0) || (basketManager = this.f14997d) == null || (countryId = basketManager.getCountryId()) == null || countryId.length() <= 0) {
            this.f14996c = null;
            this.f14998e = null;
            this.f14999f = null;
            this.f15001h = null;
            this.f15006n = false;
            c2 c2Var = this.f14994a;
            ConstraintLayout constraintLayout = c2Var.f34816t;
            constraintLayout.getClass();
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = c2Var.f34819w;
            constraintLayout2.getClass();
            constraintLayout2.setVisibility(8);
            h(false);
            return;
        }
        BasketManager basketManager3 = this.f14997d;
        String countryId2 = basketManager3 != null ? basketManager3.getCountryId() : null;
        if (countryId2 == null) {
            countryId2 = "";
        }
        BasketManager basketManager4 = this.f14997d;
        List<BasketBriefItem> basketItems = basketManager4 != null ? basketManager4.getBasketItems() : null;
        if (basketItems == null) {
            basketItems = n0.f26529a;
        }
        BasketRequest basketRequest = new BasketRequest(countryId2, basketItems);
        w wVar = this.f14995b;
        wVar.getClass();
        wVar.f46262j.i(Boolean.TRUE);
        a9.a aVarD = m1.d(wVar);
        wVar.f46259g.getClass();
        c90.f fVar = p0.f42144a;
        f0.B(aVarD, c90.e.f7834b, null, new tm.d(wVar, basketRequest, cVar, 27), 2);
    }

    public final int g(boolean z11) {
        Price price;
        Price price2;
        c2 c2Var = this.f14994a;
        TextView textView = c2Var.f34815s;
        ProgressBar progressBar = c2Var.D;
        View view = c2Var.f986f;
        String strG = null;
        int i11 = 0;
        if (z11) {
            if (!this.f15003j) {
                progressBar.getClass();
                progressBar.setVisibility(0);
                Price price3 = this.f15004k;
                if (price3 != null && (price2 = this.f15002i) != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String strG2 = androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_banner_add_for_checkout);
                    strG2.getClass();
                    strG = String.format(strG2, Arrays.copyOf(new Object[]{mv.d.i(new Price(price3.getCurrency(), price3.getDecimals(), price3.getMinorUnits() - price2.getMinorUnits()), 1)}, 1));
                }
                textView.setText(strG);
                return i11;
            }
            progressBar.getClass();
            progressBar.setVisibility(8);
            i = this.f15005m != null ? 0 : 2000;
            strG = androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_banner_can_checkout);
        } else if (this.f15005m == null || !Intrinsics.areEqual(this.l, Boolean.TRUE)) {
            progressBar.getClass();
            progressBar.setVisibility(0);
            Price price4 = this.f15005m;
            if (price4 != null && (price = this.f15002i) != null) {
                Price price5 = new Price(price4.getCurrency(), price4.getDecimals(), price4.getMinorUnits() - price.getMinorUnits());
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String strG3 = androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_banner_add_for_delivery);
                strG3.getClass();
                strG = String.format(strG3, Arrays.copyOf(new Object[]{mv.d.i(price5, 1)}, 1));
            }
            i = 0;
        } else {
            progressBar.getClass();
            progressBar.setVisibility(8);
            strG = androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_screen_offer_header_free_delivery);
        }
        i11 = i;
        textView.setText(strG);
        return i11;
    }

    public final void h(boolean z11) {
        c2 c2Var = this.f14994a;
        int paddingRight = c2Var.C.getPaddingRight();
        int i11 = (z11 ? 52 : 0) + 4 + (this.f15006n ? 36 : 0);
        RecyclerView recyclerView = c2Var.C;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), d70.b.a(i11) + paddingRight);
    }
}
