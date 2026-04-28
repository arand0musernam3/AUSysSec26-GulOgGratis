package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e20.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import n20.f0;
import n20.g0;
import n20.h0;
import n20.j0;
import n20.o;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f12375k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se.b f12378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1.a f12379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer[] f12380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f12381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f12382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j0 f12384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12385j;

    public e(@NonNull Context context, AttributeSet attributeSet, int i11) {
        f0 f0VarB;
        XmlResourceParser xml;
        int next;
        j0 j0Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i11);
        this.f12376a = new ArrayList();
        this.f12377b = new ArrayList();
        this.f12378c = new se.b(this, 10);
        this.f12379d = new a1.a(this, 2);
        this.f12385j = true;
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24430x, i11, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM.hasValue(2)) {
            int resourceId = typedArrayM.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        j0Var = new j0();
                        j0Var.f30371c = new int[10][];
                        j0Var.f30372d = new jd.f[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    j0Var = null;
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    j0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.f12384i = j0Var;
            } else {
                j0Var = null;
                this.f12384i = j0Var;
            }
        }
        if (typedArrayM.hasValue(4)) {
            h0 h0VarB = h0.b(context2, typedArrayM, 4);
            this.f12382g = h0VarB;
            if (h0VarB == null) {
                g0 g0Var = new g0(o.a(context2, typedArrayM.getResourceId(4, 0), typedArrayM.getResourceId(5, 0)).a());
                this.f12382g = g0Var.f30310a != 0 ? new h0(g0Var) : null;
            }
        }
        if (typedArrayM.hasValue(3)) {
            n20.a aVar = new n20.a(0.0f);
            int resourceId2 = typedArrayM.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        f0 f0Var = new f0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            f0Var.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        f0VarB = f0Var;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    f0VarB = f0.b(aVar);
                }
            } else {
                f0VarB = f0.b(o.e(typedArrayM, 3, aVar));
            }
            this.f12381f = f0VarB;
        }
        this.f12383h = typedArrayM.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM.getBoolean(0, true));
        typedArrayM.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (c(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i11);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i11 - 1);
            if (this.f12383h <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f12383h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f12383h - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f12385j = true;
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f12378c);
        this.f12376a.add(materialButton.getShapeAppearanceModel());
        this.f12377b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.f12384i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
            if (c(i11)) {
                if (c(i11) && this.f12384i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i11);
                    j0 j0Var = this.f12384i;
                    int width = materialButton3.getWidth();
                    int i12 = -width;
                    for (int i13 = 0; i13 < j0Var.f30369a; i13++) {
                        ke.d dVar = (ke.d) j0Var.f30372d[i13].f24983b;
                        n20.i0 i0Var = (n20.i0) dVar.f26300b;
                        float f11 = dVar.f26299a;
                        if (i0Var == n20.i0.PIXELS) {
                            fMax = Math.max(i12, f11);
                        } else if (i0Var == n20.i0.PERCENT) {
                            fMax = Math.max(i12, width * f11);
                        }
                        i12 = (int) fMax;
                    }
                    int iMax = Math.max(0, i12);
                    int i14 = i11 - 1;
                    while (true) {
                        materialButton = null;
                        if (i14 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i14)) {
                                materialButton2 = (MaterialButton) getChildAt(i14);
                                break;
                            }
                            i14--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i15 = i11 + 1;
                    while (true) {
                        if (i15 >= childCount) {
                            break;
                        }
                        if (c(i15)) {
                            materialButton = (MaterialButton) getChildAt(i15);
                            break;
                        }
                        i15++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i16 = firstVisibleChildIndex;
        while (i16 <= lastVisibleChildIndex) {
            if (c(i16)) {
                ((MaterialButton) getChildAt(i16)).setSizeChange(this.f12384i);
                ((MaterialButton) getChildAt(i16)).setWidthChangeMax((i16 == firstVisibleChildIndex || i16 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i16++;
        }
    }

    public final boolean c(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    public final void d() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ((MaterialButton) getChildAt(i11)).recoverOriginalLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f12379d);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put((MaterialButton) getChildAt(i11), Integer.valueOf(i11));
        }
        this.f12380e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        g0 g0Var;
        int i11;
        if (!(this.f12381f == null && this.f12382g == null) && this.f12385j) {
            this.f12385j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i12 = 0;
            while (i12 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i12);
                if (materialButton.getVisibility() != 8) {
                    boolean z11 = i12 == firstVisibleChildIndex;
                    boolean z12 = i12 == lastVisibleChildIndex;
                    h0 h0Var = this.f12382g;
                    if (h0Var == null || (!z11 && !z12)) {
                        h0Var = (h0) this.f12377b.get(i12);
                    }
                    if (h0Var == null) {
                        g0Var = new g0((o) this.f12376a.get(i12));
                    } else {
                        g0 g0Var2 = new g0();
                        int i13 = h0Var.f30335a;
                        g0Var2.f30310a = i13;
                        g0Var2.f30311b = h0Var.f30336b;
                        int[][] iArr = h0Var.f30337c;
                        int[][] iArr2 = new int[iArr.length][];
                        g0Var2.f30312c = iArr2;
                        o[] oVarArr = h0Var.f30338d;
                        g0Var2.f30313d = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i13);
                        System.arraycopy(oVarArr, 0, g0Var2.f30313d, 0, g0Var2.f30310a);
                        g0Var2.f30314e = h0Var.f30339e;
                        g0Var2.f30315f = h0Var.f30340f;
                        g0Var2.f30316g = h0Var.f30341g;
                        g0Var2.f30317h = h0Var.f30342h;
                        g0Var = g0Var2;
                    }
                    boolean z13 = getOrientation() == 0;
                    boolean z14 = getLayoutDirection() == 1;
                    if (z13) {
                        i11 = z11 ? 5 : 0;
                        if (z12) {
                            i11 |= 10;
                        }
                        if (z14) {
                            i11 = ((i11 & 10) >> 1) | ((i11 & 5) << 1);
                        }
                    } else {
                        i11 = z11 ? 3 : 0;
                        if (z12) {
                            i11 |= 12;
                        }
                    }
                    int i14 = ~i11;
                    f0 f0Var = this.f12381f;
                    if ((i14 | 1) == i14) {
                        g0Var.f30314e = f0Var;
                    }
                    if ((i14 | 2) == i14) {
                        g0Var.f30315f = f0Var;
                    }
                    if ((i14 | 4) == i14) {
                        g0Var.f30316g = f0Var;
                    }
                    if ((i14 | 8) == i14) {
                        g0Var.f30317h = f0Var;
                    }
                    h0 h0Var2 = g0Var.f30310a == 0 ? null : new h0(g0Var);
                    if (h0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(h0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(h0Var2.c());
                    }
                }
                i12++;
            }
        }
    }

    public j0 getButtonSizeChange() {
        return this.f12384i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f12380e;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i12;
    }

    @NonNull
    public n20.d getInnerCornerSize() {
        return this.f12381f.f30306b;
    }

    @NonNull
    public f0 getInnerCornerSizeStateList() {
        return this.f12381f;
    }

    public o getShapeAppearance() {
        h0 h0Var = this.f12382g;
        if (h0Var == null) {
            return null;
        }
        return h0Var.c();
    }

    public int getSpacing() {
        return this.f12383h;
    }

    public h0 getStateListShapeAppearance() {
        return this.f12382g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        e();
        a();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f12376a.remove(iIndexOfChild);
            this.f12377b.remove(iIndexOfChild);
        }
        this.f12385j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(@NonNull j0 j0Var) {
        if (this.f12384i != j0Var) {
            this.f12384i = j0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ((MaterialButton) getChildAt(i11)).setEnabled(z11);
        }
    }

    public void setInnerCornerSize(@NonNull n20.d dVar) {
        this.f12381f = f0.b(dVar);
        this.f12385j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(@NonNull f0 f0Var) {
        this.f12381f = f0Var;
        this.f12385j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (getOrientation() != i11) {
            this.f12385j = true;
        }
        super.setOrientation(i11);
    }

    public void setShapeAppearance(o oVar) {
        g0 g0Var = new g0(oVar);
        this.f12382g = g0Var.f30310a == 0 ? null : new h0(g0Var);
        this.f12385j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i11) {
        this.f12383h = i11;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(h0 h0Var) {
        this.f12382g = h0Var;
        this.f12385j = true;
        e();
        invalidate();
    }

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public e(@NonNull Context context) {
        this(context, null);
    }
}
