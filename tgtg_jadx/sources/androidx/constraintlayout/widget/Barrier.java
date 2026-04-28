package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n6.a f2305k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f2305k.f30546y0;
    }

    public int getMargin() {
        return this.f2305k.f30547z0;
    }

    public int getType() {
        return this.f2303i;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f2305k = new n6.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f2508b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f2305k.f30546y0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f2305k.f30547z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2362d = this.f2305k;
        l();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void j(l lVar, n6.m mVar, r.a aVar, SparseArray sparseArray) {
        super.j(lVar, mVar, aVar, sparseArray);
        m mVar2 = lVar.f2407e;
        if (mVar instanceof n6.a) {
            n6.a aVar2 = (n6.a) mVar;
            m(aVar2, mVar2.f2425g0, ((n6.h) mVar.W).A0);
            aVar2.f30546y0 = mVar2.f2440o0;
            aVar2.f30547z0 = mVar2.f2427h0;
        }
    }

    @Override // androidx.constraintlayout.widget.c
    public final void k(n6.g gVar, boolean z11) {
        m(gVar, this.f2303i, z11);
    }

    public final void m(n6.g gVar, int i11, boolean z11) {
        this.f2304j = i11;
        int i12 = this.f2303i;
        if (z11) {
            if (i12 == 5) {
                this.f2304j = 1;
            } else if (i12 == 6) {
                this.f2304j = 0;
            }
        } else if (i12 == 5) {
            this.f2304j = 0;
        } else if (i12 == 6) {
            this.f2304j = 1;
        }
        if (gVar instanceof n6.a) {
            ((n6.a) gVar).f30545x0 = this.f2304j;
        }
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.f2305k.f30546y0 = z11;
    }

    public void setDpMargin(int i11) {
        this.f2305k.f30547z0 = (int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i11) {
        this.f2305k.f30547z0 = i11;
    }

    public void setType(int i11) {
        this.f2303i = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        super.setVisibility(8);
    }
}
