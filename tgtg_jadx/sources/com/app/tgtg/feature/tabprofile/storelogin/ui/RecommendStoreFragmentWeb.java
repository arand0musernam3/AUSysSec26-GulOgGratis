package com.app.tgtg.feature.tabprofile.storelogin.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import bt.b;
import com.app.tgtg.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pg.v;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.ui.android.conversation.textcell.c;
import zs.a;
import zs.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/storelogin/ui/RecommendStoreFragmentWeb;", "Lzs/j;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecommendStoreFragmentWeb extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f9448m;

    public RecommendStoreFragmentWeb() {
        super(R.layout.signup_store_view_web);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        v vVarA = v.a(layoutInflater, viewGroup);
        this.f9448m = vVarA;
        ConstraintLayout constraintLayout = (ConstraintLayout) vVarA.f35201b;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // zs.j, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        v vVar = this.f9448m;
        vVar.getClass();
        this.f48090j = (WebView) vVar.f35202c;
        v vVar2 = this.f9448m;
        vVar2.getClass();
        WebView webView = (WebView) vVar2.f35202c;
        b bVar = this.f48086f;
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
        String userStoreRecommendationUrl = p().f48100c.n().getUserStoreRecommendationUrl();
        if (userStoreRecommendationUrl != null) {
            v vVar3 = this.f9448m;
            vVar3.getClass();
            ((WebView) vVar3.f35202c).loadUrl(userStoreRecommendationUrl);
        }
        v vVar4 = this.f9448m;
        vVar4.getClass();
        ((WebView) vVar4.f35202c).addJavascriptInterface(new a(new c(this, 1)), AnalyticsProcessor.CHANNEL_NAME);
        if (this.f48091k != null) {
            ((TextView) o().f34795c).setText(getString(R.string.recommend_store_title));
            v vVar5 = this.f9448m;
            vVar5.getClass();
            ViewCompat.k0((ConstraintLayout) vVar5.f35201b, new mp.a(this, 27));
        }
    }
}
