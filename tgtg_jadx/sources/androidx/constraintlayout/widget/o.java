package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2470e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f2524s);
        this.f2466a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 1) {
                this.f2469d = typedArrayObtainStyledAttributes.getFloat(index, this.f2469d);
            } else if (index == 0) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f2467b);
                this.f2467b = i12;
                this.f2467b = q.f2485h[i12];
            } else if (index == 4) {
                this.f2468c = typedArrayObtainStyledAttributes.getInt(index, this.f2468c);
            } else if (index == 3) {
                this.f2470e = typedArrayObtainStyledAttributes.getFloat(index, this.f2470e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
