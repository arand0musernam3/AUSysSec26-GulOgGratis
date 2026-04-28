package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import fd.j;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "<init>", "()V", "fd/j", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ActivityResultContract<I, O> {
    public abstract Intent a(Context context, Object obj);

    public j b(Context context, Object obj) {
        return null;
    }

    public abstract Object c(int i11, Intent intent);
}
