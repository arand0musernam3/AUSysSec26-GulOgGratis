package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f2471o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2482k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2484n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2471o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(p pVar) {
        this.f2472a = pVar.f2472a;
        this.f2473b = pVar.f2473b;
        this.f2474c = pVar.f2474c;
        this.f2475d = pVar.f2475d;
        this.f2476e = pVar.f2476e;
        this.f2477f = pVar.f2477f;
        this.f2478g = pVar.f2478g;
        this.f2479h = pVar.f2479h;
        this.f2480i = pVar.f2480i;
        this.f2481j = pVar.f2481j;
        this.f2482k = pVar.f2482k;
        this.l = pVar.l;
        this.f2483m = pVar.f2483m;
        this.f2484n = pVar.f2484n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f2527v);
        this.f2472a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (f2471o.get(index)) {
                case 1:
                    this.f2473b = typedArrayObtainStyledAttributes.getFloat(index, this.f2473b);
                    break;
                case 2:
                    this.f2474c = typedArrayObtainStyledAttributes.getFloat(index, this.f2474c);
                    break;
                case 3:
                    this.f2475d = typedArrayObtainStyledAttributes.getFloat(index, this.f2475d);
                    break;
                case 4:
                    this.f2476e = typedArrayObtainStyledAttributes.getFloat(index, this.f2476e);
                    break;
                case 5:
                    this.f2477f = typedArrayObtainStyledAttributes.getFloat(index, this.f2477f);
                    break;
                case 6:
                    this.f2478g = typedArrayObtainStyledAttributes.getDimension(index, this.f2478g);
                    break;
                case 7:
                    this.f2479h = typedArrayObtainStyledAttributes.getDimension(index, this.f2479h);
                    break;
                case 8:
                    this.f2481j = typedArrayObtainStyledAttributes.getDimension(index, this.f2481j);
                    break;
                case 9:
                    this.f2482k = typedArrayObtainStyledAttributes.getDimension(index, this.f2482k);
                    break;
                case 10:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 11:
                    this.f2483m = true;
                    this.f2484n = typedArrayObtainStyledAttributes.getDimension(index, this.f2484n);
                    break;
                case 12:
                    this.f2480i = q.m(typedArrayObtainStyledAttributes, index, this.f2480i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
