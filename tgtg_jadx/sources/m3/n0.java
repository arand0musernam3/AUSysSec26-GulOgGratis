package m3;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends PlatformOptimizedCancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i11) {
        super("rememberCoroutineScope left the composition");
        switch (i11) {
            case 1:
                super("The coroutine scope left the composition");
                break;
            default:
                break;
        }
    }
}
