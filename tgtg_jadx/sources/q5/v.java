package q5;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final String a(q qVar, Context context) {
        ArrayList arrayList = qVar.f36036a;
        z5.e eVarD = xz.b.d(context);
        int i11 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i11 == 0) {
            return b6.b.a(arrayList, null, new nv.a(eVarD), 31);
        }
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        float fB = n80.p.b(i11 + 400.0f, 1.0f, 1000.0f);
        return (arrayList.isEmpty() ? "" : "".concat(MessageLogView.COMMA_SEPARATOR)) + "'wght' " + fB;
    }
}
