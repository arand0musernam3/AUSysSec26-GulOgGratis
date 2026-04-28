package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f4049d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4050e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f4051f = new d(this, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f4047b = new f();

    public h(Context context) {
        this.f4048c = context;
    }

    public static h a(Context context, int i11) {
        h hVar = new h(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = w6.j.f43256a;
        Drawable drawable = resources.getDrawable(i11, theme);
        hVar.f4052a = drawable;
        drawable.setCallback(hVar.f4051f);
        new g(hVar.f4052a.getConstantState());
        return hVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void b(c cVar) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.getPlatformCallback());
            return;
        }
        if (cVar == null) {
            return;
        }
        if (this.f4050e == null) {
            this.f4050e = new ArrayList();
        }
        if (this.f4050e.contains(cVar)) {
            return;
        }
        this.f4050e.add(cVar);
        if (this.f4049d == null) {
            this.f4049d = new e(this, 0);
        }
        this.f4047b.f4042b.addListener(this.f4049d);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        f fVar = this.f4047b;
        fVar.f4041a.draw(canvas);
        if (fVar.f4042b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getAlpha() : this.f4047b.f4041a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4047b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getColorFilter() : this.f4047b.f4041a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4052a != null) {
            return new g(this.f4052a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4047b.f4041a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4047b.f4041a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getOpacity() : this.f4047b.f4041a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r3.f4042b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        r3.f4042b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r3.f4042b.playTogether(r3.f4043c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4047b.f4041a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4052a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4047b.f4042b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.isStateful() : this.f4047b.f4041a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4047b.f4041a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.setLevel(i11) : this.f4047b.f4041a.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.setState(iArr) : this.f4047b.f4041a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f4047b.f4041a.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f4047b.f4041a.setAutoMirrored(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4047b.f4041a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTint(i11);
        } else {
            this.f4047b.f4041a.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f4047b.f4041a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f4047b.f4041a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f4047b.f4041a.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        f fVar = this.f4047b;
        if (fVar.f4042b.isStarted()) {
            return;
        }
        fVar.f4042b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4047b.f4042b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
