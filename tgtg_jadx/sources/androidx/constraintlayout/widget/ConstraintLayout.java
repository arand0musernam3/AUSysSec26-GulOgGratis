package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static w sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<c> mConstraintHelpers;
    protected j mConstraintLayoutSpec;
    private q mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected n6.h mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    f mMeasurer;
    private g6.d mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<g> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<n6.g> mTempMapIdToWidget;

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new n6.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(null, 0, 0);
    }

    public static /* synthetic */ g6.d access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static w getSharedValues() {
        if (sSharedValues == null) {
            w wVar = new w();
            new SparseIntArray();
            wVar.f2532a = new HashMap();
            sSharedValues = wVar;
        }
        return sSharedValues;
    }

    public void addValueModifier(g gVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r15, android.view.View r16, n6.g r17, androidx.constraintlayout.widget.ConstraintLayout.a r18, android.util.SparseArray<n6.g> r19) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, n6.g, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    public final void b(AttributeSet attributeSet, int i11, int i12) {
        n6.h hVar = this.mLayoutWidget;
        hVar.f30591i0 = this;
        f fVar = this.mMeasurer;
        hVar.f30623z0 = fVar;
        hVar.f30621x0.f809g = fVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f2508b, i11, i12);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        q qVar = new q();
                        this.mConstraintSet = qVar;
                        qVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        n6.h hVar2 = this.mLayoutWidget;
        hVar2.I0 = this.mOptimizationLevel;
        g6.c.f20022q = hVar2.d0(512);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(MessageLogView.COMMA_SEPARATOR);
                    if (strArrSplit.length == 4) {
                        int i13 = Integer.parseInt(strArrSplit[0]);
                        int i14 = Integer.parseInt(strArrSplit[1]);
                        int i15 = Integer.parseInt(strArrSplit[2]);
                        int i16 = (int) ((i13 / 1080.0f) * width);
                        int i17 = (int) ((i14 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f11 = i16;
                        float f12 = i17;
                        float f13 = i16 + ((int) ((i15 / 1080.0f) * width));
                        canvas.drawLine(f11, f12, f13, f12, paint);
                        float f14 = i17 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f13, f12, f13, f14, paint);
                        canvas.drawLine(f13, f14, f11, f14, paint);
                        canvas.drawLine(f11, f14, f11, f12, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f11, f12, f13, f14, paint);
                        canvas.drawLine(f11, f14, f13, f12, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i11, int i12) {
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i11);
        View.MeasureSpec.getSize(i12);
        Iterator<g> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                org.bouncycastle.jce.provider.a.c();
                return false;
            }
            Iterator it2 = this.mLayoutWidget.f30619v0.iterator();
            if (it2.hasNext()) {
                View view = (View) ((n6.g) it2.next()).f30591i0;
                view.getId();
                throw null;
            }
        }
        return false;
    }

    public void fillMetrics(g6.d dVar) {
        this.mLayoutWidget.B0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i11, Object obj) {
        if (i11 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f30594k == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f30594k = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f30594k = "parent";
            }
        }
        n6.h hVar = this.mLayoutWidget;
        if (hVar.f30596l0 == null) {
            hVar.f30596l0 = hVar.f30594k;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f30596l0);
        }
        for (n6.g gVar : this.mLayoutWidget.f30619v0) {
            View view = (View) gVar.f30591i0;
            if (view != null) {
                if (gVar.f30594k == null && (id2 = view.getId()) != -1) {
                    gVar.f30594k = getContext().getResources().getResourceEntryName(id2);
                }
                if (gVar.f30596l0 == null) {
                    gVar.f30596l0 = gVar.f30594k;
                    Log.v(TAG, " setDebugName " + gVar.f30596l0);
                }
            }
        }
        this.mLayoutWidget.p(sb2);
        return sb2.toString();
    }

    public View getViewById(int i11) {
        return this.mChildrenByIds.get(i11);
    }

    public final n6.g getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f2338q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f2338q0;
        }
        return null;
    }

    public final void i(n6.g gVar, a aVar, SparseArray sparseArray, int i11, n6.c cVar) {
        View view = this.mChildrenByIds.get(i11);
        n6.g gVar2 = (n6.g) sparseArray.get(i11);
        if (gVar2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f2311c0 = USE_CONSTRAINTS_HELPER;
        n6.c cVar2 = n6.c.BASELINE;
        if (cVar == cVar2) {
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f2311c0 = USE_CONSTRAINTS_HELPER;
            aVar2.f2338q0.F = USE_CONSTRAINTS_HELPER;
        }
        gVar.k(cVar2).b(gVar2.k(cVar), aVar.D, aVar.C, USE_CONSTRAINTS_HELPER);
        gVar.F = USE_CONSTRAINTS_HELPER;
        gVar.k(n6.c.TOP).j();
        gVar.k(n6.c.BOTTOM).j();
    }

    public boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return USE_CONSTRAINTS_HELPER;
    }

    public void loadLayoutDescription(int i11) {
        if (i11 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new j(getContext(), this, i11);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            a aVar = (a) childAt.getLayoutParams();
            n6.g gVar = aVar.f2338q0;
            if ((childAt.getVisibility() != 8 || aVar.f2313d0 || aVar.f2315e0 || zIsInEditMode) && !aVar.f2317f0) {
                int iT = gVar.t();
                int iU = gVar.u();
                int iS = gVar.s() + iT;
                int iM = gVar.m() + iU;
                childAt.layout(iT, iU, iS, iM);
                if ((childAt instanceof t) && (content = ((t) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iT, iU, iS, iM);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.mConstraintHelpers.get(i16).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        String str;
        int iG;
        n6.g gVar;
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i11, i12);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        int i13 = 0;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (getChildAt(i14).isLayoutRequested()) {
                    this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
                    break;
                }
                i14++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i11;
        this.mOnMeasureHeightMeasureSpec = i12;
        this.mLayoutWidget.A0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    z11 = false;
                    break;
                } else {
                    if (getChildAt(i15).isLayoutRequested()) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (z11) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    n6.g viewWidget = getViewWidget(getChildAt(i16));
                    if (viewWidget != null) {
                        viewWidget.E();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = getChildAt(i17);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                gVar = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                gVar = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).f2338q0;
                            }
                            gVar.f30596l0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        View childAt2 = getChildAt(i18);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof r)) {
                            this.mConstraintSet = ((r) childAt2).getConstraintSet();
                        }
                    }
                }
                q qVar = this.mConstraintSet;
                if (qVar != null) {
                    qVar.c(this);
                }
                this.mLayoutWidget.f30619v0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        c cVar = this.mConstraintHelpers.get(i19);
                        HashMap map = cVar.f2366h;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f2363e);
                        }
                        n6.m mVar = cVar.f2362d;
                        if (mVar != null) {
                            mVar.f30655w0 = i13;
                            Arrays.fill(mVar.f30654v0, obj);
                            for (int i21 = i13; i21 < cVar.f2360b; i21++) {
                                int i22 = cVar.f2359a[i21];
                                View viewById = getViewById(i22);
                                if (viewById == null && (iG = cVar.g(this, (str = (String) map.get(Integer.valueOf(i22))))) != 0) {
                                    cVar.f2359a[i21] = iG;
                                    map.put(Integer.valueOf(iG), str);
                                    viewById = getViewById(iG);
                                }
                                View view = viewById;
                                if (view != null) {
                                    cVar.f2362d.W(getViewWidget(view));
                                }
                            }
                            cVar.f2362d.Y();
                        }
                        i19++;
                        i13 = 0;
                        obj = null;
                    }
                }
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt3 = getChildAt(i23);
                    if (childAt3 instanceof t) {
                        t tVar = (t) childAt3;
                        if (tVar.f2504a == -1 && !tVar.isInEditMode()) {
                            tVar.setVisibility(tVar.f2506c);
                        }
                        View viewFindViewById2 = findViewById(tVar.f2504a);
                        tVar.f2505b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((a) viewFindViewById2.getLayoutParams()).f2317f0 = USE_CONSTRAINTS_HELPER;
                            tVar.f2505b.setVisibility(0);
                            tVar.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i24 = 0; i24 < childCount3; i24++) {
                    View childAt4 = getChildAt(i24);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt5 = getChildAt(i25);
                    n6.g viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        a aVar = (a) childAt5.getLayoutParams();
                        this.mLayoutWidget.W(viewWidget2);
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, aVar, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z11) {
                n6.h hVar = this.mLayoutWidget;
                hVar.f30620w0.G(hVar);
            }
        }
        this.mLayoutWidget.B0.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i11, i12);
        int iS = this.mLayoutWidget.s();
        int iM = this.mLayoutWidget.m();
        n6.h hVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i11, i12, iS, iM, hVar2.J0, hVar2.K0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        n6.g viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof n6.l)) {
            a aVar = (a) view.getLayoutParams();
            n6.l lVar = new n6.l();
            aVar.f2338q0 = lVar;
            aVar.f2313d0 = USE_CONSTRAINTS_HELPER;
            lVar.X(aVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.l();
            ((a) view.getLayoutParams()).f2315e0 = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(cVar)) {
                this.mConstraintHelpers.add(cVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        n6.g viewWidget = getViewWidget(view);
        this.mLayoutWidget.f30619v0.remove(viewWidget);
        viewWidget.E();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = new j(getContext(), this, i11);
    }

    public void removeValueModifier(g gVar) {
        if (gVar == null) {
            return;
        }
        this.mModifiers.remove(gVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        f fVar = this.mMeasurer;
        int i15 = fVar.f2373e;
        int iResolveSizeAndState = View.resolveSizeAndState(i13 + fVar.f2372d, i11, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z11) {
            iMin |= 16777216;
        }
        if (z12) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(n6.h hVar, int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        f fVar = this.mMeasurer;
        fVar.f2370b = iMax;
        fVar.f2371c = iMax2;
        fVar.f2372d = paddingWidth;
        fVar.f2373e = i14;
        fVar.f2374f = i12;
        fVar.f2375g = i13;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        setSelfDimensionBehaviour(hVar, mode, i15, mode2, i16);
        hVar.b0(i11, mode, i15, mode2, i16, iMax3, iMax);
    }

    public void setConstraintSet(q qVar) {
        this.mConstraintSet = qVar;
    }

    public void setDesignInformation(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(ExpiryDateInput.SEPARATOR);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.mChildrenByIds.remove(getId());
        super.setId(i11);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(s sVar) {
        j jVar = this.mConstraintLayoutSpec;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i11) {
        this.mOptimizationLevel = i11;
        n6.h hVar = this.mLayoutWidget;
        hVar.I0 = i11;
        g6.c.f20022q = hVar.d0(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 n6.f) = (r2v3 n6.f), (r2v0 n6.f) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(n6.h r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.f r0 = r7.mMeasurer
            int r1 = r0.f2373e
            int r0 = r0.f2372d
            n6.f r2 = n6.f.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            n6.f r9 = n6.f.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            n6.f r9 = n6.f.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            n6.f r2 = n6.f.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            n6.f r2 = n6.f.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.s()
            r3 = 1
            if (r10 != r11) goto L6a
            int r11 = r8.m()
            if (r12 == r11) goto L6e
        L6a:
            a40.x r11 = r8.f30621x0
            r11.f805c = r3
        L6e:
            r8.f30577b0 = r5
            r8.f30579c0 = r5
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            int[] r4 = r8.D
            r4[r5] = r11
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r4[r3] = r11
            r8.f30583e0 = r5
            r8.f30585f0 = r5
            r8.P(r9)
            r8.T(r10)
            r8.R(r2)
            r8.O(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            if (r9 >= 0) goto L96
            r8.f30583e0 = r5
            goto L98
        L96:
            r8.f30583e0 = r9
        L98:
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            if (r9 >= 0) goto La0
            r8.f30585f0 = r5
            return
        La0:
            r8.f30585f0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(n6.h, int, int, int, int):void");
    }

    public void setState(int i11, int i12, int i13) {
        j jVar = this.mConstraintLayoutSpec;
        if (jVar != null) {
            jVar.b(i12, i13, i11);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new n6.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new n6.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attributeSet, i11, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new n6.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attributeSet, i11, i12);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2306a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f2307a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2308b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f2309b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2310c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f2311c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2312d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public boolean f2313d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2314e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f2315e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2316f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f2317f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2318g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f2319g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2320h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f2321h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2322i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f2323i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2324j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f2325j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2326k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f2327k0;
        public int l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f2328l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2329m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f2330m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2331n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f2332n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2333o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f2334o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2335p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f2336p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2337q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public n6.g f2338q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f2339r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2340s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2341t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2342u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2343v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f2344w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f2345x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f2346y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f2347z;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2306a = -1;
            this.f2308b = -1;
            this.f2310c = -1.0f;
            this.f2312d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2314e = -1;
            this.f2316f = -1;
            this.f2318g = -1;
            this.f2320h = -1;
            this.f2322i = -1;
            this.f2324j = -1;
            this.f2326k = -1;
            this.l = -1;
            this.f2329m = -1;
            this.f2331n = -1;
            this.f2333o = -1;
            this.f2335p = -1;
            this.f2337q = 0;
            this.f2339r = 0.0f;
            this.f2340s = -1;
            this.f2341t = -1;
            this.f2342u = -1;
            this.f2343v = -1;
            this.f2344w = Integer.MIN_VALUE;
            this.f2345x = Integer.MIN_VALUE;
            this.f2346y = Integer.MIN_VALUE;
            this.f2347z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2307a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2309b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2311c0 = false;
            this.f2313d0 = false;
            this.f2315e0 = false;
            this.f2317f0 = false;
            this.f2319g0 = -1;
            this.f2321h0 = -1;
            this.f2323i0 = -1;
            this.f2325j0 = -1;
            this.f2327k0 = Integer.MIN_VALUE;
            this.f2328l0 = Integer.MIN_VALUE;
            this.f2330m0 = 0.5f;
            this.f2338q0 = new n6.g();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f2508b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = e.f2368a.get(index);
                switch (i12) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2335p);
                        this.f2335p = resourceId;
                        if (resourceId == -1) {
                            this.f2335p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f2337q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2337q);
                        break;
                    case 4:
                        float f11 = typedArrayObtainStyledAttributes.getFloat(index, this.f2339r) % 360.0f;
                        this.f2339r = f11;
                        if (f11 < 0.0f) {
                            this.f2339r = (360.0f - f11) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f2306a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2306a);
                        break;
                    case 6:
                        this.f2308b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2308b);
                        break;
                    case 7:
                        this.f2310c = typedArrayObtainStyledAttributes.getFloat(index, this.f2310c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2314e);
                        this.f2314e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2314e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2316f);
                        this.f2316f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2316f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2318g);
                        this.f2318g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2318g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2320h);
                        this.f2320h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2320h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2322i);
                        this.f2322i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2322i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2324j);
                        this.f2324j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2324j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2326k);
                        this.f2326k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2326k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2329m);
                        this.f2329m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2329m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2340s);
                        this.f2340s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2340s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2341t);
                        this.f2341t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2341t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2342u);
                        this.f2342u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2342u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2343v);
                        this.f2343v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2343v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f2344w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2344w);
                        break;
                    case 22:
                        this.f2345x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2345x);
                        break;
                    case 23:
                        this.f2346y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2346y);
                        break;
                    case 24:
                        this.f2347z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2347z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case BERTags.DATE /* 31 */:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i14;
                        if (i14 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case BERTags.DURATION /* 34 */:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                q.o(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2331n);
                                this.f2331n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2331n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2333o);
                                this.f2333o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2333o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        q.n(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        q.n(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f2312d = typedArrayObtainStyledAttributes.getBoolean(index, this.f2312d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f2313d0 = false;
            this.f2307a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2309b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.W) {
                this.f2307a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.X) {
                this.f2309b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2307a0 = false;
                if (i11 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f2309b0 = false;
                if (i12 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.f2310c == -1.0f && this.f2306a == -1 && this.f2308b == -1) {
                return;
            }
            this.f2313d0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2307a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2309b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (!(this.f2338q0 instanceof n6.l)) {
                this.f2338q0 = new n6.l();
            }
            ((n6.l) this.f2338q0).X(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r12) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2306a = -1;
            this.f2308b = -1;
            this.f2310c = -1.0f;
            this.f2312d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2314e = -1;
            this.f2316f = -1;
            this.f2318g = -1;
            this.f2320h = -1;
            this.f2322i = -1;
            this.f2324j = -1;
            this.f2326k = -1;
            this.l = -1;
            this.f2329m = -1;
            this.f2331n = -1;
            this.f2333o = -1;
            this.f2335p = -1;
            this.f2337q = 0;
            this.f2339r = 0.0f;
            this.f2340s = -1;
            this.f2341t = -1;
            this.f2342u = -1;
            this.f2343v = -1;
            this.f2344w = Integer.MIN_VALUE;
            this.f2345x = Integer.MIN_VALUE;
            this.f2346y = Integer.MIN_VALUE;
            this.f2347z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2307a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2309b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2311c0 = false;
            this.f2313d0 = false;
            this.f2315e0 = false;
            this.f2317f0 = false;
            this.f2319g0 = -1;
            this.f2321h0 = -1;
            this.f2323i0 = -1;
            this.f2325j0 = -1;
            this.f2327k0 = Integer.MIN_VALUE;
            this.f2328l0 = Integer.MIN_VALUE;
            this.f2330m0 = 0.5f;
            this.f2338q0 = new n6.g();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.f2306a = aVar.f2306a;
                this.f2308b = aVar.f2308b;
                this.f2310c = aVar.f2310c;
                this.f2312d = aVar.f2312d;
                this.f2314e = aVar.f2314e;
                this.f2316f = aVar.f2316f;
                this.f2318g = aVar.f2318g;
                this.f2320h = aVar.f2320h;
                this.f2322i = aVar.f2322i;
                this.f2324j = aVar.f2324j;
                this.f2326k = aVar.f2326k;
                this.l = aVar.l;
                this.f2329m = aVar.f2329m;
                this.f2331n = aVar.f2331n;
                this.f2333o = aVar.f2333o;
                this.f2335p = aVar.f2335p;
                this.f2337q = aVar.f2337q;
                this.f2339r = aVar.f2339r;
                this.f2340s = aVar.f2340s;
                this.f2341t = aVar.f2341t;
                this.f2342u = aVar.f2342u;
                this.f2343v = aVar.f2343v;
                this.f2344w = aVar.f2344w;
                this.f2345x = aVar.f2345x;
                this.f2346y = aVar.f2346y;
                this.f2347z = aVar.f2347z;
                this.A = aVar.A;
                this.B = aVar.B;
                this.C = aVar.C;
                this.D = aVar.D;
                this.E = aVar.E;
                this.F = aVar.F;
                this.G = aVar.G;
                this.H = aVar.H;
                this.I = aVar.I;
                this.J = aVar.J;
                this.K = aVar.K;
                this.W = aVar.W;
                this.X = aVar.X;
                this.L = aVar.L;
                this.M = aVar.M;
                this.N = aVar.N;
                this.P = aVar.P;
                this.O = aVar.O;
                this.Q = aVar.Q;
                this.R = aVar.R;
                this.S = aVar.S;
                this.T = aVar.T;
                this.U = aVar.U;
                this.V = aVar.V;
                this.f2307a0 = aVar.f2307a0;
                this.f2309b0 = aVar.f2309b0;
                this.f2311c0 = aVar.f2311c0;
                this.f2313d0 = aVar.f2313d0;
                this.f2319g0 = aVar.f2319g0;
                this.f2321h0 = aVar.f2321h0;
                this.f2323i0 = aVar.f2323i0;
                this.f2325j0 = aVar.f2325j0;
                this.f2327k0 = aVar.f2327k0;
                this.f2328l0 = aVar.f2328l0;
                this.f2330m0 = aVar.f2330m0;
                this.Y = aVar.Y;
                this.Z = aVar.Z;
                this.f2338q0 = aVar.f2338q0;
            }
        }

        public a(int i11, int i12) {
            super(i11, i12);
            this.f2306a = -1;
            this.f2308b = -1;
            this.f2310c = -1.0f;
            this.f2312d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2314e = -1;
            this.f2316f = -1;
            this.f2318g = -1;
            this.f2320h = -1;
            this.f2322i = -1;
            this.f2324j = -1;
            this.f2326k = -1;
            this.l = -1;
            this.f2329m = -1;
            this.f2331n = -1;
            this.f2333o = -1;
            this.f2335p = -1;
            this.f2337q = 0;
            this.f2339r = 0.0f;
            this.f2340s = -1;
            this.f2341t = -1;
            this.f2342u = -1;
            this.f2343v = -1;
            this.f2344w = Integer.MIN_VALUE;
            this.f2345x = Integer.MIN_VALUE;
            this.f2346y = Integer.MIN_VALUE;
            this.f2347z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2307a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2309b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f2311c0 = false;
            this.f2313d0 = false;
            this.f2315e0 = false;
            this.f2317f0 = false;
            this.f2319g0 = -1;
            this.f2321h0 = -1;
            this.f2323i0 = -1;
            this.f2325j0 = -1;
            this.f2327k0 = Integer.MIN_VALUE;
            this.f2328l0 = Integer.MIN_VALUE;
            this.f2330m0 = 0.5f;
            this.f2338q0 = new n6.g();
        }
    }
}
