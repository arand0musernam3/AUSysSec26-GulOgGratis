package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f31567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.f f31568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f31569c;

    @Override // o.w
    public final void h(l lVar, boolean z11) {
        k.f fVar;
        if ((z11 || lVar == this.f31567a) && (fVar = this.f31568b) != null) {
            fVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        d0 d0Var = this.f31567a;
        h hVar = this.f31569c;
        if (hVar.f31536f == null) {
            hVar.f31536f = new g(hVar);
        }
        d0Var.q(hVar.f31536f.getItem(i11), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f31569c.h(this.f31567a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f31567a;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f31568b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f31568b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i11, keyEvent, 0);
    }

    @Override // o.w
    public final boolean v(l lVar) {
        return false;
    }
}
