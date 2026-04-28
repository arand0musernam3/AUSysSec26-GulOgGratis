package bd;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6105b;

    public a(ImageView imageView) {
        this.f6105b = imageView;
    }

    public final void a() {
        Object drawable = this.f6105b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f6104a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        ImageView imageView = this.f6105b;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f6105b, ((a) obj).f6105b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6105b.hashCode();
    }

    @Override // bd.b
    public final void onError(Drawable drawable) {
        b(drawable);
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f6104a = true;
        a();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.f6104a = false;
        a();
    }

    @Override // bd.b
    public final void onSuccess(Drawable drawable) {
        b(drawable);
    }

    @Override // bd.b
    public final void onStart(Drawable drawable) {
        b(drawable);
    }
}
