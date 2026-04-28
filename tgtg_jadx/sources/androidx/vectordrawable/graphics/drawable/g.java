package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4045a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4046b;

    public g(c20.c cVar) {
        this.f4046b = cVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f4045a) {
            case 0:
                return ((Drawable.ConstantState) this.f4046b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f4045a) {
            case 0:
                return ((Drawable.ConstantState) this.f4046b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f4045a) {
            case 0:
                h hVar = new h(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4046b).newDrawable();
                hVar.f4052a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hVar.f4051f);
                return hVar;
            default:
                return (c20.c) this.f4046b;
        }
    }

    public g(Drawable.ConstantState constantState) {
        this.f4046b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f4045a) {
            case 0:
                h hVar = new h(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4046b).newDrawable(resources);
                hVar.f4052a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hVar.f4051f);
                return hVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f4045a) {
            case 0:
                h hVar = new h(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4046b).newDrawable(resources, theme);
                hVar.f4052a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hVar.f4051f);
                return hVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
