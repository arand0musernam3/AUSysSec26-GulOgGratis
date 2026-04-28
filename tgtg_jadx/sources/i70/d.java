package i70;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import b4.x;
import com.google.firebase.messaging.a0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Window.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f23489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f23490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f23491f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f23492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f23493b = new a0(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window.Callback f23494c;

    static {
        m mVar = m.NONE;
        f23489d = l.a(mVar, c.f23482c);
        l.a(mVar, c.f23481b);
        f23490e = new WeakHashMap();
        f23491f = new Object();
    }

    public d(Window.Callback callback) {
        this.f23492a = callback;
        this.f23494c = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f23492a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f23494c;
        if (keyEvent == null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23493b.f12780c).iterator();
        it.getClass();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        return (callback.dispatchKeyEvent(keyEvent) ? h70.c.f21653b : h70.e.f21654a) instanceof h70.c;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f23492a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f23492a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f23494c;
        if (motionEvent == null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23493b.f12779b).iterator();
        it.getClass();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        return (callback.dispatchTouchEvent(motionEvent) ? h70.c.f21653b : h70.e.f21654a) instanceof h70.c;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f23492a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f23492a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f23492a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f23492a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        for (h70.f fVar : (CopyOnWriteArrayList) this.f23493b.f12781d) {
            ((CopyOnWriteArrayList) fVar.f21655a.f12781d).remove(fVar);
            x xVar = fVar.f21657c;
            View viewPeekDecorView = fVar.f21656b.peekDecorView();
            viewPeekDecorView.getClass();
            xVar.invoke(viewPeekDecorView);
        }
        this.f23494c.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i11, Menu menu) {
        return this.f23492a.onCreatePanelMenu(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i11) {
        return this.f23492a.onCreatePanelView(i11);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f23492a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        return this.f23492a.onMenuItemSelected(i11, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i11, Menu menu) {
        return this.f23492a.onMenuOpened(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i11, Menu menu) {
        this.f23492a.onPanelClosed(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z11) {
        this.f23492a.onPointerCaptureChanged(z11);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i11, View view, Menu menu) {
        return this.f23492a.onPreparePanel(i11, view, menu);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i11) {
        this.f23492a.onProvideKeyboardShortcuts(list, menu, i11);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f23492a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f23492a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z11) {
        Iterator it = ((CopyOnWriteArrayList) this.f23493b.f12782e).iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        this.f23494c.onWindowFocusChanged(z11);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f23492a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f23492a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        return this.f23492a.onWindowStartingActionMode(callback, i11);
    }
}
