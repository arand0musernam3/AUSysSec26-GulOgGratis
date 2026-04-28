package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f2453n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2464k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2465m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2453n = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(n nVar) {
        this.f2454a = nVar.f2454a;
        this.f2455b = nVar.f2455b;
        this.f2457d = nVar.f2457d;
        this.f2458e = nVar.f2458e;
        this.f2459f = nVar.f2459f;
        this.f2461h = nVar.f2461h;
        this.f2460g = nVar.f2460g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f2518m);
        this.f2454a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (f2453n.get(index)) {
                case 1:
                    this.f2461h = typedArrayObtainStyledAttributes.getFloat(index, this.f2461h);
                    break;
                case 2:
                    this.f2458e = typedArrayObtainStyledAttributes.getInt(index, this.f2458e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f2457d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f2457d = i6.e.f23414d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f2459f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f2455b = q.m(typedArrayObtainStyledAttributes, index, this.f2455b);
                    break;
                case 6:
                    this.f2456c = typedArrayObtainStyledAttributes.getInteger(index, this.f2456c);
                    break;
                case 7:
                    this.f2460g = typedArrayObtainStyledAttributes.getFloat(index, this.f2460g);
                    break;
                case 8:
                    this.f2463j = typedArrayObtainStyledAttributes.getInteger(index, this.f2463j);
                    break;
                case 9:
                    this.f2462i = typedArrayObtainStyledAttributes.getFloat(index, this.f2462i);
                    break;
                case 10:
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f2465m = resourceId;
                        if (resourceId != -1) {
                            this.l = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f2464k = string;
                        if (string.indexOf(ExpiryDateInput.SEPARATOR) > 0) {
                            this.f2465m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.l = -2;
                        } else {
                            this.l = -1;
                        }
                    } else {
                        this.l = typedArrayObtainStyledAttributes.getInteger(index, this.f2465m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
