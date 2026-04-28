package com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent;

import a8.k;
import ah.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.ViewModelProvider$Factory;
import b0.a0;
import c5.r3;
import com.app.tgtg.R;
import gn.i;
import gr.a;
import java.util.ArrayList;
import java.util.Iterator;
import k.h;
import kotlin.jvm.internal.Intrinsics;
import o30.f0;
import p70.b;
import pg.s3;
import pj.e;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class TrackingConsentDetailActivity extends h implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9342g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9344c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9345d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s3 f9346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f9347f;

    public TrackingConsentDetailActivity() {
        addOnContextAvailableListener(new m(this, 21));
        this.f9347f = new e0(this, 20);
    }

    public final TextView A(int i11) {
        TextView textView = new TextView(this);
        textView.setText(i11);
        textView.setTextAppearance(R.style.Body1_Bold_Green);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(d70.b.a(16), d70.b.a(8), d70.b.a(16), d70.b.a(6));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final void C() {
        super.onDestroy();
        z().b();
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        B(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = s3.f35157u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        s3 s3Var = null;
        s3 s3Var2 = (s3) k.Z(layoutInflater, R.layout.tracking_detail_view, null, false, null);
        s3Var2.getClass();
        this.f9346e = s3Var2;
        setContentView(s3Var2.f986f);
        getOnBackPressedDispatcher().a(this.f9347f);
        if (!getIntent().hasExtra("Details") || a0.A(getIntent(), "Details", pj.b.class) == null) {
            Toast.makeText(this, getString(R.string.generic_err_undefined_error), 0).show();
            finishAfterTransition();
            return;
        }
        pj.b bVar = (pj.b) a0.A(getIntent(), "Details", pj.b.class);
        s3 s3Var3 = this.f9346e;
        if (s3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            s3Var = s3Var3;
        }
        LinearLayout linearLayout = s3Var.f35158s;
        linearLayout.removeAllViews();
        if (bVar != null) {
            ComposeView composeView = s3Var.f35159t;
            composeView.setViewCompositionStrategy(r3.f7360a);
            composeView.setContent(new d(new i(3, this, bVar), true, 2106245150));
            linearLayout.addView(A(bVar.f35419c));
            for (e eVar : bVar.f35420d) {
                linearLayout.addView(A(eVar.f35426a));
                pj.c cVar = eVar.f35427b;
                if (cVar != null) {
                    gr.c cVar2 = new gr.c(this);
                    cVar2.setContent(cVar);
                    linearLayout.addView(cVar2);
                }
                ArrayList arrayList = eVar.f35428c;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        a aVar = new a(this);
                        aVar.setTitle(iIntValue);
                        linearLayout.addView(aVar);
                    }
                }
                ArrayList<pj.f> arrayList2 = eVar.f35429d;
                if (arrayList2 != null) {
                    for (pj.f fVar : arrayList2) {
                        gr.b bVar2 = new gr.b(this);
                        bVar2.setContent(fVar);
                        linearLayout.addView(bVar2);
                    }
                }
                ArrayList<pj.d> arrayList3 = eVar.f35430e;
                if (arrayList3 != null) {
                    for (pj.d dVar : arrayList3) {
                        a aVar2 = new a(this);
                        aVar2.setContent(m0.c.c0("<b>" + getString(dVar.f35424a) + "</b> " + getString(dVar.f35425b)));
                        linearLayout.addView(aVar2);
                    }
                }
            }
            linearLayout.requestLayout();
        }
        f0.S(this, true);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9347f.remove();
        C();
    }

    public final b z() {
        if (this.f9343b == null) {
            synchronized (this.f9344c) {
                try {
                    if (this.f9343b == null) {
                        this.f9343b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9343b;
    }
}
