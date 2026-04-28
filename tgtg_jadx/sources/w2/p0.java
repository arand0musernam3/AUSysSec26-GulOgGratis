package w2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import c5.u3;
import com.google.android.gms.internal.measurement.te;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import t1.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f43014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3.e f43015b = new o3.e(new Function1[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7.b f43016c;

    public p0(te teVar, EditorInfo editorInfo) {
        this.f43014a = teVar;
        o0 o0Var = new o0(this, false);
        n0 n0Var = new n0(this);
        if (editorInfo != null) {
            this.f43016c = new j7.b(o0Var, n0Var);
        } else {
            c50.w.l("editorInfo must be non-null");
            throw null;
        }
    }

    public final v2.b a() {
        return ((s1) this.f43014a.f11896d).d();
    }

    public final void b(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((a3.j) this.f43014a.f11894b).f398b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f43015b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return this.f43016c.commitContent(inputContentInfo, i11, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.f43014a.g(new gt.u(charSequence.toString(), i11, 4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        te teVar = this.f43014a;
        teVar.g(new x(i11, i12, teVar));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        this.f43014a.g(new w(i11, i12, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((a3.j) this.f43014a.f11894b).i();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.f43014a.g(new w1(28));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(a(), m5.t0.g(a().f41929d), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        Objects.toString(extractedTextRequest);
        v2.b bVarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = bVarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = bVarA.f41928c.length();
        extractedText.partialStartOffset = -1;
        long j9 = bVarA.f41929d;
        extractedText.selectionStart = m5.t0.g(j9);
        extractedText.selectionEnd = m5.t0.f(j9);
        extractedText.flags = !StringsKt.A(bVarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (m5.t0.d(a().f41929d)) {
            return null;
        }
        v2.b bVarA = a();
        return bVarA.f41928c.subSequence(m5.t0.g(bVarA.f41929d), m5.t0.f(bVarA.f41929d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        v2.b bVarA = a();
        long j9 = bVarA.f41929d;
        CharSequence charSequence = bVarA.f41928c;
        int iF = m5.t0.f(j9);
        int iF2 = m5.t0.f(bVarA.f41929d);
        int length = iF2 + i11;
        if (((i11 ^ length) & (iF2 ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        v2.b bVarA = a();
        int iG = m5.t0.g(bVarA.f41929d);
        int i13 = iG - i11;
        if (((i11 ^ iG) & (iG ^ i13)) < 0) {
            i13 = 0;
        }
        return bVarA.f41928c.subSequence(Math.max(0, i13), m5.t0.g(bVarA.f41929d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        int i12 = 0;
        switch (i11) {
            case R.id.selectAll:
                int length = a().f41928c.length();
                te teVar = this.f43014a;
                teVar.g(new x(teVar, i12, length));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L6
            switch(r4) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r4 = r0
            goto L13
        L8:
            r4 = 5
            goto L13
        La:
            r4 = 7
            goto L13
        Lc:
            r4 = 6
            goto L13
        Le:
            r4 = 4
            goto L13
        L10:
            r4 = 3
            goto L13
        L12:
            r4 = 2
        L13:
            com.google.android.gms.internal.measurement.te r1 = r3.f43014a
            java.lang.Object r1 = r1.f11898f
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L23
            r5.l r2 = new r5.l
            r2.<init>(r4)
            r1.invoke(r2)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.p0.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iF;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 34) {
            return;
        }
        if (i11 >= 34) {
            te teVar = this.f43014a;
            iF = t.f((s1) teVar.f11896d, handwritingGesture, (o1) teVar.f11900h, (Function0) teVar.f11901i, (u3) teVar.f11893a);
        } else {
            iF = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new h(intConsumer, iF, 1));
        } else {
            intConsumer.accept(iF);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.f43016c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 34 || i11 < 34) {
            return false;
        }
        te teVar = this.f43014a;
        return t.h((s1) teVar.f11896d, previewableHandwritingGesture, (o1) teVar.f11900h, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.te r0 = r10.f43014a
            java.lang.Object r0 = r0.f11899g
            oa0.m0 r0 = (oa0.m0) r0
            r1 = r11 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r2
        Lf:
            r4 = r11 & 2
            if (r4 == 0) goto L15
            r4 = r3
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            if (r5 < r6) goto L4f
            r6 = r11 & 16
            if (r6 == 0) goto L22
            r6 = r3
            goto L23
        L22:
            r6 = r2
        L23:
            r7 = r11 & 8
            if (r7 == 0) goto L29
            r7 = r3
            goto L2a
        L29:
            r7 = r2
        L2a:
            r8 = r11 & 4
            if (r8 == 0) goto L30
            r8 = r3
            goto L31
        L30:
            r8 = r2
        L31:
            r9 = 34
            if (r5 < r9) goto L3a
            r11 = r11 & 32
            if (r11 == 0) goto L3a
            r2 = r3
        L3a:
            if (r6 != 0) goto L4c
            if (r7 != 0) goto L4c
            if (r8 != 0) goto L4c
            if (r2 != 0) goto L4c
            if (r5 < r9) goto L49
            r11 = r3
            r2 = r11
        L46:
            r6 = r2
        L47:
            r7 = r6
            goto L52
        L49:
            r11 = r2
            r2 = r3
            goto L46
        L4c:
            r11 = r2
            r2 = r8
            goto L52
        L4f:
            r11 = r2
            r6 = r3
            goto L47
        L52:
            r0.f32338a = r6
            r0.f32339b = r7
            r0.f32340c = r2
            r0.f32341d = r11
            if (r1 == 0) goto L71
            android.view.inputmethod.CursorAnchorInfo r11 = r0.a()
            if (r11 == 0) goto L71
            java.lang.Object r1 = r0.f32344g
            ub.a r1 = (ub.a) r1
            android.view.inputmethod.InputMethodManager r2 = r1.H()
            java.lang.Object r1 = r1.f40981b
            android.view.View r1 = (android.view.View) r1
            r2.updateCursorAnchorInfo(r1, r11)
        L71:
            java.lang.Object r11 = r0.f32346i
            v80.b2 r11 = (v80.b2) r11
            r1 = 0
            if (r4 == 0) goto L95
            if (r11 == 0) goto L81
            boolean r11 = r11.g()
            if (r11 != r3) goto L81
            return r3
        L81:
            java.lang.Object r11 = r0.f32345h
            v80.b0 r11 = (v80.b0) r11
            v80.d0 r2 = v80.d0.UNDISPATCHED
            sf.a r4 = new sf.a
            r5 = 13
            r4.<init>(r0, r1, r5)
            v80.b2 r11 = v80.f0.B(r11, r1, r2, r4, r3)
            r0.f32346i = r11
            return r3
        L95:
            if (r11 == 0) goto L9a
            r11.a(r1)
        L9a:
            r0.f32346i = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.p0.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        ub.a aVar = (ub.a) this.f43014a.f11897e;
        aVar.H().dispatchKeyEventFromInputMethod((View) aVar.f40981b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        this.f43014a.g(new w(i11, i12, 1));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setComposingText(java.lang.CharSequence r35, int r36) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.p0.setComposingText(java.lang.CharSequence, int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        te teVar = this.f43014a;
        teVar.g(new x(teVar, i11, i12));
        ((Function1) teVar.f11902j).invoke(Boolean.FALSE);
        return true;
    }
}
