package i20;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends androidx.vectordrawable.graphics.drawable.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22938b;

    public /* synthetic */ c(int i11, View view) {
        this.f22937a = i11;
        this.f22938b = view;
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationEnd(Drawable drawable) {
        switch (this.f22937a) {
            case 0:
                d dVar = (d) this.f22938b;
                dVar.setIndeterminate(false);
                dVar.setProgressCompat(dVar.f22940b, dVar.f22941c);
                break;
            case 1:
                d dVar2 = (d) this.f22938b;
                if (!dVar2.f22947i) {
                    dVar2.setVisibility(dVar2.f22948j);
                }
                break;
            default:
                ColorStateList colorStateList = ((s10.b) this.f22938b).f38748o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public void onAnimationStart(Drawable drawable) {
        switch (this.f22937a) {
            case 2:
                super.onAnimationStart(drawable);
                s10.b bVar = (s10.b) this.f22938b;
                ColorStateList colorStateList = bVar.f38748o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.f38752s, colorStateList.getDefaultColor()));
                }
                break;
            default:
                super.onAnimationStart(drawable);
                break;
        }
    }
}
