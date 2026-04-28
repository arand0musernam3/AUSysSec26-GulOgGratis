package s6;

import a40.d0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f38839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f38849k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f38853p;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38840b = false;
        this.f38841c = 0;
        this.f38842d = 0;
        this.f38843e = -1;
        this.f38844f = -1;
        this.f38845g = 0;
        this.f38846h = 0;
        this.f38853p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.f37733b);
        this.f38841c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f38844f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f38842d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f38843e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f38845g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f38846h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f38840b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2544t;
            b bVar = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2544t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2546v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2545u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    d0.o("Could not inflate Behavior subclass ".concat(string), e5);
                    throw null;
                }
            }
            this.f38839a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f38839a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public final boolean a(int i11) {
        if (i11 == 0) {
            return this.f38850m;
        }
        if (i11 != 1) {
            return false;
        }
        return this.f38851n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f38839a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.j();
            }
            this.f38839a = bVar;
            this.f38840b = true;
            if (bVar != null) {
                bVar.g(this);
            }
        }
    }

    public e() {
        super(-2, -2);
        this.f38840b = false;
        this.f38841c = 0;
        this.f38842d = 0;
        this.f38843e = -1;
        this.f38844f = -1;
        this.f38845g = 0;
        this.f38846h = 0;
        this.f38853p = new Rect();
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f38840b = false;
        this.f38841c = 0;
        this.f38842d = 0;
        this.f38843e = -1;
        this.f38844f = -1;
        this.f38845g = 0;
        this.f38846h = 0;
        this.f38853p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f38840b = false;
        this.f38841c = 0;
        this.f38842d = 0;
        this.f38843e = -1;
        this.f38844f = -1;
        this.f38845g = 0;
        this.f38846h = 0;
        this.f38853p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f38840b = false;
        this.f38841c = 0;
        this.f38842d = 0;
        this.f38843e = -1;
        this.f38844f = -1;
        this.f38845g = 0;
        this.f38846h = 0;
        this.f38853p = new Rect();
    }
}
