package n7;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface n {
    boolean isAvailableOnDevice();

    void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, l lVar);

    void onGetCredential(Context context, s sVar, CancellationSignal cancellationSignal, Executor executor, l lVar);
}
