package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ax.f0;
import p.k;
import p.r;
import p.u2;
import p.v2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final k mBackgroundTintHelper;
    private boolean mHasLevel;
    private final r mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        this.mHasLevel = false;
        u2.a(getContext(), this);
        k kVar = new k(this);
        this.mBackgroundTintHelper = kVar;
        kVar.d(attributeSet, i11);
        r rVar = new r(this);
        this.mImageHelper = rVar;
        rVar.b(attributeSet, i11);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.a();
        }
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f0 f0Var;
        r rVar = this.mImageHelper;
        if (rVar == null || (f0Var = rVar.f33989b) == null) {
            return null;
        }
        return (ColorStateList) f0Var.f4906c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f0 f0Var;
        r rVar = this.mImageHelper;
        if (rVar == null || (f0Var = rVar.f33989b) == null) {
            return null;
        }
        return (PorterDuff.Mode) f0Var.f4907d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f33988a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        r rVar = this.mImageHelper;
        if (rVar != null && drawable != null && !this.mHasLevel) {
            rVar.f33990c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        r rVar2 = this.mImageHelper;
        if (rVar2 != null) {
            rVar2.a();
            if (this.mHasLevel) {
                return;
            }
            r rVar3 = this.mImageHelper;
            ImageView imageView = rVar3.f33988a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(rVar3.f33990c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i11) {
        super.setImageLevel(i11);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.c(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            if (rVar.f33989b == null) {
                rVar.f33989b = new f0();
            }
            f0 f0Var = rVar.f33989b;
            f0Var.f4906c = colorStateList;
            f0Var.f4905b = true;
            rVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            if (rVar.f33989b == null) {
                rVar.f33989b = new f0();
            }
            f0 f0Var = rVar.f33989b;
            f0Var.f4907d = mode;
            f0Var.f4904a = true;
            rVar.a();
        }
    }

    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }
}
