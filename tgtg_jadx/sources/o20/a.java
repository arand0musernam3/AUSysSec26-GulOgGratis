package o20;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends u00.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SideSheetBehavior f31812d;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i11) {
        this.f31811c = i11;
        this.f31812d = sideSheetBehavior;
    }

    @Override // u00.d
    public final int A(CoordinatorLayout coordinatorLayout) {
        switch (this.f31811c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // u00.d
    public final int B() {
        switch (this.f31811c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // u00.d
    public final boolean D(float f11) {
        switch (this.f31811c) {
            case 0:
                if (f11 > 0.0f) {
                }
                break;
            default:
                if (f11 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // u00.d
    public final boolean H(View view) {
        switch (this.f31811c) {
            case 0:
                if (view.getRight() < (v() - w()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (v() + this.f31812d.f12591m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // u00.d
    public final boolean I(float f11, float f12) {
        switch (this.f31811c) {
            case 0:
                if (Math.abs(f11) <= Math.abs(f12) || Math.abs(f11) <= 500) {
                }
                break;
            default:
                if (Math.abs(f11) <= Math.abs(f12) || Math.abs(f11) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // u00.d
    public final boolean O(View view, float f11) {
        switch (this.f31811c) {
            case 0:
                if (Math.abs((f11 * this.f31812d.f12590k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f11 * this.f31812d.f12590k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // u00.d
    public final void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        switch (this.f31811c) {
            case 0:
                marginLayoutParams.leftMargin = i11;
                break;
            default:
                marginLayoutParams.rightMargin = i11;
                break;
        }
    }

    @Override // u00.d
    public final void R(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        switch (this.f31811c) {
            case 0:
                if (i11 <= this.f31812d.f12591m) {
                    marginLayoutParams.leftMargin = i12;
                }
                break;
            default:
                int i13 = this.f31812d.f12591m;
                if (i11 <= i13) {
                    marginLayoutParams.rightMargin = i13 - i11;
                }
                break;
        }
    }

    @Override // u00.d
    public final int n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f31811c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // u00.d
    public final float o(int i11) {
        switch (this.f31811c) {
            case 0:
                float fW = w();
                return (i11 - fW) / (v() - fW);
            default:
                float f11 = this.f31812d.f12591m;
                return (f11 - i11) / (f11 - v());
        }
    }

    @Override // u00.d
    public final int u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f31811c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // u00.d
    public final int v() {
        switch (this.f31811c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f31812d;
                return Math.max(0, sideSheetBehavior.f12592n + sideSheetBehavior.f12593o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f31812d;
                return Math.max(0, (sideSheetBehavior2.f12591m - sideSheetBehavior2.l) - sideSheetBehavior2.f12593o);
        }
    }

    @Override // u00.d
    public final int w() {
        switch (this.f31811c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f31812d;
                return (-sideSheetBehavior.l) - sideSheetBehavior.f12593o;
            default:
                return this.f31812d.f12591m;
        }
    }

    @Override // u00.d
    public final int x() {
        switch (this.f31811c) {
            case 0:
                return this.f31812d.f12593o;
            default:
                return this.f31812d.f12591m;
        }
    }

    @Override // u00.d
    public final int y() {
        switch (this.f31811c) {
            case 0:
                return -this.f31812d.l;
            default:
                return v();
        }
    }

    @Override // u00.d
    public final int z(View view) {
        switch (this.f31811c) {
            case 0:
                return view.getRight() + this.f31812d.f12593o;
            default:
                return view.getLeft() - this.f31812d.f12593o;
        }
    }
}
