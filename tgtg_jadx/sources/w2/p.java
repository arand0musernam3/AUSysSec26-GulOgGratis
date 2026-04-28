package w2;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final void a(CursorAnchorInfo.Builder builder, m5.q0 q0Var, h4.c cVar) {
        if (cVar.h()) {
            return;
        }
        m5.r rVar = q0Var.f29618b;
        int i11 = rVar.f29628f - 1;
        if (i11 < 0) {
            i11 = 0;
        }
        int iC = n80.p.c(rVar.e(cVar.f21381b), 0, i11);
        int iC2 = n80.p.c(rVar.e(cVar.f21383d), 0, i11);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(q0Var.g(iC), rVar.f(iC), q0Var.h(iC), rVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static void b(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(kotlin.collections.d0.h(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(kotlin.collections.y.W(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}
