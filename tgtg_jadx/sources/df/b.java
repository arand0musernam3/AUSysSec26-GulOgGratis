package df;

import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.r;
import gf.h;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f14880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf.b f14883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r40.d f14884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f14885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f14886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public af.e f14887h;

    public b(Window.Callback callback, View view, String str, h hVar, List list, kf.b bVar, gf.e eVar) {
        r40.d dVar = new r40.d();
        a aVar = new a(view, str, hVar, bVar, list, eVar);
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), aVar);
        view.getClass();
        list.getClass();
        bVar.getClass();
        this.f14880a = callback;
        this.f14881b = str;
        this.f14882c = list;
        this.f14883d = bVar;
        this.f14884e = dVar;
        this.f14885f = gestureDetector;
        this.f14886g = new WeakReference(view);
        aVar.f14878f = new r(this, 12);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f14880a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f14880a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f14880a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f14880a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f14884e.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.getClass();
            try {
                try {
                    this.f14885f.onTouchEvent(motionEventObtain);
                } catch (Exception e5) {
                    this.f14883d.a("Error handling touch event: " + e5);
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
        return this.f14880a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f14880a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f14880a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f14880a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f14880a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f14880a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i11, Menu menu) {
        menu.getClass();
        return this.f14880a.onCreatePanelMenu(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i11) {
        return this.f14880a.onCreatePanelView(i11);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f14880a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        menuItem.getClass();
        return this.f14880a.onMenuItemSelected(i11, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i11, Menu menu) {
        menu.getClass();
        return this.f14880a.onMenuOpened(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i11, Menu menu) {
        menu.getClass();
        this.f14880a.onPanelClosed(i11, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i11, View view, Menu menu) {
        menu.getClass();
        return this.f14880a.onPreparePanel(i11, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f14880a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f14880a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z11) {
        this.f14880a.onWindowFocusChanged(z11);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f14880a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f14880a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        return this.f14880a.onWindowStartingActionMode(callback, i11);
    }
}
