package com.app.tgtg.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import b0.h;
import bg.y;
import com.airbnb.lottie.LottieAnimationView;
import d70.b;
import he.o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class TGTGLoadingView extends LottieAnimationView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8922p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8923o;

    public TGTGLoadingView(@Nullable Context context) {
        super(context);
        g();
    }

    public static void f(TGTGLoadingView tGTGLoadingView, int i11) {
        if (tGTGLoadingView.f8923o) {
            tGTGLoadingView.e();
            super.setVisibility(i11);
        }
    }

    public final void g() {
        o.b(getContext(), "logo_animation.json").b(new y(this, 2));
        int iA = b.a(8);
        setPadding(iA, iA / 2, iA, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        if (i11 == 0) {
            this.f8923o = true;
            super.setVisibility(8);
            new Handler(Looper.getMainLooper()).postDelayed(new h(this, i11, 1), 800L);
        } else if (i11 == 4 || i11 == 8) {
            this.f8923o = false;
            super.setVisibility(i11);
            this.f8859i = false;
            this.f8855e.l();
        }
    }

    public TGTGLoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public TGTGLoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g();
    }
}
