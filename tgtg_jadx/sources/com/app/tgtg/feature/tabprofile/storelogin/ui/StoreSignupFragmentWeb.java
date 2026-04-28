package com.app.tgtg.feature.tabprofile.storelogin.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import bt.b;
import com.app.tgtg.R;
import cv.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pg.v;
import v80.f0;
import x70.c;
import xq.a;
import yl.e;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zs.j;
import zs.n;
import zs.o;
import zs.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/storelogin/ui/StoreSignupFragmentWeb;", "Lzs/j;", "<init>", "()V", "zs/p", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoreSignupFragmentWeb extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f9457m;

    public StoreSignupFragmentWeb() {
        super(R.layout.signup_store_view_web);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        v vVarA = v.a(layoutInflater, viewGroup);
        this.f9457m = vVarA;
        WebView webView = (WebView) vVarA.f35202c;
        this.f48090j = webView;
        b bVar = this.f48086f;
        c cVar = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        webView.setWebViewClient(bVar);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setCacheMode(2);
        o oVarP = p();
        f0.B(m1.d(oVarP), null, null, new n(oVarP, cVar, 0), 3);
        o0 o0Var = p().f48102e;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new a(23, webView, this));
        androidx.fragment.app.o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        webView.addJavascriptInterface(new p(o0VarRequireActivity, new zendesk.ui.android.conversation.textcell.c(this, 3), new e(12, webView, this)), AnalyticsProcessor.CHANNEL_NAME);
        o0 o0Var2 = p().f48103f;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        m0.c.f0(o0Var2, viewLifecycleOwner2, new zendesk.core.android.internal.a(this, 11));
        o oVarP2 = p();
        i iVar = i.SCREEN_STORE_SIGNUP;
        iVar.getClass();
        cv.b bVar2 = oVarP2.f48099b;
        bVar2.getClass();
        bVar2.c(iVar, null);
        v vVar = this.f9457m;
        vVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) vVar.f35201b;
        constraintLayout.getClass();
        return constraintLayout;
    }
}
