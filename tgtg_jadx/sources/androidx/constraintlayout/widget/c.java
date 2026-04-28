package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.r;
import java.util.Arrays;
import java.util.HashMap;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f2359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n6.m f2362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View[] f2365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f2366h;

    public c(Context context) {
        super(context);
        this.f2359a = new int[32];
        this.f2365g = null;
        this.f2366h = new HashMap();
        this.f2361c = context;
        i(null);
    }

    public final void b(String str) {
        if (str.length() == 0 || this.f2361c == null) {
            return;
        }
        String strTrim = str.trim();
        int iH = h(strTrim);
        if (iH != 0) {
            this.f2366h.put(Integer.valueOf(iH), strTrim);
            c(iH);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void c(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.f2360b + 1;
        int[] iArr = this.f2359a;
        if (i12 > iArr.length) {
            this.f2359a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2359a;
        int i13 = this.f2360b;
        iArr2[i13] = i11;
        this.f2360b = i13 + 1;
    }

    public final void d(String str) {
        if (str.length() == 0 || this.f2361c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && strTrim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.f2360b; i11++) {
            View viewById = constraintLayout.getViewById(this.f2359a[i11]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f2361c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = constraintLayout.getChildAt(i11);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2359a, this.f2360b);
    }

    public final int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iG = ((Integer) designInformation).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = u.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iG != 0) {
            return iG;
        }
        Context context = this.f2361c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f2508b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2363e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2364f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void j(l lVar, n6.m mVar, r.a aVar, SparseArray sparseArray) {
        m mVar2 = lVar.f2407e;
        int[] iArr = mVar2.f2431j0;
        int i11 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = mVar2.f2433k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = mVar2.f2433k0.split(MessageLogView.COMMA_SEPARATOR);
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i12 = 0;
                    for (String str2 : strArrSplit) {
                        int iH = h(str2.trim());
                        if (iH != 0) {
                            iArrCopyOf[i12] = iH;
                            i12++;
                        }
                    }
                    if (i12 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
                    }
                    mVar2.f2431j0 = iArrCopyOf;
                } else {
                    mVar2.f2431j0 = null;
                }
            }
        }
        mVar.f30655w0 = 0;
        Arrays.fill(mVar.f30654v0, (Object) null);
        if (mVar2.f2431j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = mVar2.f2431j0;
            if (i11 >= iArr2.length) {
                return;
            }
            n6.g gVar = (n6.g) sparseArray.get(iArr2[i11]);
            if (gVar != null) {
                mVar.W(gVar);
            }
            i11++;
        }
    }

    public final void l() {
        if (this.f2362d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f2338q0 = this.f2362d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2363e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2364f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2363e = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f2360b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                b(str.substring(i11));
                return;
            } else {
                b(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2364f = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f2360b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                d(str.substring(i11));
                return;
            } else {
                d(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2363e = null;
        this.f2360b = 0;
        for (int i11 : iArr) {
            c(i11);
        }
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f2363e == null) {
            c(i11);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2359a = new int[32];
        this.f2365g = null;
        this.f2366h = new HashMap();
        this.f2361c = context;
        i(attributeSet);
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2359a = new int[32];
        this.f2365g = null;
        this.f2366h = new HashMap();
        this.f2361c = context;
        i(attributeSet);
    }

    public void k(n6.g gVar, boolean z11) {
    }
}
