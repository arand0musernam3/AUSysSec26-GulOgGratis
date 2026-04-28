package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.a0;
import androidx.constraintlayout.widget.l;
import androidx.constraintlayout.widget.r;
import androidx.constraintlayout.widget.v;
import n6.g;
import n6.j;
import n6.m;
import n6.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f2260k;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.a0, androidx.constraintlayout.widget.c
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f2260k = new j();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f2508b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.f2260k.f30641a1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    j jVar = this.f2260k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar.f30657x0 = dimensionPixelSize;
                    jVar.f30658y0 = dimensionPixelSize;
                    jVar.f30659z0 = dimensionPixelSize;
                    jVar.A0 = dimensionPixelSize;
                } else if (index == 18) {
                    j jVar2 = this.f2260k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar2.f30659z0 = dimensionPixelSize2;
                    jVar2.B0 = dimensionPixelSize2;
                    jVar2.C0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2260k.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2260k.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2260k.f30657x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2260k.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2260k.f30658y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2260k.Y0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2260k.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2260k.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2260k.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2260k.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2260k.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2260k.N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2260k.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2260k.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2260k.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2260k.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2260k.T0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2260k.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2260k.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2260k.X0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2260k.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2260k.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2260k.Z0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2362d = this.f2260k;
        l();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void j(l lVar, m mVar, r.a aVar, SparseArray sparseArray) {
        super.j(lVar, mVar, aVar, sparseArray);
        if (mVar instanceof j) {
            j jVar = (j) mVar;
            int i11 = aVar.V;
            if (i11 != -1) {
                jVar.f30641a1 = i11;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.c
    public final void k(g gVar, boolean z11) {
        j jVar = this.f2260k;
        int i11 = jVar.f30659z0;
        if (i11 > 0 || jVar.A0 > 0) {
            if (z11) {
                jVar.B0 = jVar.A0;
                jVar.C0 = i11;
            } else {
                jVar.B0 = i11;
                jVar.C0 = jVar.A0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a0
    public final void m(p pVar, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (pVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            pVar.Z(mode, size, mode2, size2);
            setMeasuredDimension(pVar.E0, pVar.F0);
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public final void onMeasure(int i11, int i12) {
        m(this.f2260k, i11, i12);
    }

    public void setFirstHorizontalBias(float f11) {
        this.f2260k.Q0 = f11;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i11) {
        this.f2260k.K0 = i11;
        requestLayout();
    }

    public void setFirstVerticalBias(float f11) {
        this.f2260k.R0 = f11;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i11) {
        this.f2260k.L0 = i11;
        requestLayout();
    }

    public void setHorizontalAlign(int i11) {
        this.f2260k.W0 = i11;
        requestLayout();
    }

    public void setHorizontalBias(float f11) {
        this.f2260k.O0 = f11;
        requestLayout();
    }

    public void setHorizontalGap(int i11) {
        this.f2260k.U0 = i11;
        requestLayout();
    }

    public void setHorizontalStyle(int i11) {
        this.f2260k.I0 = i11;
        requestLayout();
    }

    public void setLastHorizontalBias(float f11) {
        this.f2260k.S0 = f11;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i11) {
        this.f2260k.M0 = i11;
        requestLayout();
    }

    public void setLastVerticalBias(float f11) {
        this.f2260k.T0 = f11;
        requestLayout();
    }

    public void setLastVerticalStyle(int i11) {
        this.f2260k.N0 = i11;
        requestLayout();
    }

    public void setMaxElementsWrap(int i11) {
        this.f2260k.Z0 = i11;
        requestLayout();
    }

    public void setOrientation(int i11) {
        this.f2260k.f30641a1 = i11;
        requestLayout();
    }

    public void setPadding(int i11) {
        j jVar = this.f2260k;
        jVar.f30657x0 = i11;
        jVar.f30658y0 = i11;
        jVar.f30659z0 = i11;
        jVar.A0 = i11;
        requestLayout();
    }

    public void setPaddingBottom(int i11) {
        this.f2260k.f30658y0 = i11;
        requestLayout();
    }

    public void setPaddingLeft(int i11) {
        this.f2260k.B0 = i11;
        requestLayout();
    }

    public void setPaddingRight(int i11) {
        this.f2260k.C0 = i11;
        requestLayout();
    }

    public void setPaddingTop(int i11) {
        this.f2260k.f30657x0 = i11;
        requestLayout();
    }

    public void setVerticalAlign(int i11) {
        this.f2260k.X0 = i11;
        requestLayout();
    }

    public void setVerticalBias(float f11) {
        this.f2260k.P0 = f11;
        requestLayout();
    }

    public void setVerticalGap(int i11) {
        this.f2260k.V0 = i11;
        requestLayout();
    }

    public void setVerticalStyle(int i11) {
        this.f2260k.J0 = i11;
        requestLayout();
    }

    public void setWrapMode(int i11) {
        this.f2260k.Y0 = i11;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
