package com.braze.ui.inappmessage.listeners;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import e0.f;
import i20.e;
import i20.l;
import java.util.Iterator;
import l20.o;
import n20.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10941c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f10939a = i11;
        this.f10940b = obj;
        this.f10941c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i11 = this.f10939a;
        Object obj = this.f10941c;
        Object obj2 = this.f10940b;
        switch (i11) {
            case 0:
                ((SwipeDismissTouchListener) obj2).lambda$performDismiss$0((ViewGroup.LayoutParams) obj, valueAnimator);
                return;
            case 1:
                l lVar = (l) obj2;
                e eVar = (e) obj;
                if (eVar.b(true) && eVar.f22964m != 0 && lVar.isVisible()) {
                    lVar.invalidateSelf();
                    return;
                }
                return;
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i12 = AppBarLayout.A;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((j) obj).s(fFloatValue);
                Drawable drawable = appBarLayout.f12226w;
                if (drawable instanceof j) {
                    ((j) drawable).s(fFloatValue);
                }
                Iterator it = appBarLayout.f12220q.iterator();
                if (it.hasNext()) {
                    throw f.e(it);
                }
                for (l20.a aVar : appBarLayout.f12221r) {
                    float f11 = fFloatValue / appBarLayout.f12228y;
                    SearchBar searchBar = aVar.f26791a;
                    ColorStateList colorStateList = searchBar.f12536i1;
                    if (colorStateList != null) {
                        searchBar.f12548u1.t(ColorStateList.valueOf(w0.e.E(searchBar.f12533g1, f11, colorStateList.getDefaultColor())));
                    }
                }
                return;
            default:
                Rect rect = (Rect) obj;
                rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((o) obj2).f26827j.setClipBounds(rect);
                return;
        }
    }
}
