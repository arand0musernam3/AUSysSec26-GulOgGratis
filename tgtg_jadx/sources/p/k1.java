package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.app.tgtg.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f33925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i1 f33931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f33933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m7.c f33935k;
    public a8.f l;

    public k1(Context context, boolean z11) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f33925a = new Rect();
        this.f33926b = 0;
        this.f33927c = 0;
        this.f33928d = 0;
        this.f33929e = 0;
        this.f33933i = z11;
        setCacheColorHint(0);
    }

    public final int a(int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i11, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i12) {
                return i12;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f33925a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.l != null) {
            return;
        }
        super.drawableStateChanged();
        i1 i1Var = this.f33931g;
        if (i1Var != null) {
            i1Var.f33912b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f33934j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f33933i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f33933i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f33933i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f33933i && this.f33932h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.l == null) {
            a8.f fVar = new a8.f(this, 9);
            this.l = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !g1.f33902d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        g1.f33899a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        g1.f33900b.invoke(this, Integer.valueOf(iPointToPosition));
                        g1.f33901c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f33934j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33930f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        a8.f fVar = this.l;
        if (fVar != null) {
            k1 k1Var = (k1) fVar.f970b;
            k1Var.l = null;
            k1Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z11) {
        this.f33932h = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        i1 i1Var = null;
        if (drawable != null) {
            i1 i1Var2 = new i1();
            Drawable drawable2 = i1Var2.f33911a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            i1Var2.f33911a = drawable;
            drawable.setCallback(i1Var2);
            i1Var2.f33912b = true;
            i1Var = i1Var2;
        }
        this.f33931g = i1Var;
        super.setSelector(i1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f33926b = rect.left;
        this.f33927c = rect.top;
        this.f33928d = rect.right;
        this.f33929e = rect.bottom;
    }
}
