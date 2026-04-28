package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f36094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f36095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f36096k;
    public e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f36097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f36098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f36099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f36101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f36102r;

    public c0(d0 d0Var, Context context, XmlResourceParser xmlResourceParser) {
        this.f36086a = -1;
        this.f36087b = false;
        this.f36088c = -1;
        this.f36089d = -1;
        this.f36090e = 0;
        this.f36091f = null;
        this.f36092g = -1;
        this.f36093h = 400;
        this.f36094i = 0.0f;
        this.f36096k = new ArrayList();
        this.l = null;
        this.f36097m = new ArrayList();
        this.f36098n = 0;
        this.f36099o = false;
        this.f36100p = -1;
        this.f36102r = 0;
        int i11 = d0Var.f36126j;
        SparseArray sparseArray = d0Var.f36123g;
        this.f36093h = i11;
        this.f36101q = d0Var.f36127k;
        this.f36095j = d0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2528w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 2) {
                this.f36088c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f36088c);
                if ("layout".equals(resourceTypeName)) {
                    androidx.constraintlayout.widget.q qVar = new androidx.constraintlayout.widget.q();
                    qVar.k(context, this.f36088c);
                    sparseArray.append(this.f36088c, qVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f36088c = d0Var.i(context, this.f36088c);
                }
            } else if (index == 3) {
                this.f36089d = typedArrayObtainStyledAttributes.getResourceId(index, this.f36089d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f36089d);
                if ("layout".equals(resourceTypeName2)) {
                    androidx.constraintlayout.widget.q qVar2 = new androidx.constraintlayout.widget.q();
                    qVar2.k(context, this.f36089d);
                    sparseArray.append(this.f36089d, qVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f36089d = d0Var.i(context, this.f36089d);
                }
            } else if (index == 6) {
                int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i13 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f36092g = resourceId;
                    if (resourceId != -1) {
                        this.f36090e = -2;
                    }
                } else if (i13 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f36091f = string;
                    if (string != null) {
                        if (string.indexOf(ExpiryDateInput.SEPARATOR) > 0) {
                            this.f36092g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f36090e = -2;
                        } else {
                            this.f36090e = -1;
                        }
                    }
                } else {
                    this.f36090e = typedArrayObtainStyledAttributes.getInteger(index, this.f36090e);
                }
            } else if (index == 4) {
                int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f36093h);
                this.f36093h = i14;
                if (i14 < 8) {
                    this.f36093h = 8;
                }
            } else if (index == 8) {
                this.f36094i = typedArrayObtainStyledAttributes.getFloat(index, this.f36094i);
            } else if (index == 1) {
                this.f36098n = typedArrayObtainStyledAttributes.getInteger(index, this.f36098n);
            } else if (index == 0) {
                this.f36086a = typedArrayObtainStyledAttributes.getResourceId(index, this.f36086a);
            } else if (index == 9) {
                this.f36099o = typedArrayObtainStyledAttributes.getBoolean(index, this.f36099o);
            } else if (index == 7) {
                this.f36100p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f36101q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f36102r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f36089d == -1) {
            this.f36087b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public c0(d0 d0Var, int i11) {
        this.f36086a = -1;
        this.f36087b = false;
        this.f36088c = -1;
        this.f36089d = -1;
        this.f36090e = 0;
        this.f36091f = null;
        this.f36092g = -1;
        this.f36093h = 400;
        this.f36094i = 0.0f;
        this.f36096k = new ArrayList();
        this.l = null;
        this.f36097m = new ArrayList();
        this.f36098n = 0;
        this.f36099o = false;
        this.f36100p = -1;
        this.f36101q = 0;
        this.f36102r = 0;
        this.f36086a = -1;
        this.f36095j = d0Var;
        this.f36089d = R.id.view_transition;
        this.f36088c = i11;
        this.f36093h = d0Var.f36126j;
        this.f36101q = d0Var.f36127k;
    }

    public c0(d0 d0Var, c0 c0Var) {
        this.f36086a = -1;
        this.f36087b = false;
        this.f36088c = -1;
        this.f36089d = -1;
        this.f36090e = 0;
        this.f36091f = null;
        this.f36092g = -1;
        this.f36093h = 400;
        this.f36094i = 0.0f;
        this.f36096k = new ArrayList();
        this.l = null;
        this.f36097m = new ArrayList();
        this.f36098n = 0;
        this.f36099o = false;
        this.f36100p = -1;
        this.f36101q = 0;
        this.f36102r = 0;
        this.f36095j = d0Var;
        this.f36093h = d0Var.f36126j;
        if (c0Var != null) {
            this.f36100p = c0Var.f36100p;
            this.f36090e = c0Var.f36090e;
            this.f36091f = c0Var.f36091f;
            this.f36092g = c0Var.f36092g;
            this.f36093h = c0Var.f36093h;
            this.f36096k = c0Var.f36096k;
            this.f36094i = c0Var.f36094i;
            this.f36101q = c0Var.f36101q;
        }
    }
}
