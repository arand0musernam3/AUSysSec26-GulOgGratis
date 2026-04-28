package eo;

import a8.k;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.o0;
import androidx.lifecycle.c1;
import androidx.lifecycle.n1;
import at.c0;
import b5.r1;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import mv.z;
import pg.n2;
import u70.j;
import u70.l;
import u70.m;
import u70.t;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo/f;", "Lkm/a;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyStoreFragment.kt\ncom/app/tgtg/feature/mystore/ui/MyStoreFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,204:1\n106#2,15:205\n*S KotlinDebug\n*F\n+ 1 MyStoreFragment.kt\ncom/app/tgtg/feature/mystore/ui/MyStoreFragment\n*L\n38#1:205,15\n*E\n"})
public final class f extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bt.b f16202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f16203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f16204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2 f16205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f16206k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f16207m;

    public f() {
        j jVarA = l.a(m.NONE, new defpackage.a(new defpackage.a(this, 12), 13));
        this.f16204i = new n1(Reflection.getOrCreateKotlinClass(h.class), new bl.c(jVarA, 2), new r1(7, this, jVarA), new bl.c(jVarA, 3));
        this.f16206k = l.b(new e(this, 1));
        this.f16207m = 600000L;
    }

    @Override // km.a
    public final z o() {
        return z.MY_STORE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        int i11 = n2.f35012u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        n2 n2Var = (n2) k.Z(layoutInflater, R.layout.mystore_webview_container, viewGroup, false, null);
        this.f16205j = n2Var;
        n2Var.getClass();
        View view = n2Var.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bt.b bVar = this.f16202g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        bVar.f6703c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (System.currentTimeMillis() - this.l > this.f16207m) {
            r().reload();
            this.l = System.currentTimeMillis();
        }
    }

    @Override // km.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strConcat;
        ArrayList arrayList;
        view.getClass();
        super.onViewCreated(view, bundle);
        bt.b bVar = this.f16202g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        bVar.f6703c = new se.d(this, 15);
        requireActivity().getWindow().setSoftInputMode(34);
        n2 n2Var = this.f16205j;
        n2Var.getClass();
        n2Var.f35013s.setVisibility(8);
        n1 n1Var = this.f16204i;
        h hVar = (h) n1Var.getValue();
        c1 c1Var = hVar.f16209b;
        String myStoreUrl = hVar.f16208a.n().getMyStoreUrl();
        if (myStoreUrl == null || myStoreUrl.length() == 0) {
            strConcat = null;
        } else {
            try {
                Uri uri = Uri.parse(myStoreUrl);
                Uri uri2 = (Uri) c1Var.a("MYSTORE_URL_DATA");
                if (uri2 == null || ((f70.i) c1Var.a("ORIGIN")) != f70.i.DEEP_LINK) {
                    uri2 = null;
                }
                if (uri2 != null) {
                    List<String> pathSegments = uri2.getPathSegments();
                    if (pathSegments != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : pathSegments) {
                            if (!y.k((String) obj, "mystore", true)) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    strConcat = new Uri.Builder().scheme("https").authority(uri.getAuthority()).path(arrayList != null ? CollectionsKt.U(arrayList, ExpiryDateInput.SEPARATOR, null, null, null, 62) : null).encodedQuery(uri2.getEncodedQuery()).appendQueryParameter("appversion", "26.4.1").build().toString();
                    strConcat.getClass();
                    c1Var.d(null, "MYSTORE_URL_DATA");
                    c1Var.d(null, "ORIGIN");
                } else {
                    strConcat = myStoreUrl.concat("&appversion=26.4.1");
                }
            } catch (Exception e5) {
                sa0.a.f38953a.d(e5);
                strConcat = null;
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        if (strConcat.length() > 0) {
            bt.b bVar2 = this.f16202g;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
                bVar2 = null;
            }
            n2 n2Var2 = this.f16205j;
            n2Var2.getClass();
            bVar2.f6702b = n2Var2.f35013s;
            WebView webViewR = r();
            bt.b bVar3 = this.f16202g;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
                bVar3 = null;
            }
            webViewR.setWebViewClient(bVar3);
            webViewR.getSettings().setDomStorageEnabled(true);
            webViewR.getSettings().setJavaScriptEnabled(true);
            webViewR.getSettings().setAllowFileAccess(true);
            webViewR.getSettings().setLoadWithOverviewMode(true);
            webViewR.getSettings().setUseWideViewPort(true);
            webViewR.getSettings().setCacheMode(2);
            r().addJavascriptInterface(new c(new e(this, 0)), AnalyticsProcessor.CHANNEL_NAME);
            webViewR.setDownloadListener(new d(this));
            webViewR.getSettings().setSupportMultipleWindows(true);
            webViewR.setWebChromeClient(new i(this));
            webViewR.loadUrl(strConcat);
        }
        this.l = System.currentTimeMillis();
        o0 o0VarRequireActivity = requireActivity();
        MainActivity mainActivity = o0VarRequireActivity instanceof MainActivity ? (MainActivity) o0VarRequireActivity : null;
        if (mainActivity != null) {
            n2 n2Var3 = this.f16205j;
            n2Var3.getClass();
            ViewCompat.k0(n2Var3.f986f, new a50.d(13, mainActivity, this));
        }
        ((h) n1Var.getValue()).f16211d.b(cv.i.SCREEN_MYSTORE_WEBVIEW);
    }

    public final WebView r() {
        Object value = this.f16206k.getValue();
        value.getClass();
        return (WebView) value;
    }
}
