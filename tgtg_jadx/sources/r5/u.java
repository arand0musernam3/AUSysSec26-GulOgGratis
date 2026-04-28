package r5;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd.f f37700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f37703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f37706g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37707h = true;

    public u(y yVar, jd.f fVar, boolean z11) {
        this.f37700a = fVar;
        this.f37701b = z11;
        this.f37703d = yVar;
    }

    public final void a(g gVar) {
        this.f37702c++;
        try {
            this.f37706g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i11 = this.f37702c - 1;
        this.f37702c = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f37706g;
            if (!arrayList.isEmpty()) {
                ((c0) this.f37700a.f24983b).f37656e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f37702c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        this.f37702c++;
        return true;
    }

    public final void c(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f37707h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f37706g.clear();
        this.f37702c = 0;
        this.f37707h = false;
        ArrayList arrayList = ((c0) this.f37700a.f24983b).f37660i;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (Intrinsics.areEqual(((WeakReference) arrayList.get(i11)).get(), this)) {
                arrayList.remove(i11);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f37707h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f37707h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f37707h;
        return z11 ? this.f37701b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f37707h;
        if (z11) {
            a(new a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        a(new e(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        a(new f(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        a(new j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        y yVar = this.f37703d;
        return TextUtils.getCapsMode(yVar.f37714a.f29538b, t0.g(yVar.f37715b), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f37705f = z11;
        if (z11) {
            this.f37704e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return o30.e0.F(this.f37703d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (t0.d(this.f37703d.f37715b)) {
            return null;
        }
        return o30.f0.C(this.f37703d).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return o30.f0.D(this.f37703d, i11).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return o30.f0.E(this.f37703d, i11).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f37707h;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    a(new x(0, this.f37703d.f37714a.f29538b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        int i12;
        boolean z11 = this.f37707h;
        if (z11) {
            z11 = true;
            if (i11 != 0) {
                switch (i11) {
                    case 2:
                        i12 = 2;
                        break;
                    case 3:
                        i12 = 3;
                        break;
                    case 4:
                        i12 = 4;
                        break;
                    case 5:
                        i12 = 6;
                        break;
                    case 6:
                        i12 = 7;
                        break;
                    case 7:
                        i12 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i11);
                        i12 = 1;
                        break;
                }
                ((c0) this.f37700a.f24983b).f37657f.invoke(new l(i12));
            } else {
                i12 = 1;
                ((c0) this.f37700a.f24983b).f37657f.invoke(new l(i12));
            }
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f37707h;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f37707h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            jd.f r4 = r9.f37700a
            java.lang.Object r4 = r4.f24983b
            r5.c0 r4 = (r5.c0) r4
            r5.c r4 = r4.l
            java.lang.Object r7 = r4.f37637c
            monitor-enter(r7)
            r4.f37640f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f37641g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f37642h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f37643i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f37639e = r2     // Catch: java.lang.Throwable -> L6f
            r5.y r10 = r4.f37644j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f37638d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.u.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u70.j] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        ((BaseInputConnection) ((c0) this.f37700a.f24983b).f37661j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f37707h;
        if (z11) {
            a(new v(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f37707h;
        if (z11) {
            a(new w(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f37707h;
        if (!z11) {
            return z11;
        }
        a(new x(i11, i12));
        return true;
    }
}
