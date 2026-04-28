package n8;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f30693a;

    public e(KeyListener keyListener) {
        this.f30693a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i11) {
        this.f30693a.clearMetaKeyState(view, editable, i11);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f30693a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
        boolean z11;
        if (i11 != 67 ? i11 != 112 ? false : j30.g.e(editable, keyEvent, true) : j30.g.e(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || this.f30693a.onKeyDown(view, editable, i11, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f30693a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return this.f30693a.onKeyUp(view, editable, i11, keyEvent);
    }
}
