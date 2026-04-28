package p;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f33965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky.o f33966b;

    public p(EditText editText) {
        this.f33965a = editText;
        this.f33966b = new ky.o(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((k8.d) this.f33966b.f26718b).getClass();
        if (keyListener instanceof n8.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new n8.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.f33965a.getContext().obtainStyledAttributes(attributeSet, j.a.f24261i, i11, 0);
        try {
            boolean z11 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z11);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final n8.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        ky.o oVar = this.f33966b;
        if (inputConnection == null) {
            oVar.getClass();
            inputConnection = null;
        } else {
            k8.d dVar = (k8.d) oVar.f26718b;
            dVar.getClass();
            if (!(inputConnection instanceof n8.b)) {
                inputConnection = new n8.b(editorInfo, inputConnection, (EditText) dVar.f26134b);
            }
        }
        return (n8.b) inputConnection;
    }

    public final void d(boolean z11) {
        n8.i iVar = (n8.i) ((k8.d) this.f33966b.f26718b).f26135c;
        if (iVar.f30701c != z11) {
            if (iVar.f30700b != null) {
                l8.j jVarA = l8.j.a();
                n8.h hVar = iVar.f30700b;
                jVarA.getClass();
                pd.g.m(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f27457a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f27458b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f30701c = z11;
            if (z11) {
                n8.i.a(iVar.f30699a, l8.j.a().c());
            }
        }
    }
}
