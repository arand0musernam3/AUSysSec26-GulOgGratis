package com.braze.images;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f9869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f9871c;

    public f(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f9869a = brazeViewBounds;
        this.f9870b = imageView;
        this.f9871c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.getClass();
        if (this.f9869a == BrazeViewBounds.BASE_CARD_VIEW) {
            ImageView imageView = this.f9870b;
            imageView.post(new atd.d.a(this.f9871c, imageView));
        }
        view.removeOnLayoutChangeListener(this);
    }
}
