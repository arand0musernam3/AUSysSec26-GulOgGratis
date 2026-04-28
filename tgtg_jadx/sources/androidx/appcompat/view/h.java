package androidx.appcompat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.braze.h2;
import java.lang.reflect.Constructor;
import o.o;
import o.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ i E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f1862a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1872k;
    public CharSequence l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f1874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f1876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f1885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f1886z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1863b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1864c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1865d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1866e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1867f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1868g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f1862a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f1891c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        i iVar = this.E;
        Context context = iVar.f1891c;
        boolean z11 = false;
        menuItem.setChecked(this.f1879s).setVisible(this.f1880t).setEnabled(this.f1881u).setCheckable(this.f1878r >= 1).setTitleCondensed(this.l).setIcon(this.f1873m);
        int i11 = this.f1882v;
        if (i11 >= 0) {
            menuItem.setShowAsAction(i11);
        }
        if (this.f1885y != null) {
            if (context.isRestricted()) {
                h2.b("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (iVar.f1892d == null) {
                iVar.f1892d = i.a(context);
            }
            Object obj = iVar.f1892d;
            String str = this.f1885y;
            g gVar = new g();
            gVar.f1860a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f1861b = cls.getMethod(str, g.f1859c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e5) {
                StringBuilder sbS = e0.f.s("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbS.append(cls.getName());
                InflateException inflateException = new InflateException(sbS.toString());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f1878r >= 2) {
            if (menuItem instanceof o.n) {
                ((o.n) menuItem).f(true);
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                a7.a aVar = sVar.f31602c;
                try {
                    if (sVar.f31603d == null) {
                        sVar.f31603d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f31603d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f1884x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, i.f1887e, iVar.f1889a));
            z11 = true;
        }
        int i12 = this.f1883w;
        if (i12 > 0) {
            if (z11) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i12);
            }
        }
        o oVar = this.f1886z;
        if (oVar != null) {
            if (menuItem instanceof a7.a) {
                ((a7.a) menuItem).c(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof a7.a;
        if (z12) {
            ((a7.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((a7.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c3 = this.f1874n;
        int i13 = this.f1875o;
        if (z12) {
            ((a7.a) menuItem).setAlphabeticShortcut(c3, i13);
        } else {
            menuItem.setAlphabeticShortcut(c3, i13);
        }
        char c7 = this.f1876p;
        int i14 = this.f1877q;
        if (z12) {
            ((a7.a) menuItem).setNumericShortcut(c7, i14);
        } else {
            menuItem.setNumericShortcut(c7, i14);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((a7.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((a7.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
