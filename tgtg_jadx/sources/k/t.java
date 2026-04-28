package k;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.WindowCallbackWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends WindowCallbackWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jd.f f25581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.a aVar, Window.Callback callback) {
        super(callback);
        this.f25585e = aVar;
    }

    public final void b(Window.Callback callback) {
        try {
            this.f25582b = true;
            callback.onContentChanged();
        } finally {
            this.f25582b = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f25583c ? a().dispatchKeyEvent(keyEvent) : this.f25585e.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            androidx.appcompat.app.a aVar = this.f25585e;
            aVar.Y();
            ActionBar actionBar = aVar.f1793o;
            if (actionBar == null || !actionBar.j(keyCode, keyEvent)) {
                w wVar = aVar.M;
                if (wVar == null || !aVar.c0(wVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (aVar.M == null) {
                        w wVarX = aVar.X(0);
                        aVar.d0(wVarX, keyEvent);
                        boolean zC0 = aVar.c0(wVarX, keyEvent.getKeyCode(), keyEvent);
                        wVarX.f25600k = false;
                        if (zC0) {
                        }
                    }
                    return false;
                }
                w wVar2 = aVar.M;
                if (wVar2 != null) {
                    wVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f25582b) {
            a().onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 != 0 || (menu instanceof o.l)) {
            return super.onCreatePanelMenu(i11, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final View onCreatePanelView(int i11) {
        jd.f fVar = this.f25581a;
        if (fVar != null) {
            View view = i11 == 0 ? new View(((androidx.appcompat.app.b) fVar.f24983b).f1805a.f2157a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i11);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i11, Menu menu) {
        super.onMenuOpened(i11, menu);
        if (i11 == 108) {
            androidx.appcompat.app.a aVar = this.f25585e;
            aVar.Y();
            ActionBar actionBar = aVar.f1793o;
            if (actionBar != null) {
                actionBar.c(true);
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i11, Menu menu) {
        if (this.f25584d) {
            a().onPanelClosed(i11, menu);
            return;
        }
        super.onPanelClosed(i11, menu);
        androidx.appcompat.app.a aVar = this.f25585e;
        if (i11 == 108) {
            aVar.Y();
            ActionBar actionBar = aVar.f1793o;
            if (actionBar != null) {
                actionBar.c(false);
                return;
            }
            return;
        }
        if (i11 == 0) {
            w wVarX = aVar.X(i11);
            if (wVarX.f25601m) {
                aVar.Q(wVarX, false);
            }
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i11, View view, Menu menu) {
        o.l lVar = menu instanceof o.l ? (o.l) menu : null;
        if (i11 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f31566x = true;
        }
        jd.f fVar = this.f25581a;
        if (fVar != null && i11 == 0) {
            androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) fVar.f24983b;
            if (!bVar.f1808d) {
                bVar.f1805a.l = true;
                bVar.f1808d = true;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i11, view, menu);
        if (lVar != null) {
            lVar.f31566x = false;
        }
        return zOnPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i11) {
        o.l lVar = this.f25585e.X(0).f25597h;
        if (lVar != null) {
            super.onProvideKeyboardShortcuts(list, lVar, i11);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i11);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.onWindowStartingActionMode(callback, i11);
        }
        androidx.appcompat.app.a aVar = this.f25585e;
        androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(aVar.f1787k, callback);
        androidx.appcompat.view.ActionMode actionModeK = aVar.K(eVar);
        if (actionModeK != null) {
            return eVar.e(actionModeK);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
