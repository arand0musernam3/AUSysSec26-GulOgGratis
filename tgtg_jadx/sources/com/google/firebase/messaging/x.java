package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.customview.DiscoverLocationView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements d10.e, h7.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12890b;

    public /* synthetic */ x(Object obj, boolean z11) {
        this.f12890b = obj;
        this.f12889a = z11;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        fn.t tVar = (fn.t) this.f12890b;
        x6.d dVarX = j4.s.x(view, windowInsetsCompat);
        pg.o0 o0Var = tVar.f17859s;
        if (o0Var != null) {
            DiscoverLocationView discoverLocationView = (DiscoverLocationView) o0Var.f35023i;
            int paddingLeft = discoverLocationView.getPaddingLeft();
            int i11 = this.f12889a ? dVarX.f43874b : 0;
            pg.o0 o0Var2 = tVar.f17859s;
            o0Var2.getClass();
            int paddingRight = ((DiscoverLocationView) o0Var2.f35023i).getPaddingRight();
            pg.o0 o0Var3 = tVar.f17859s;
            o0Var3.getClass();
            discoverLocationView.setPadding(paddingLeft, i11, paddingRight, ((DiscoverLocationView) o0Var3.f35023i).getPaddingBottom());
        }
        return windowInsetsCompat;
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = l0.e((Context) this.f12890b).edit();
        editorEdit.putBoolean("proxy_retention", this.f12889a);
        editorEdit.apply();
    }
}
