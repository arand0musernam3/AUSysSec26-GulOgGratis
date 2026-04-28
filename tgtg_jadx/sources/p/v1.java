package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class v1 implements o.b0 {
    public static final Method A;
    public static final Method B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f34041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k1 f34042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34050k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s1 f34052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f34053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f34054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f34055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r1 f34056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u1 f34057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1 f34058t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r1 f34059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f34060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f34061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rect f34062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34063y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t f34064z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public v1(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f34043d = -2;
        this.f34044e = -2;
        this.f34047h = AppConstants.RESULT_CODE_AUTO_REFUND;
        this.l = 0;
        this.f34051m = Integer.MAX_VALUE;
        this.f34056r = new r1(this, 1);
        this.f34057s = new u1(this, 0);
        this.f34058t = new t1(this);
        this.f34059u = new r1(this, 0);
        this.f34061w = new Rect();
        this.f34040a = context;
        this.f34060v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24267p, i11, 0);
        this.f34045f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f34046g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f34048i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i11, 0);
        tVar.a(context, attributeSet, i11);
        this.f34064z = tVar;
        tVar.setInputMethodMode(1);
    }

    @Override // o.b0
    public final boolean a() {
        return this.f34064z.isShowing();
    }

    public final int b() {
        return this.f34045f;
    }

    public final void d(int i11) {
        this.f34045f = i11;
    }

    @Override // o.b0
    public final void dismiss() {
        t tVar = this.f34064z;
        tVar.dismiss();
        tVar.setContentView(null);
        this.f34042c = null;
        this.f34060v.removeCallbacks(this.f34056r);
    }

    public final Drawable f() {
        return this.f34064z.getBackground();
    }

    @Override // o.b0
    public final k1 g() {
        return this.f34042c;
    }

    public final void j(Drawable drawable) {
        this.f34064z.setBackgroundDrawable(drawable);
    }

    public final void k(int i11) {
        this.f34046g = i11;
        this.f34048i = true;
    }

    public final int n() {
        if (this.f34048i) {
            return this.f34046g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        s1 s1Var = this.f34052n;
        if (s1Var == null) {
            this.f34052n = new s1(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f34041b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(s1Var);
            }
        }
        this.f34041b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f34052n);
        }
        k1 k1Var = this.f34042c;
        if (k1Var != null) {
            k1Var.setAdapter(this.f34041b);
        }
    }

    public k1 p(Context context, boolean z11) {
        return new k1(context, z11);
    }

    public final void q(int i11) {
        Drawable background = this.f34064z.getBackground();
        if (background == null) {
            this.f34044e = i11;
            return;
        }
        Rect rect = this.f34061w;
        background.getPadding(rect);
        this.f34044e = rect.left + rect.right + i11;
    }

    @Override // o.b0
    public final void show() {
        int i11;
        int paddingBottom;
        k1 k1Var;
        k1 k1Var2 = this.f34042c;
        Context context = this.f34040a;
        t tVar = this.f34064z;
        if (k1Var2 == null) {
            k1 k1VarP = p(context, !this.f34063y);
            this.f34042c = k1VarP;
            k1VarP.setAdapter(this.f34041b);
            this.f34042c.setOnItemClickListener(this.f34054p);
            this.f34042c.setFocusable(true);
            this.f34042c.setFocusableInTouchMode(true);
            this.f34042c.setOnItemSelectedListener(new o1(this, 0));
            this.f34042c.setOnScrollListener(this.f34058t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f34055q;
            if (onItemSelectedListener != null) {
                this.f34042c.setOnItemSelectedListener(onItemSelectedListener);
            }
            tVar.setContentView(this.f34042c);
        }
        Drawable background = tVar.getBackground();
        Rect rect = this.f34061w;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i11 = rect.bottom + i12;
            if (!this.f34048i) {
                this.f34046g = -i12;
            }
        } else {
            rect.setEmpty();
            i11 = 0;
        }
        int iA = p1.a(tVar, this.f34053o, this.f34046g, tVar.getInputMethodMode() == 2);
        int i13 = this.f34043d;
        if (i13 == -1) {
            paddingBottom = iA + i11;
        } else {
            int i14 = this.f34044e;
            int iA2 = this.f34042c.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f34042c.getPaddingBottom() + this.f34042c.getPaddingTop() + i11 : 0);
        }
        boolean z11 = tVar.getInputMethodMode() == 2;
        tVar.setWindowLayoutType(this.f34047h);
        if (tVar.isShowing()) {
            if (this.f34053o.isAttachedToWindow()) {
                int width = this.f34044e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f34053o.getWidth();
                }
                if (i13 == -1) {
                    i13 = z11 ? paddingBottom : -1;
                    int i15 = this.f34044e;
                    if (z11) {
                        tVar.setWidth(i15 == -1 ? -1 : 0);
                        tVar.setHeight(0);
                    } else {
                        tVar.setWidth(i15 == -1 ? -1 : 0);
                        tVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                tVar.setOutsideTouchable(true);
                int i16 = width;
                View view = this.f34053o;
                int i17 = this.f34045f;
                int i18 = this.f34046g;
                int i19 = i16 < 0 ? -1 : i16;
                if (i13 < 0) {
                    i13 = -1;
                }
                tVar.update(view, i17, i18, i19, i13);
                return;
            }
            return;
        }
        int width2 = this.f34044e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f34053o.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        tVar.setWidth(width2);
        tVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(tVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            q1.b(tVar, true);
        }
        tVar.setOutsideTouchable(true);
        tVar.setTouchInterceptor(this.f34057s);
        if (this.f34050k) {
            tVar.setOverlapAnchor(this.f34049j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(tVar, this.f34062x);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            q1.a(tVar, this.f34062x);
        }
        tVar.showAsDropDown(this.f34053o, this.f34045f, this.f34046g, this.l);
        this.f34042c.setSelection(-1);
        if ((!this.f34063y || this.f34042c.isInTouchMode()) && (k1Var = this.f34042c) != null) {
            k1Var.setListSelectionHidden(true);
            k1Var.requestLayout();
        }
        if (this.f34063y) {
            return;
        }
        this.f34060v.post(this.f34059u);
    }

    public v1(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public v1(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }
}
