package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends v1 implements i0 {
    public CharSequence C;
    public d0 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ AppCompatSpinner G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.G = appCompatSpinner;
        this.E = new Rect();
        this.f34053o = appCompatSpinner;
        this.f34063y = true;
        this.f34064z.setFocusable(true);
        this.f34054p = new e0(this, 0);
    }

    @Override // p.i0
    public final CharSequence e() {
        return this.C;
    }

    @Override // p.i0
    public final void h(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // p.i0
    public final void l(int i11) {
        this.F = i11;
    }

    @Override // p.i0
    public final void m(int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        t tVar = this.f34064z;
        boolean zIsShowing = tVar.isShowing();
        r();
        tVar.setInputMethodMode(2);
        show();
        k1 k1Var = this.f34042c;
        k1Var.setChoiceMode(1);
        k1Var.setTextDirection(i11);
        k1Var.setTextAlignment(i12);
        AppCompatSpinner appCompatSpinner = this.G;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        k1 k1Var2 = this.f34042c;
        if (tVar.isShowing() && k1Var2 != null) {
            k1Var2.setListSelectionHidden(false);
            k1Var2.setSelection(selectedItemPosition);
            if (k1Var2.getChoiceMode() != 0) {
                k1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        h20.u uVar = new h20.u(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(uVar);
        tVar.setOnDismissListener(new f0(this, uVar));
    }

    @Override // p.v1, p.i0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.D = (d0) listAdapter;
    }

    public final void r() {
        int i11;
        t tVar = this.f34064z;
        Drawable background = tVar.getBackground();
        AppCompatSpinner appCompatSpinner = this.G;
        Rect rect = appCompatSpinner.f2023h;
        if (background != null) {
            background.getPadding(rect);
            boolean z11 = g3.f33904a;
            i11 = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i11 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i12 = appCompatSpinner.f2022g;
        if (i12 == -2) {
            int iA = appCompatSpinner.a(this.D, tVar.getBackground());
            int i13 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i13) {
                iA = i13;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i12);
        }
        boolean z12 = g3.f33904a;
        this.f34045f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f34044e) - this.F) + i11 : paddingLeft + this.F + i11;
    }
}
