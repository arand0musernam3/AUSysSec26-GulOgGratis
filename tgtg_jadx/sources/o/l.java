package o;

import a3.a3;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f31543y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f31545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f31548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f31549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f31550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f31552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f31553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31554k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f31555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f31556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f31557o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f31564v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31566x;
    public int l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31558p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31559q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31560r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f31561s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f31562t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f31563u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31565w = false;

    public l(Context context) {
        boolean zH;
        boolean z11 = false;
        this.f31544a = context;
        Resources resources = context.getResources();
        this.f31545b = resources;
        this.f31549f = new ArrayList();
        this.f31550g = new ArrayList();
        this.f31551h = true;
        this.f31552i = new ArrayList();
        this.f31553j = new ArrayList();
        this.f31554k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zH = a3.H(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", AnalyticsPlatformParams.channel);
                zH = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zH) {
                z11 = true;
            }
        }
        this.f31547d = z11;
    }

    public n a(int i11, int i12, int i13, CharSequence charSequence) {
        int i14;
        int i15 = ((-65536) & i13) >> 16;
        if (i15 < 0 || i15 >= 6) {
            i4.a.f("order does not contain a valid category.");
            return null;
        }
        int i16 = (f31543y[i15] << 16) | (65535 & i13);
        n nVar = new n(this, i11, i12, i13, i16, charSequence, this.l);
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i14 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f31573d <= i16) {
                i14 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i14, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return a(0, 0, 0, this.f31545b.getString(i11));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f31544a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i11, i12, i13, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f31576g = intent2;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        n nVarA = a(i11, i12, i13, charSequence);
        d0 d0Var = new d0(this.f31544a, this, nVarA);
        nVarA.f31583o = d0Var;
        d0Var.setHeaderTitle(nVarA.f31574e);
        return d0Var;
    }

    public final void b(x xVar, Context context) {
        this.f31563u.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.f31554k = true;
    }

    public final void c(boolean z11) {
        if (this.f31561s) {
            return;
        }
        this.f31561s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.h(this, z11);
            }
        }
        this.f31561s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f31564v;
        if (nVar != null) {
            d(nVar);
        }
        this.f31549f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f31556n = null;
        this.f31555m = null;
        this.f31557o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        boolean zL = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f31564v == nVar) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zL = xVar.l(nVar);
                    if (zL) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zL) {
                this.f31564v = null;
            }
        }
        return zL;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f31548e;
        return jVar != null && jVar.j(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zI = xVar.i(nVar);
                if (zI) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zI) {
            this.f31564v = nVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f31570a == i11) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f31583o.findItem(i11)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i11, KeyEvent keyEvent) {
        ArrayList arrayList = this.f31562t;
        arrayList.clear();
        h(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            char c3 = zN ? nVar.f31579j : nVar.f31577h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zN && c3 == '\b' && i11 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return (MenuItem) this.f31549f.get(i11);
    }

    public final void h(List list, int i11, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            ArrayList arrayList = this.f31549f;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = (n) arrayList.get(i12);
                if (nVar.hasSubMenu()) {
                    nVar.f31583o.h(list, i11, keyEvent);
                }
                char c3 = zN ? nVar.f31579j : nVar.f31577h;
                if ((modifiers & 69647) == ((zN ? nVar.f31580k : nVar.f31578i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (zN && c3 == '\b' && i11 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f31566x) {
            return true;
        }
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((n) arrayList.get(i11)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f31554k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= xVar.d();
                }
            }
            ArrayList arrayList = this.f31552i;
            ArrayList arrayList2 = this.f31553j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = (n) arrayListL.get(i11);
                    if ((nVar.f31592x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f31554k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return g(i11, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z11 = this.f31551h;
        ArrayList arrayList = this.f31550g;
        if (!z11) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f31549f;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList2.get(i11);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f31551h = false;
        this.f31554k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f31565w;
    }

    public boolean n() {
        return this.f31546c;
    }

    public boolean o() {
        return this.f31547d;
    }

    public void p(boolean z11) {
        if (this.f31558p) {
            this.f31559q = true;
            if (z11) {
                this.f31560r = true;
                return;
            }
            return;
        }
        if (z11) {
            this.f31551h = true;
            this.f31554k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(z11);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return q(findItem(i11), null, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        n nVarG = g(i11, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i12) : false;
        if ((i12 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, o.x r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.q(android.view.MenuItem, o.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (((n) arrayList.get(i13)).f31571b == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            int size2 = arrayList.size() - i13;
            while (true) {
                int i14 = i12 + 1;
                if (i12 >= size2 || ((n) arrayList.get(i13)).f31571b != i11) {
                    break;
                }
                if (i13 >= 0 && i13 < arrayList.size()) {
                    arrayList.remove(i13);
                }
                i12 = i14;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f31570a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0 || i12 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i12);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f31549f.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).s(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f31571b == i11) {
                nVar.f(z12);
                nVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f31565w = z11;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f31571b == i11) {
                nVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        ArrayList arrayList = this.f31549f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f31571b == i11) {
                int i13 = nVar.f31592x;
                int i14 = (i13 & (-9)) | (z11 ? 0 : 8);
                nVar.f31592x = i14;
                if (i13 != i14) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f31546c = z11;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f31549f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id2 = xVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        xVar.f(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f31549f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableK;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f31563u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = xVar.getId();
                if (id2 > 0 && (parcelableK = xVar.k()) != null) {
                    sparseArray.put(id2, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        if (view != null) {
            this.f31557o = view;
            this.f31555m = null;
            this.f31556n = null;
        } else {
            if (i11 > 0) {
                this.f31555m = this.f31545b.getText(i11);
            } else if (charSequence != null) {
                this.f31555m = charSequence;
            }
            if (i12 > 0) {
                this.f31556n = this.f31544a.getDrawable(i12);
            } else if (drawable != null) {
                this.f31556n = drawable;
            }
            this.f31557o = null;
        }
        p(false);
    }

    public final void x() {
        this.f31558p = false;
        if (this.f31559q) {
            this.f31559q = false;
            p(this.f31560r);
        }
    }

    public final void y() {
        if (this.f31558p) {
            return;
        }
        this.f31558p = true;
        this.f31559q = false;
        this.f31560r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f31545b.getString(i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f31545b.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f31545b.getString(i14));
    }

    public l k() {
        return this;
    }
}
