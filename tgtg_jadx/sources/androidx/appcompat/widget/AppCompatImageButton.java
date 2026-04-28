package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ax.f0;
import com.app.tgtg.R;
import p.k;
import p.r;
import p.u2;
import p.v2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        v2.a(context);
        this.f2014c = false;
        u2.a(getContext(), this);
        k kVar = new k(this);
        this.f2012a = kVar;
        kVar.d(attributeSet, i11);
        r rVar = new r(this);
        this.f2013b = rVar;
        rVar.b(attributeSet, i11);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f2012a;
        if (kVar != null) {
            kVar.a();
        }
        r rVar = this.f2013b;
        if (rVar != null) {
            rVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f2012a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f2012a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f0 f0Var;
        r rVar = this.f2013b;
        if (rVar == null || (f0Var = rVar.f33989b) == null) {
            return null;
        }
        return (ColorStateList) f0Var.f4906c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f0 f0Var;
        r rVar = this.f2013b;
        if (rVar == null || (f0Var = rVar.f33989b) == null) {
            return null;
        }
        return (PorterDuff.Mode) f0Var.f4907d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f2013b.f33988a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f2012a;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        k kVar = this.f2012a;
        if (kVar != null) {
            kVar.f(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r rVar = this.f2013b;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        r rVar = this.f2013b;
        if (rVar != null && drawable != null && !this.f2014c) {
            rVar.f33990c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (rVar != null) {
            rVar.a();
            if (this.f2014c) {
                return;
            }
            ImageView imageView = rVar.f33988a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(rVar.f33990c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i11) {
        super.setImageLevel(i11);
        this.f2014c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f2013b.c(i11);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        r rVar = this.f2013b;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f2012a;
        if (kVar != null) {
            kVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f2012a;
        if (kVar != null) {
            kVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        r rVar = this.f2013b;
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
        r rVar = this.f2013b;
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

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }
}
