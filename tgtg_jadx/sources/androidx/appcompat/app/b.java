package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.core.view.ViewCompat;
import c40.i;
import java.util.ArrayList;
import jd.f;
import o.n;
import se.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f1806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1811g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a8.f f1812h = new a8.f(this, 7);

    public b(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        jb.b bVar = new jb.b(this);
        h hVar = new h(toolbar, false);
        this.f1805a = hVar;
        callback.getClass();
        this.f1806b = callback;
        hVar.f2167k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!hVar.f2163g) {
            hVar.f2164h = charSequence;
            if ((hVar.f2158b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (hVar.f2163g) {
                    ViewCompat.d0(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f1807c = new f(this, 3);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean a() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f1805a.f2157a.f2098a;
        return (actionMenuView == null || (aVar = actionMenuView.f1990t) == null || !aVar.g()) ? false : true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        n nVar;
        g gVar = this.f1805a.f2157a.M;
        if (gVar == null || (nVar = gVar.f2155b) == null) {
            return false;
        }
        if (gVar == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z11) {
        if (z11 == this.f1810f) {
            return;
        }
        this.f1810f = z11;
        ArrayList arrayList = this.f1811g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return this.f1805a.f2158b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        return this.f1805a.f2157a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        this.f1805a.f2157a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean g() {
        h hVar = this.f1805a;
        Toolbar toolbar = hVar.f2157a;
        a8.f fVar = this.f1812h;
        toolbar.removeCallbacks(fVar);
        ViewCompat.U(hVar.f2157a, fVar);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void i() {
        this.f1805a.f2157a.removeCallbacks(this.f1812h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j(int i11, KeyEvent keyEvent) {
        Menu menuU = u();
        if (menuU == null) {
            return false;
        }
        menuU.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuU.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean l() {
        return this.f1805a.f2157a.v();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n(boolean z11) {
        h hVar = this.f1805a;
        hVar.a((hVar.f2158b & (-5)) | 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o() {
        h hVar = this.f1805a;
        hVar.a((hVar.f2158b & (-3)) | 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p() {
        h hVar = this.f1805a;
        hVar.f2161e = null;
        hVar.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(CharSequence charSequence) {
        h hVar = this.f1805a;
        hVar.f2163g = true;
        Toolbar toolbar = hVar.f2157a;
        hVar.f2164h = charSequence;
        if ((hVar.f2158b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (hVar.f2163g) {
                ViewCompat.d0(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(CharSequence charSequence) {
        h hVar = this.f1805a;
        if (hVar.f2163g) {
            return;
        }
        Toolbar toolbar = hVar.f2157a;
        hVar.f2164h = charSequence;
        if ((hVar.f2158b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (hVar.f2163g) {
                ViewCompat.d0(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu u() {
        boolean z11 = this.f1809e;
        h hVar = this.f1805a;
        if (!z11) {
            hVar.f2157a.setMenuCallbacks(new i(this, (byte) 0), new d(this, 23));
            this.f1809e = true;
        }
        return hVar.f2157a.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z11) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z11) {
    }
}
