package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends c5.b implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f31471c;

    public a0(Context context, l lVar) {
        super(context);
        if (lVar != null) {
            this.f31471c = lVar;
        } else {
            i4.a.f("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return j(this.f31471c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f31471c.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = j(menuItemArr2[i15]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f31471c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        k1 k1Var = (k1) this.f7114b;
        if (k1Var != null) {
            k1Var.clear();
        }
        this.f31471c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f31471c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        return j(this.f31471c.findItem(i11));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return j(this.f31471c.getItem(i11));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f31471c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.f31471c.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return this.f31471c.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.f31471c.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        if (((k1) this.f7114b) != null) {
            int i12 = 0;
            while (true) {
                k1 k1Var = (k1) this.f7114b;
                if (i12 >= k1Var.f35782c) {
                    break;
                }
                if (((a7.a) k1Var.g(i12)).getGroupId() == i11) {
                    ((k1) this.f7114b).h(i12);
                    i12--;
                }
                i12++;
            }
        }
        this.f31471c.removeGroup(i11);
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        if (((k1) this.f7114b) != null) {
            int i12 = 0;
            while (true) {
                k1 k1Var = (k1) this.f7114b;
                if (i12 >= k1Var.f35782c) {
                    break;
                }
                if (((a7.a) k1Var.g(i12)).getItemId() == i11) {
                    ((k1) this.f7114b).h(i12);
                    break;
                }
                i12++;
            }
        }
        this.f31471c.removeItem(i11);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.f31471c.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        this.f31471c.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        this.f31471c.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f31471c.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f31471c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return this.f31471c.addSubMenu(i11);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return this.f31471c.addSubMenu(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return this.f31471c.addSubMenu(i11, i12, i13, i14);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return j(this.f31471c.add(i11));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return j(this.f31471c.a(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return j(this.f31471c.add(i11, i12, i13, i14));
    }
}
