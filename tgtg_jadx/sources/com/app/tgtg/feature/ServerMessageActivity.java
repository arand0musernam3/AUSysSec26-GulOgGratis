package com.app.tgtg.feature;

import a8.c;
import a8.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.webkit.WebSettings;
import android.widget.Button;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import k.h;
import kotlin.jvm.internal.Intrinsics;
import mr.e;
import mv.d;
import o30.f0;
import pg.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ServerMessageActivity extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8955f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h3 f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f8959e = new e(this, 6);

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = h3.f34892v;
        DataBinderMapperImpl dataBinderMapperImpl = c.f965a;
        int i12 = 0;
        h3 h3Var = (h3) k.Z(layoutInflater, R.layout.server_message_view, null, false, null);
        h3Var.getClass();
        this.f8958d = h3Var;
        setContentView(z().f986f);
        getOnBackPressedDispatcher().a(this.f8959e);
        this.f8956b = getIntent().getStringExtra("MESSAGE_URL");
        boolean booleanExtra = getIntent().getBooleanExtra("BLOCK_APP", false);
        this.f8957c = booleanExtra;
        if (booleanExtra) {
            z().f34893s.setText(R.string.server_message_force_upgrade_button);
        }
        Button button = z().f34893s;
        button.getClass();
        d.x(button, new sg.c(this, i12));
        WebSettings settings = z().f34895u.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        z().f34895u.setWebViewClient(new co.datadome.sdk.e(this, 1));
        String str = this.f8956b;
        if (str != null) {
            z().f34895u.loadUrl(str);
        }
        f0.S(this, true);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f8959e.remove();
        super.onDestroy();
    }

    public final h3 z() {
        h3 h3Var = this.f8958d;
        if (h3Var != null) {
            return h3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
