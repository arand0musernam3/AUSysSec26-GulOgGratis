package com.app.tgtg.feature.flashsales.list;

import a3.b2;
import ah.n;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y1;
import bg.w0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import cv.g;
import dk.b;
import dk.f;
import e70.c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lq.d;
import lq.j;
import lv.s;
import mv.e0;
import pg.a;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class FlashSalesListActivity extends n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8995p = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f8996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f8997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f8998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w0 f8999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f9000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f9001k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DiscoverBucket f9002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.activity.e0 f9004o;

    public FlashSalesListActivity() {
        super(6);
        this.f8998h = new n1(Reflection.getOrCreateKotlinClass(f.class), new dk.c(this, 1), new dk.c(this, 0), new dk.c(this, 2));
        this.f9001k = new j(d.VERTICAL);
        this.l = "";
        this.f9003n = true;
        this.f9004o = new androidx.activity.e0(this, 6);
    }

    public final void a0() {
        e0 e0Var;
        e0 e0Var2 = this.f9000j;
        a aVar = null;
        if (e0Var2 != null) {
            e0Var = e0Var2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
            e0Var = null;
        }
        ArrayList arrayList = this.f9001k.f28130d;
        a aVar2 = this.f8997g;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aVar = aVar2;
        }
        y1 layoutManager = ((RecyclerView) aVar.f34762d).getLayoutManager();
        layoutManager.getClass();
        e0.e(e0Var, arrayList, (LinearLayoutManager) layoutManager, g.BUCKET, null, 0, new dk.a(this, 1), 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a70.a.t(this, s.B);
        a aVar = null;
        Object[] objArr = 0;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_flash_sales_list, (ViewGroup) null, false);
        int i12 = R.id.itemList;
        RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.itemList, viewInflate);
        if (recyclerView != null) {
            i12 = R.id.ivToolbarBack;
            ImageButton imageButton = (ImageButton) pd.g.t(R.id.ivToolbarBack, viewInflate);
            if (imageButton != null) {
                i12 = R.id.ivToolbarIcon;
                ImageView imageView = (ImageView) pd.g.t(R.id.ivToolbarIcon, viewInflate);
                if (imageView != null) {
                    i12 = R.id.loadingView;
                    if (((TGTGLoadingView) pd.g.t(R.id.loadingView, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i12 = R.id.tvToolbarTitle;
                        TextView textView = (TextView) pd.g.t(R.id.tvToolbarTitle, viewInflate);
                        if (textView != null) {
                            this.f8997g = new a(constraintLayout, recyclerView, imageButton, imageView, constraintLayout, textView);
                            setContentView(constraintLayout);
                            c cVar = this.f8996f;
                            if (cVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                cVar = null;
                            }
                            c.b(cVar, this, null, 6);
                            getOnBackPressedDispatcher().a(this.f9004o);
                            this.l = getIntent().getStringExtra("TITLE");
                            getIntent().getStringExtra("DISPLAY_TYPE");
                            String stringExtra = getIntent().getStringExtra("FILLER_TYPE");
                            if (stringExtra != null) {
                                n1 n1Var = this.f8998h;
                                f fVar = (f) n1Var.getValue();
                                fVar.f14962g.e(this, new b(new dk.a(this, 2), 0));
                                fVar.f14964i.e(this, new b(new dk.a(this, 3), 0));
                                fVar.f14966k.e(this, new b(new dk.a(this, 4), 0));
                                f fVar2 = (f) n1Var.getValue();
                                fVar2.f14967m = stringExtra;
                                if (stringExtra.length() == 0) {
                                    fVar2.b();
                                } else {
                                    fVar2.f14963h.k(Boolean.TRUE);
                                    f0.B(m1.d(fVar2), null, null, new b2(fVar2, objArr == true ? 1 : 0, 10), 3);
                                }
                            }
                            a aVar2 = this.f8997g;
                            if (aVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                aVar = aVar2;
                            }
                            mv.d.x((ImageButton) aVar.f34763e, new dk.a(this, i11));
                            ((TextView) aVar.f34765g).setText(this.l);
                            o30.f0.S(this, true);
                            return;
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }
}
