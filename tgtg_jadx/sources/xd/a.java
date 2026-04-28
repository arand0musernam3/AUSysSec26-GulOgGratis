package xd;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import fd.l;
import fd.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f44235b;

    public a(ImageView imageView) {
        this.f44235b = imageView;
    }

    @Override // xd.b
    public final void a(l lVar) {
        c(lVar);
    }

    public final void b() {
        Object drawable = this.f44235b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f44234a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void c(l lVar) {
        ImageView imageView = this.f44235b;
        Drawable drawableB = lVar != null ? o.b(lVar, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableB);
        b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f44235b, ((a) obj).f44235b);
    }

    public final int hashCode() {
        return this.f44235b.hashCode();
    }

    @Override // xd.b
    public final void i(l lVar) {
        c(lVar);
    }

    @Override // xd.b
    public final void j(l lVar) {
        c(lVar);
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f44234a = true;
        b();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.f44234a = false;
        b();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f44235b + ")";
    }
}
