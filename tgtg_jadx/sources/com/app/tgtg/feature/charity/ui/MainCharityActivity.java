package com.app.tgtg.feature.charity.ui;

import a3.f1;
import ah.n;
import android.os.Bundle;
import androidx.lifecycle.n1;
import c50.p;
import c50.w;
import ci.a;
import com.app.tgtg.model.remote.item.response.BasicItem;
import e.f;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o30.f0;
import u3.d;
import y00.d0;
import yi.r;
import zi.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MainCharityActivity extends n implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8980h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f8981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f8982g;

    public MainCharityActivity() {
        super(4);
        this.f8981f = new n1(Reflection.getOrCreateKotlinClass(ci.c.class), new a(this, 1), new a(this, 0), new a(this, 2));
    }

    @Override // zi.e
    public final void e(boolean z11, BasicItem basicItem, aj.c cVar, String str) {
        d0.d(z11, basicItem, cVar, str, new w(1)).show(getSupportFragmentManager(), "CHECKOUT");
    }

    @Override // zi.e
    public final void k(boolean z11, BasicItem basicItem, aj.c cVar, boolean z12, String str) {
        d0.b(z11, basicItem, cVar, str, z12, new w(1)).show(getSupportFragmentManager(), "CHECKOUT");
    }

    @Override // zi.e
    public final void n(boolean z11, BasicItem basicItem, aj.c cVar, String str) {
        w wVar = new w(1);
        r rVar = new r();
        rVar.f46020k = wVar;
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

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0.S(this, false);
        c cVar = this.f8982g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new p(this, 3), 2);
        f.a(this, new d(new f1(this, 16), true, -205083268));
    }
}
