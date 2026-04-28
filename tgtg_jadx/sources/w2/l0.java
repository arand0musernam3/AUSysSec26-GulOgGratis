package w2;

import a3.l3;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import c5.u3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t10.c f42970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.e1 f42972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f42973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3 f42974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r5.y f42976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f42979j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42980k = true;

    public l0(r5.y yVar, t10.c cVar, boolean z11, m2.e1 e1Var, l3 l3Var, u3 u3Var) {
        this.f42970a = cVar;
        this.f42971b = z11;
        this.f42972c = e1Var;
        this.f42973d = l3Var;
        this.f42974e = u3Var;
        this.f42976g = yVar;
    }

    public final void a(r5.g gVar) {
        this.f42975f++;
        try {
            this.f42979j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i11 = this.f42975f - 1;
        this.f42975f = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f42979j;
            if (!arrayList.isEmpty()) {
                ((h0) this.f42970a.f39648a).f42913c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f42975f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        this.f42975f++;
        return true;
    }

    public final void c(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f42980k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f42979j.clear();
        this.f42975f = 0;
        this.f42980k = false;
        ArrayList arrayList = ((h0) this.f42970a.f39648a).f42920j;
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
        boolean z11 = this.f42980k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f42980k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f42980k;
        return z11 ? this.f42971b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f42980k;
        if (z11) {
            a(new r5.a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        a(new r5.e(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        a(new r5.f(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        a(new r5.j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        r5.y yVar = this.f42976g;
        return TextUtils.getCapsMode(yVar.f37714a.f29538b, m5.t0.g(yVar.f37715b), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f42978i = z11;
        if (z11) {
            this.f42977h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return c0.g(this.f42976g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (m5.t0.d(this.f42976g.f37715b)) {
            return null;
        }
        return o30.f0.C(this.f42976g).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return o30.f0.D(this.f42976g, i11).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return o30.f0.E(this.f42976g, i11).f29538b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f42980k;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    a(new r5.x(0, this.f42976g.f37714a.f29538b.length()));
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
        boolean z11 = this.f42980k;
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
                ((h0) this.f42970a.f39648a).f42914d.invoke(new r5.l(i12));
            } else {
                i12 = 1;
                ((h0) this.f42970a.f39648a).f42914d.invoke(new r5.l(i12));
            }
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            sg.c cVar = new sg.c(this, 20);
            m2.e1 e1Var = this.f42972c;
            int iE = e1Var != null ? t.e(e1Var, handwritingGesture, this.f42973d, this.f42974e, cVar) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new h(intConsumer, iE, 0));
            } else {
                intConsumer.accept(iE);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f42980k;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        m2.e1 e1Var;
        if (Build.VERSION.SDK_INT < 34 || (e1Var = this.f42972c) == null) {
            return false;
        }
        return t.g(e1Var, previewableHandwritingGesture, this.f42973d, cancellationSignal);
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
            boolean r0 = r9.f42980k
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
            t10.c r4 = r9.f42970a
            java.lang.Object r4 = r4.f39648a
            w2.h0 r4 = (w2.h0) r4
            w2.d0 r4 = r4.f42922m
            java.lang.Object r7 = r4.f42851c
            monitor-enter(r7)
            r4.f42854f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f42855g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f42856h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f42857i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f42853e = r2     // Catch: java.lang.Throwable -> L6f
            r5.y r10 = r4.f42858j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f42852d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.l0.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u70.j] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        ((BaseInputConnection) ((h0) this.f42970a.f39648a).f42921k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f42980k;
        if (z11) {
            a(new r5.v(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f42980k;
        if (z11) {
            a(new r5.w(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f42980k;
        if (!z11) {
            return z11;
        }
        a(new r5.x(i11, i12));
        return true;
    }
}
