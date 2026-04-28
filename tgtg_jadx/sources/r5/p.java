package r5;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class p implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.r f37697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputConnection f37698b;

    public p(InputConnection inputConnection, androidx.fragment.app.r rVar) {
        this.f37697a = rVar;
        this.f37698b = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            if (inputConnection != null) {
                inputConnection.closeConnection();
                this.f37698b = null;
            }
            this.f37697a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i11, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i11);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        InputConnection inputConnection = this.f37698b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i11, i12);
        }
        return false;
    }
}
