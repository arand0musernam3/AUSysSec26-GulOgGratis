package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2540e;

    public y(Context context, XmlResourceParser xmlResourceParser) {
        this.f2536a = Float.NaN;
        this.f2537b = Float.NaN;
        this.f2538c = Float.NaN;
        this.f2539d = Float.NaN;
        this.f2540e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f2529x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2540e);
                this.f2540e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f2539d = typedArrayObtainStyledAttributes.getDimension(index, this.f2539d);
            } else if (index == 2) {
                this.f2537b = typedArrayObtainStyledAttributes.getDimension(index, this.f2537b);
            } else if (index == 3) {
                this.f2538c = typedArrayObtainStyledAttributes.getDimension(index, this.f2538c);
            } else if (index == 4) {
                this.f2536a = typedArrayObtainStyledAttributes.getDimension(index, this.f2536a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f11, float f12) {
        float f13 = this.f2536a;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f2537b;
        if (!Float.isNaN(f14) && f12 < f14) {
            return false;
        }
        float f15 = this.f2538c;
        if (!Float.isNaN(f15) && f11 > f15) {
            return false;
        }
        float f16 = this.f2539d;
        return Float.isNaN(f16) || f12 <= f16;
    }
}
