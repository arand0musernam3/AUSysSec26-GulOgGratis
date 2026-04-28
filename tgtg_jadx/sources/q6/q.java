package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class q extends androidx.constraintlayout.widget.c implements y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36303k;
    public View[] l;

    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36301i = false;
        this.f36302j = false;
        i(attributeSet);
    }

    public float getProgress() {
        return this.f36303k;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2519n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 1) {
                    this.f36301i = typedArrayObtainStyledAttributes.getBoolean(index, this.f36301i);
                } else if (index == 0) {
                    this.f36302j = typedArrayObtainStyledAttributes.getBoolean(index, this.f36302j);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f11) {
        this.f36303k = f11;
        int i11 = 0;
        if (this.f2360b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i11 < childCount) {
                View childAt = viewGroup.getChildAt(i11);
                if (!(childAt instanceof q)) {
                    setProgress(childAt, f11);
                }
                i11++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f2365g;
        if (viewArr == null || viewArr.length != this.f2360b) {
            this.f2365g = new View[this.f2360b];
        }
        for (int i12 = 0; i12 < this.f2360b; i12++) {
            this.f2365g[i12] = constraintLayout.getViewById(this.f2359a[i12]);
        }
        this.l = this.f2365g;
        while (i11 < this.f2360b) {
            setProgress(this.l[i11], f11);
            i11++;
        }
    }

    public q(Context context) {
        super(context);
        this.f36301i = false;
        this.f36302j = false;
    }

    public q(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36301i = false;
        this.f36302j = false;
        i(attributeSet);
    }

    @Override // q6.y
    public final void a() {
    }

    public void setProgress(View view, float f11) {
    }
}
