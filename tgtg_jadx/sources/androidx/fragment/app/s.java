package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t2 {
    public static void n(q1.e eVar, View view) {
        String strA = ViewCompat.A(view);
        if (strA != null) {
            eVar.put(strA, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    n(eVar, childAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x04ce A[LOOP:7: B:166:0x04c8->B:168:0x04ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0554  */
    @Override // androidx.fragment.app.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.b(java.util.ArrayList, boolean):void");
    }
}
