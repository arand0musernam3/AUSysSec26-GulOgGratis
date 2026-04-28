package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import s6.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f12309a;

    public a(BottomAppBar.Behavior behavior) {
        this.f12309a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        BottomAppBar.Behavior behavior = this.f12309a;
        Rect rect = behavior.f12305m;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f12306n.get();
        if (bottomAppBar != null) {
            int i19 = bottomAppBar.f12289k1;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.f(rect);
                    int iHeight = rect.height();
                    bottomAppBar.J(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f30392e.a(new RectF(rect)));
                    height = iHeight;
                }
                e eVar = (e) view.getLayoutParams();
                if (behavior.f12307o == 0) {
                    if (bottomAppBar.f12288j1 == 1) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i19;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i19;
                    }
                }
                int i21 = BottomAppBar.B1;
                bottomAppBar.I();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
